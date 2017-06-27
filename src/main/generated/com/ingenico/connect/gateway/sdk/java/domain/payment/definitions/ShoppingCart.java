/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import java.util.List;

public class ShoppingCart {

	private List<AmountBreakdown> amountBreakdown = null;

	/**
	 * Determines the type of the amount.
	 */
	public List<AmountBreakdown> getAmountBreakdown() {
		return amountBreakdown;
	}

	/**
	 * Determines the type of the amount.
	 */
	public void setAmountBreakdown(List<AmountBreakdown> value) {
		this.amountBreakdown = value;
	}
}
