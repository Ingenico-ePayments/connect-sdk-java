/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.ContactDetailsBase;

public class ContactDetails extends ContactDetailsBase {

	private String faxNumber = null;

	private String phoneNumber = null;

	/**
	 * Fax number of the consumer
	 */
	public String getFaxNumber() {
		return faxNumber;
	}

	/**
	 * Fax number of the consumer
	 */
	public void setFaxNumber(String value) {
		this.faxNumber = value;
	}

	/**
	 * Phone number of the consumer
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Phone number of the consumer
	 */
	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
}
