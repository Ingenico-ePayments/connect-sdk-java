/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CardWithoutCvv">CardWithoutCvv</a>
 */
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
