/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

public class FixedListValidator {

	private List<String> allowedValues = null;

	/**
	 * List of the allowed values that the field will be validated against
	 */
	public List<String> getAllowedValues() {
		return allowedValues;
	}

	/**
	 * List of the allowed values that the field will be validated against
	 */
	public void setAllowedValues(List<String> value) {
		this.allowedValues = value;
	}
}
