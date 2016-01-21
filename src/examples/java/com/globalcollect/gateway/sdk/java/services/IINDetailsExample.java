package com.globalcollect.gateway.sdk.java.services;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.services.BINLookupRequest;
import com.globalcollect.gateway.sdk.java.gc.services.BINLookupResponse;

public class IINDetailsExample extends ExampleBase {
	
	public void example() throws URISyntaxException {
		GcClient client = getGcClient();
		
		BINLookupRequest body = new BINLookupRequest();
		
		body.setBin("4567350000427977");

		BINLookupResponse response = client.merchant("merchantId").services().getIINdetails(body);
	}

}
