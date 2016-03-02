package com.globalcollect.gateway.sdk.java.tokens;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.token.ApproveTokenRequest;

public class ApproveSepaDirectDebitTokenExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		ApproveTokenRequest body = new ApproveTokenRequest();

		body.setMandateSignaturePlace("Monument Valley");
		body.setMandateSignatureDate("20150201");
		body.setMandateSigned(true);

		client.merchant("merchantId").tokens().approvesepadirectdebit("tokenId", body);
	}
}
