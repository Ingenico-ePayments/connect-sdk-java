package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CardWithoutCvv;

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
