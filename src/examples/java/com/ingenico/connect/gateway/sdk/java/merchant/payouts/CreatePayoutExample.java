/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.payouts;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.ApiException;
import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.DeclinedPayoutException;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CompanyInformation;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.ContactDetailsBase;
import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.PersonalName;
import com.ingenico.connect.gateway.sdk.java.domain.payout.CreatePayoutRequest;
import com.ingenico.connect.gateway.sdk.java.domain.payout.PayoutResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.BankTransferPayoutMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.PayoutCustomer;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.PayoutDetails;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.PayoutReferences;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.PayoutResult;

public class CreatePayoutExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			BankAccountIban bankAccountIban = new BankAccountIban();
			bankAccountIban.setAccountHolderName("Wile E. Coyote");
			bankAccountIban.setIban("IT60X0542811101000000123456");

			BankTransferPayoutMethodSpecificInput bankTransferPayoutMethodSpecificInput = new BankTransferPayoutMethodSpecificInput();
			bankTransferPayoutMethodSpecificInput.setBankAccountIban(bankAccountIban);
			bankTransferPayoutMethodSpecificInput.setPayoutDate("20150102");
			bankTransferPayoutMethodSpecificInput.setPayoutText("Payout Acme");
			bankTransferPayoutMethodSpecificInput.setSwiftCode("swift");

			AmountOfMoney amountOfMoney = new AmountOfMoney();
			amountOfMoney.setAmount(2345L);
			amountOfMoney.setCurrencyCode("EUR");

			Address address = new Address();
			address.setCity("Burbank");
			address.setCountryCode("US");
			address.setHouseNumber("411");
			address.setState("California");
			address.setStreet("N Hollywood Way");
			address.setZip("91505");

			CompanyInformation companyInformation = new CompanyInformation();
			companyInformation.setName("Acme Labs");

			ContactDetailsBase contactDetails = new ContactDetailsBase();
			contactDetails.setEmailAddress("wile.e.coyote@acmelabs.com");

			PersonalName name = new PersonalName();
			name.setFirstName("Wile");
			name.setSurname("Coyote");
			name.setSurnamePrefix("E.");
			name.setTitle("Mr.");

			PayoutCustomer customer = new PayoutCustomer();
			customer.setAddress(address);
			customer.setCompanyInformation(companyInformation);
			customer.setContactDetails(contactDetails);
			customer.setName(name);

			PayoutReferences references = new PayoutReferences();
			references.setMerchantReference("AcmeOrder001");

			PayoutDetails payoutDetails = new PayoutDetails();
			payoutDetails.setAmountOfMoney(amountOfMoney);
			payoutDetails.setCustomer(customer);
			payoutDetails.setReferences(references);

			CreatePayoutRequest body = new CreatePayoutRequest();
			body.setBankTransferPayoutMethodSpecificInput(bankTransferPayoutMethodSpecificInput);
			body.setPayoutDetails(payoutDetails);

			try {
				PayoutResponse response = client.merchant("merchantId").payouts().create(body);
			} catch (DeclinedPayoutException e) {
				handleDeclinedPayout(e.getPayoutResult());
			} catch (ApiException e) {
				handleApiErrors(e.getErrors());
			}
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

	private void handleDeclinedPayout(PayoutResult payoutResult) {
		// handle the result here
	}

	private void handleApiErrors(List<APIError> errors) {
		// handle the errors here
	}
}
