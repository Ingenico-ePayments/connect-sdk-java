/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.PaymentProductFieldDataRestrictions;
import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.PaymentProductFieldDisplayHints;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProductField">PaymentProductField</a>
 */
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
