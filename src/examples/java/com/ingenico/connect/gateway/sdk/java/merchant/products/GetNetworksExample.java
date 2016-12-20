/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.products;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProductNetworksResponse;
import com.ingenico.connect.gateway.sdk.java.merchant.products.NetworksParams;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class GetNetworksExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			NetworksParams query = new NetworksParams();
			query.setCountryCode("NL");
			query.setCurrencyCode("EUR");
			query.setAmount(1000L);
			query.setIsRecurring(true);

			PaymentProductNetworksResponse response = client.merchant("merchantId").products().networks(320, query);
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
