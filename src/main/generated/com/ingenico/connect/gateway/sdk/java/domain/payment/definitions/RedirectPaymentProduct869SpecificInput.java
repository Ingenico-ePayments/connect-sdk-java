/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class RedirectPaymentProduct869SpecificInput {

	private String issuerId = null;

	private String residentIdName = null;

	private String residentIdNumber = null;

	/**
	 * ID of the issuing bank of the customer. A list of available issuerIDs can be obtained by using the retrieve payment product directory API.
	 */
	public String getIssuerId() {
		return issuerId;
	}

	/**
	 * ID of the issuing bank of the customer. A list of available issuerIDs can be obtained by using the retrieve payment product directory API.
	 */
	public void setIssuerId(String value) {
		this.issuerId = value;
	}

	/**
	 * The name as described on the Resident Identity Card of the People's Republic of China.
	 */
	public String getResidentIdName() {
		return residentIdName;
	}

	/**
	 * The name as described on the Resident Identity Card of the People's Republic of China.
	 */
	public void setResidentIdName(String value) {
		this.residentIdName = value;
	}

	/**
	 * The identification number as described on the Resident Identity Card of the People's Republic of China.
	 */
	public String getResidentIdNumber() {
		return residentIdNumber;
	}

	/**
	 * The identification number as described on the Resident Identity Card of the People's Republic of China.
	 */
	public void setResidentIdNumber(String value) {
		this.residentIdNumber = value;
	}
}
