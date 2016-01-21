package com.globalcollect.gateway.sdk.java.payouts;

import java.net.URISyntaxException;
import java.util.List;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcDeclinedPayoutException;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountIban;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CompanyInformation;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.ContactDetailsBase;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PersonalName;
import com.globalcollect.gateway.sdk.java.gc.payout.CreatePayoutRequest;
import com.globalcollect.gateway.sdk.java.gc.payout.PayoutResponse;
import com.globalcollect.gateway.sdk.java.gc.payout.definitions.PayoutCustomer;
import com.globalcollect.gateway.sdk.java.gc.payout.definitions.PayoutReferences;
import com.globalcollect.gateway.sdk.java.gc.payout.definitions.PayoutResult;

public class CreatePayoutExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		CreatePayoutRequest body = new CreatePayoutRequest();

		body.setPayoutText("Payout Acme");
		body.setPayoutDate("20150102");
		body.setSwiftCode("swift");

		AmountOfMoney amountOfMoney = new AmountOfMoney();
		amountOfMoney.setAmount(2345L);
		amountOfMoney.setCurrencyCode("EUR");
		body.setAmountOfMoney(amountOfMoney);

		BankAccountIban bankAccountIban = new BankAccountIban();
		bankAccountIban.setIban("IT60X0542811101000000123456");
		bankAccountIban.setAccountHolderName("Wile E. Coyote");
		body.setBankAccountIban(bankAccountIban);

		PayoutReferences references = new PayoutReferences();
		references.setMerchantReference("AcmeOrder0001");
		body.setReferences(references);

		PayoutCustomer customer = new PayoutCustomer();

		ContactDetailsBase contactDetails = new ContactDetailsBase();
		contactDetails.setEmailAddress("wile.e.coyote@acmelabs.com");
		customer.setContactDetails(contactDetails);

		CompanyInformation companyInformation = new CompanyInformation();
		companyInformation.setName("Acme Labs");
		customer.setCompanyInformation(companyInformation);

		Address address = new Address();
		address.setCountryCode("US");
		address.setStreet("N Hollywood Way");
		address.setHouseNumber("411");
		address.setZip("91505");
		address.setCity("Burbank");
		address.setState("California");
		customer.setAddress(address);

		PersonalName name = new PersonalName();
		name.setTitle("Mr.");
		name.setFirstName("Wile");
		name.setSurnamePrefix("E.");
		name.setSurname("Coyote");
		customer.setName(name);

		body.setCustomer(customer);

		try {
			PayoutResponse response = client.merchant("merchantId").payouts().create(body);
		} catch (GcDeclinedPayoutException e) {
			handleDeclinedPayout(e.getPayoutResult());
		} catch (GcApiException e) {
			handleApiErrors(e.getErrors());
		}
	}

	private void handleDeclinedPayout(PayoutResult payoutResult) {
		// handle the result here
	}

	private void handleApiErrors(List<APIError> errors) {
		// handle the errors here
	}
}
