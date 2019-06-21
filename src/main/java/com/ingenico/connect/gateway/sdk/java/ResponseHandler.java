package com.ingenico.connect.gateway.sdk.java;

import java.io.InputStream;
import java.util.List;

/**
 * An interface for handling responses from the Ingenico ePayments platform.
 */
public interface ResponseHandler<R> {

	/**
	 * @param statusCode The HTTP status code that was returned by the Ingenico ePayments platform.
	 * @param bodyStream The raw response body that was returned by the Ingenico ePayments platform. Note that it will be closed outside of this method.
	 * @param headers The headers that were returned by the Ingenico ePayments platform. Never {@code null}.
	 */
	R handleResponse(int statusCode, InputStream bodyStream, List<ResponseHeader> headers);
}
