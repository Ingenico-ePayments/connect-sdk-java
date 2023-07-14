/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions;

public class MandatePersonalInformation {

	private MandatePersonalName name = null;

	private String title = null;

	/**
	 * Object containing the name details of the customer
	 */
	public MandatePersonalName getName() {
		return name;
	}

	/**
	 * Object containing the name details of the customer
	 */
	public void setName(MandatePersonalName value) {
		this.name = value;
	}

	/**
	 * Object containing the title of the customer (Mr, Miss or Mrs)
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Object containing the title of the customer (Mr, Miss or Mrs)
	 */
	public void setTitle(String value) {
		this.title = value;
	}
}
