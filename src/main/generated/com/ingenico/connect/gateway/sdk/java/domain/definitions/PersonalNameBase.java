/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PersonalNameBase">PersonalNameBase</a>
 */
public class PersonalNameBase {

	private String firstName = null;

	private String surname = null;

	private String surnamePrefix = null;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String value) {
		this.firstName = value;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String value) {
		this.surname = value;
	}

	public String getSurnamePrefix() {
		return surnamePrefix;
	}

	public void setSurnamePrefix(String value) {
		this.surnamePrefix = value;
	}
}
