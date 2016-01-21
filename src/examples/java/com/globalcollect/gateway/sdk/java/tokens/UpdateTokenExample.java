package com.globalcollect.gateway.sdk.java.tokens;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CardWithoutCvv;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CompanyInformation;
import com.globalcollect.gateway.sdk.java.gc.token.UpdateTokenRequest;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.CustomerToken;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.PersonalInformationToken;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.PersonalNameToken;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenCard;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenCardData;

public class UpdateTokenExample extends ExampleBase {
	
	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		UpdateTokenRequest body = new UpdateTokenRequest();
		
		body.setPaymentProductId(1);
		
		TokenCard card = new TokenCard();
		
		TokenCardData data = new TokenCardData();
		
		CardWithoutCvv cardWithoutCvv = new CardWithoutCvv();
		cardWithoutCvv.setCardholderName("Wile E. Coyote");
		cardWithoutCvv.setIssueNumber("12");
		cardWithoutCvv.setExpiryDate("0820");
		cardWithoutCvv.setCardNumber("4567350000427977");
		data.setCardWithoutCvv(cardWithoutCvv);
		
		card.setData(data);
		
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
		billingAddress.setHouseNumber("13");
		billingAddress.setAdditionalInfo("b");
		billingAddress.setState("Utah");
		billingAddress.setStreet("Desertroad");
		billingAddress.setZip("84536");
		customer.setBillingAddress(billingAddress);
		
		card.setCustomer(customer);
		
		client.merchant("merchantId").tokens().update("tokenId", body);
	}
}
