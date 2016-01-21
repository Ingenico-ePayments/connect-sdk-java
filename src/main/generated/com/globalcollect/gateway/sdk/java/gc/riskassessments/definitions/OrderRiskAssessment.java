package com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AdditionalOrderInputAirlineData;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions.CustomerRiskAssessment;

public class OrderRiskAssessment {

	private AdditionalOrderInputAirlineData additionalInput = null;

	private AmountOfMoney amountOfMoney = null;

	private CustomerRiskAssessment customer = null;

	public AdditionalOrderInputAirlineData getAdditionalInput() {
		return additionalInput;
	}

	public void setAdditionalInput(AdditionalOrderInputAirlineData value) {
		this.additionalInput = value;
	}

	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	public CustomerRiskAssessment getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerRiskAssessment value) {
		this.customer = value;
	}
}
