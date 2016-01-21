package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AdditionalOrderInputAirlineData;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderReferencesApprovePayment;

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
