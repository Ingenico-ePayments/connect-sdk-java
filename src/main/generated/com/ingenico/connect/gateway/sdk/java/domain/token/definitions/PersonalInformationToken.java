/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

public class PersonalInformationToken {

	private PersonalNameToken name = null;

	/**
	 * Given name(s) or first name(s) of the customer
	 */
	public PersonalNameToken getName() {
		return name;
	}

	/**
	 * Given name(s) or first name(s) of the customer
	 */
	public void setName(PersonalNameToken value) {
		this.name = value;
	}
}
