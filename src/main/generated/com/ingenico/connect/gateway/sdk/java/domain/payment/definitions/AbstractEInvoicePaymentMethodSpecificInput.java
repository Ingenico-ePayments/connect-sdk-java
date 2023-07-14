/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AbstractPaymentMethodSpecificInput;

public class AbstractEInvoicePaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

	private Boolean requiresApproval = null;

	public Boolean getRequiresApproval() {
		return requiresApproval;
	}

	public void setRequiresApproval(Boolean value) {
		this.requiresApproval = value;
	}
}
