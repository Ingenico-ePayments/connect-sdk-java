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
import com.ingenico.connect.gateway.sdk.java.domain.capture.CaptureResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CapturePaymentRequest;

public class CapturePaymentExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			CapturePaymentRequest body = new CapturePaymentRequest();
			body.setAmount(2980L);

			CaptureResponse response = client.merchant("merchantId").payments().capture("paymentId", body);
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
