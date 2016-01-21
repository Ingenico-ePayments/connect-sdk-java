package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RefundBankMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RefundCardMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RefundEWalletMethodSpecificOutput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderOutput;

public class RefundOutput extends OrderOutput {

	private Long amountPaid = null;

	private RefundBankMethodSpecificOutput bankRefundMethodSpecificOutput = null;

	private RefundCardMethodSpecificOutput cardRefundMethodSpecificOutput = null;

	private RefundEWalletMethodSpecificOutput eWalletRefundMethodSpecificOutput = null;

	private String paymentMethod = null;

	public Long getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Long value) {
		this.amountPaid = value;
	}

	public RefundBankMethodSpecificOutput getBankRefundMethodSpecificOutput() {
		return bankRefundMethodSpecificOutput;
	}

	public void setBankRefundMethodSpecificOutput(RefundBankMethodSpecificOutput value) {
		this.bankRefundMethodSpecificOutput = value;
	}

	public RefundCardMethodSpecificOutput getCardRefundMethodSpecificOutput() {
		return cardRefundMethodSpecificOutput;
	}

	public void setCardRefundMethodSpecificOutput(RefundCardMethodSpecificOutput value) {
		this.cardRefundMethodSpecificOutput = value;
	}

	public RefundEWalletMethodSpecificOutput getEWalletRefundMethodSpecificOutput() {
		return eWalletRefundMethodSpecificOutput;
	}

	public void setEWalletRefundMethodSpecificOutput(RefundEWalletMethodSpecificOutput value) {
		this.eWalletRefundMethodSpecificOutput = value;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String value) {
		this.paymentMethod = value;
	}
}
