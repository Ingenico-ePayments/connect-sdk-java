package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PersonalName;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;

public class AddressPersonal extends Address {

	private PersonalName name = null;

	public PersonalName getName() {
		return name;
	}

	public void setName(PersonalName value) {
		this.name = value;
	}
}
