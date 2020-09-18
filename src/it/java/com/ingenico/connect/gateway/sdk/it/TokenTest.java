package com.ingenico.connect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardWithoutCvv;
import com.ingenico.connect.gateway.sdk.java.domain.token.CreateTokenRequest;
import com.ingenico.connect.gateway.sdk.java.domain.token.CreateTokenResponse;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.CustomerToken;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCard;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCardData;
import com.ingenico.connect.gateway.sdk.java.merchant.tokens.DeleteTokenParams;

public class TokenTest extends ItTest {

	/**
	 * Smoke test for token calls.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

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
		cardWithoutCvv.setExpiryDate("1225");

		Client client = getClient();
		try {
			CreateTokenResponse createTokenResponse = client.merchant(getMerchantId()).tokens().create(createTokenRequest);

			Assert.assertNotNull(createTokenResponse.getToken());

			DeleteTokenParams deleteTokenRequest = new DeleteTokenParams();

			client.merchant(getMerchantId()).tokens().delete(createTokenResponse.getToken(), deleteTokenRequest);

		} finally {
			client.close();
		}
	}
}
