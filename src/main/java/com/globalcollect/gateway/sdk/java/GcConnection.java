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
	 * Releases any system resources associated with this object. Should be
	 * called when this object is about to go out of scope.
	 */
	@Override
	void close() throws IOException;

	/**
	 * Send a GET request to the GlobalCollect platform and return the response.
	 *
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException
	 *             when an error response was received from the GlobalCollect platform
	 */
	String get(String relativePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters);

	/**
	 * Send a DELETE request to the GlobalCollect platform and return the response.
	 *
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException
	 *             when an error response was received from the GlobalCollect platform
	 */
	String delete(String relativePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters);

	/**
	 * Send a POST request to the GlobalCollect platform and return the response.
	 *
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException
	 *             when an error response was received from the GlobalCollect platform
	 */
	String post(String resourcePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters, String body);

	/**
	 * Send a PUT request to the GlobalCollect platform and return the response.
	 *
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException
	 *             when an error response was received from the GlobalCollect platform
	 */
	String put(String resourcePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters, String body);
}
