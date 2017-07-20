package com.Naveen.restClient;

import static org.junit.Assert.*;

import javax.ws.rs.core.Response;

import org.junit.Test;

import com.Naveen.restclient.RestClient;

public class RestClientTest {
	
	public static final int HTTP_CREATED = 201;
	
	private RestClient client = new RestClient();

	@Test
	public void givenCorrectObject_whenCorrectJsonRequest_thenResponseCodeCreated() {

		String response =  client.getAccountTransactions().toString();

		assertEquals(Response.status(201).entity(response).build().getStatus(), HTTP_CREATED);
	}

}
