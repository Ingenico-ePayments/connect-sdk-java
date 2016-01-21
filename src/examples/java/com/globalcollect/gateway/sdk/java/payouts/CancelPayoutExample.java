package com.globalcollect.gateway.sdk.java.payouts;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;

public class CancelPayoutExample extends ExampleBase {
	
	public void example() throws URISyntaxException {
		GcClient client = getGcClient();
		
		client.merchant("merchantId").payouts().cancel("payoutId");
	}

}
