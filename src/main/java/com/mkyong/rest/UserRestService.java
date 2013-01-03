package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserRestService {

	@GET
	public Response getUser() {
 
		return Response.status(200).entity("getUser is called").build();
 
	}
 
	@GET
	@Path("{name}")
	public Response getUserByName(@PathParam("name") String name) {
 
		return Response.status(200)
			.entity("getUserByName is called, name : " + name).build();
 
	}
	
}
