/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_AmountOfMoney">AmountOfMoney</a>
 */
public class AmountOfMoney {

	private Long amount = null;

	private String currencyCode = null;

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long value) {
		this.amount = value;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String value) {
		this.currencyCode = value;
	}
}
