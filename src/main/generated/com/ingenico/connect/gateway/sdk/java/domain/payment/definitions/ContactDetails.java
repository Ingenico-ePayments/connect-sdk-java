/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.ContactDetailsBase;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_ContactDetails">ContactDetails</a>
 */
public class ContactDetails extends ContactDetailsBase {

	private String faxNumber = null;

	private String phoneNumber = null;

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String value) {
		this.faxNumber = value;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String value) {
		this.phoneNumber = value;
	}
}
