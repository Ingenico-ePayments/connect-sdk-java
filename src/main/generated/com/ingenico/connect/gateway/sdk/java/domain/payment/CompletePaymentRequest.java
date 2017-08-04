/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CompletePaymentCardPaymentMethodSpecificInput;

public class CompletePaymentRequest {

	private CompletePaymentCardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = null;

	public CompletePaymentCardPaymentMethodSpecificInput getCardPaymentMethodSpecificInput() {
		return cardPaymentMethodSpecificInput;
	}

	public void setCardPaymentMethodSpecificInput(CompletePaymentCardPaymentMethodSpecificInput value) {
		this.cardPaymentMethodSpecificInput = value;
	}
}
