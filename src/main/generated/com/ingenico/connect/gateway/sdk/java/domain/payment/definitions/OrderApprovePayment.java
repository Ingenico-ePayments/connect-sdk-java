/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AdditionalOrderInputAirlineData;

public class OrderApprovePayment {

	private AdditionalOrderInputAirlineData additionalInput = null;

	private OrderReferencesApprovePayment references = null;

	/**
	 * Object containing additional input on the order
	 */
	public AdditionalOrderInputAirlineData getAdditionalInput() {
		return additionalInput;
	}

	/**
	 * Object containing additional input on the order
	 */
	public void setAdditionalInput(AdditionalOrderInputAirlineData value) {
		this.additionalInput = value;
	}

	/**
	 * Object that holds all reference fields that are linked to this transaction
	 */
	public OrderReferencesApprovePayment getReferences() {
		return references;
	}

	/**
	 * Object that holds all reference fields that are linked to this transaction
	 */
	public void setReferences(OrderReferencesApprovePayment value) {
		this.references = value;
	}
}
