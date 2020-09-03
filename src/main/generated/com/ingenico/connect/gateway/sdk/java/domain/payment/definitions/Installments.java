/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;

/**
 * Object containing data related to installments which can be used for card payments and only with some acquirers. In case you send in the details of this object, only the combination of card products and acquirers that do support installments will be shown on the MyCheckout hosted payment pages.
 */
public class Installments {

	private AmountOfMoney amountOfMoneyPerInstallment = null;

	private String frequencyOfInstallments = null;

	private String interestRate = null;

	private Long numberOfInstallments = null;

	/**
	 * The amount that will be paid per installment. The total amount of amountOfMoneyPerInstallment x numberOfInstallments can not be higher than the total amount of this transaction, although we will not validate that.
	 */
	public AmountOfMoney getAmountOfMoneyPerInstallment() {
		return amountOfMoneyPerInstallment;
	}

	/**
	 * The amount that will be paid per installment. The total amount of amountOfMoneyPerInstallment x numberOfInstallments can not be higher than the total amount of this transaction, although we will not validate that.
	 */
	public void setAmountOfMoneyPerInstallment(AmountOfMoney value) {
		this.amountOfMoneyPerInstallment = value;
	}

	/**
	 * The frequency in which the installments will be collected from the customer.
	 *  The possible values are:
	 * <ul class="paragraph-width">
	 * <li>daily
	 * <li>weekly
	 * <li>monthly (default)
	 * <li>quarterly
	 * </ul> 
	 */
	public String getFrequencyOfInstallments() {
		return frequencyOfInstallments;
	}

	/**
	 * The frequency in which the installments will be collected from the customer.
	 *  The possible values are:
	 * <ul class="paragraph-width">
	 * <li>daily
	 * <li>weekly
	 * <li>monthly (default)
	 * <li>quarterly
	 * </ul> 
	 */
	public void setFrequencyOfInstallments(String value) {
		this.frequencyOfInstallments = value;
	}

	/**
	 * The interest rate paid for installments expressed in percentage. So for example 5.75 means 5.75%
	 */
	public String getInterestRate() {
		return interestRate;
	}

	/**
	 * The interest rate paid for installments expressed in percentage. So for example 5.75 means 5.75%
	 */
	public void setInterestRate(String value) {
		this.interestRate = value;
	}

	/**
	 * The number of installments in which this transaction will be paid, which can be used for card payments. Only used with some acquirers. In case you send in the details of this object, only the combination of card products and acquirers that do support installments will be shown on the MyCheckout hosted payment pages.
	 */
	public Long getNumberOfInstallments() {
		return numberOfInstallments;
	}

	/**
	 * The number of installments in which this transaction will be paid, which can be used for card payments. Only used with some acquirers. In case you send in the details of this object, only the combination of card products and acquirers that do support installments will be shown on the MyCheckout hosted payment pages.
	 */
	public void setNumberOfInstallments(Long value) {
		this.numberOfInstallments = value;
	}
}
