/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.ApprovePaymentCardPaymentMethodSpecificOutput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Payment;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentApprovalResponse">PaymentApprovalResponse</a>
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
