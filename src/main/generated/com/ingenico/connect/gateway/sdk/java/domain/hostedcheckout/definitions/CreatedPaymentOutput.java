/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Payment;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.PaymentCreationReferences;

/**
 * This object is used when a payment was created during a HostedCheckout. It is part of the response of a GET HostedCheckout object and contains the details of the created payment object.
 */
public class CreatedPaymentOutput {

	private DisplayedData displayedData = null;

	private Payment payment = null;

	private PaymentCreationReferences paymentCreationReferences = null;

	private String paymentStatusCategory = null;

	private String tokens = null;

	/**
	 * Object that contains the action, including the needed data, that you should perform next, like showing instruction, showing the transaction results or redirect to a third party to complete the payment
	 */
	public DisplayedData getDisplayedData() {
		return displayedData;
	}

	/**
	 * Object that contains the action, including the needed data, that you should perform next, like showing instruction, showing the transaction results or redirect to a third party to complete the payment
	 */
	public void setDisplayedData(DisplayedData value) {
		this.displayedData = value;
	}

	/**
	 * Object that holds the payment data
	 */
	public Payment getPayment() {
		return payment;
	}

	/**
	 * Object that holds the payment data
	 */
	public void setPayment(Payment value) {
		this.payment = value;
	}

	/**
	 * Object containing the created references
	 */
	public PaymentCreationReferences getPaymentCreationReferences() {
		return paymentCreationReferences;
	}

	/**
	 * Object containing the created references
	 */
	public void setPaymentCreationReferences(PaymentCreationReferences value) {
		this.paymentCreationReferences = value;
	}

	/**
	 * Highlevel indication of the payment status with the following possible values:
	 * <ul><li>REJECTED - The payment has been rejected or is in such a state that it will never become successful. This category groups the following statuses:
	 * <ul><li>CREATED
	 * <li>REJECTED
	 * <li>REJECTED CAPTURE
	 * <li>REJECTED REFUND
	 * <li>REJECTED PAYOUT
	 * <li>CANCELLED</ul>
	 * <li>SUCCESSFUL - The payment was not (yet) rejected. Use the payment statuses to determine if it was completed, see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a>. This category groups the following statuses:
	 * <ul><li>PENDING PAYMENT
	 * <li>ACCOUNT VERIFIED
	 * <li>PENDING FRAUD APPROVAL
	 * <li>PENDING APPROVAL
	 * <li>AUTHORIZATION REQUESTED
	 * <li>CAPTURE REQUESTED
	 * <li>REFUND REQUESTED
	 * <li>PAYOUT REQUESTED
	 * <li>CAPTURED
	 * <li>PAID
	 * <li>ACCOUNT CREDITED
	 * <li>REVERSED
	 * <li>CHARGEBACK_NOTIFICATION
	 * <li>CHARGEBACKED
	 * <li>REFUNDED
	 * </ul>
	 * <li>STATUS_UNKNOWN - The status of the payment is unknown at this moment. This category groups the following statuses:
	 * <ul><li>REDIRECTED
	 * </ul>
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public String getPaymentStatusCategory() {
		return paymentStatusCategory;
	}

	/**
	 * Highlevel indication of the payment status with the following possible values:
	 * <ul><li>REJECTED - The payment has been rejected or is in such a state that it will never become successful. This category groups the following statuses:
	 * <ul><li>CREATED
	 * <li>REJECTED
	 * <li>REJECTED CAPTURE
	 * <li>REJECTED REFUND
	 * <li>REJECTED PAYOUT
	 * <li>CANCELLED</ul>
	 * <li>SUCCESSFUL - The payment was not (yet) rejected. Use the payment statuses to determine if it was completed, see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a>. This category groups the following statuses:
	 * <ul><li>PENDING PAYMENT
	 * <li>ACCOUNT VERIFIED
	 * <li>PENDING FRAUD APPROVAL
	 * <li>PENDING APPROVAL
	 * <li>AUTHORIZATION REQUESTED
	 * <li>CAPTURE REQUESTED
	 * <li>REFUND REQUESTED
	 * <li>PAYOUT REQUESTED
	 * <li>CAPTURED
	 * <li>PAID
	 * <li>ACCOUNT CREDITED
	 * <li>REVERSED
	 * <li>CHARGEBACK_NOTIFICATION
	 * <li>CHARGEBACKED
	 * <li>REFUNDED
	 * </ul>
	 * <li>STATUS_UNKNOWN - The status of the payment is unknown at this moment. This category groups the following statuses:
	 * <ul><li>REDIRECTED
	 * </ul>
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public void setPaymentStatusCategory(String value) {
		this.paymentStatusCategory = value;
	}

	/**
	 * This field contains the tokens that are associated with the hosted checkout session/consumer. You can use the tokens listed in this list for a future checkout of the same consumer.
	 */
	public String getTokens() {
		return tokens;
	}

	/**
	 * This field contains the tokens that are associated with the hosted checkout session/consumer. You can use the tokens listed in this list for a future checkout of the same consumer.
	 */
	public void setTokens(String value) {
		this.tokens = value;
	}
}
