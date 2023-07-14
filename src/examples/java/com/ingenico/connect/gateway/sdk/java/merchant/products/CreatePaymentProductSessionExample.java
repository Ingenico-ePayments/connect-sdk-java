/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.products;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.product.CreatePaymentProductSessionRequest;
import com.ingenico.connect.gateway.sdk.java.domain.product.CreatePaymentProductSessionResponse;
import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.MobilePaymentProductSession302SpecificInput;

public class CreatePaymentProductSessionExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			MobilePaymentProductSession302SpecificInput paymentProductSession302SpecificInput = new MobilePaymentProductSession302SpecificInput();
			paymentProductSession302SpecificInput.setDisplayName("Ingenico");
			paymentProductSession302SpecificInput.setDomainName("pay1.secured-by-ingenico.com");
			paymentProductSession302SpecificInput.setValidationUrl("<VALIDATION URL RECEIVED FROM APPLE>");

			CreatePaymentProductSessionRequest body = new CreatePaymentProductSessionRequest();
			body.setPaymentProductSession302SpecificInput(paymentProductSession302SpecificInput);

			CreatePaymentProductSessionResponse response = client.merchant("merchantId").products().sessions(302, body);
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
