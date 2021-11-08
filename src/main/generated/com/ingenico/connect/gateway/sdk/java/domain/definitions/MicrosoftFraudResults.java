/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class MicrosoftFraudResults {

	private Integer fraudScore = null;

	/**
	 * Result of the Microsoft Fraud Protection check. This contains the normalized fraud score from a scale of 0 to 100. A higher score indicates an increased risk of fraud.
	 */
	public Integer getFraudScore() {
		return fraudScore;
	}

	/**
	 * Result of the Microsoft Fraud Protection check. This contains the normalized fraud score from a scale of 0 to 100. A higher score indicates an increased risk of fraud.
	 */
	public void setFraudScore(Integer value) {
		this.fraudScore = value;
	}
}
