package com.globalcollect.gateway.sdk.java;

/**
 * Thrown when a JSON string cannot be converted to a response object.
 */
@SuppressWarnings("serial")
public class GcMarshallerSyntaxException extends RuntimeException {

	public GcMarshallerSyntaxException() {
		super();
	}

	public GcMarshallerSyntaxException(Throwable cause) {
		super(cause);
	}
}
