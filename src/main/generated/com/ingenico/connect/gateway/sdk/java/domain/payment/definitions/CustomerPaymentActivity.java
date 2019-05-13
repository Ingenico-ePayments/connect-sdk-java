/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Object containing data on the purchase history of the customer with you
 */
public class CustomerPaymentActivity {

	private Integer numberOfPaymentAttemptsLast24Hours = null;

	private Integer numberOfPaymentAttemptsLastYear = null;

	private Integer numberOfPurchasesLast6Months = null;

	/**
	 * Number of payment attempts (so including unsuccessful ones) made by this customer with you in the last 24 hours
	 */
	public Integer getNumberOfPaymentAttemptsLast24Hours() {
		return numberOfPaymentAttemptsLast24Hours;
	}

	/**
	 * Number of payment attempts (so including unsuccessful ones) made by this customer with you in the last 24 hours
	 */
	public void setNumberOfPaymentAttemptsLast24Hours(Integer value) {
		this.numberOfPaymentAttemptsLast24Hours = value;
	}

	/**
	 * Number of payment attempts (so including unsuccessful ones) made by this customer with you in the last 12 months
	 */
	public Integer getNumberOfPaymentAttemptsLastYear() {
		return numberOfPaymentAttemptsLastYear;
	}

	/**
	 * Number of payment attempts (so including unsuccessful ones) made by this customer with you in the last 12 months
	 */
	public void setNumberOfPaymentAttemptsLastYear(Integer value) {
		this.numberOfPaymentAttemptsLastYear = value;
	}

	/**
	 * Number of successful purchases made by this customer with you in the last 6 months
	 */
	public Integer getNumberOfPurchasesLast6Months() {
		return numberOfPurchasesLast6Months;
	}

	/**
	 * Number of successful purchases made by this customer with you in the last 6 months
	 */
	public void setNumberOfPurchasesLast6Months(Integer value) {
		this.numberOfPurchasesLast6Months = value;
	}
}
