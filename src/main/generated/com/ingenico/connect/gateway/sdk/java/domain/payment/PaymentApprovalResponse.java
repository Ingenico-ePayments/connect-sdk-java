/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.ApprovePaymentCardPaymentMethodSpecificOutput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.ApprovePaymentMobilePaymentMethodSpecificOutput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Payment;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentApprovalResponse">PaymentApprovalResponse</a>
 */
public class PaymentApprovalResponse {

	private ApprovePaymentCardPaymentMethodSpecificOutput cardPaymentMethodSpecificOutput = null;

	private ApprovePaymentMobilePaymentMethodSpecificOutput mobilePaymentMethodSpecificOutput = null;

	private Payment payment = null;

	private ApprovePaymentCardPaymentMethodSpecificOutput paymentMethodSpecificOutput = null;

	public ApprovePaymentCardPaymentMethodSpecificOutput getCardPaymentMethodSpecificOutput() {
		return cardPaymentMethodSpecificOutput;
	}

	public void setCardPaymentMethodSpecificOutput(ApprovePaymentCardPaymentMethodSpecificOutput value) {
		this.cardPaymentMethodSpecificOutput = value;
	}

	public ApprovePaymentMobilePaymentMethodSpecificOutput getMobilePaymentMethodSpecificOutput() {
		return mobilePaymentMethodSpecificOutput;
	}

	public void setMobilePaymentMethodSpecificOutput(ApprovePaymentMobilePaymentMethodSpecificOutput value) {
		this.mobilePaymentMethodSpecificOutput = value;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment value) {
		this.payment = value;
	}

	/**
	 * @deprecated Use cardPaymentMethodSpecificOutput instead
	 */
	@Deprecated
	public ApprovePaymentCardPaymentMethodSpecificOutput getPaymentMethodSpecificOutput() {
		return paymentMethodSpecificOutput;
	}

	/**
	 * @deprecated Use cardPaymentMethodSpecificOutput instead
	 */
	@Deprecated
	public void setPaymentMethodSpecificOutput(ApprovePaymentCardPaymentMethodSpecificOutput value) {
		this.paymentMethodSpecificOutput = value;
	}
}
