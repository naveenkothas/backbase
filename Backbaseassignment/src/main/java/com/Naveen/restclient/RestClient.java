package com.Naveen.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class RestClient {
	
	private static final String REST_URI 
    = "https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions";

  private Client client = ClientBuilder.newClient();

  public Object getAccountTransactions(int id) {
      return client
        .target(REST_URI)
        .path(String.valueOf(id))
        .request(MediaType.APPLICATION_JSON)
        .get(Object.class);
  }

}
