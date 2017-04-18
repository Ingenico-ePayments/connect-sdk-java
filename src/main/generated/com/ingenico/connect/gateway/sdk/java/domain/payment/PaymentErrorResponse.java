/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CreatePaymentResult;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentErrorResponse">PaymentErrorResponse</a>
 */
public class PaymentErrorResponse {

	private String errorId = null;

	private List<APIError> errors = null;

	private CreatePaymentResult paymentResult = null;

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String value) {
		this.errorId = value;
	}

	public List<APIError> getErrors() {
		return errors;
	}

	public void setErrors(List<APIError> value) {
		this.errors = value;
	}

	public CreatePaymentResult getPaymentResult() {
		return paymentResult;
	}

	public void setPaymentResult(CreatePaymentResult value) {
		this.paymentResult = value;
	}
}
