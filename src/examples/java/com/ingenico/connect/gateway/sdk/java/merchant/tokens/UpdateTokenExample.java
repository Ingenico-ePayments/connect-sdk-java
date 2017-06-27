/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.tokens;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardWithoutCvv;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CompanyInformation;
import com.ingenico.connect.gateway.sdk.java.domain.token.UpdateTokenRequest;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.CustomerToken;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.PersonalInformationToken;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.PersonalNameToken;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCard;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCardData;

public class UpdateTokenExample {

	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			Address billingAddress = new Address();
			billingAddress.setAdditionalInfo("b");
			billingAddress.setCity("Monument Valley");
			billingAddress.setCountryCode("US");
			billingAddress.setHouseNumber("13");
			billingAddress.setState("Utah");
			billingAddress.setStreet("Desertroad");
			billingAddress.setZip("84536");

			CompanyInformation companyInformation = new CompanyInformation();
			companyInformation.setName("Acme Labs");

			PersonalNameToken name = new PersonalNameToken();
			name.setFirstName("Wile");
			name.setSurname("Coyote");
			name.setSurnamePrefix("E.");

			PersonalInformationToken personalInformation = new PersonalInformationToken();
			personalInformation.setName(name);

			CustomerToken customer = new CustomerToken();
			customer.setBillingAddress(billingAddress);
			customer.setCompanyInformation(companyInformation);
			customer.setMerchantCustomerId("1234");
			customer.setPersonalInformation(personalInformation);

			CardWithoutCvv cardWithoutCvv = new CardWithoutCvv();
			cardWithoutCvv.setCardNumber("4567350000427977");
			cardWithoutCvv.setCardholderName("Wile E. Coyote");
			cardWithoutCvv.setExpiryDate("0820");
			cardWithoutCvv.setIssueNumber("12");

			TokenCardData data = new TokenCardData();
			data.setCardWithoutCvv(cardWithoutCvv);

			TokenCard card = new TokenCard();
			card.setCustomer(customer);
			card.setData(data);

			UpdateTokenRequest body = new UpdateTokenRequest();
			body.setCard(card);
			body.setPaymentProductId(1);

			client.merchant("merchantId").tokens().update("tokenId", body);
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
