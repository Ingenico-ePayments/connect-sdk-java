package com.globalcollect.gateway.sdk.java.gc.refund;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.refund.definitions.BankRefundMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.refund.definitions.RefundCustomer;
import com.globalcollect.gateway.sdk.java.gc.refund.definitions.RefundReferences;

/**
 * class RefundRequest
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
