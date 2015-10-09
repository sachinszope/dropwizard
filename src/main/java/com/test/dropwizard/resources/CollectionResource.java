package com.test.dropwizard.resources;

import java.util.Iterator;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import com.test.dropwizard.core.Collection;
import com.test.dropwizard.dao.CollectionDAO;
import com.test.dropwizard.dao.CollectionItemDAO;
import com.test.dropwizard.util.GenericUtil;


@Path("/collection")
@Produces(MediaType.APPLICATION_JSON)
public class CollectionResource {
	
	private static final Logger logger = LoggerFactory.getLogger(CollectionResource.class);
	private CollectionDAO collectionDao;
	private CollectionItemDAO collectionItemDao;
	private Timer responses = null;
	
	public CollectionResource(CollectionDAO collectionDao, CollectionItemDAO collectionItemDao, MetricRegistry metrics) {
		this.collectionDao = collectionDao;
		this.collectionItemDao = collectionItemDao;
		
		responses = metrics.timer(CollectionResource.class.getName());
	}
	
	@GET	
	@Path("{gooru_oid}")
	public String getCollectionByGooruOId(@PathParam("gooru_oid") String gooru_oid) {
		final Timer.Context context = responses.time();
		logger.info("got the request to fetch collection for gooru_oid=" + gooru_oid);
		List<Collection> collections = collectionDao.getCollectionByGooruOid(gooru_oid);
		for (Iterator<Collection> iterator = collections.iterator(); iterator.hasNext();) {
			Collection collection = iterator.next();
			collection.setCollectionItems(collectionItemDao.getCollectionItemByContentId(collection.getContentId()));
		}
		context.stop();
		return GenericUtil.getJson(collections);
	}

}
