package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.Creditor;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.MandateSepaDirectDebitWithMandateId;

public class MandateSepaDirectDebit extends MandateSepaDirectDebitWithMandateId {

	private Creditor creditor = null;

	public Creditor getCreditor() {
		return creditor;
	}

	public void setCreditor(Creditor value) {
		this.creditor = value;
	}
}
