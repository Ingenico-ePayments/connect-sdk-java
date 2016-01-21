package com.globalcollect.gateway.sdk.java.payments;

import java.net.URISyntaxException;
import java.util.List;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcDeclinedRefundException;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountIban;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.ContactDetailsBase;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.AddressPersonal;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PersonalName;
import com.globalcollect.gateway.sdk.java.gc.refund.RefundRequest;
import com.globalcollect.gateway.sdk.java.gc.refund.RefundResponse;
import com.globalcollect.gateway.sdk.java.gc.refund.definitions.BankRefundMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.refund.definitions.RefundCustomer;
import com.globalcollect.gateway.sdk.java.gc.refund.definitions.RefundReferences;
import com.globalcollect.gateway.sdk.java.gc.refund.definitions.RefundResult;

public class RefundPaymentExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		RefundRequest body = new RefundRequest();

		RefundReferences refundReferences = new RefundReferences();
		refundReferences.setMerchantReference("AcmeOrder0001");
		body.setRefundReferences(refundReferences);

		AmountOfMoney amountOfMoney = new AmountOfMoney();
		amountOfMoney.setAmount(1L);
		amountOfMoney.setCurrencyCode("EUR");
		body.setAmountOfMoney(amountOfMoney);

		RefundCustomer customer = new RefundCustomer();

		AddressPersonal address = new AddressPersonal();
		address.setCountryCode("US");

		PersonalName name = new PersonalName();
		name.setSurname("Coyote");
		address.setName(name);

		customer.setAddress(address);

		ContactDetailsBase contactDetails = new ContactDetailsBase();
		contactDetails.setEmailAddress("wile.e.coyote@acmelabs.com");
		contactDetails.setEmailMessageType("html");
		customer.setContactDetails(contactDetails);

		body.setCustomer(customer);

		body.setRefundDate("20140306");

		BankRefundMethodSpecificInput bankRefundMethodSpecificInput = new BankRefundMethodSpecificInput();
		BankAccountIban bankAccountIban = new BankAccountIban();
		bankAccountIban.setIban("NL53INGB0000000036");
		bankRefundMethodSpecificInput.setBankAccountIban(bankAccountIban);

		body.setBankRefundMethodSpecificInput(bankRefundMethodSpecificInput);

		try {
			RefundResponse response = client.merchant("merchantId").payments().refund("paymentId", body);
		} catch (GcDeclinedRefundException e) {
			handleDeclinedRefund(e.getRefundResult());
		} catch (GcApiException e) {
			handleApiErrors(e.getErrors());
		}
	}

	private void handleDeclinedRefund(RefundResult refundResult) {
		// handle the result here
	}

	private void handleApiErrors(List<APIError> errors) {
		// handle the errors here
	}
}
