package com.globalcollect.gateway.sdk.java;

import com.globalcollect.gateway.sdk.java.gc.payment.PaymentErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CreatePaymentResult;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Payment;

/**
 * Represents an error response from a create payment call.
 */
@SuppressWarnings("serial")
public class GcDeclinedPaymentException extends GcDeclinedTransactionException {

	private final PaymentErrorResponse errors;

	public GcDeclinedPaymentException(int statusCode, String responseBody, PaymentErrorResponse errors) {
		super(buildMessage(errors), statusCode, responseBody, errors != null ? errors.getErrorId() : null, errors != null ? errors.getErrors() : null);
		this.errors = errors;
	}

	private static String buildMessage(PaymentErrorResponse errors) {
		Payment payment = errors != null && errors.getPaymentResult() != null ? errors.getPaymentResult().getPayment() : null;
		if (payment != null) {
			return "declined payment '" + payment.getId() + "' with status '" + payment.getStatus() + "'";
		} else {
			return "the GlobalCollect platform returned a declined payment response";
		}
	}

	/**
	 * Returns the result of creating a payment if available, otherwise returns <code>null</code>.
	 */
	public CreatePaymentResult getCreatePaymentResult() {
		return errors == null ? null : errors.getPaymentResult();
	}
}
