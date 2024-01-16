/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.riskassessments;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.ResultDoRiskAssessment;

public class RiskAssessmentResponse {

	private List<ResultDoRiskAssessment> results = null;

	/**
	 * Object that contains the results of the performed fraudchecks
	 */
	public List<ResultDoRiskAssessment> getResults() {
		return results;
	}

	/**
	 * Object that contains the results of the performed fraudchecks
	 */
	public void setResults(List<ResultDoRiskAssessment> value) {
		this.results = value;
	}
}
