/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.mandates;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.mandates.CreateMandateRequest;
import com.ingenico.connect.gateway.sdk.java.domain.mandates.CreateMandateResponse;
import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.MandateAddress;
import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.MandateContactDetails;
import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.MandateCustomer;
import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.MandatePersonalInformation;
import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.MandatePersonalName;

public class CreateMandateWithReferenceExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			BankAccountIban bankAccountIban = new BankAccountIban();
			bankAccountIban.setIban("DE46940594210000012345");

			MandateContactDetails contactDetails = new MandateContactDetails();
			contactDetails.setEmailAddress("wile.e.coyote@acmelabs.com");

			MandateAddress mandateAddress = new MandateAddress();
			mandateAddress.setCity("Monumentenvallei");
			mandateAddress.setCountryCode("NL");
			mandateAddress.setStreet("Woestijnweg");
			mandateAddress.setZip("1337XD");

			MandatePersonalName name = new MandatePersonalName();
			name.setFirstName("Wile");
			name.setSurname("Coyote");

			MandatePersonalInformation personalInformation = new MandatePersonalInformation();
			personalInformation.setName(name);
			personalInformation.setTitle("Miss");

			MandateCustomer customer = new MandateCustomer();
			customer.setBankAccountIban(bankAccountIban);
			customer.setCompanyName("Acme labs");
			customer.setContactDetails(contactDetails);
			customer.setMandateAddress(mandateAddress);
			customer.setPersonalInformation(personalInformation);

			CreateMandateRequest body = new CreateMandateRequest();
			body.setCustomer(customer);
			body.setCustomerReference("idonthaveareference");
			body.setLanguage("nl");
			body.setRecurrenceType("UNIQUE");
			body.setSignatureType("UNSIGNED");

			CreateMandateResponse response = client.merchant("merchantId").mandates().createWithMandateReference("42268d8067df43e18a50a2ebf4bdb729", body);
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
