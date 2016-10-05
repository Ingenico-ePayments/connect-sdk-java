/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.token.definitions.PersonalInformationToken;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CustomerBase;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CustomerToken">CustomerToken</a>
 */
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
