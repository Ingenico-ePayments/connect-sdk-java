/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class ContactDetailsBase {

	private String emailAddress = null;

	private String emailMessageType = null;

	/**
	 * Email address of the customer
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Email address of the customer
	 */
	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	/**
	 * Preference for the type of email message markup
	 * <ul class="paragraph-width"><li>plain-text
	 * <li>html
	 * </ul>
	 */
	public String getEmailMessageType() {
		return emailMessageType;
	}

	/**
	 * Preference for the type of email message markup
	 * <ul class="paragraph-width"><li>plain-text
	 * <li>html
	 * </ul>
	 */
	public void setEmailMessageType(String value) {
		this.emailMessageType = value;
	}
}
