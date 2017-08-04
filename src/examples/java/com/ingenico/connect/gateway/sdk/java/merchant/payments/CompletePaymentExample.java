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
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardWithoutCvv;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CompletePaymentRequest;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CompletePaymentResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CompletePaymentCardPaymentMethodSpecificInput;

public class CompletePaymentExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			CardWithoutCvv card = new CardWithoutCvv();
			card.setCardNumber("67030000000000003");
			card.setCardholderName("Wile E. Coyote");
			card.setExpiryDate("1220");

			CompletePaymentCardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = new CompletePaymentCardPaymentMethodSpecificInput();
			cardPaymentMethodSpecificInput.setCard(card);

			CompletePaymentRequest body = new CompletePaymentRequest();
			body.setCardPaymentMethodSpecificInput(cardPaymentMethodSpecificInput);

			CompletePaymentResponse response = client.merchant("merchantId").payments().complete("paymentId", body);
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
