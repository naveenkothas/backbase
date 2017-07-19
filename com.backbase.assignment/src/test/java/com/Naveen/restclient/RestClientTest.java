package com.Naveen.restclient;

import static org.junit.Assert.*;

import javax.ws.rs.core.Response;

import org.junit.Test;

public class RestClientTest {
	
	public static final int HTTP_CREATED = 201;
	
	private RestClient client = new RestClient();

	@Test
	public void givenCorrectObject_whenCorrectJsonRequest_thenResponseCodeCreated() {

		int accountid = 12345;

		Response response = (Response) client.getAccountTransactions(accountid);

		assertEquals(response.getStatus(), HTTP_CREATED);
	}

}
