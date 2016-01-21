package com.globalcollect.gateway.sdk.java.tokens;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.tokens.DeleteParams;

public class DeleteTokenExample extends ExampleBase {
	
	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		DeleteParams queryParameters = new DeleteParams();
		queryParameters.setMandateCancelDate("20150102");
		
		client.merchant("merchantId").tokens().delete("tokenId", queryParameters);
	}
}
