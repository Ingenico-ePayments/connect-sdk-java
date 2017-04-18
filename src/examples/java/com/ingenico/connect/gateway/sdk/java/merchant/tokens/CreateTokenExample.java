/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.tokens;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountBban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CompanyInformation;
import com.ingenico.connect.gateway.sdk.java.domain.token.CreateTokenRequest;
import com.ingenico.connect.gateway.sdk.java.domain.token.CreateTokenResponse;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.CustomerToken;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.MandateNonSepaDirectDebit;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.PersonalInformationToken;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.PersonalNameToken;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenNonSepaDirectDebit;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenNonSepaDirectDebitPaymentProduct705SpecificData;

public class CreateTokenExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			Address billingAddress = new Address();
			billingAddress.setAdditionalInfo("Suite II");
			billingAddress.setCity("Monument Valley");
			billingAddress.setCountryCode("US");
			billingAddress.setHouseNumber("1");
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

			BankAccountBban bankAccountBban = new BankAccountBban();
			bankAccountBban.setAccountNumber("000000123456");
			bankAccountBban.setBankCode("05428");
			bankAccountBban.setBranchCode("11101");
			bankAccountBban.setCheckDigit("X");
			bankAccountBban.setCountryCode("IT");

			TokenNonSepaDirectDebitPaymentProduct705SpecificData paymentProduct705SpecificData = new TokenNonSepaDirectDebitPaymentProduct705SpecificData();
			paymentProduct705SpecificData.setAuthorisationId("123456");
			paymentProduct705SpecificData.setBankAccountBban(bankAccountBban);

			MandateNonSepaDirectDebit mandate = new MandateNonSepaDirectDebit();
			mandate.setPaymentProduct705SpecificData(paymentProduct705SpecificData);

			TokenNonSepaDirectDebit nonSepaDirectDebit = new TokenNonSepaDirectDebit();
			nonSepaDirectDebit.setCustomer(customer);
			nonSepaDirectDebit.setMandate(mandate);

			CreateTokenRequest body = new CreateTokenRequest();
			body.setNonSepaDirectDebit(nonSepaDirectDebit);
			body.setPaymentProductId(705);

			CreateTokenResponse response = client.merchant("merchantId").tokens().create(body);
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
