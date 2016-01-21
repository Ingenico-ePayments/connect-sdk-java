package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.ContactDetailsToken;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.CustomerToken;

public class CustomerTokenWithContactDetails extends CustomerToken {

	private ContactDetailsToken contactDetails = null;

	public ContactDetailsToken getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetailsToken value) {
		this.contactDetails = value;
	}
}
