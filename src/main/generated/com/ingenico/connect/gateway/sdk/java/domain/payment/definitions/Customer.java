/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
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

	private Boolean isCompany = null;

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
	 * The fiscal registration number of the customer or the tax registration number of the company in case of a business customer. Please find below specifics per country:
	 * <ul class="paragraph-width">
	 * <li>Argentina - Consumer (DNI) with a length of 7 or 8 digits
	 * <li>Argentina - Company (CUIT) with a length of 11 digits
	 * <li>Brazil - Consumer (CPF) with a length of 11 digits
	 * <li>Brazil - Company (CNPJ) with a length of 14 digits
	 * <li>Chile - Consumer (RUT) with a length of 9 digits
	 * <li>Colombia - Consumer (NIT) with a length of 8, 9 or 10 digits
	 * <li>Denmark - Consumer (CPR-nummer or personnummer) with a length of 10 digits
	 * <li>Dominican Republic - Consumer (RNC) with a length of 11 digits
	 * <li>Finland - Consumer (Finnish: henkilötunnus (abbreviated as HETU)) with a length of 11 characters
	 * <li>India - Consumer (PAN) with a length of 10 characters
	 * <li>Mexico - Consumer (RFC) with a length of 13 digits
	 * <li>Mexico - Company (RFC) with a length of 12 digits
	 * <li>Norway - Consumer (fødselsnummer) with a length of 11 digits
	 * <li>Peru - Consumer (RUC) with a length of 11 digits
	 * <li>Sweden - Consumer (personnummer) with a length of 10 or 12 digits
	 * <li>Uruguay - Consumer (CI) with a length of 8 digits
	 * <li>Uruguay - Consumer (NIE) with a length of 9 digits
	 * <li>Uruguay - Company (RUT) with a length of 12 digits
	 * </ul>
	 */
	public String getFiscalNumber() {
		return fiscalNumber;
	}

	/**
	 * The fiscal registration number of the customer or the tax registration number of the company in case of a business customer. Please find below specifics per country:
	 * <ul class="paragraph-width">
	 * <li>Argentina - Consumer (DNI) with a length of 7 or 8 digits
	 * <li>Argentina - Company (CUIT) with a length of 11 digits
	 * <li>Brazil - Consumer (CPF) with a length of 11 digits
	 * <li>Brazil - Company (CNPJ) with a length of 14 digits
	 * <li>Chile - Consumer (RUT) with a length of 9 digits
	 * <li>Colombia - Consumer (NIT) with a length of 8, 9 or 10 digits
	 * <li>Denmark - Consumer (CPR-nummer or personnummer) with a length of 10 digits
	 * <li>Dominican Republic - Consumer (RNC) with a length of 11 digits
	 * <li>Finland - Consumer (Finnish: henkilötunnus (abbreviated as HETU)) with a length of 11 characters
	 * <li>India - Consumer (PAN) with a length of 10 characters
	 * <li>Mexico - Consumer (RFC) with a length of 13 digits
	 * <li>Mexico - Company (RFC) with a length of 12 digits
	 * <li>Norway - Consumer (fødselsnummer) with a length of 11 digits
	 * <li>Peru - Consumer (RUC) with a length of 11 digits
	 * <li>Sweden - Consumer (personnummer) with a length of 10 or 12 digits
	 * <li>Uruguay - Consumer (CI) with a length of 8 digits
	 * <li>Uruguay - Consumer (NIE) with a length of 9 digits
	 * <li>Uruguay - Company (RUT) with a length of 12 digits
	 * </ul>
	 */
	public void setFiscalNumber(String value) {
		this.fiscalNumber = value;
	}

	/**
	 * Indicates if the payer is a company or an individual
	 * <ul class="paragraph-width">
	 * <li>true =  This is a company
	 * <li>false = This is an individual
	 * </ul>
	 */
	public Boolean getIsCompany() {
		return isCompany;
	}

	/**
	 * Indicates if the payer is a company or an individual
	 * <ul class="paragraph-width">
	 * <li>true =  This is a company
	 * <li>false = This is an individual
	 * </ul>
	 */
	public void setIsCompany(Boolean value) {
		this.isCompany = value;
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
