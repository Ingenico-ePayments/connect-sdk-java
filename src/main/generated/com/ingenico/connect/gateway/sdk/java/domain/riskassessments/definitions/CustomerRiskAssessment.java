/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.AddressPersonal;

public class CustomerRiskAssessment {

	private Address billingAddress = null;

	private ContactDetailsRiskAssessment contactDetails = null;

	private String locale = null;

	private PersonalInformationRiskAssessment personalInformation = null;

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
	 * Object containing contact details like email address
	 */
	public ContactDetailsRiskAssessment getContactDetails() {
		return contactDetails;
	}

	/**
	 * Object containing contact details like email address
	 */
	public void setContactDetails(ContactDetailsRiskAssessment value) {
		this.contactDetails = value;
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
	 * Object containing personal information like name, date of birth and gender
	 */
	public PersonalInformationRiskAssessment getPersonalInformation() {
		return personalInformation;
	}

	/**
	 * Object containing personal information like name, date of birth and gender
	 */
	public void setPersonalInformation(PersonalInformationRiskAssessment value) {
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
