/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.RetailDecisionsCCFraudCheckOutput;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.ValidationBankAccountOutput;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_ResultDoRiskAssessment">ResultDoRiskAssessment</a>
 */
public class ResultDoRiskAssessment {

	private String category = null;

	private String result = null;

	private RetailDecisionsCCFraudCheckOutput retaildecisionsCCFraudCheckOutput = null;

	private ValidationBankAccountOutput validationBankAccountOutput = null;

	public String getCategory() {
		return category;
	}

	public void setCategory(String value) {
		this.category = value;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String value) {
		this.result = value;
	}

	public RetailDecisionsCCFraudCheckOutput getRetaildecisionsCCFraudCheckOutput() {
		return retaildecisionsCCFraudCheckOutput;
	}

	public void setRetaildecisionsCCFraudCheckOutput(RetailDecisionsCCFraudCheckOutput value) {
		this.retaildecisionsCCFraudCheckOutput = value;
	}

	public ValidationBankAccountOutput getValidationBankAccountOutput() {
		return validationBankAccountOutput;
	}

	public void setValidationBankAccountOutput(ValidationBankAccountOutput value) {
		this.validationBankAccountOutput = value;
	}
}
