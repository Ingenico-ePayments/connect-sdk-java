package com.globalcollect.gateway.sdk.java.hostedcheckouts;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.GetHostedCheckoutResponse;

public class GetHostedCheckoutExample extends ExampleBase {
	
	public void example() throws URISyntaxException {
		GcClient client = getGcClient();
			
		GetHostedCheckoutResponse response = client.merchant("merchantId").hostedcheckouts().get("hostedCheckoutId");
	}

}
