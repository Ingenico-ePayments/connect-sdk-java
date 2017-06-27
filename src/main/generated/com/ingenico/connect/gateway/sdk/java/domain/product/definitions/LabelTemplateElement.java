/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

public class LabelTemplateElement {

	private String attributeKey = null;

	private String mask = null;

	/**
	 * Name of the attribute that is shown to the consumer on selection pages or screens
	 */
	public String getAttributeKey() {
		return attributeKey;
	}

	/**
	 * Name of the attribute that is shown to the consumer on selection pages or screens
	 */
	public void setAttributeKey(String value) {
		this.attributeKey = value;
	}

	/**
	 * Regular mask for the attributeKey<br>
	 * Note: The mask is optional as not every field has a mask
	 */
	public String getMask() {
		return mask;
	}

	/**
	 * Regular mask for the attributeKey<br>
	 * Note: The mask is optional as not every field has a mask
	 */
	public void setMask(String value) {
		this.mask = value;
	}
}
