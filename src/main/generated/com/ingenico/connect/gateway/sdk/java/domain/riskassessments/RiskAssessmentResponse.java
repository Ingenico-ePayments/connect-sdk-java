/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.riskassessments;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.ResultDoRiskAssessment;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RiskAssessmentResponse">RiskAssessmentResponse</a>
 */
public class RiskAssessmentResponse {

	private List<ResultDoRiskAssessment> results = null;

	public List<ResultDoRiskAssessment> getResults() {
		return results;
	}

	public void setResults(List<ResultDoRiskAssessment> value) {
		this.results = value;
	}
}
