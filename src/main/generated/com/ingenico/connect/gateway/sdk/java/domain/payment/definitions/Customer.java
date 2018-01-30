/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CustomerBase;

/**
 * This object contains information about the consumer
 */
public class Customer extends CustomerBase {

	private Address billingAddress = null;

	private ContactDetails contactDetails = null;

	private String fiscalNumber = null;

	private String locale = null;

	private PersonalInformation personalInformation = null;

	private AddressPersonal shippingAddress = null;

	/**
	 * Object containing billing address details
	 */
	public Address getBillingAddress() {
		return billingAddress;
	}

	/**
	 * Object containing billing address details
	 */
	public void setBillingAddress(Address value) {
		this.billingAddress = value;
	}

	/**
	 * Object containing contact details like email address and phone number
	 */
	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	/**
	 * Object containing contact details like email address and phone number
	 */
	public void setContactDetails(ContactDetails value) {
		this.contactDetails = value;
	}

	/**
	 * Fiscal registration number of the consumer (CPF) with a length of 11 or the tax registration number of the company for a business consumer (CNPJ) with a length of 14.
	 */
	public String getFiscalNumber() {
		return fiscalNumber;
	}

	/**
	 * Fiscal registration number of the consumer (CPF) with a length of 11 or the tax registration number of the company for a business consumer (CNPJ) with a length of 14.
	 */
	public void setFiscalNumber(String value) {
		this.fiscalNumber = value;
	}

	/**
	 * The locale that the consumer should be addressed in (for 3rd parties). Note that some 3rd party providers only support the languageCode part of the locale, in those cases we will only use part of the locale provided.
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * The locale that the consumer should be addressed in (for 3rd parties). Note that some 3rd party providers only support the languageCode part of the locale, in those cases we will only use part of the locale provided.
	 */
	public void setLocale(String value) {
		this.locale = value;
	}

	/**
	 * Object containing personal information like name, date of birth and gender.
	 */
	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	/**
	 * Object containing personal information like name, date of birth and gender.
	 */
	public void setPersonalInformation(PersonalInformation value) {
		this.personalInformation = value;
	}

	/**
	 * Object containing shipping address details
	 */
	public AddressPersonal getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * Object containing shipping address details
	 */
	public void setShippingAddress(AddressPersonal value) {
		this.shippingAddress = value;
	}
}
