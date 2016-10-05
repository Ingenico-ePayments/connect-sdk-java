/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.refund;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundResult;
import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RefundErrorResponse">RefundErrorResponse</a>
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
