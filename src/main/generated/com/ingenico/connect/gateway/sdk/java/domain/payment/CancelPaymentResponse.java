/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CancelPaymentCardPaymentMethodSpecificOutput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Payment;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CancelPaymentResponse">CancelPaymentResponse</a>
 */
public class CancelPaymentResponse {

	private CancelPaymentCardPaymentMethodSpecificOutput cardPaymentMethodSpecificOutput = null;

	private Payment payment = null;

	public CancelPaymentCardPaymentMethodSpecificOutput getCardPaymentMethodSpecificOutput() {
		return cardPaymentMethodSpecificOutput;
	}

	public void setCardPaymentMethodSpecificOutput(CancelPaymentCardPaymentMethodSpecificOutput value) {
		this.cardPaymentMethodSpecificOutput = value;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment value) {
		this.payment = value;
	}
}
