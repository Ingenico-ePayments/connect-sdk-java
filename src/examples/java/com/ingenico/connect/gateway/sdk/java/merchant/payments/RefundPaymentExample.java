/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.payments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.ApiException;
import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.DeclinedRefundException;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.ContactDetailsBase;
import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.AddressPersonal;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.PersonalName;
import com.ingenico.connect.gateway.sdk.java.domain.refund.RefundRequest;
import com.ingenico.connect.gateway.sdk.java.domain.refund.RefundResponse;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.BankRefundMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundCustomer;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundReferences;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundResult;

public class RefundPaymentExample {

	@SuppressWarnings("unused")
	public void example() throws URISyntaxException, IOException {
		Client client = getClient();
		try {
			AmountOfMoney amountOfMoney = new AmountOfMoney();
			amountOfMoney.setAmount(1L);
			amountOfMoney.setCurrencyCode("EUR");

			BankAccountIban bankAccountIban = new BankAccountIban();
			bankAccountIban.setIban("NL53INGB0000000036");

			BankRefundMethodSpecificInput bankRefundMethodSpecificInput = new BankRefundMethodSpecificInput();
			bankRefundMethodSpecificInput.setBankAccountIban(bankAccountIban);

			PersonalName name = new PersonalName();
			name.setSurname("Coyote");

			AddressPersonal address = new AddressPersonal();
			address.setCountryCode("US");
			address.setName(name);

			ContactDetailsBase contactDetails = new ContactDetailsBase();
			contactDetails.setEmailAddress("wile.e.coyote@acmelabs.com");
			contactDetails.setEmailMessageType("html");

			RefundCustomer customer = new RefundCustomer();
			customer.setAddress(address);
			customer.setContactDetails(contactDetails);

			RefundReferences refundReferences = new RefundReferences();
			refundReferences.setMerchantReference("AcmeOrder0001");

			RefundRequest body = new RefundRequest();
			body.setAmountOfMoney(amountOfMoney);
			body.setBankRefundMethodSpecificInput(bankRefundMethodSpecificInput);
			body.setCustomer(customer);
			body.setRefundDate("20140306");
			body.setRefundReferences(refundReferences);

			try {
				RefundResponse response = client.merchant("merchantId").payments().refund("paymentId", body);
			} catch (DeclinedRefundException e) {
				handleDeclinedRefund(e.getRefundResult());
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

	private void handleDeclinedRefund(RefundResult refundResult) {
		// handle the result here
	}

	private void handleApiErrors(List<APIError> errors) {
		// handle the errors here
	}
}
