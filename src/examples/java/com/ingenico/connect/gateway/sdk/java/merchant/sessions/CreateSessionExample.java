/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.sessions;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.sessions.SessionRequest;
import com.ingenico.connect.gateway.sdk.java.domain.sessions.SessionResponse;

public class CreateSessionExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			List<String> tokens = new ArrayList<String>();
			tokens.add("126166b16ed04b3ab85fb06da1d7a167");
			tokens.add("226166b16ed04b3ab85fb06da1d7a167");
			tokens.add("122c5b4d-dd40-49f0-b7c9-3594212167a9");
			tokens.add("326166b16ed04b3ab85fb06da1d7a167");
			tokens.add("426166b16ed04b3ab85fb06da1d7a167");

			SessionRequest body = new SessionRequest();
			body.setTokens(tokens);

			SessionResponse response = client.merchant("merchantId").sessions().create(body);
		} finally {
			client.close();
		}
	}

	private Client getClient() throws URISyntaxException {
		String apiKeyId = System.getProperty("connect.api.apiKeyId", "someKey");
		String secretApiKey = System.getProperty("connect.api.secretApiKey", "someSecret");

		URL propertiesUrl = getClass().getResource("/example-configuration.properties");
		CommunicatorConfiguration configuration = Factory.createConfiguration(propertiesUrl.toURI(), apiKeyId, secretApiKey);
		return Factory.createClient(configuration);
	}
}
