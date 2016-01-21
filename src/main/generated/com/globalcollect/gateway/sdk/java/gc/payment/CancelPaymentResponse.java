package com.globalcollect.gateway.sdk.java.gc.payment;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CancelPaymentCardPaymentMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Payment;

/**
 * class CancelPaymentResponse
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
