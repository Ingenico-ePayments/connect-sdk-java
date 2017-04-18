/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PersonalInformation">PersonalInformation</a>
 */
public class PersonalInformation {

	private String dateOfBirth = null;

	private String gender = null;

	private PersonalName name = null;

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String value) {
		this.dateOfBirth = value;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String value) {
		this.gender = value;
	}

	public PersonalName getName() {
		return name;
	}

	public void setName(PersonalName value) {
		this.name = value;
	}
}
