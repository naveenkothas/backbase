package com.Naveen.restService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.Naveen.restclient.RestClient;

@Path("/")
public class RestService {
	
	final static Logger logger = Logger.getLogger(RestService.class);
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		
		logger.debug("getMsg");

		String output = "Jersey say : " + msg;

		return Response.status(200).entity(output).build();

	}
	//to Fetch the Transaction List
	@GET
	@Path("/rbs/accounts/transactions")
	public Object getTransactionList() {
		logger.debug("Started getTransactionList");
		
		RestClient restClient=new RestClient();
		return restClient.getAccountTransactions();


	}
	
	//Fetch transactions by account id
	@GET
	@Path("/rbs/accounts/transactions/{Accountid}")
	public Response getTransactionListBasedonFilter(@PathParam("Accountid") int  Accountid) {
		logger.debug("Started getTransactionListBasedonFilter");
		RestClient restClient=new RestClient();
		return restClient.getAccountTransactions(Accountid);

	}


}
