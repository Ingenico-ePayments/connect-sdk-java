package com.ingenico.connect.gateway.sdk.java.webhooks;

/**
 * Represents an error because a webhooks event has an API version that this version of the SDK does not support.
 */
@SuppressWarnings("serial")
public class ApiVersionMismatchException extends RuntimeException {

	private final String eventApiVersion;
	private final String sdkApiVersion;

	public ApiVersionMismatchException(String eventApiVersion, String sdkApiVersion) {
		super("event API version " + eventApiVersion + " is not compatible with SDK API version " + sdkApiVersion);
		this.sdkApiVersion = sdkApiVersion;
		this.eventApiVersion = eventApiVersion;
	}

	/**
	 * @return The API version from the webhooks event.
	 */
	public String getEventApiVersion() {
		return eventApiVersion;
	}

	/**
	 * @return The API version that this version of the SDK supports.
	 */
	public String getSdkApiVersion() {
		return sdkApiVersion;
	}
}
