package com.globalcollect.gateway.sdk.java.gc.product.definitions;

import com.globalcollect.gateway.sdk.java.gc.product.definitions.PaymentProductFieldDataRestrictions;
import com.globalcollect.gateway.sdk.java.gc.product.definitions.PaymentProductFieldDisplayHints;

public class PaymentProductField {

	private PaymentProductFieldDataRestrictions dataRestrictions = null;

	private PaymentProductFieldDisplayHints displayHints = null;

	private String id = null;

	private String type = null;

	public PaymentProductFieldDataRestrictions getDataRestrictions() {
		return dataRestrictions;
	}

	public void setDataRestrictions(PaymentProductFieldDataRestrictions value) {
		this.dataRestrictions = value;
	}

	public PaymentProductFieldDisplayHints getDisplayHints() {
		return displayHints;
	}

	public void setDisplayHints(PaymentProductFieldDisplayHints value) {
		this.displayHints = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String value) {
		this.id = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String value) {
		this.type = value;
	}
}
