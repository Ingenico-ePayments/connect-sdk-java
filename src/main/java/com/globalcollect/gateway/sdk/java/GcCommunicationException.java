package com.globalcollect.gateway.sdk.java;

/**
 * Indicates an exception regarding the communication with the GlobalCollect platform such as a connection exception.
 */
@SuppressWarnings("serial")
public class GcCommunicationException extends RuntimeException {

	public GcCommunicationException(Exception e) {
		super(e);
	}
}
