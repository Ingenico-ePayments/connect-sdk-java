/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.services.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

/**
 * Values that can optionally be set to refine an IIN Lookup
 */
public class PaymentContext {

	private AmountOfMoney amountOfMoney = null;

	private String countryCode = null;

	private Boolean isInstallments = null;

	private Boolean isRecurring = null;

	/**
	 * The payment amount
	 */
	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	/**
	 * The payment amount
	 */
	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	/**
	 * The country the payment takes place in
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * The country the payment takes place in
	 */
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 * True if the payment is to be paid in multiple installments (numberOfInstallments &gt; 1 for the payment). When true only payment products that support installments will be allowed in context.
	 */
	public Boolean getIsInstallments() {
		return isInstallments;
	}

	/**
	 * True if the payment is to be paid in multiple installments (numberOfInstallments &gt; 1 for the payment). When true only payment products that support installments will be allowed in context.
	 */
	public void setIsInstallments(Boolean value) {
		this.isInstallments = value;
	}

	/**
	 * True if the payment is recurring
	 */
	public Boolean getIsRecurring() {
		return isRecurring;
	}

	/**
	 * True if the payment is recurring
	 */
	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}
}
