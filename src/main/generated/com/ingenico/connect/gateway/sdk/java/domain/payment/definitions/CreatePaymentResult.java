/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class CreatePaymentResult {

	private PaymentCreationOutput creationOutput = null;

	private MerchantAction merchantAction = null;

	private Payment payment = null;

	/**
	 * Object containing the details of the created payment
	 */
	public PaymentCreationOutput getCreationOutput() {
		return creationOutput;
	}

	/**
	 * Object containing the details of the created payment
	 */
	public void setCreationOutput(PaymentCreationOutput value) {
		this.creationOutput = value;
	}

	/**
	 * Object that contains the action, including the needed data, that you should perform next, like showing instruction, showing the transaction results or redirect to a third party to complete the payment
	 */
	public MerchantAction getMerchantAction() {
		return merchantAction;
	}

	/**
	 * Object that contains the action, including the needed data, that you should perform next, like showing instruction, showing the transaction results or redirect to a third party to complete the payment
	 */
	public void setMerchantAction(MerchantAction value) {
		this.merchantAction = value;
	}

	/**
	 * Object that holds the payment related properties
	 */
	public Payment getPayment() {
		return payment;
	}

	/**
	 * Object that holds the payment related properties
	 */
	public void setPayment(Payment value) {
		this.payment = value;
	}
}
