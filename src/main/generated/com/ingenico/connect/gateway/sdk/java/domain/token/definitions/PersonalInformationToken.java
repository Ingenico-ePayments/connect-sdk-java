/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.PersonalNameToken;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PersonalInformationToken">PersonalInformationToken</a>
 */
public class PersonalInformationToken {

	private PersonalNameToken name = null;

	public PersonalNameToken getName() {
		return name;
	}

	public void setName(PersonalNameToken value) {
		this.name = value;
	}
}
