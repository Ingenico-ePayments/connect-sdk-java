/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

public class Creditor {

	private String additionalAddressInfo = null;

	private String city = null;

	private String countryCode = null;

	private String houseNumber = null;

	private String iban = null;

	private String id = null;

	private String name = null;

	private String referenceParty = null;

	private String referencePartyId = null;

	private String street = null;

	private String zip = null;

	/**
	 * Additional information about the creditor's address, like Suite II, Apartment 2a
	 */
	public String getAdditionalAddressInfo() {
		return additionalAddressInfo;
	}

	/**
	 * Additional information about the creditor's address, like Suite II, Apartment 2a
	 */
	public void setAdditionalAddressInfo(String value) {
		this.additionalAddressInfo = value;
	}

	/**
	 * City of the creditor address
	 */
	public String getCity() {
		return city;
	}

	/**
	 * City of the creditor address
	 */
	public void setCity(String value) {
		this.city = value;
	}

	/**
	 * ISO 3166-1 alpha-2 country code
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * ISO 3166-1 alpha-2 country code
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 * House number of the creditor address
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * House number of the creditor address
	 */
	public void setHouseNumber(String value) {
		this.houseNumber = value;
	}

	/**
	 * Creditor IBAN number<br>
	 * The IBAN is the International Bank Account Number. It is an internationally agreed format for the bank account number and includes the ISO country code and two check digits.
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * Creditor IBAN number<br>
	 * The IBAN is the International Bank Account Number. It is an internationally agreed format for the bank account number and includes the ISO country code and two check digits.
	 */
	public void setIban(String value) {
		this.iban = value;
	}

	/**
	 * Creditor identifier
	 */
	public String getId() {
		return id;
	}

	/**
	 * Creditor identifier
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Name of the collecting creditor
	 */
	public String getName() {
		return name;
	}

	/**
	 * Name of the collecting creditor
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Creditor type of the legal reference of the collecting entity
	 */
	public String getReferenceParty() {
		return referenceParty;
	}

	/**
	 * Creditor type of the legal reference of the collecting entity
	 */
	public void setReferenceParty(String value) {
		this.referenceParty = value;
	}

	/**
	 * Legal reference of the collecting creditor
	 */
	public String getReferencePartyId() {
		return referencePartyId;
	}

	/**
	 * Legal reference of the collecting creditor
	 */
	public void setReferencePartyId(String value) {
		this.referencePartyId = value;
	}

	/**
	 * Street of the creditor address
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Street of the creditor address
	 */
	public void setStreet(String value) {
		this.street = value;
	}

	/**
	 * ZIP code of the creditor address
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * ZIP code of the creditor address
	 */
	public void setZip(String value) {
		this.zip = value;
	}
}
