package com.globalcollect.gateway.sdk.java.gc.payment;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Payment;

/**
 * class CancelApprovalPaymentResponse
 */
public class CancelApprovalPaymentResponse {

	private Payment payment = null;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment value) {
		this.payment = value;
	}
}
