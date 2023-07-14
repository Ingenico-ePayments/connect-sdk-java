/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

public class MandateSepaDirectDebit extends MandateSepaDirectDebitWithMandateId {

	private Creditor creditor = null;

	/**
	 * Object containing information on the creditor
	 */
	public Creditor getCreditor() {
		return creditor;
	}

	/**
	 * Object containing information on the creditor
	 */
	public void setCreditor(Creditor value) {
		this.creditor = value;
	}
}
