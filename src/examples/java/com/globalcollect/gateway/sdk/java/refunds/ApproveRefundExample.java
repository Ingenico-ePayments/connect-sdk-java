package com.globalcollect.gateway.sdk.java.refunds;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.refund.ApproveRefundRequest;

public class ApproveRefundExample extends ExampleBase {
	
	public void example() throws URISyntaxException {
		GcClient client = getGcClient();
		
		ApproveRefundRequest body = new ApproveRefundRequest();
		
		body.setAmount(1000L);		

		client.merchant("merchantId").refunds().approve("refundId", body);
	}
}
