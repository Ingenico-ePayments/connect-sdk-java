package com.globalcollect.gateway.sdk.java.gc.refund;

import com.globalcollect.gateway.sdk.java.gc.errors.definitions.APIError;
import com.globalcollect.gateway.sdk.java.gc.refund.definitions.RefundResult;
import java.util.List;

/**
 * class RefundErrorResponse
 */
public class RefundErrorResponse {

	private String errorId = null;

	private List<APIError> errors = null;

	private RefundResult refundResult = null;

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

	public RefundResult getRefundResult() {
		return refundResult;
	}

	public void setRefundResult(RefundResult value) {
		this.refundResult = value;
	}
}
