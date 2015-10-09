package com.test.dropwizard.dao;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

public interface AsyncDAO {

	@SqlUpdate("insert into req_count(request_type, request_count) values(:request_type, :request_count)")
	public void insert(@Bind("request_type") String request_type, @Bind("request_count") int request_count);
	
	@SqlUpdate("update req_count set request_count = request_count + 1 where request_type = :request_type")
	public void udpate(@Bind("request_type") String request_type);
	
	@SqlQuery("select request_count from req_count where request_type = :request_type")
	public int getCount(@Bind("request_type") String request_type);

}
