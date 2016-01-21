package com.globalcollect.gateway.sdk.java.refunds;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;

public class CancelRefundExample extends ExampleBase {
	
	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		client.merchant("merchantId").refunds().cancel("refundId");
	}

}
