/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

public class PaymentProductFieldDataRestrictions {

	private Boolean isRequired = null;

	private PaymentProductFieldValidators validators = null;

	/**
	 * <ul class="paragraph-width">
	 * <li>true - Indicates that this field is required
	 * <li>false - Indicates that this field is optional
	 * </ul>
	 */
	public Boolean getIsRequired() {
		return isRequired;
	}

	/**
	 * <ul class="paragraph-width">
	 * <li>true - Indicates that this field is required
	 * <li>false - Indicates that this field is optional
	 * </ul>
	 */
	public void setIsRequired(Boolean value) {
		this.isRequired = value;
	}

	/**
	 * Object containing the details of the validations on the field
	 */
	public PaymentProductFieldValidators getValidators() {
		return validators;
	}

	/**
	 * Object containing the details of the validations on the field
	 */
	public void setValidators(PaymentProductFieldValidators value) {
		this.validators = value;
	}
}
