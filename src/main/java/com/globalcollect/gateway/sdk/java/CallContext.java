package com.globalcollect.gateway.sdk.java;

/**
 * A call context can be used to send extra information with a request, and to receive extra information from a response.
 * <p>
 * Please note that this class is not thread-safe. Each request should get its own call context instance.
 */
public class CallContext {

	private String idempotenceKey;

	private Long idempotenceRequestTimestamp;

	/**
	 * @return The idempotence key.
	 */
	public String getIdempotenceKey() {
		return idempotenceKey;
	}

	/**
	 * Sets the idempotence key to use for the next request for which this call context is used.
	 * @return This call context object.
	 */
	public CallContext withIdempotenceKey(String idempotenceKey) {
		this.idempotenceKey = idempotenceKey;
		return this;
	}

	/**
	 * @return The idempotence request timestamp from the response to the last request for which this call context was used,
	 *             or {@code null} if no idempotence request timestamp was present.
	 */
	public Long getIdempotenceRequestTimestamp() {
		return idempotenceRequestTimestamp;
	}

	/**
	 * Sets the idempotence request timestamp.
	 * This method should only be called by {@link GcCommunicator} objects based on the response to the request for which this
	 * call context was used.
	 */
	public void setIdempotenceRequestTimestamp(Long idempotenceRequestTimestamp) {
		this.idempotenceRequestTimestamp = idempotenceRequestTimestamp;
	}
}
