/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions;

public class MandatePersonalName {

	private String firstName = null;

	private String surname = null;

	/**
	 * Given name(s) or first name(s) of the consumer
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Given name(s) or first name(s) of the consumer
	 */
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * Surname(s) or last name(s) of the consumer
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Surname(s) or last name(s) of the consumer
	 */
	public void setSurname(String value) {
		this.surname = value;
	}
}
