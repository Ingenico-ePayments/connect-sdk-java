/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractOrderStatus;

public class Payment extends AbstractOrderStatus {

	private HostedCheckoutSpecificOutput hostedCheckoutSpecificOutput = null;

	private PaymentOutput paymentOutput = null;

	private String status = null;

	private PaymentStatusOutput statusOutput = null;

	/**
	 * Hosted Checkout specific information. Populated if the payment was created on the GlobalCollect platform through a Hosted Checkout.
	 */
	public HostedCheckoutSpecificOutput getHostedCheckoutSpecificOutput() {
		return hostedCheckoutSpecificOutput;
	}

	/**
	 * Hosted Checkout specific information. Populated if the payment was created on the GlobalCollect platform through a Hosted Checkout.
	 */
	public void setHostedCheckoutSpecificOutput(HostedCheckoutSpecificOutput value) {
		this.hostedCheckoutSpecificOutput = value;
	}

	/**
	 * Object containing payment details
	 */
	public PaymentOutput getPaymentOutput() {
		return paymentOutput;
	}

	/**
	 * Object containing payment details
	 */
	public void setPaymentOutput(PaymentOutput value) {
		this.paymentOutput = value;
	}

	/**
	 * Current high-level status of the payment in a human-readable form. Possible values are :
	 * <ul class="paragraph-width">
	 * <li>ACCOUNT_VERIFIED - The account has been verified using a validation services like 0$ auth
	 * <li>CREATED - The transaction has been created. This is the initial state once a new payment is created.
	 * <li>REDIRECTED - The customer has been redirected to a 3rd party to complete the authentication/payment
	 * <li>PENDING_PAYMENT - Instructions have been provided and we are now waiting for the money to come in
	 * <li>PENDING_FRAUD_APPROVAL - The transaction has been marked for manual review after an automatic fraud screening
	 * <li>PENDING_APPROVAL - The transaction is awaiting approval from you to proceed with the capturing of the funds
	 * <li>PENDING_COMPLETION - The transaction needs to be completed.
	 * <li>PENDING_CAPTURE - The transaction is waiting for you to request one or more captures of the funds.
	 * <li>REJECTED - The transaction has been rejected
	 * <li>AUTHORIZATION_REQUESTED - we have requested an authorization against an asynchronous system and is awaiting its response
	 * <li>CAPTURE_REQUESTED - The transaction is in the queue to be captured
	 * <li>CAPTURED - The transaction has been captured and we have received online confirmation
	 * <li>PAID - We have matched the incoming funds to the transaction
	 * <li>CANCELLED - You have cancelled the transaction
	 * <li>REJECTED_CAPTURE - We or one of our downstream acquirers/providers have rejected the capture request
	 * <li>REVERSED - The transaction has been reversed
	 * <li>CHARGEBACK_NOTIFICATION - We have received a notification of chargeback and this status informs you that your account will be debited for a particular transaction
	 * <li>CHARGEBACKED - The transaction has been chargebacked
	 * <li>REFUNDED - The transaction has been refunded
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Current high-level status of the payment in a human-readable form. Possible values are :
	 * <ul class="paragraph-width">
	 * <li>ACCOUNT_VERIFIED - The account has been verified using a validation services like 0$ auth
	 * <li>CREATED - The transaction has been created. This is the initial state once a new payment is created.
	 * <li>REDIRECTED - The customer has been redirected to a 3rd party to complete the authentication/payment
	 * <li>PENDING_PAYMENT - Instructions have been provided and we are now waiting for the money to come in
	 * <li>PENDING_FRAUD_APPROVAL - The transaction has been marked for manual review after an automatic fraud screening
	 * <li>PENDING_APPROVAL - The transaction is awaiting approval from you to proceed with the capturing of the funds
	 * <li>PENDING_COMPLETION - The transaction needs to be completed.
	 * <li>PENDING_CAPTURE - The transaction is waiting for you to request one or more captures of the funds.
	 * <li>REJECTED - The transaction has been rejected
	 * <li>AUTHORIZATION_REQUESTED - we have requested an authorization against an asynchronous system and is awaiting its response
	 * <li>CAPTURE_REQUESTED - The transaction is in the queue to be captured
	 * <li>CAPTURED - The transaction has been captured and we have received online confirmation
	 * <li>PAID - We have matched the incoming funds to the transaction
	 * <li>CANCELLED - You have cancelled the transaction
	 * <li>REJECTED_CAPTURE - We or one of our downstream acquirers/providers have rejected the capture request
	 * <li>REVERSED - The transaction has been reversed
	 * <li>CHARGEBACK_NOTIFICATION - We have received a notification of chargeback and this status informs you that your account will be debited for a particular transaction
	 * <li>CHARGEBACKED - The transaction has been chargebacked
	 * <li>REFUNDED - The transaction has been refunded
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * This object has the numeric representation of the current payment status, timestamp of last status change and performable action on the current payment resource.
	 * In case of failed payments and negative scenarios, detailed error information is listed.
	 */
	public PaymentStatusOutput getStatusOutput() {
		return statusOutput;
	}

	/**
	 * This object has the numeric representation of the current payment status, timestamp of last status change and performable action on the current payment resource.
	 * In case of failed payments and negative scenarios, detailed error information is listed.
	 */
	public void setStatusOutput(PaymentStatusOutput value) {
		this.statusOutput = value;
	}
}
