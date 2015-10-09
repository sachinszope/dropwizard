package com.test.dropwizard.dao;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import com.test.dropwizard.core.User;

@RegisterMapper(UserMapper.class)
public interface UserDAO {
	
	@SqlQuery("select * from user")
	List<User> findAll();
	
	@SqlQuery("select * from user where gooru_uid = :userId")
	User findById(@Bind("userId") String userId);
}
