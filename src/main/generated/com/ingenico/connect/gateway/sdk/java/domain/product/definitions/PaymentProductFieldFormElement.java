/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProductFieldFormElement">PaymentProductFieldFormElement</a>
 */
public class PaymentProductFieldFormElement {

	private String type = null;

	private List<ValueMappingElement> valueMapping = null;

	public String getType() {
		return type;
	}

	public void setType(String value) {
		this.type = value;
	}

	public List<ValueMappingElement> getValueMapping() {
		return valueMapping;
	}

	public void setValueMapping(List<ValueMappingElement> value) {
		this.valueMapping = value;
	}
}
