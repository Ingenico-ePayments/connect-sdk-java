/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

public class CustomerTokenWithContactDetails extends CustomerToken {

	private ContactDetailsToken contactDetails = null;

	/**
	 * Object containing contact details like email address and phone number
	 */
	public ContactDetailsToken getContactDetails() {
		return contactDetails;
	}

	/**
	 * Object containing contact details like email address and phone number
	 */
	public void setContactDetails(ContactDetailsToken value) {
		this.contactDetails = value;
	}
}
