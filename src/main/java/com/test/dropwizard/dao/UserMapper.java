package com.test.dropwizard.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import com.test.dropwizard.core.User;

public class UserMapper implements ResultSetMapper<User>{

	public User map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
		User user = new User();
		user.setUserId(resultSet.getString("user_id"));
		user.setFirstName(resultSet.getString("firstname"));
		return user;
	}

}
