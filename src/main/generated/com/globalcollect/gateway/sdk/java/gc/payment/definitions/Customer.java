package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.AddressPersonal;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.ContactDetails;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.PersonalInformation;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.CustomerBase;

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
