package com.globalcollect.gateway.sdk.java.sessions;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.sessions.SessionRequest;
import com.globalcollect.gateway.sdk.java.gc.sessions.SessionResponse;

public class CreateSessionExample extends ExampleBase {
	
	public void example() throws URISyntaxException {
		GcClient client = getGcClient();
		
		SessionRequest body = new SessionRequest();
		
		List<String> tokens = new ArrayList<String>();
		
		tokens.add("122c5b4d-dd40-49f0-b7c9-3594212167a9");
		tokens.add("126166b16ed04b3ab85fb06da1d7a167");
		tokens.add("226166b16ed04b3ab85fb06da1d7a167");
		tokens.add("326166b16ed04b3ab85fb06da1d7a167");
		tokens.add("426166b16ed04b3ab85fb06da1d7a167");
		
		body.setTokens(tokens);

		SessionResponse response = client.merchant("merchantId").sessions().create(body);
	}

}
