/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.installments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.installments.GetInstallmentRequest;
import com.ingenico.connect.gateway.sdk.java.domain.installments.InstallmentOptionsResponse;

public class GetInstallmentsInfoExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			AmountOfMoney amountOfMoney = new AmountOfMoney();
			amountOfMoney.setAmount(123L);
			amountOfMoney.setCurrencyCode("EUR");

			GetInstallmentRequest body = new GetInstallmentRequest();
			body.setAmountOfMoney(amountOfMoney);
			body.setBin("123455");
			body.setCountryCode("NL");
			body.setPaymentProductId(123);

			InstallmentOptionsResponse response = client.merchant("merchantId").installments().getInstallmentsInfo(body);
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
