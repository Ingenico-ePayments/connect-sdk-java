/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class RetailDecisionsCCFraudCheckOutput {

	private String fraudCode = null;

	private String fraudNeural = null;

	private String fraudRCF = null;

	/**
	 * Provides additional information about the fraud result
	 */
	public String getFraudCode() {
		return fraudCode;
	}

	/**
	 * Provides additional information about the fraud result
	 */
	public void setFraudCode(String value) {
		this.fraudCode = value;
	}

	/**
	 * The raw score returned by the Neural check returned by the evaluation of the transaction
	 */
	public String getFraudNeural() {
		return fraudNeural;
	}

	/**
	 * The raw score returned by the Neural check returned by the evaluation of the transaction
	 */
	public void setFraudNeural(String value) {
		this.fraudNeural = value;
	}

	/**
	 * List of RuleCategoryFlags as setup in the Retail Decisions system that lead to the result
	 */
	public String getFraudRCF() {
		return fraudRCF;
	}

	/**
	 * List of RuleCategoryFlags as setup in the Retail Decisions system that lead to the result
	 */
	public void setFraudRCF(String value) {
		this.fraudRCF = value;
	}
}
