/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.CardWithoutCvv;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_TokenCardData">TokenCardData</a>
 */
public class TokenCardData {

	private CardWithoutCvv cardWithoutCvv = null;

	private String firstTransactionDate = null;

	private String providerReference = null;

	public CardWithoutCvv getCardWithoutCvv() {
		return cardWithoutCvv;
	}

	public void setCardWithoutCvv(CardWithoutCvv value) {
		this.cardWithoutCvv = value;
	}

	public String getFirstTransactionDate() {
		return firstTransactionDate;
	}

	public void setFirstTransactionDate(String value) {
		this.firstTransactionDate = value;
	}

	public String getProviderReference() {
		return providerReference;
	}

	public void setProviderReference(String value) {
		this.providerReference = value;
	}
}
