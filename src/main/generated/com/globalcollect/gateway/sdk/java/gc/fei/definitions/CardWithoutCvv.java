package com.globalcollect.gateway.sdk.java.gc.fei.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CardEssentials;

public class CardWithoutCvv extends CardEssentials {

	private String cardholderName = null;

	private String issueNumber = null;

	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String value) {
		this.cardholderName = value;
	}

	public String getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(String value) {
		this.issueNumber = value;
	}
}
