package com.test.dropwizard.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.test.dropwizard.dao.UserDAO;
import com.test.dropwizard.util.GenericUtil;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    private UserDAO userDao;
    
    public UserResource(UserDAO dao) {
        this.userDao = dao;
    }

	@GET
	@Path("{id}")
	public String getUser(@PathParam ("id") String id) {
		return GenericUtil.getJson(userDao.findById(id));
	}
	
	@GET
	public String getAll() {
		return GenericUtil.getJson(userDao.findAll());
	}
}
