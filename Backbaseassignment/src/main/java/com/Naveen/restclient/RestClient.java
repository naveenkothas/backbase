package com.Naveen.restclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class RestClient {
	
	private static final String REST_URI 
    = "https://apisandbox.openbankproject.com/obp/v1.2.1/banks/rbs/accounts/savings-kids-john/public/transactions";

  private Client client = ClientBuilder.newClient();

  public Object getAccountTransactions() {
      return client
        .target(REST_URI)
        .request(MediaType.APPLICATION_JSON)
        .get(Object.class);
  }
  
  public Response getAccountTransactions(int accountid) {
	  return (Response) client
	          .target(REST_URI)
	          .path(String.valueOf(accountid))
	          .request(MediaType.APPLICATION_JSON)
        .get(Object.class);
  }
  
  public static void main(String args[]){
	  RestClient restClient=new RestClient();
	  System.out.println(restClient.getAccountTransactions());
  }

}
