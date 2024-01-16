/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardEssentials;

public class RefundCardMethodSpecificOutput extends RefundMethodSpecificOutput {

	private String authorisationCode = null;

	private CardEssentials card = null;

	/**
	 * Card Authorization code as returned by the acquirer
	 */
	public String getAuthorisationCode() {
		return authorisationCode;
	}

	/**
	 * Card Authorization code as returned by the acquirer
	 */
	public void setAuthorisationCode(String value) {
		this.authorisationCode = value;
	}

	/**
	 * Object containing card details
	 */
	public CardEssentials getCard() {
		return card;
	}

	/**
	 * Object containing card details
	 */
	public void setCard(CardEssentials value) {
		this.card = value;
	}
}
