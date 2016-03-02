package com.globalcollect.gateway.sdk.java.services;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.services.ConvertAmountParams;
import com.globalcollect.gateway.sdk.java.gc.services.ConvertAmount;

public class ConvertAmountExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		ConvertAmountParams queryParameters = new ConvertAmountParams();

		queryParameters.setAmount(1000L);
		queryParameters.setSource("USD");
		queryParameters.setTarget("EUR");

		ConvertAmount response = client.merchant("merchantId").services().convertAmount(queryParameters);
	}
}
