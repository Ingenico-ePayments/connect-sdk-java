/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudResultsRetailDecisions;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudResults;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_CardFraudResults">CardFraudResults</a>
 */
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
