/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.BankAccountIban;

public class MandateCustomer {

	private BankAccountIban bankAccountIban = null;

	private String companyName = null;

	private MandateContactDetails contactDetails = null;

	private MandateAddress mandateAddress = null;

	private MandatePersonalInformation personalInformation = null;

	/**
	 * Object containing IBAN information
	 */
	public BankAccountIban getBankAccountIban() {
		return bankAccountIban;
	}

	/**
	 * Object containing IBAN information
	 */
	public void setBankAccountIban(BankAccountIban value) {
		this.bankAccountIban = value;
	}

	/**
	 * Name of company, as a customer
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * Name of company, as a customer
	 */
	public void setCompanyName(String value) {
		this.companyName = value;
	}

	/**
	 * Object containing contact details like email address and phone number
	 */
	public MandateContactDetails getContactDetails() {
		return contactDetails;
	}

	/**
	 * Object containing contact details like email address and phone number
	 */
	public void setContactDetails(MandateContactDetails value) {
		this.contactDetails = value;
	}

	/**
	 * Object containing billing address details
	 */
	public MandateAddress getMandateAddress() {
		return mandateAddress;
	}

	/**
	 * Object containing billing address details
	 */
	public void setMandateAddress(MandateAddress value) {
		this.mandateAddress = value;
	}

	/**
	 * Object containing personal information of the customer
	 */
	public MandatePersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	/**
	 * Object containing personal information of the customer
	 */
	public void setPersonalInformation(MandatePersonalInformation value) {
		this.personalInformation = value;
	}
}
