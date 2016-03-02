package com.globalcollect.gateway.sdk.java.refunds;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.refund.RefundResponse;

public class GetRefundExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		RefundResponse response = client.merchant("merchantId").refunds().get("refundId");
	}
}
