package com.globalcollect.gateway.sdk.it;

import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CardWithoutCvv;
import com.globalcollect.gateway.sdk.java.gc.merchant.tokens.DeleteParams;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenRequest;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenResponse;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.CustomerToken;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenCard;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.TokenCardData;

public class TokenTest extends ItTest {

	/**
	 * Smoke test for token calls.
	 */
	@Test
	public void test() throws URISyntaxException {

		GcClient gcClient = getGcClient();

		CreateTokenRequest createTokenRequest = new CreateTokenRequest();
		createTokenRequest.setPaymentProductId(1);
		TokenCard card = new TokenCard();
		createTokenRequest.setCard(card);
		CustomerToken customer = new CustomerToken();
		card.setCustomer(customer);
		Address billingAddress = new Address();
		customer.setBillingAddress(billingAddress);
		billingAddress.setCountryCode("NL");
		TokenCardData mandate = new TokenCardData();
		card.setData(mandate);
		CardWithoutCvv cardWithoutCvv = new CardWithoutCvv();
		mandate.setCardWithoutCvv(cardWithoutCvv);
		cardWithoutCvv.setCardholderName("Jan");
		cardWithoutCvv.setIssueNumber("12");
		cardWithoutCvv.setCardNumber("4567350000427977");
		cardWithoutCvv.setExpiryDate("0820");

		CreateTokenResponse createTokenResponse = gcClient.merchant("9991").tokens().create(createTokenRequest);

		Assert.assertNotNull(createTokenResponse.getToken());

		DeleteParams deleteTokenRequest = new DeleteParams();

		gcClient.merchant("9991").tokens().delete(createTokenResponse.getToken(), deleteTokenRequest);
	}
}
