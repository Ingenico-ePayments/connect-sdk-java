/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.services;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

public class SettlementDetails {

	private String acquirerReferenceNumber = null;

	private AmountOfMoney amountOfMoney = null;

	private String paymentId = null;

	private String retrievalReferenceNumber = null;

	/**
	 * The Acquirer Reference Number (ARN) is a unique identifier assigned to a card payment as it moves through the payment network.
	 */
	public String getAcquirerReferenceNumber() {
		return acquirerReferenceNumber;
	}

	/**
	 * The Acquirer Reference Number (ARN) is a unique identifier assigned to a card payment as it moves through the payment network.
	 */
	public void setAcquirerReferenceNumber(String value) {
		this.acquirerReferenceNumber = value;
	}

	/**
	 * The payment amount
	 */
	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	/**
	 * The payment amount
	 */
	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	/**
	 * Our unique payment transaction identifier.
	 */
	public String getPaymentId() {
		return paymentId;
	}

	/**
	 * Our unique payment transaction identifier.
	 */
	public void setPaymentId(String value) {
		this.paymentId = value;
	}

	/**
	 * The Retrieval Reference Number (RRN) provides a unique reference for a card payment, pinpointing it to a specific date.
	 */
	public String getRetrievalReferenceNumber() {
		return retrievalReferenceNumber;
	}

	/**
	 * The Retrieval Reference Number (RRN) provides a unique reference for a card payment, pinpointing it to a specific date.
	 */
	public void setRetrievalReferenceNumber(String value) {
		this.retrievalReferenceNumber = value;
	}
}
