/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProductFieldDataRestrictions">PaymentProductFieldDataRestrictions</a>
 */
public class PaymentProductFieldDataRestrictions {

	private Boolean isRequired = null;

	private PaymentProductFieldValidators validators = null;

	public Boolean getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(Boolean value) {
		this.isRequired = value;
	}

	public PaymentProductFieldValidators getValidators() {
		return validators;
	}

	public void setValidators(PaymentProductFieldValidators value) {
		this.validators = value;
	}
}
