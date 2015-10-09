package com.test.dropwizard.dao;

import java.util.Set;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import com.test.dropwizard.core.CollectionItem;

@RegisterMapper(CollectionItemMapper.class)
public interface CollectionItemDAO {

	@SqlQuery("select collection_item_id, item_type from collection_item where collection_content_id = :collection_content_id")
	public Set<CollectionItem> getCollectionItemByContentId(@Bind("collection_content_id") int collection_content_id);
}
