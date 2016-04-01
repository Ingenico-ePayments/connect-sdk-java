package com.globalcollect.gateway.sdk.java;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

/**
 * Used to communicate with the GlobalCollect platform web services.
 * <p>
 * It contains all the logic to transform a request object to a HTTP request and
 * a HTTP response to a response object.
 * <p>
 * Thread-safe.
 */
public interface GcCommunicator extends Closeable {

	/**
	 * Releases any system resources associated with this object.
	 */
	@Override
	void close() throws IOException;

	/**
	 * Corresponds to the HTTP GET method.
	 *
	 * @param relativePath The path to call, relative to the base URI.
	 * @param requestHeaders An optional list of request headers.
	 * @param requestParameters An optional set of request parameters.
	 * @param responseType The type of response to return.
	 * @param context The optional call context to use.
	 * @throws GcCommunicationException when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException when an error response was received from the GlobalCollect platform
	 * @throws GcApiException when an error response was received from the GlobalCollect platform which contained a list of errors
	 */
	<P extends GcParamRequest, O> O get(String relativePath, List<RequestHeader> requestHeaders, P requestParameters,
			Class<O> responseType, CallContext context);

	/**
	 * Corresponds to the HTTP DELETE method.
	 *
	 * @param relativePath The path to call, relative to the base URI.
	 * @param requestHeaders An optional list of request headers.
	 * @param requestParameters An optional set of request parameters.
	 * @param responseType The type of response to return.
	 * @param context The optional call context to use.
	 * @throws GcCommunicationException when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException when an error response was received from the GlobalCollect platform
	 * @throws GcApiException when an error response was received from the GlobalCollect platform which contained a list of errors
	 */
	<P extends GcParamRequest, O> O delete(String relativePath, List<RequestHeader> requestHeaders, P requestParameters,
			Class<O> responseType, CallContext context);

	/**
	 * Corresponds to the HTTP POST method.
	 *
	 * @param relativePath The path to call, relative to the base URI.
	 * @param requestHeaders An optional list of request headers.
	 * @param requestParameters An optional set of request parameters.
	 * @param requestBody The optional request body to send.
	 * @param responseType The type of response to return.
	 * @param context The optional call context to use.
	 * @throws GcCommunicationException when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException when an error response was received from the GlobalCollect platform
	 * @throws GcApiException when an error response was received from the GlobalCollect platform which contained a list of errors
	 */
	<P extends GcParamRequest, O> O post(String relativePath, List<RequestHeader> requestHeaders, P requestParameters, Object requestBody,
			Class<O> responseType, CallContext context);

	/**
	 * Corresponds to the HTTP PUT method.
	 *
	 * @param relativePath The path to call, relative to the base URI.
	 * @param requestHeaders An optional list of request headers.
	 * @param requestParameters An optional set of request parameters.
	 * @param requestBody The optional request body to send.
	 * @param responseType The type of response to return.
	 * @param context The optional call context to use.
	 * @throws GcCommunicationException when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException when an error response was received from the GlobalCollect platform
	 * @throws GcApiException when an error response was received from the GlobalCollect platform which contained a list of errors
	 */
	<P extends GcParamRequest, O> O put(String relativePath, List<RequestHeader> requestHeaders, P requestParameters, Object requestBody,
			Class<O> responseType, CallContext context);

	/**
	 * @return The {@link GcMarshaller} object associated with this communicator. Never {@code null}.
	 */
	GcMarshaller getMarshaller();
}
