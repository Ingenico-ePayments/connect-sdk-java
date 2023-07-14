/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.files;

import java.util.Map;
import java.util.TreeMap;

import com.ingenico.connect.gateway.sdk.java.ApiException;
import com.ingenico.connect.gateway.sdk.java.ApiResource;
import com.ingenico.connect.gateway.sdk.java.AuthorizationException;
import com.ingenico.connect.gateway.sdk.java.BodyHandler;
import com.ingenico.connect.gateway.sdk.java.CallContext;
import com.ingenico.connect.gateway.sdk.java.GlobalCollectException;
import com.ingenico.connect.gateway.sdk.java.IdempotenceException;
import com.ingenico.connect.gateway.sdk.java.ReferenceException;
import com.ingenico.connect.gateway.sdk.java.ResponseException;
import com.ingenico.connect.gateway.sdk.java.ValidationException;
import com.ingenico.connect.gateway.sdk.java.domain.errors.ErrorResponse;

/**
 * Files client. Thread-safe.
 */
public class FilesClient extends ApiResource {

	public FilesClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/files/{fileId}
	 * - <a href="https://epayments-api.developer-ingenico.com/fileserviceapi/v1/en_US/java/files/getFile.html">Retrieve File</a>
	 *
	 * @param fileId String
	 * @param bodyHandler BodyHandler
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public void getFile(String fileId, BodyHandler bodyHandler) {
		getFile(fileId, bodyHandler, null);
	}

	/**
	 * Resource /{merchantId}/files/{fileId}
	 * - <a href="https://epayments-api.developer-ingenico.com/fileserviceapi/v1/en_US/java/files/getFile.html">Retrieve File</a>
	 *
	 * @param fileId String
	 * @param bodyHandler BodyHandler
	 * @param context CallContext
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public void getFile(String fileId, BodyHandler bodyHandler, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("fileId", fileId);
		String uri = instantiateUri("/files/v1/{merchantId}/files/{fileId}", pathContext);
		try {
			communicator.get(
					uri,
					getClientHeaders(),
					null,
					bodyHandler,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
