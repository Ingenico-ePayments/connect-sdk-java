/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CustomerBase;

public class CustomerToken extends CustomerBase {

	private Address billingAddress = null;

	private PersonalInformationToken personalInformation = null;

	/**
	 * Object containing the billing address details
	 */
	public Address getBillingAddress() {
		return billingAddress;
	}

	/**
	 * Object containing the billing address details
	 */
	public void setBillingAddress(Address value) {
		this.billingAddress = value;
	}

	/**
	 * Object containing personal information of the customer
	 */
	public PersonalInformationToken getPersonalInformation() {
		return personalInformation;
	}

	/**
	 * Object containing personal information of the customer
	 */
	public void setPersonalInformation(PersonalInformationToken value) {
		this.personalInformation = value;
	}
}
