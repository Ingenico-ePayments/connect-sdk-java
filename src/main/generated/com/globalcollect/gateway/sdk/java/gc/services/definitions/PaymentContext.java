package com.globalcollect.gateway.sdk.java.gc.services.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;

public class PaymentContext {

	private AmountOfMoney amountOfMoney = null;

	private String countryCode = null;

	private Boolean isRecurring = null;

	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	public Boolean getIsRecurring() {
		return isRecurring;
	}

	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}
}
