/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AdditionalOrderInputAirlineData;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_OrderApprovePayment">OrderApprovePayment</a>
 */
public class OrderApprovePayment {

	private AdditionalOrderInputAirlineData additionalInput = null;

	private OrderReferencesApprovePayment references = null;

	public AdditionalOrderInputAirlineData getAdditionalInput() {
		return additionalInput;
	}

	public void setAdditionalInput(AdditionalOrderInputAirlineData value) {
		this.additionalInput = value;
	}

	public OrderReferencesApprovePayment getReferences() {
		return references;
	}

	public void setReferences(OrderReferencesApprovePayment value) {
		this.references = value;
	}
}
