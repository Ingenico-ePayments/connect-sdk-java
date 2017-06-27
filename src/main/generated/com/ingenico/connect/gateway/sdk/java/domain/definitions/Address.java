/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class Address {

	private String additionalInfo = null;

	private String city = null;

	private String countryCode = null;

	private String houseNumber = null;

	private String state = null;

	private String stateCode = null;

	private String street = null;

	private String zip = null;

	/**
	 * Additional address information
	 */
	public String getAdditionalInfo() {
		return additionalInfo;
	}

	/**
	 * Additional address information
	 */
	public void setAdditionalInfo(String value) {
		this.additionalInfo = value;
	}

	/**
	 * City
	 */
	public String getCity() {
		return city;
	}

	/**
	 * City
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
	 * House number
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * House number
	 */
	public void setHouseNumber(String value) {
		this.houseNumber = value;
	}

	/**
	 * Full name of the state or province
	 */
	public String getState() {
		return state;
	}

	/**
	 * Full name of the state or province
	 */
	public void setState(String value) {
		this.state = value;
	}

	/**
	 * State code
	 */
	public String getStateCode() {
		return stateCode;
	}

	/**
	 * State code
	 */
	public void setStateCode(String value) {
		this.stateCode = value;
	}

	/**
	 * Streetname
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * Streetname
	 */
	public void setStreet(String value) {
		this.street = value;
	}

	/**
	 * Zip code
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Zip code
	 */
	public void setZip(String value) {
		this.zip = value;
	}
}
