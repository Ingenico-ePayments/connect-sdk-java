/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_ShoppingCart">ShoppingCart</a>
 */
public class ShoppingCart {

	private List<AmountBreakdown> amountBreakdown = null;

	public List<AmountBreakdown> getAmountBreakdown() {
		return amountBreakdown;
	}

	public void setAmountBreakdown(List<AmountBreakdown> value) {
		this.amountBreakdown = value;
	}
}
