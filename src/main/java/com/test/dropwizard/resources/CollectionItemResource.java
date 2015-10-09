package com.test.dropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.test.dropwizard.dao.CollectionItemDAO;
import com.test.dropwizard.util.GenericUtil;

@Path("/collection/item")
@Produces(MediaType.APPLICATION_JSON)
public class CollectionItemResource {
	private CollectionItemDAO collectionItemDao;
	
	public CollectionItemResource(CollectionItemDAO collectionItemDao) {
		this.collectionItemDao = collectionItemDao;
	}
	
	@GET
	@Path("{collectionItemId}")
	public String getCollectionItemByItemId(@PathParam("collectionItemId") int collectionItemId) {
		return GenericUtil.getJson(collectionItemDao.getCollectionItemByContentId(collectionItemId));
	}

}
