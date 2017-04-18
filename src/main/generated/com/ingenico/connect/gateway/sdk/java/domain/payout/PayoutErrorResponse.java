/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payout;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;
import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.PayoutResult;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PayoutErrorResponse">PayoutErrorResponse</a>
 */
public class PayoutErrorResponse {

	private String errorId = null;

	private List<APIError> errors = null;

	private PayoutResult payoutResult = null;

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

	public PayoutResult getPayoutResult() {
		return payoutResult;
	}

	public void setPayoutResult(PayoutResult value) {
		this.payoutResult = value;
	}
}
