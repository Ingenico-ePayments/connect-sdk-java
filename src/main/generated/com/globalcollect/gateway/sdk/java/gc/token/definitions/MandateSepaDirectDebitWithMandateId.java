package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.MandateSepaDirectDebitWithoutCreditor;

public class MandateSepaDirectDebitWithMandateId extends MandateSepaDirectDebitWithoutCreditor {

	private String mandateId = null;

	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String value) {
		this.mandateId = value;
	}
}
