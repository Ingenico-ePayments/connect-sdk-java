package com.globalcollect.gateway.sdk.java.tokens;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.token.TokenResponse;

public class GetTokenExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		TokenResponse response = client.merchant("merchantId").tokens().get("tokenId");
	}
}
