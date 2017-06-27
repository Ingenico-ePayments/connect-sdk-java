/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AdditionalOrderInputAirlineData;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

public class OrderRiskAssessment {

	private AdditionalOrderInputAirlineData additionalInput = null;

	private AmountOfMoney amountOfMoney = null;

	private CustomerRiskAssessment customer = null;

	/**
	 * Object containing additional input on the order
	 */
	public AdditionalOrderInputAirlineData getAdditionalInput() {
		return additionalInput;
	}

	/**
	 * Object containing additional input on the order
	 */
	public void setAdditionalInput(AdditionalOrderInputAirlineData value) {
		this.additionalInput = value;
	}

	/**
	 * Object containing amount and ISO currency code attributes
	 */
	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	/**
	 * Object containing amount and ISO currency code attributes
	 */
	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	/**
	 * Object containing the details of the consumer
	 */
	public CustomerRiskAssessment getCustomer() {
		return customer;
	}

	/**
	 * Object containing the details of the consumer
	 */
	public void setCustomer(CustomerRiskAssessment value) {
		this.customer = value;
	}
}
