package com.globalcollect.gateway.sdk.java.gc.fei.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.RetailDecisionsCCFraudCheckOutput;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.ValidationBankAccountOutput;

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
