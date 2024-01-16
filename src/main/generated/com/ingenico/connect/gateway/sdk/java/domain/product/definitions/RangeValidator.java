/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

public class RangeValidator {

	private Integer maxValue = null;

	private Integer minValue = null;

	/**
	 * Upper value of the range that is still valid
	 */
	public Integer getMaxValue() {
		return maxValue;
	}

	/**
	 * Upper value of the range that is still valid
	 */
	public void setMaxValue(Integer value) {
		this.maxValue = value;
	}

	/**
	 * Lower value of the range that is still valid
	 */
	public Integer getMinValue() {
		return minValue;
	}

	/**
	 * Lower value of the range that is still valid
	 */
	public void setMinValue(Integer value) {
		this.minValue = value;
	}
}
