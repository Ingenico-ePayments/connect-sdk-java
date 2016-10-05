/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Payment;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CancelApprovalPaymentResponse">CancelApprovalPaymentResponse</a>
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
