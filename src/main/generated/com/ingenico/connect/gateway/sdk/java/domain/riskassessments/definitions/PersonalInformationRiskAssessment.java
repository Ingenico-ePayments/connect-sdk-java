/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.PersonalNameRiskAssessment;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PersonalInformationRiskAssessment">PersonalInformationRiskAssessment</a>
 */
public class PersonalInformationRiskAssessment {

	private PersonalNameRiskAssessment name = null;

	public PersonalNameRiskAssessment getName() {
		return name;
	}

	public void setName(PersonalNameRiskAssessment value) {
		this.name = value;
	}
}
