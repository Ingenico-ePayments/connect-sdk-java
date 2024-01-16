/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

public class LengthValidator {

	private Integer maxLength = null;

	private Integer minLength = null;

	/**
	 * The maximum allowed length
	 */
	public Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * The maximum allowed length
	 */
	public void setMaxLength(Integer value) {
		this.maxLength = value;
	}

	/**
	 * The minimum allowed length
	 */
	public Integer getMinLength() {
		return minLength;
	}

	/**
	 * The minimum allowed length
	 */
	public void setMinLength(Integer value) {
		this.minLength = value;
	}
}
