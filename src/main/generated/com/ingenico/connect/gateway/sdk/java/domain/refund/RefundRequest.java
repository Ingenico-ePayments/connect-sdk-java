/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.refund;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.BankRefundMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundCustomer;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundReferences;

public class RefundRequest {

	private AmountOfMoney amountOfMoney = null;

	private BankRefundMethodSpecificInput bankRefundMethodSpecificInput = null;

	private RefundCustomer customer = null;

	private String refundDate = null;

	private RefundReferences refundReferences = null;

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
	 * Object containing the specific input details for a bank refund
	 */
	public BankRefundMethodSpecificInput getBankRefundMethodSpecificInput() {
		return bankRefundMethodSpecificInput;
	}

	/**
	 * Object containing the specific input details for a bank refund
	 */
	public void setBankRefundMethodSpecificInput(BankRefundMethodSpecificInput value) {
		this.bankRefundMethodSpecificInput = value;
	}

	/**
	 * Object containing the details of the customer
	 */
	public RefundCustomer getCustomer() {
		return customer;
	}

	/**
	 * Object containing the details of the customer
	 */
	public void setCustomer(RefundCustomer value) {
		this.customer = value;
	}

	/**
	 * Refund date<br>
	 * Format: YYYYMMDD
	 */
	public String getRefundDate() {
		return refundDate;
	}

	/**
	 * Refund date<br>
	 * Format: YYYYMMDD
	 */
	public void setRefundDate(String value) {
		this.refundDate = value;
	}

	/**
	 * Object that holds all reference properties that are linked to this refund
	 */
	public RefundReferences getRefundReferences() {
		return refundReferences;
	}

	/**
	 * Object that holds all reference properties that are linked to this refund
	 */
	public void setRefundReferences(RefundReferences value) {
		this.refundReferences = value;
	}
}
