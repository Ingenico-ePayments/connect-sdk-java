/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

public class PayoutDetails {

	private AmountOfMoney amountOfMoney = null;

	private PayoutCustomer customer = null;

	private PayoutReferences references = null;

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
	 * Object containing the details of the customer.
	 */
	public PayoutCustomer getCustomer() {
		return customer;
	}

	/**
	 * Object containing the details of the customer.
	 */
	public void setCustomer(PayoutCustomer value) {
		this.customer = value;
	}

	/**
	 * Object that holds all reference properties that are linked to this transaction
	 */
	public PayoutReferences getReferences() {
		return references;
	}

	/**
	 * Object that holds all reference properties that are linked to this transaction
	 */
	public void setReferences(PayoutReferences value) {
		this.references = value;
	}
}
