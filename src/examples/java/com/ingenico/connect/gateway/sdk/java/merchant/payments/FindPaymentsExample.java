/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.payments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.payment.FindPaymentsResponse;

public class FindPaymentsExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			FindPaymentsParams query = new FindPaymentsParams();
			query.setHostedCheckoutId("15c09dac-bf44-486a-af6b-edfd8680a166");
			query.setMerchantReference("AcmeOrder0001");
			query.setMerchantOrderId(123456L);
			query.setOffset(0);
			query.setLimit(10);

			FindPaymentsResponse response = client.merchant("merchantId").payments().find(query);
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
