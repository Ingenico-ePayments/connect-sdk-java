/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.CustomerBase;

/**
 * Object containing data related to the customer
 */
public class Customer extends CustomerBase {

	private CustomerAccount account = null;

	private String accountType = null;

	private Address billingAddress = null;

	private ContactDetails contactDetails = null;

	private CustomerDevice device = null;

	private String fiscalNumber = null;

	private Boolean isPreviousCustomer = null;

	private String locale = null;

	private PersonalInformation personalInformation = null;

	private AddressPersonal shippingAddress = null;

	/**
	 * Object containing data related to the account the customer has with you
	 */
	public CustomerAccount getAccount() {
		return account;
	}

	/**
	 * Object containing data related to the account the customer has with you
	 */
	public void setAccount(CustomerAccount value) {
		this.account = value;
	}

	/**
	 * Type of the customer account that is used to place this order. Can have one of the following values:
	 * <ul class="paragraph-width"><li>none - The account that was used to place the order with is a guest account or no account was used at all
	 * <li>created - The customer account was created during this transaction
	 * <li>existing - The customer account was an already existing account prior to this transaction</ul>
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Type of the customer account that is used to place this order. Can have one of the following values:
	 * <ul class="paragraph-width"><li>none - The account that was used to place the order with is a guest account or no account was used at all
	 * <li>created - The customer account was created during this transaction
	 * <li>existing - The customer account was an already existing account prior to this transaction</ul>
	 */
	public void setAccountType(String value) {
		this.accountType = value;
	}

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
	 * Object containing information on the device and browser of the customer
	 */
	public CustomerDevice getDevice() {
		return device;
	}

	/**
	 * Object containing information on the device and browser of the customer
	 */
	public void setDevice(CustomerDevice value) {
		this.device = value;
	}

	/**
	 * Fiscal registration number of the customer or the tax registration number of the company for a business customer. Please find below specifics per country:
	 * <ul class="paragraph-width">
	 * <li>Brazil - Consumer (CPF) with a length of 11 digits
	 * <li>Brazil - Company (CNPJ) with a length of 14 digits
	 * <li>Denmark - Consumer (CPR-nummer or personnummer) with a length of 10 digits
	 * <li>Finland - Consumer (Finnish: henkilötunnus (abbreviated as HETU), Swedish: personbeteckning) with a length of 11 characters
	 * <li>Norway - Consumer (fødselsnummer) with a length of 11 digits
	 * <li>Sweden - Consumer (personnummer) with a length of 10 or 12 digits
	 * </ul>
	 */
	public String getFiscalNumber() {
		return fiscalNumber;
	}

	/**
	 * Fiscal registration number of the customer or the tax registration number of the company for a business customer. Please find below specifics per country:
	 * <ul class="paragraph-width">
	 * <li>Brazil - Consumer (CPF) with a length of 11 digits
	 * <li>Brazil - Company (CNPJ) with a length of 14 digits
	 * <li>Denmark - Consumer (CPR-nummer or personnummer) with a length of 10 digits
	 * <li>Finland - Consumer (Finnish: henkilötunnus (abbreviated as HETU), Swedish: personbeteckning) with a length of 11 characters
	 * <li>Norway - Consumer (fødselsnummer) with a length of 11 digits
	 * <li>Sweden - Consumer (personnummer) with a length of 10 or 12 digits
	 * </ul>
	 */
	public void setFiscalNumber(String value) {
		this.fiscalNumber = value;
	}

	/**
	 * Specifies if the customer has a history of online shopping with the merchant
	 * <ul class="paragraph-width">
	 * <li>true - The customer is a known returning customer
	 * <li>false - The customer is new/unknown customer
	 * </ul>
	 */
	public Boolean getIsPreviousCustomer() {
		return isPreviousCustomer;
	}

	/**
	 * Specifies if the customer has a history of online shopping with the merchant
	 * <ul class="paragraph-width">
	 * <li>true - The customer is a known returning customer
	 * <li>false - The customer is new/unknown customer
	 * </ul>
	 */
	public void setIsPreviousCustomer(Boolean value) {
		this.isPreviousCustomer = value;
	}

	/**
	 * The locale that the customer should be addressed in (for 3rd parties). Note that some 3rd party providers only support the languageCode part of the locale, in those cases we will only use part of the locale provided.
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * The locale that the customer should be addressed in (for 3rd parties). Note that some 3rd party providers only support the languageCode part of the locale, in those cases we will only use part of the locale provided.
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
	 *
	 * @deprecated Use Order.shipping.address instead
	 */
	@Deprecated
	public AddressPersonal getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * Object containing shipping address details
	 *
	 * @deprecated Use Order.shipping.address instead
	 */
	@Deprecated
	public void setShippingAddress(AddressPersonal value) {
		this.shippingAddress = value;
	}
}
