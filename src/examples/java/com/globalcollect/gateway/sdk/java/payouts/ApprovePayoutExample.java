package com.globalcollect.gateway.sdk.java.payouts;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.payout.ApprovePayoutRequest;
import com.globalcollect.gateway.sdk.java.gc.payout.PayoutResponse;

public class ApprovePayoutExample extends ExampleBase {
	
	public void example() throws URISyntaxException {
		GcClient client = getGcClient();
		
		ApprovePayoutRequest body = new ApprovePayoutRequest();
		
		body.setDatePayout("20150102");
		
		PayoutResponse response = client.merchant("merchantId").payouts().approve("payoutId", body);
	}

}
