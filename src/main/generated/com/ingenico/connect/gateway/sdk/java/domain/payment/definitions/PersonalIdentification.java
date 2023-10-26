/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class PersonalIdentification {

	private String idIssuingCountryCode = null;

	private String idType = null;

	private String idValue = null;

	/**
	 * ISO 3166-1 alpha-2 country code of the country that issued the identification document
	 */
	public String getIdIssuingCountryCode() {
		return idIssuingCountryCode;
	}

	/**
	 * ISO 3166-1 alpha-2 country code of the country that issued the identification document
	 */
	public void setIdIssuingCountryCode(String value) {
		this.idIssuingCountryCode = value;
	}

	/**
	 * Indicates the type of identification 
	 * <ul class="paragraph-width">
	 * <li>nationalIdentification = The provided idValue is a national identification number.
	 * <li>passportNumber = The provided idValue is a passport number.
	 * <li>driverLicense = The provided idValue is driving License of the individual.
	 * <li>companyRegistrationNumber = The provided idValue is a company identifier. It verifies its legal existence as an incorporated entity.
	 * <li>socialSecurityNumber =n The provided idValue is a social security number, issued to an individual by the individual's government.
	 * <li>alienRegistrationNumber = The provided idValue is an alien registration number, provided by immigration services of a country.
	 * <li>lawEnforcementIdentification = The provided idValue is an alien registration number, provided by immigration services of a country.
	 * <li>militaryIdentification = The provided idValue is an identification issued to military personnel of a country.
	 * </ul>
	 */
	public String getIdType() {
		return idType;
	}

	/**
	 * Indicates the type of identification 
	 * <ul class="paragraph-width">
	 * <li>nationalIdentification = The provided idValue is a national identification number.
	 * <li>passportNumber = The provided idValue is a passport number.
	 * <li>driverLicense = The provided idValue is driving License of the individual.
	 * <li>companyRegistrationNumber = The provided idValue is a company identifier. It verifies its legal existence as an incorporated entity.
	 * <li>socialSecurityNumber =n The provided idValue is a social security number, issued to an individual by the individual's government.
	 * <li>alienRegistrationNumber = The provided idValue is an alien registration number, provided by immigration services of a country.
	 * <li>lawEnforcementIdentification = The provided idValue is an alien registration number, provided by immigration services of a country.
	 * <li>militaryIdentification = The provided idValue is an identification issued to military personnel of a country.
	 * </ul>
	 */
	public void setIdType(String value) {
		this.idType = value;
	}

	/**
	 * The value of the identification
	 */
	public String getIdValue() {
		return idValue;
	}

	/**
	 * The value of the identification
	 */
	public void setIdValue(String value) {
		this.idValue = value;
	}
}
