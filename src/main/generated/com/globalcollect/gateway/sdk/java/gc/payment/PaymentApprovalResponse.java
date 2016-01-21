package com.globalcollect.gateway.sdk.java.gc.payment;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.ApprovePaymentCardPaymentMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Payment;

/**
 * class PaymentApprovalResponse
 */
public class PaymentApprovalResponse {

	private Payment payment = null;

	private ApprovePaymentCardPaymentMethodSpecificOutput paymentMethodSpecificOutput = null;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment value) {
		this.payment = value;
	}

	public ApprovePaymentCardPaymentMethodSpecificOutput getPaymentMethodSpecificOutput() {
		return paymentMethodSpecificOutput;
	}

	public void setPaymentMethodSpecificOutput(ApprovePaymentCardPaymentMethodSpecificOutput value) {
		this.paymentMethodSpecificOutput = value;
	}
}
