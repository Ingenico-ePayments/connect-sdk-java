/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_MandateSepaDirectDebit">MandateSepaDirectDebit</a>
 */
public class MandateSepaDirectDebit extends MandateSepaDirectDebitWithMandateId {

	private Creditor creditor = null;

	public Creditor getCreditor() {
		return creditor;
	}

	public void setCreditor(Creditor value) {
		this.creditor = value;
	}
}
