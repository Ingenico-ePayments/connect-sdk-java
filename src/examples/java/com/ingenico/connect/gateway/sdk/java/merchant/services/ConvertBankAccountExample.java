/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.services;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.services.BankDetailsRequest;
import com.ingenico.connect.gateway.sdk.java.domain.services.BankDetailsResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class ConvertBankAccountExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			BankAccountBban bankAccountBban = new BankAccountBban();
			bankAccountBban.setAccountNumber("0532013000");
			bankAccountBban.setBankCode("37040044");
			bankAccountBban.setCountryCode("DE");

			BankDetailsRequest body = new BankDetailsRequest();
			body.setBankAccountBban(bankAccountBban);

			BankDetailsResponse response = client.merchant("merchantId").services().bankaccount(body);
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
