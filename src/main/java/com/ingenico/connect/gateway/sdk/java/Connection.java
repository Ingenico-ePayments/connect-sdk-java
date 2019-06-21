package com.ingenico.connect.gateway.sdk.java;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.logging.LoggingCapable;

/**
 * Represents a connection to the Ingenico ePayments platform server. Thread-safe.
 */
public interface Connection extends Closeable, LoggingCapable {

	/**
	 * Releases any system resources associated with this object.
	 * Should be called when this object is about to go out of scope.
	 */
	@Override
	void close() throws IOException;

	/**
	 * Send a GET request to the Ingenico ePayments platform.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @param responseHandler A handler for the response.
	 * @throws CommunicationException when an exception occurred communicating with the Ingenico ePayments platform
	 */
	<R> R get(URI uri, List<RequestHeader> requestHeaders, ResponseHandler<R> responseHandler);

	/**
	 * Send a DELETE request to the Ingenico ePayments platform.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @param responseHandler A handler for the response.
	 * @throws CommunicationException when an exception occurred communicating with the Ingenico ePayments platform
	 */
	<R> R delete(URI uri, List<RequestHeader> requestHeaders, ResponseHandler<R> responseHandler);

	/**
	 * Send a POST request to the Ingenico ePayments platform.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @param body The optional body to send.
	 * @param responseHandler A handler for the response.
	 * @throws CommunicationException when an exception occurred communicating with the Ingenico ePayments platform
	 */
	<R> R post(URI uri, List<RequestHeader> requestHeaders, String body, ResponseHandler<R> responseHandler);

	/**
	 * Send a multipart/form-data POST request to the Ingenico ePayments platform.
	 * <p>
	 * The content type of the request will be be part of the given request header list.
	 * If the connection creates its own content type, it should be {@link MultipartFormDataObject#getContentType() multipart.getContentType()}.
	 * Otherwise, authentication failures will occur.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @param multipart The multipart/form-data request to send.
	 * @param responseHandler A handler for the response.
	 * @throws CommunicationException when an exception occurred communicating with the Ingenico ePayments platform
	 */
	<R> R post(URI uri, List<RequestHeader> requestHeaders, MultipartFormDataObject multipart, ResponseHandler<R> responseHandler);

	/**
	 * Send a PUT request to the Ingenico ePayments platform.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @param body The optional body to send.
	 * @param responseHandler A handler for the response.
	 * @throws CommunicationException when an exception occurred communicating with the Ingenico ePayments platform
	 */
	<R> R put(URI uri, List<RequestHeader> requestHeaders, String body, ResponseHandler<R> responseHandler);

	/**
	 * Send a multipart/form-data PUT request to the Ingenico ePayments platform.
	 * <p>
	 * The content type of the request will be be part of the given request header list.
	 * If the connection creates its own content type, it should be {@link MultipartFormDataObject#getContentType() multipart.getContentType()}.
	 * Otherwise, authentication failures will occur.
	 *
	 * @param uri The URI to call, including any necessary query parameters.
	 * @param requestHeaders An optional list of request headers.
	 * @param multipart The multipart/form-data request to send.
	 * @param responseHandler A handler for the response.
	 * @throws CommunicationException when an exception occurred communicating with the Ingenico ePayments platform
	 */
	<R> R put(URI uri, List<RequestHeader> requestHeaders, MultipartFormDataObject multipart, ResponseHandler<R> responseHandler);
}
