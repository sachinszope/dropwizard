package com.test.dropwizard.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.test.dropwizard.core.Collection;

public class CollectionMapper implements ResultSetMapper<Collection> {

	public Collection map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
		Collection collection = new Collection();

		//col.content_id, col.title, col.description, col.url, col.collection_type
		collection.setContentId(resultSet.getInt("content_id"));
		collection.setTitle(resultSet.getString("title"));
		collection.setDescription(resultSet.getString("description"));
		collection.setUrl(resultSet.getString("url"));
		collection.setCollectionType(resultSet.getString("collection_type"));
		return collection;
	}
}

