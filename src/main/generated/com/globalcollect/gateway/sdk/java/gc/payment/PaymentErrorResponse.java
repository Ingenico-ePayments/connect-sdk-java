package com.globalcollect.gateway.sdk.java.gc.payment;

import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CreatePaymentResult;
import java.util.List;

/**
 * class PaymentErrorResponse
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
