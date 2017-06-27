/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class CardWithoutCvv extends CardEssentials {

	private String cardholderName = null;

	private String issueNumber = null;

	/**
	 * Card holder's name on the card
	 */
	public String getCardholderName() {
		return cardholderName;
	}

	/**
	 * Card holder's name on the card
	 */
	public void setCardholderName(String value) {
		this.cardholderName = value;
	}

	/**
	 * Issue number on the card (if applicable)
	 */
	public String getIssueNumber() {
		return issueNumber;
	}

	/**
	 * Issue number on the card (if applicable)
	 */
	public void setIssueNumber(String value) {
		this.issueNumber = value;
	}
}
