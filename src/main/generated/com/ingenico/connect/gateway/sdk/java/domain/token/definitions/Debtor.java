/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

/**
 * This object describes the the consumer (or company) that will be debited and it is part of a SEPA Direct Debit Mandate
 */
public class Debtor {

	private String additionalAddressInfo = null;

	private String city = null;

	private String countryCode = null;

	private String firstName = null;

	private String houseNumber = null;

	private String state = null;

	private String stateCode = null;

	private String street = null;

	private String surname = null;

	private String surnamePrefix = null;

	private String zip = null;

	/**
	 * Additional information about the debtor's address, like Suite II, Apartment 2a
	 */
	public String getAdditionalAddressInfo() {
		return additionalAddressInfo;
	}

	/**
	 * Additional information about the debtor's address, like Suite II, Apartment 2a
	 */
	public void setAdditionalAddressInfo(String value) {
		this.additionalAddressInfo = value;
	}

	/**
	 * City of the debtor's address
	 */
	public String getCity() {
		return city;
	}

	/**
	 * City of the debtor's address
	 */
	public void setCity(String value) {
		this.city = value;
	}

	/**
	 * ISO 3166-1 alpha-2 country code of the debtor's address
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * ISO 3166-1 alpha-2 country code of the debtor's address
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 * Debtor first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Debtor first name
	 */
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * House number of the debtor's address
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * House number of the debtor's address
	 */
	public void setHouseNumber(String value) {
		this.houseNumber = value;
	}

	/**
	 * State of debtor address
	 */
	public String getState() {
		return state;
	}

	/**
	 * State of debtor address
	 */
	public void setState(String value) {
		this.state = value;
	}

	/**
	 * ISO 3166-2 alpha-3 state code<br>
	 * Notes:<br><ul class="paragraph-width"><li>The maximum length for 3-D Secure version 2 is AN3.<li>The maximum length for paymentProductId 1503 (Boleto) is AN2.</ul>
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * ISO 3166-2 alpha-3 state code<br>
	 * Notes:<br><ul class="paragraph-width"><li>The maximum length for 3-D Secure version 2 is AN3.<li>The maximum length for paymentProductId 1503 (Boleto) is AN2.</ul>
	 */
	public void setStateCode(String value) {
		this.stateCode = value;
	}

	/**
	 * Street of debtor's address
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Street of debtor's address
	 */
	public void setStreet(String value) {
		this.street = value;
	}

	/**
	 * Debtor's last name
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Debtor's last name
	 */
	public void setSurname(String value) {
		this.surname = value;
	}

	/**
	 * Prefix of the debtor's last name
	 */
	public String getSurnamePrefix() {
		return surnamePrefix;
	}

	/**
	 * Prefix of the debtor's last name
	 */
	public void setSurnamePrefix(String value) {
		this.surnamePrefix = value;
	}

	/**
	 * ZIP code of the debtor's address
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * ZIP code of the debtor's address
	 */
	public void setZip(String value) {
		this.zip = value;
	}
}
