package com.Naveen.restService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

@Path("/abc")
public class RestService {
	
	final static Logger logger = Logger.getLogger(RestService.class);
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		
		logger.debug("getMsg");

		String output = "Jersey say : " + msg;

		return Response.status(200).entity(output).build();

	}
	
	@GET
	@Path("/rbs/accounts/savings-kids-john/public/transactions")
	public Response getTransactionList() {

		String output = "Jersey say : " ;

		return Response.status(200).entity(output).build();

	}
	
	@GET
	@Path("/rbs/accounts/savings-kids-john/public/transactions1")
	public Response getTransactionListBasedonFilter() {

		String output = "Jersey say : " ;

		return Response.status(200).entity(output).build();

	}


}
