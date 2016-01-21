package com.globalcollect.gateway.sdk.java.gc.product.definitions;

import com.globalcollect.gateway.sdk.java.gc.product.definitions.PaymentProductFieldValidators;

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
