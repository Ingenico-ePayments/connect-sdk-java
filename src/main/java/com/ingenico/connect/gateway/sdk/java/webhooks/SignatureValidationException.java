package com.ingenico.connect.gateway.sdk.java.webhooks;

/**
 * Represents an error while validating webhooks signatures.
 */
@SuppressWarnings("serial")
public class SignatureValidationException extends RuntimeException {

	public SignatureValidationException(String message) {
		super(message);
	}

	public SignatureValidationException(Throwable cause) {
		super(cause);
	}

	public SignatureValidationException(String message, Throwable cause) {
		super(message, cause);
	}
}
