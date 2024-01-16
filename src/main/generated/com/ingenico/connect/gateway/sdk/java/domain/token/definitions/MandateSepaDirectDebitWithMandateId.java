/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

public class MandateSepaDirectDebitWithMandateId extends MandateSepaDirectDebitWithoutCreditor {

	private String mandateId = null;

	/**
	 * Unique mandate identifier
	 */
	public String getMandateId() {
		return mandateId;
	}

	/**
	 * Unique mandate identifier
	 */
	public void setMandateId(String value) {
		this.mandateId = value;
	}
}
