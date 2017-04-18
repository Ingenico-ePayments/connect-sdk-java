/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CustomerTokenWithContactDetails">CustomerTokenWithContactDetails</a>
 */
public class CustomerTokenWithContactDetails extends CustomerToken {

	private ContactDetailsToken contactDetails = null;

	public ContactDetailsToken getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetailsToken value) {
		this.contactDetails = value;
	}
}
