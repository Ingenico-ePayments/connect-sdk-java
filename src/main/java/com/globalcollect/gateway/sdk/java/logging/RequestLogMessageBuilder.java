package com.globalcollect.gateway.sdk.java.logging;

/**
 * A utility class to build request log messages.
 */
public class RequestLogMessageBuilder extends LogMessageBuilder {

	private final String method;
	private final String uri;

	public RequestLogMessageBuilder(String requestId, String method, String uri) {
		super(requestId);

		this.method = method;
		this.uri = uri;
	}

	@Override
	public String getMessage() {

		final String messageTemplateWithoutBody = "Outgoing request (requestId='%s'):%n"
				+ "  method:       '%s'%n"
				+ "  uri:          '%s'%n"
				+ "  headers:      '%s'";

		final String messageTemplateWithBody = messageTemplateWithoutBody + "%n"
				+ "  content-type: '%s'%n"
				+ "  body:         '%s'";

		String body = body();
		if (body == null) {

			return String.format(messageTemplateWithoutBody, requestId(),
					emptyIfNull(method),
					emptyIfNull(uri),
					headers());

		} else {

			return String.format(messageTemplateWithBody, requestId(),
					emptyIfNull(method),
					emptyIfNull(uri),
					headers(),
					emptyIfNull(contentType()),
					body);
		}
	}
}
