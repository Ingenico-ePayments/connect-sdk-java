/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class EInvoicePaymentMethodSpecificInputBase extends AbstractPaymentMethodSpecificInput {

	private Boolean requiresApproval = null;

	/**
	 * <ul><li>true = the payment requires approval before the funds will be captured using the <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/approve.html'>Approve payment</a> or <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/capture.html'>Capture payment</a> API
	 * <li>false = the payment does not require approval, and the funds will be captured automatically
	 * </ul>
	 */
	public Boolean getRequiresApproval() {
		return requiresApproval;
	}

	/**
	 * <ul><li>true = the payment requires approval before the funds will be captured using the <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/approve.html'>Approve payment</a> or <a href='https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/capture.html'>Capture payment</a> API
	 * <li>false = the payment does not require approval, and the funds will be captured automatically
	 * </ul>
	 */
	public void setRequiresApproval(Boolean value) {
		this.requiresApproval = value;
	}
}
