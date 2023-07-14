/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardWithoutCvv;

public class CompletePaymentCardPaymentMethodSpecificInput {

	private CardWithoutCvv card = null;

	/**
	 * Object containing card details
	 */
	public CardWithoutCvv getCard() {
		return card;
	}

	/**
	 * Object containing card details
	 */
	public void setCard(CardWithoutCvv value) {
		this.card = value;
	}
}
