package com.ingenico.connect.gateway.sdk.java.logging;

/**
 * A utility class to build request log messages.
 */
public class ResponseLogMessageBuilder extends LogMessageBuilder {

	private final int statusCode;
	private final long duration;

	public ResponseLogMessageBuilder(String requestId, int statusCode) {
		this(requestId, statusCode, -1);
	}

	public ResponseLogMessageBuilder(String requestId, int statusCode, long duration) {
		super(requestId);
		this.statusCode = statusCode;
		this.duration = duration;
	}

	@Override
	public String getMessage() {

		if (duration < 0) {

			final String messageTemplate = "Incoming response (requestId='%s'):%n"
					+ "  status-code:  '%d'%n"
					+ "  headers:      '%s'%n"
					+ "  content-type: '%s'%n"
					+ "  body:         '%s'";

			return String.format(messageTemplate, requestId(),
					statusCode,
					headers(),
					emptyIfNull(contentType()),
					emptyIfNull(body()));

		} else {

			final String messageTemplate = "Incoming response (requestId='%s', %d ms):%n"
					+ "  status-code:  '%d'%n"
					+ "  headers:      '%s'%n"
					+ "  content-type: '%s'%n"
					+ "  body:         '%s'";

			return String.format(messageTemplate, requestId(), duration,
					statusCode,
					headers(),
					emptyIfNull(contentType()),
					emptyIfNull(body()));

		}
	}
}
