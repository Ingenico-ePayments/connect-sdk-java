package com.ingenico.connect.gateway.sdk.java.defaultimpl;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.token.TokenResponse;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.CustomerToken;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCard;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.TokenCardData;

public class DefaultMarshallerTest {

	@Test
	public void testUnmarshalWithExtraFields() {
		TokenResponseWithExtraField original = new TokenResponseWithExtraField();

		Address billingAddress = new Address();
		billingAddress.setCountryCode("NL");

		CustomerToken customer = new CustomerToken();
		customer.setBillingAddress(billingAddress);

		TokenCardData data = new TokenCardData();

		TokenCard card = new TokenCard();
		card.setCustomer(customer);
		card.setData(data);
		original.setCard(card);

		original.setExtraField("extra-field-value");

		String json = DefaultMarshaller.INSTANCE.marshal(original);

		TokenResponse unmarshalled = DefaultMarshaller.INSTANCE.unmarshal(json, TokenResponse.class);

		Assert.assertNotNull(unmarshalled.getCard());
		Assert.assertNotNull(unmarshalled.getCard().getCustomer());
		Assert.assertNotNull(unmarshalled.getCard().getCustomer().getBillingAddress());
		Assert.assertEquals("NL", unmarshalled.getCard().getCustomer().getBillingAddress().getCountryCode());
		Assert.assertNotNull(unmarshalled.getCard().getData());
	}

	static final class TokenResponseWithExtraField extends TokenResponse {

		private String extraField;

		public String getExtraField() {
			return extraField;
		}
		public void setExtraField(String extraField) {
			this.extraField = extraField;
		}
	}
}
