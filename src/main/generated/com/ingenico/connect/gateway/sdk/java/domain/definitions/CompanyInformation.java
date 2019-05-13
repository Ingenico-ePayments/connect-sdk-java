/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class CompanyInformation {

	private String name = null;

	private String vatNumber = null;

	/**
	 * Name of company, as a customer
	 */
	public String getName() {
		return name;
	}

	/**
	 * Name of company, as a customer
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Local VAT number of the company
	 */
	public String getVatNumber() {
		return vatNumber;
	}

	/**
	 * Local VAT number of the company
	 */
	public void setVatNumber(String value) {
		this.vatNumber = value;
	}
}
