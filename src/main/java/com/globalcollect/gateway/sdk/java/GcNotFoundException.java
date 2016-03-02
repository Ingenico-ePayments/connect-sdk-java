package com.globalcollect.gateway.sdk.java;

/**
 * Indicates an exception that occurs when the requested resource is not found.
 * In normal usage of the SDK, this exception should not occur, however it is possible.
 * For example when path parameters are set with invalid values.
 */
@SuppressWarnings("serial")
public class GcNotFoundException extends RuntimeException {

	public GcNotFoundException(Exception e) {
		super(e);
	}

	public GcNotFoundException(String message, Exception e) {
		super(message, e);
	}
}
