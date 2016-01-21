package com.globalcollect.gateway.sdk.java.gc.payout;

import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;
import com.globalcollect.gateway.sdk.java.gc.payout.definitions.PayoutResult;
import java.util.List;

/**
 * class PayoutErrorResponse
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
