/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractOrderStatus;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.OrderStatusOutput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.OrderOutput;

public class PayoutResult extends AbstractOrderStatus {

	private OrderOutput payoutOutput = null;

	private String status = null;

	private OrderStatusOutput statusOutput = null;

	/**
	 * Object containing payout details
	 */
	public OrderOutput getPayoutOutput() {
		return payoutOutput;
	}

	/**
	 * Object containing payout details
	 */
	public void setPayoutOutput(OrderOutput value) {
		this.payoutOutput = value;
	}

	/**
	 * Current high-level status of the payouts in a human-readable form. Possible values are :
	 * <ul class="paragraph-width">
	 * <li>CREATED - The transaction has been created. This is the initial state once a new payout is created.
	 * <li>PENDING_APPROVAL - The transaction is awaiting approval from you to proceed with the paying out of the funds
	 * <li>REJECTED - The transaction has been rejected
	 * <li>PAYOUT_REQUESTED - The transaction is in the queue to be payed out to the customer
	 * <li>ACCOUNT_CREDITED - We have successfully credited the customer
	 * <li>REJECTED_CREDIT - The credit to the account of the customer was rejected by the bank
	 * <li>CANCELLED - You have cancelled the transaction
	 * <li>REVERSED - The payout has been reversed and the money is returned to your balance
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Current high-level status of the payouts in a human-readable form. Possible values are :
	 * <ul class="paragraph-width">
	 * <li>CREATED - The transaction has been created. This is the initial state once a new payout is created.
	 * <li>PENDING_APPROVAL - The transaction is awaiting approval from you to proceed with the paying out of the funds
	 * <li>REJECTED - The transaction has been rejected
	 * <li>PAYOUT_REQUESTED - The transaction is in the queue to be payed out to the customer
	 * <li>ACCOUNT_CREDITED - We have successfully credited the customer
	 * <li>REJECTED_CREDIT - The credit to the account of the customer was rejected by the bank
	 * <li>CANCELLED - You have cancelled the transaction
	 * <li>REVERSED - The payout has been reversed and the money is returned to your balance
	 * </ul><br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * This object has the numeric representation of the current payout status, timestamp of last status change and performable action on the current payout resource.<br>
	 * In case of a rejected payout, detailed error information is listed.
	 */
	public OrderStatusOutput getStatusOutput() {
		return statusOutput;
	}

	/**
	 * This object has the numeric representation of the current payout status, timestamp of last status change and performable action on the current payout resource.<br>
	 * In case of a rejected payout, detailed error information is listed.
	 */
	public void setStatusOutput(OrderStatusOutput value) {
		this.statusOutput = value;
	}
}
