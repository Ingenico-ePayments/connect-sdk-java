package com.globalcollect.gateway.sdk.java.gc.riskassessments;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.ResultDoRiskAssessment;
import java.util.List;

/**
 * class RiskAssessmentResponse
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
