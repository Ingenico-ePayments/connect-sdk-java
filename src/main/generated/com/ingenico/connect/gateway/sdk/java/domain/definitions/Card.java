/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class Card extends CardWithoutCvv {

	private String cvv = null;

	/**
	 * Card Verification Value, a 3 or 4 digit code used as an additional security feature for card not present transactions. 
	 */
	public String getCvv() {
		return cvv;
	}

	/**
	 * Card Verification Value, a 3 or 4 digit code used as an additional security feature for card not present transactions. 
	 */
	public void setCvv(String value) {
		this.cvv = value;
	}
}
