/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.hostedmandatemanagements;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.hostedmandatemanagement.CreateHostedMandateManagementRequest;
import com.ingenico.connect.gateway.sdk.java.domain.hostedmandatemanagement.CreateHostedMandateManagementResponse;
import com.ingenico.connect.gateway.sdk.java.domain.hostedmandatemanagement.definitions.HostedMandateInfo;
import com.ingenico.connect.gateway.sdk.java.domain.hostedmandatemanagement.definitions.HostedMandateManagementSpecificInput;

public class CreateHostedMandateManagementExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			HostedMandateInfo createMandateInfo = new HostedMandateInfo();
			createMandateInfo.setCustomerReference("idonthaveareference");
			createMandateInfo.setRecurrenceType("RECURRING");
			createMandateInfo.setSignatureType("UNSIGNED");

			HostedMandateManagementSpecificInput hostedMandateManagementSpecificInput = new HostedMandateManagementSpecificInput();
			hostedMandateManagementSpecificInput.setLocale("fr_FR");
			hostedMandateManagementSpecificInput.setReturnUrl("http://www.example.com");
			hostedMandateManagementSpecificInput.setVariant("101");

			CreateHostedMandateManagementRequest body = new CreateHostedMandateManagementRequest();
			body.setCreateMandateInfo(createMandateInfo);
			body.setHostedMandateManagementSpecificInput(hostedMandateManagementSpecificInput);

			CreateHostedMandateManagementResponse response = client.merchant("merchantId").hostedmandatemanagements().create(body);
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
