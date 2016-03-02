package com.globalcollect.gateway.sdk.java.payouts;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.payout.PayoutResponse;

public class GetPayoutExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		PayoutResponse response = client.merchant("merchantId").payouts().get("payoutId");
	}
}
