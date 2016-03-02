package com.globalcollect.gateway.sdk.java;

import com.globalcollect.gateway.sdk.java.gc.refund.RefundErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.refund.definitions.RefundResult;

/**
 * Represents an error response from a refund call.
 */
@SuppressWarnings("serial")
public class GcDeclinedRefundException extends GcDeclinedTransactionException {

	private RefundErrorResponse errors;

	public GcDeclinedRefundException(int statusCode, String responseBody, RefundErrorResponse errors) {
		super(buildMessage(errors), statusCode, responseBody, errors != null ? errors.getErrorId() : null, errors != null ? errors.getErrors() : null);
		this.errors = errors;
	}

	private static String buildMessage(RefundErrorResponse errors) {
		RefundResult refund = errors != null ? errors.getRefundResult() : null;
		if (refund != null) {
			return "declined refund '" + refund.getId() + "' with status '" + refund.getStatus() + "'";
		} else {
			return "the GlobalCollect platform returned a declined refund response";
		}
	}

	/**
	 * Returns the result of creating a refund if available, otherwise returns <code>null</code>.
	 */
	public RefundResult getRefundResult() {
		return errors == null ? null : errors.getRefundResult();
	}
}
