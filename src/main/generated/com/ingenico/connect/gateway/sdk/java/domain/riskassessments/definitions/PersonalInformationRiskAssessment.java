/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions;

public class PersonalInformationRiskAssessment {

	private PersonalNameRiskAssessment name = null;

	/**
	 * Object containing the name details of the customer
	 */
	public PersonalNameRiskAssessment getName() {
		return name;
	}

	/**
	 * Object containing the name details of the customer
	 */
	public void setName(PersonalNameRiskAssessment value) {
		this.name = value;
	}
}
