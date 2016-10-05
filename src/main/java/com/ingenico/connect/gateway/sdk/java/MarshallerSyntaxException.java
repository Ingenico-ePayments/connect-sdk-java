package com.ingenico.connect.gateway.sdk.java;

/**
 * Thrown when a JSON string cannot be converted to a response object.
 */
@SuppressWarnings("serial")
public class MarshallerSyntaxException extends RuntimeException {

	public MarshallerSyntaxException() {
		super();
	}

	public MarshallerSyntaxException(Throwable cause) {
		super(cause);
	}
}
