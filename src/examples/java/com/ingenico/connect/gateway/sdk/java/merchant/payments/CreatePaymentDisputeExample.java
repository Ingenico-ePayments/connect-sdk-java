/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.payments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.dispute.CreateDisputeRequest;
import com.ingenico.connect.gateway.sdk.java.domain.dispute.DisputeResponse;

public class CreatePaymentDisputeExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			AmountOfMoney amountOfMoney = new AmountOfMoney();
			amountOfMoney.setAmount(1234L);
			amountOfMoney.setCurrencyCode("USD");

			CreateDisputeRequest body = new CreateDisputeRequest();
			body.setAmountOfMoney(amountOfMoney);
			body.setContactPerson("Wile Coyote");
			body.setEmailAddress("wile.e.coyote@acmelabs.com");
			body.setReplyTo("r.runner@acmelabs.com");
			body.setRequestMessage("This is the message from the merchant to GlobalCollect. It is a a freeform text field.");

			DisputeResponse response = client.merchant("merchantId").payments().dispute("paymentId", body);
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
