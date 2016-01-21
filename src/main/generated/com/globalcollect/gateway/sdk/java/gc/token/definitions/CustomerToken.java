package com.globalcollect.gateway.sdk.java.gc.token.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.token.definitions.PersonalInformationToken;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CustomerBase;

public class CustomerToken extends CustomerBase {

	private Address billingAddress = null;

	private PersonalInformationToken personalInformation = null;

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address value) {
		this.billingAddress = value;
	}

	public PersonalInformationToken getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformationToken value) {
		this.personalInformation = value;
	}
}
