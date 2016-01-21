package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.ContactDetailsBase;

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
