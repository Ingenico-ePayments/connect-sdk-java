package com.globalcollect.gateway.sdk.java.services;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.services.TestConnection;

public class TestConnectionExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		TestConnection response = client.merchant("merchantId").services().testconnection();
	}
}
