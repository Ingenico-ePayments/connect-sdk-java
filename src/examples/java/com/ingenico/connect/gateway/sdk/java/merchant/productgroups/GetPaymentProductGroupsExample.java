/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.productgroups;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProductGroups;

public class GetPaymentProductGroupsExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			FindProductgroupsParams query = new FindProductgroupsParams();
			query.setCountryCode("US");
			query.setCurrencyCode("USD");
			query.setLocale("en_US");
			query.setAmount(1000L);
			query.setIsRecurring(true);
			query.addHide("fields");

			PaymentProductGroups response = client.merchant("merchantId").productgroups().find(query);
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
