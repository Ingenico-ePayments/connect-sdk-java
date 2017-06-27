/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Payment;

public class CancelApprovalPaymentResponse {

	private Payment payment = null;

	/**
	 * Object that holds the payment related fields
	 */
	public Payment getPayment() {
		return payment;
	}

	/**
	 * Object that holds the payment related fields
	 */
	public void setPayment(Payment value) {
		this.payment = value;
	}
}
