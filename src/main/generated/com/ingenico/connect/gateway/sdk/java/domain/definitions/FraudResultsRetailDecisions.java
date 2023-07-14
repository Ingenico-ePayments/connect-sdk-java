/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class FraudResultsRetailDecisions {

	private String fraudCode = null;

	private String fraudNeural = null;

	private String fraudRCF = null;

	/**
	 * Result of the fraud service.
	 * Provides additional information about the fraud result
	 */
	public String getFraudCode() {
		return fraudCode;
	}

	/**
	 * Result of the fraud service.
	 * Provides additional information about the fraud result
	 */
	public void setFraudCode(String value) {
		this.fraudCode = value;
	}

	/**
	 * Returns the raw score of the neural
	 */
	public String getFraudNeural() {
		return fraudNeural;
	}

	/**
	 * Returns the raw score of the neural
	 */
	public void setFraudNeural(String value) {
		this.fraudNeural = value;
	}

	/**
	 * Result of the fraud service
	 * Represent sets of fraud rules returned during the evaluation of the transaction
	 */
	public String getFraudRCF() {
		return fraudRCF;
	}

	/**
	 * Result of the fraud service
	 * Represent sets of fraud rules returned during the evaluation of the transaction
	 */
	public void setFraudRCF(String value) {
		this.fraudRCF = value;
	}
}
