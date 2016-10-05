package com.ingenico.connect.gateway.sdk.java;

import com.ingenico.connect.gateway.sdk.java.domain.payment.PaymentErrorResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CreatePaymentResult;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Payment;

/**
 * Represents an error response from a create payment call.
 */
@SuppressWarnings("serial")
public class DeclinedPaymentException extends DeclinedTransactionException {

	private final PaymentErrorResponse errors;

	public DeclinedPaymentException(int statusCode, String responseBody, PaymentErrorResponse errors) {
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
	 * @return The result of creating a payment if available, otherwise returns {@code null}.
	 */
	public CreatePaymentResult getCreatePaymentResult() {
		return errors == null ? null : errors.getPaymentResult();
	}
}
