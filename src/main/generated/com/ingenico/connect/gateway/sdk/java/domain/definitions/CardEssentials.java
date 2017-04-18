/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CardEssentials">CardEssentials</a>
 */
public class CardEssentials {

	private String cardNumber = null;

	private String expiryDate = null;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String value) {
		this.cardNumber = value;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String value) {
		this.expiryDate = value;
	}
}
