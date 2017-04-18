/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_MandateSepaDirectDebitWithMandateId">MandateSepaDirectDebitWithMandateId</a>
 */
public class MandateSepaDirectDebitWithMandateId extends MandateSepaDirectDebitWithoutCreditor {

	private String mandateId = null;

	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String value) {
		this.mandateId = value;
	}
}
