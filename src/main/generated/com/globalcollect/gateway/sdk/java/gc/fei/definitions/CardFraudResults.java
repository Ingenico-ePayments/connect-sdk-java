package com.globalcollect.gateway.sdk.java.gc.fei.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.FraudResultsRetailDecisions;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.FraudResults;

public class CardFraudResults extends FraudResults {

	private String avsResult = null;

	private String cvvResult = null;

	private FraudResultsRetailDecisions retailDecisions = null;

	public String getAvsResult() {
		return avsResult;
	}

	public void setAvsResult(String value) {
		this.avsResult = value;
	}

	public String getCvvResult() {
		return cvvResult;
	}

	public void setCvvResult(String value) {
		this.cvvResult = value;
	}

	public FraudResultsRetailDecisions getRetailDecisions() {
		return retailDecisions;
	}

	public void setRetailDecisions(FraudResultsRetailDecisions value) {
		this.retailDecisions = value;
	}
}
