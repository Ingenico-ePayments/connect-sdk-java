package com.ingenico.connect.gateway.sdk.java.logging;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/**
 * A utility class to build log messages.
 */
public abstract class LogMessageBuilder {

	private final String requestId;
	private final StringBuilder headers;

	private String body;
	private String contentType;

	protected LogMessageBuilder(String requestId) {
		if (requestId == null || requestId.isEmpty()) {
			throw new IllegalArgumentException("requestId is required");
		}

		this.requestId = requestId;
		this.headers = new StringBuilder();
	}

	protected final String requestId() {
		return requestId;
	}

	protected final String headers() {
		return headers.toString();
	}

	protected final String body() {
		return body;
	}

	protected final String contentType() {
		return contentType;
	}

	public final void addHeader(String name, String value) {

		if (headers.length() > 0) {
			headers.append(", ");
		}

		headers.append(name);
		headers.append("=\"");
		if (value != null) {
			String obfuscatedValue = LoggingUtil.obfuscateHeader(name, value);
			headers.append(obfuscatedValue);
		}
		headers.append('"');
	}

	public final void setBody(String body, String contentType) {
		this.body = LoggingUtil.obfuscateBody(body);
		this.contentType = contentType;
	}

	public final void setBody(InputStream bodyStream, Charset charset, String contentType) throws IOException {
		this.body = isBinaryContent(contentType) ? "<binary content>" : LoggingUtil.obfuscateBody(bodyStream, charset);
		this.contentType = contentType;
	}

	public final void setBinaryContentBody(String contentType) {
		if (!isBinaryContent(contentType)) {
			throw new IllegalArgumentException("Not a binary content type: " + contentType);
		}
		this.body = "<binary content>";
		this.contentType = contentType;
	}

	private boolean isBinaryContent(String contentType) {
		return contentType != null
				&& !contentType.startsWith("text/")
				&& !contentType.contains("json")
				&& !contentType.contains("xml");
	}

	public final void setBody(Reader bodyStream, String contentType) throws IOException {
		this.body = LoggingUtil.obfuscateBody(bodyStream);
		this.contentType = contentType;
	}

	public abstract String getMessage();

	protected final String emptyIfNull(String value) {
		return value != null ? value : "";
	}
}
