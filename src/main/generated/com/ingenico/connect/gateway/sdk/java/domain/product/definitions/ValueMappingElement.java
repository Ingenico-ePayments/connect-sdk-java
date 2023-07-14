/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

public class ValueMappingElement {

	private List<PaymentProductFieldDisplayElement> displayElements = null;

	private String displayName = null;

	private String value = null;

	/**
	 * List of extra data of the value.
	 */
	public List<PaymentProductFieldDisplayElement> getDisplayElements() {
		return displayElements;
	}

	/**
	 * List of extra data of the value.
	 */
	public void setDisplayElements(List<PaymentProductFieldDisplayElement> value) {
		this.displayElements = value;
	}

	/**
	 * Key name
	 *
	 * @deprecated Use displayElements instead with ID 'displayName'
	 */
	@Deprecated
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Key name
	 *
	 * @deprecated Use displayElements instead with ID 'displayName'
	 */
	@Deprecated
	public void setDisplayName(String value) {
		this.displayName = value;
	}

	/**
	 * Value corresponding to the key
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Value corresponding to the key
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
