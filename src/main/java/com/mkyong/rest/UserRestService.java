package com.mkyong.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
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
	
	@GET
	@Path("/query")
	public Response getUsers(
		@QueryParam("from") int from,
		@QueryParam("to") int to,
		@QueryParam("orderBy") List<String> orderBy) {
 
		return Response
		   .status(200)
		   .entity("getUsers is called, from : " + from + ", to : " + to
			+ ", orderBy" + orderBy.toString()).build();
 
	}
	
}
