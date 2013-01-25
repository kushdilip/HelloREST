package com.mkyong.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello(){
		
		return "Hello Jersey";
	}
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg){
		String outputString = "Jersey say: " + msg;
		
		return Response.status(200).entity(outputString).build();
	}
}
