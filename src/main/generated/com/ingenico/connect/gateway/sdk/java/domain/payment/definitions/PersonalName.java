/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.PersonalNameBase;

public class PersonalName extends PersonalNameBase {

	private String title = null;

	/**
	 * Title of consumer
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Title of consumer
	 */
	public void setTitle(String value) {
		this.title = value;
	}
}
