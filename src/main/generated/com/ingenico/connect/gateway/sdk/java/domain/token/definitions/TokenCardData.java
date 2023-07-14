/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardWithoutCvv;

public class TokenCardData {

	private CardWithoutCvv cardWithoutCvv = null;

	private String firstTransactionDate = null;

	private String providerReference = null;

	/**
	 * Object containing the card details (without CVV)
	 */
	public CardWithoutCvv getCardWithoutCvv() {
		return cardWithoutCvv;
	}

	/**
	 * Object containing the card details (without CVV)
	 */
	public void setCardWithoutCvv(CardWithoutCvv value) {
		this.cardWithoutCvv = value;
	}

	/**
	 * Date of the first transaction (for ATOS)<br>
	 * Format: YYYYMMDD
	 */
	public String getFirstTransactionDate() {
		return firstTransactionDate;
	}

	/**
	 * Date of the first transaction (for ATOS)<br>
	 * Format: YYYYMMDD
	 */
	public void setFirstTransactionDate(String value) {
		this.firstTransactionDate = value;
	}

	/**
	 * Reference of the provider (of the first transaction) - used to store the ATOS Transaction Certificate
	 */
	public String getProviderReference() {
		return providerReference;
	}

	/**
	 * Reference of the provider (of the first transaction) - used to store the ATOS Transaction Certificate
	 */
	public void setProviderReference(String value) {
		this.providerReference = value;
	}
}
