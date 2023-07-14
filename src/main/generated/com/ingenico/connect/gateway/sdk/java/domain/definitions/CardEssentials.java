/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class CardEssentials {

	private String cardNumber = null;

	private String cardholderName = null;

	private String expiryDate = null;

	/**
	 * The complete credit/debit card number
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * The complete credit/debit card number
	 */
	public void setCardNumber(String value) {
		this.cardNumber = value;
	}

	/**
	 * The card holder's name on the card.
	 */
	public String getCardholderName() {
		return cardholderName;
	}

	/**
	 * The card holder's name on the card.
	 */
	public void setCardholderName(String value) {
		this.cardholderName = value;
	}

	/**
	 * Expiry date of the card<br>
	 * Format: MMYY
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * Expiry date of the card<br>
	 * Format: MMYY
	 */
	public void setExpiryDate(String value) {
		this.expiryDate = value;
	}
}
