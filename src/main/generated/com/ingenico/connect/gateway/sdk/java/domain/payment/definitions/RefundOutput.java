/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RefundOutput">RefundOutput</a>
 */
public class RefundOutput extends OrderOutput {

	private Long amountPaid = null;

	private RefundBankMethodSpecificOutput bankRefundMethodSpecificOutput = null;

	private RefundCardMethodSpecificOutput cardRefundMethodSpecificOutput = null;

	private RefundEWalletMethodSpecificOutput eWalletRefundMethodSpecificOutput = null;

	private RefundMobileMethodSpecificOutput mobileRefundMethodSpecificOutput = null;

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

	public RefundMobileMethodSpecificOutput getMobileRefundMethodSpecificOutput() {
		return mobileRefundMethodSpecificOutput;
	}

	public void setMobileRefundMethodSpecificOutput(RefundMobileMethodSpecificOutput value) {
		this.mobileRefundMethodSpecificOutput = value;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String value) {
		this.paymentMethod = value;
	}
}
