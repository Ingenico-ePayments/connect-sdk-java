/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class EInvoicePaymentProduct9000SpecificOutput {

	private String installmentId = null;

	/**
	 * The ID of the installment plan used for the payment.
	 */
	public String getInstallmentId() {
		return installmentId;
	}

	/**
	 * The ID of the installment plan used for the payment.
	 */
	public void setInstallmentId(String value) {
		this.installmentId = value;
	}
}
