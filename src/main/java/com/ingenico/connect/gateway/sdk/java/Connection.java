package com.ingenico.connect.gateway.sdk.java;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.logging.LoggingCapable;

/**
 * Represents a connection to the GlobalCollect platform server. Thread-safe.
 */
public interface Connection extends Closeable, LoggingCapable {

	/**
	 * Releases any system resources associated with this object.
	 * Should be called when this object is about to go out of scope.
	 */
	@Override
	void close() throws IOException;

	/**
	 * Send a GET request to the GlobalCollect platform and return the response.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @throws CommunicationException when an exception occurred communicating with the GlobalCollect platform
	 */
	Response get(URI uri, List<RequestHeader> requestHeaders);

	/**
	 * Send a DELETE request to the GlobalCollect platform and return the response.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @throws CommunicationException when an exception occurred communicating with the GlobalCollect platform
	 */
	Response delete(URI uri, List<RequestHeader> requestHeaders);

	/**
	 * Send a POST request to the GlobalCollect platform and return the response.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @param body The optional body to send.
	 * @throws CommunicationException when an exception occurred communicating with the GlobalCollect platform
	 */
	Response post(URI uri, List<RequestHeader> requestHeaders, String body);

	/**
	 * Send a PUT request to the GlobalCollect platform and return the response.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @param body The optional body to send.
	 * @throws CommunicationException when an exception occurred communicating with the GlobalCollect platform
	 */
	Response put(URI uri, List<RequestHeader> requestHeaders, String body);
}
