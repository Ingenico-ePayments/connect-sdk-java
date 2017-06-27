/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;

public class AddressPersonal extends Address {

	private PersonalName name = null;

	/**
	 * Object that holds the name elements
	 */
	public PersonalName getName() {
		return name;
	}

	/**
	 * Object that holds the name elements
	 */
	public void setName(PersonalName value) {
		this.name = value;
	}
}
