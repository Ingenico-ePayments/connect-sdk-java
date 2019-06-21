package com.ingenico.connect.gateway.sdk.java;

/**
 * Thrown when an error occurred when calling a {@link BodyHandler}.
 */
@SuppressWarnings("serial")
public class BodyHandlerException extends RuntimeException {

	public BodyHandlerException() {
		super();
	}

	public BodyHandlerException(String message) {
		super(message);
	}

	public BodyHandlerException(Throwable cause) {
		super(cause);
	}

	public BodyHandlerException(String message, Throwable cause) {
		super(message, cause);
	}
}
