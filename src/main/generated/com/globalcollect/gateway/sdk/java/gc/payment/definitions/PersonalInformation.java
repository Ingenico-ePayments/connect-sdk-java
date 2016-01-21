package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PersonalName;

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
