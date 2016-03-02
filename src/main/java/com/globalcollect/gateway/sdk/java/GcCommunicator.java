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
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException
	 *             when an error response was received from the GlobalCollect platform
	 * @throws GcApiException
	 *             when an error response was received from the GlobalCollect platform which contained a list of errors
	 */
	<P extends GcParamRequest, O> O get(String relativePath, List<RequestHeader> requestHeaders, P requestParameters, TypeWrapper<O> responseTypeWrapper);

	/**
	 * Corresponds to the HTTP DELETE method.
	 *
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException
	 *             when an error response was received from the GlobalCollect platform
	 * @throws GcApiException
	 *             when an error response was received from the GlobalCollect platform which contained a list of errors
	 */
	<P extends GcParamRequest, O> O delete(String relativePath, List<RequestHeader> requestHeaders, P requestParameters, TypeWrapper<O> responseTypeWrapper);

	/**
	 * Corresponds to the HTTP POST method.
	 *
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException
	 *             when an error response was received from the GlobalCollect platform
	 * @throws GcApiException
	 *             when an error response was received from the GlobalCollect platform which contained a list of errors
	 */
	<P extends GcParamRequest, O> O post(String relativePath, List<RequestHeader> requestHeaders, P requestParameters, Object requestBody, TypeWrapper<O> responseTypeWrapper);

	/**
	 * Corresponds to the HTTP PUT method.
	 *
	 * @throws GcCommunicationException
	 *             when an exception occurred communicating with the GlobalCollect platform
	 * @throws GcResponseException
	 *             when an error response was received from the GlobalCollect platform
	 * @throws GcApiException
	 *             when an error response was received from the GlobalCollect platform which contained a list of errors
	 */
	<P extends GcParamRequest, O> O put(String relativePath, List<RequestHeader> requestHeaders, P requestParameters, Object requestBody, TypeWrapper<O> responseTypeWrapper);

	/**
	 * @return The {@link GcMarshaller} object associated with this communicator.
	 *         Never {@code null}.
	 */
	GcMarshaller getMarshaller();
}
