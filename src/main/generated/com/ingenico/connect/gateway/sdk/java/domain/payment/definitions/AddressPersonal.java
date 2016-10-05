/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.PersonalName;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_AddressPersonal">AddressPersonal</a>
 */
public class AddressPersonal extends Address {

	private PersonalName name = null;

	public PersonalName getName() {
		return name;
	}

	public void setName(PersonalName value) {
		this.name = value;
	}
}
