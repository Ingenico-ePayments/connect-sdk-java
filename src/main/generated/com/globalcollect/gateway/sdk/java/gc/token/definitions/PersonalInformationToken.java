package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.token.definitions.PersonalNameToken;

public class PersonalInformationToken {

	private PersonalNameToken name = null;

	public PersonalNameToken getName() {
		return name;
	}

	public void setName(PersonalNameToken value) {
		this.name = value;
	}
}
