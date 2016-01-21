package com.globalcollect.gateway.sdk.java.gc.product.definitions;

import com.globalcollect.gateway.sdk.java.gc.product.definitions.ValueMappingElement;
import java.util.List;

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
