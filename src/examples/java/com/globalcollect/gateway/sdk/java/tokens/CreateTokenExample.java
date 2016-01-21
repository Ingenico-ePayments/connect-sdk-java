package com.globalcollect.gateway.sdk.java.tokens;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.BankAccountBban;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CompanyInformation;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenRequest;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenResponse;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.CustomerToken;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.MandateNonSepaDirectDebit;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.PersonalInformationToken;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.PersonalNameToken;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenNonSepaDirectDebit;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenNonSepaDirectDebitPaymentProduct705SpecificData;

public class CreateTokenExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		CreateTokenRequest body = new CreateTokenRequest();
		body.setPaymentProductId(705);

		TokenNonSepaDirectDebit nonSepaDirectDebit = new TokenNonSepaDirectDebit();

		MandateNonSepaDirectDebit mandate = new MandateNonSepaDirectDebit();

		TokenNonSepaDirectDebitPaymentProduct705SpecificData paymentProduct705SpecificData = new TokenNonSepaDirectDebitPaymentProduct705SpecificData();
		paymentProduct705SpecificData.setAuthorisationId("123456");

		BankAccountBban bankAccountBban = new BankAccountBban();
		bankAccountBban.setAccountNumber("000000123456");
		bankAccountBban.setBankCode("05428");
		bankAccountBban.setBranchCode("11101");
		bankAccountBban.setCheckDigit("X");
		bankAccountBban.setCountryCode("IT");
		paymentProduct705SpecificData.setBankAccountBban(bankAccountBban);

		mandate.setPaymentProduct705SpecificData(paymentProduct705SpecificData);

		nonSepaDirectDebit.setMandate(mandate);

		CustomerToken customer = new CustomerToken();
		customer.setMerchantCustomerId("1234");

		CompanyInformation companyInformation = new CompanyInformation();
		companyInformation.setName("Acme Labs");
		customer.setCompanyInformation(companyInformation);

		PersonalInformationToken personalInformation = new PersonalInformationToken();

		PersonalNameToken name = new PersonalNameToken();
		name.setFirstName("Wile");
		name.setSurnamePrefix("E.");
		name.setSurname("Coyote");
		personalInformation.setName(name);

		customer.setPersonalInformation(personalInformation);

		Address billingAddress = new Address();
		billingAddress.setCity("Monument Valley");
		billingAddress.setCountryCode("US");
		billingAddress.setHouseNumber("1");
		billingAddress.setAdditionalInfo("Suite II");
		billingAddress.setState("Utah");
		billingAddress.setStreet("Desertroad");
		billingAddress.setZip("84536");
		customer.setBillingAddress(billingAddress);

		nonSepaDirectDebit.setCustomer(customer);

		body.setNonSepaDirectDebit(nonSepaDirectDebit);

		CreateTokenResponse response = client.merchant("merchantId").tokens().create(body);
	}
}
