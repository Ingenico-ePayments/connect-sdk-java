/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.AddressPersonal;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.ContactDetails;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.PersonalInformation;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CustomerBase;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_Customer">Customer</a>
 */
public class Customer extends CustomerBase {

	private Address billingAddress = null;

	private ContactDetails contactDetails = null;

	private String fiscalNumber = null;

	private String locale = null;

	private PersonalInformation personalInformation = null;

	private AddressPersonal shippingAddress = null;

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address value) {
		this.billingAddress = value;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails value) {
		this.contactDetails = value;
	}

	public String getFiscalNumber() {
		return fiscalNumber;
	}

	public void setFiscalNumber(String value) {
		this.fiscalNumber = value;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String value) {
		this.locale = value;
	}

	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformation value) {
		this.personalInformation = value;
	}

	public AddressPersonal getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(AddressPersonal value) {
		this.shippingAddress = value;
	}
}
