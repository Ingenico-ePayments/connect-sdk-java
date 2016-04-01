package com.globalcollect.gateway.sdk.java;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.util.List;

/**
 * Represents a connection to the GlobalCollect platform server. Thread-safe.
 */
public interface GcConnection extends Closeable {

	/**
	 * Creates an URI from the passed parameters.
	 */
	URI toURI(String relativePath, List<RequestParam> requestParameters);

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
	 * @throws GcCommunicationException when an exception occurred communicating with the GlobalCollect platform
	 */
	GcResponse get(URI uri, List<RequestHeader> requestHeaders);

	/**
	 * Send a DELETE request to the GlobalCollect platform and return the response.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @throws GcCommunicationException when an exception occurred communicating with the GlobalCollect platform
	 */
	GcResponse delete(URI uri, List<RequestHeader> requestHeaders);

	/**
	 * Send a POST request to the GlobalCollect platform and return the response.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @param body The optional body to send.
	 * @throws GcCommunicationException when an exception occurred communicating with the GlobalCollect platform
	 */
	GcResponse post(URI uri, List<RequestHeader> requestHeaders, String body);

	/**
	 * Send a PUT request to the GlobalCollect platform and return the response.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @param body The optional body to send.
	 * @throws GcCommunicationException when an exception occurred communicating with the GlobalCollect platform
	 */
	GcResponse put(URI uri, List<RequestHeader> requestHeaders, String body);
}
