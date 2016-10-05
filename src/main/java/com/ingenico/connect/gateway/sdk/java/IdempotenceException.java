package com.ingenico.connect.gateway.sdk.java;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.errors.definitions.APIError;

/**
 * Represents an error response from the GlobalCollect platform when an idempotent request failed because the first request has not
 * finished yet.
 */
@SuppressWarnings("serial")
public class IdempotenceException extends ApiException {

	private final String idempotenceKey;
	private final Long idempotenceRequestTimestamp;

	public IdempotenceException(String idempotenceKey, Long idempotenceRequestTimestamp,
			int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super("the GlobalCollect platform returned a duplicate request error response", statusCode, responseBody, errorId, errors);
		this.idempotenceKey = idempotenceKey;
		this.idempotenceRequestTimestamp = idempotenceRequestTimestamp;
	}

	public IdempotenceException(String message, String idempotenceKey, Long idempotenceRequestTimestamp,
			int statusCode, String responseBody, String errorId, List<APIError> errors) {
		super(message, statusCode, responseBody, errorId, errors);
		this.idempotenceKey = idempotenceKey;
		this.idempotenceRequestTimestamp = idempotenceRequestTimestamp;
	}

	/**
	 * @return The key that was used for the idempotent request.
	 */
	public String getIdempotenceKey() {
		return idempotenceKey;
	}

	/**
	 * @return The request timestamp of the first idempotent request with the same key.
	 */
	public Long getIdempotenceRequestTimestamp() {
		return idempotenceRequestTimestamp;
	}
}
