/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.definitions;

public class FraugsterResults {

	private String fraudInvestigationPoints = null;

	private Integer fraudScore = null;

	/**
	 * Result of the Fraugster check
	 * Contains the investigation points used during the evaluation
	 */
	public String getFraudInvestigationPoints() {
		return fraudInvestigationPoints;
	}

	/**
	 * Result of the Fraugster check
	 * Contains the investigation points used during the evaluation
	 */
	public void setFraudInvestigationPoints(String value) {
		this.fraudInvestigationPoints = value;
	}

	/**
	 * Result of the Fraugster check
	 * Contains the overall Fraud score which is an integer between 0 and 99
	 */
	public Integer getFraudScore() {
		return fraudScore;
	}

	/**
	 * Result of the Fraugster check
	 * Contains the overall Fraud score which is an integer between 0 and 99
	 */
	public void setFraudScore(Integer value) {
		this.fraudScore = value;
	}
}
