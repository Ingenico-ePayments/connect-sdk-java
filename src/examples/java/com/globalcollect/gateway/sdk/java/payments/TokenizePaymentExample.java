package com.globalcollect.gateway.sdk.java.payments;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.payment.TokenizePaymentRequest;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenResponse;

public class TokenizePaymentExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		TokenizePaymentRequest body = new TokenizePaymentRequest();
		body.setAlias("Some alias");

		CreateTokenResponse response = client.merchant("merchantId").payments().tokenize("paymentId", body);
	}

}
