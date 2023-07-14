/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class CardWithoutCvv extends CardEssentials {

	private String issueNumber = null;

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
