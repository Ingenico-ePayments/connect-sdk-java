package com.globalcollect.gateway.sdk.java;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.util.List;

/**
 * Represents a connection to the GlobalCollect server. Thread-safe.
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
	 * Send a GET request to GlobalCollect and return the response.
	 * 
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with GlobalCollect
	 * @throws GcResponseException
	 *             when an error response was received from GlobalCollect
	 */
	String get(String relativePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters);
	
	/**
	 * Send a DELETE request to GlobalCollect and return the response.
	 * 
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with GlobalCollect
	 * @throws GcResponseException
	 *             when an error response was received from GlobalCollect
	 */
	String delete(String relativePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters);
	
	/**
	 * Send a POST request to GlobalCollect and return the response.
	 * 
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with GlobalCollect
	 * @throws GcResponseException
	 *             when an error response was received from GlobalCollect
	 */
	String post(String resourcePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters, String body);
	
	/**
	 * Send a PUT request to GlobalCollect and return the response.
	 * 
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with GlobalCollect
	 * @throws GcResponseException
	 *             when an error response was received from GlobalCollect
	 */
	String put(String resourcePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters, String body);
	
}
