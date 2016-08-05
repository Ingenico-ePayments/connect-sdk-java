package com.globalcollect.gateway.sdk.java.services;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.services.GetIINDetailsRequest;
import com.globalcollect.gateway.sdk.java.gc.services.GetIINDetailsResponse;

public class IINDetailsExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		GetIINDetailsRequest body = new GetIINDetailsRequest();

		body.setBin("4567350000427977");

		GetIINDetailsResponse response = client.merchant("merchantId").services().getIINdetails(body);
	}
}
