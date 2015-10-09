package com.test.dropwizard.dao;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import com.test.dropwizard.core.Collection;

@RegisterMapper(CollectionMapper.class)
public interface CollectionDAO {

	@SqlQuery("select col.content_id, col.title, col.description, col.url, col.collection_type from collection col, content con where col.content_id = con.content_id and con.gooru_oid = :gooru_oid")
	public List<Collection> getCollectionByGooruOid(@Bind("gooru_oid") String gooruOid); 
}
