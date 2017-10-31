/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.products;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.KeyValuePair;
import com.ingenico.connect.gateway.sdk.java.domain.product.GetCustomerDetailsRequest;
import com.ingenico.connect.gateway.sdk.java.domain.product.GetCustomerDetailsResponse;

public class GetCustomerDetailsExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			List<KeyValuePair> values = new ArrayList<KeyValuePair>();

			KeyValuePair value1 = new KeyValuePair();
			value1.setKey("fiscalNumber");
			value1.setValue("01234567890");

			values.add(value1);

			GetCustomerDetailsRequest body = new GetCustomerDetailsRequest();
			body.setCountryCode("SE");
			body.setValues(values);

			GetCustomerDetailsResponse response = client.merchant("merchantId").products().customerDetails(1, body);
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
