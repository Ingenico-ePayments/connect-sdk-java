/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AdditionalOrderInputAirlineData;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.CustomerRiskAssessment;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_OrderRiskAssessment">OrderRiskAssessment</a>
 */
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
