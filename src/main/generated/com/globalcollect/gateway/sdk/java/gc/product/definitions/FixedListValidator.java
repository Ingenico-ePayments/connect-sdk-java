package com.globalcollect.gateway.sdk.java.gc.product.definitions;

import java.util.List;

public class FixedListValidator {

	private List<String> allowedValues = null;

	public List<String> getAllowedValues() {
		return allowedValues;
	}

	public void setAllowedValues(List<String> value) {
		this.allowedValues = value;
	}
}
