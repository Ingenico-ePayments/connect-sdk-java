package com.ingenico.connect.gateway.sdk.java;

import com.ingenico.connect.gateway.sdk.java.domain.refund.RefundErrorResponse;
import com.ingenico.connect.gateway.sdk.java.domain.refund.definitions.RefundResult;

/**
 * Represents an error response from a refund call.
 */
@SuppressWarnings("serial")
public class DeclinedRefundException extends DeclinedTransactionException {

	private final RefundErrorResponse errors;

	public DeclinedRefundException(int statusCode, String responseBody, RefundErrorResponse errors) {
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
	 * @return The result of creating a refund if available, otherwise returns {@code null}.
	 */
	public RefundResult getRefundResult() {
		return errors == null ? null : errors.getRefundResult();
	}
}
