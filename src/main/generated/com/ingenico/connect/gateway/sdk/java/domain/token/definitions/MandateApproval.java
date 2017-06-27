/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

public class MandateApproval {

	private String mandateSignatureDate = null;

	private String mandateSignaturePlace = null;

	private Boolean mandateSigned = null;

	/**
	 * The date when the mandate was signed<br>
	 * Format: YYYYMMDD
	 */
	public String getMandateSignatureDate() {
		return mandateSignatureDate;
	}

	/**
	 * The date when the mandate was signed<br>
	 * Format: YYYYMMDD
	 */
	public void setMandateSignatureDate(String value) {
		this.mandateSignatureDate = value;
	}

	/**
	 * The city where the mandate was signed
	 */
	public String getMandateSignaturePlace() {
		return mandateSignaturePlace;
	}

	/**
	 * The city where the mandate was signed
	 */
	public void setMandateSignaturePlace(String value) {
		this.mandateSignaturePlace = value;
	}

	/**
	 * <ul><li>true = Mandate is signed
	 * <li>false = Mandate is not signed
	 * </ul>
	 */
	public Boolean getMandateSigned() {
		return mandateSigned;
	}

	/**
	 * <ul><li>true = Mandate is signed
	 * <li>false = Mandate is not signed
	 * </ul>
	 */
	public void setMandateSigned(Boolean value) {
		this.mandateSigned = value;
	}
}
