/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_FixedListValidator">FixedListValidator</a>
 */
public class FixedListValidator {

	private List<String> allowedValues = null;

	public List<String> getAllowedValues() {
		return allowedValues;
	}

	public void setAllowedValues(List<String> value) {
		this.allowedValues = value;
	}
}
