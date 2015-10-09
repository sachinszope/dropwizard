package com.test.dropwizard.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.test.dropwizard.core.CollectionItem;

public class CollectionItemMapper implements ResultSetMapper<CollectionItem> {

	public CollectionItem map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
		CollectionItem cItem = new CollectionItem();
		cItem.setCollectionItemId(resultSet.getString("collection_item_id"));
		cItem.setItemType(resultSet.getString("item_type"));
		return cItem;
	}

}
