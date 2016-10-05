/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.refund;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.BankRefundMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundCustomer;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundReferences;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RefundRequest">RefundRequest</a>
 */
public class RefundRequest {

	private AmountOfMoney amountOfMoney = null;

	private BankRefundMethodSpecificInput bankRefundMethodSpecificInput = null;

	private RefundCustomer customer = null;

	private String refundDate = null;

	private RefundReferences refundReferences = null;

	public AmountOfMoney getAmountOfMoney() {
		return amountOfMoney;
	}

	public void setAmountOfMoney(AmountOfMoney value) {
		this.amountOfMoney = value;
	}

	public BankRefundMethodSpecificInput getBankRefundMethodSpecificInput() {
		return bankRefundMethodSpecificInput;
	}

	public void setBankRefundMethodSpecificInput(BankRefundMethodSpecificInput value) {
		this.bankRefundMethodSpecificInput = value;
	}

	public RefundCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(RefundCustomer value) {
		this.customer = value;
	}

	public String getRefundDate() {
		return refundDate;
	}

	public void setRefundDate(String value) {
		this.refundDate = value;
	}

	public RefundReferences getRefundReferences() {
		return refundReferences;
	}

	public void setRefundReferences(RefundReferences value) {
		this.refundReferences = value;
	}
}
