/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.disputes;

import java.util.Map;
import java.util.TreeMap;

import com.ingenico.connect.gateway.sdk.java.ApiException;
import com.ingenico.connect.gateway.sdk.java.ApiResource;
import com.ingenico.connect.gateway.sdk.java.AuthorizationException;
import com.ingenico.connect.gateway.sdk.java.CallContext;
import com.ingenico.connect.gateway.sdk.java.GlobalCollectException;
import com.ingenico.connect.gateway.sdk.java.IdempotenceException;
import com.ingenico.connect.gateway.sdk.java.ReferenceException;
import com.ingenico.connect.gateway.sdk.java.ResponseException;
import com.ingenico.connect.gateway.sdk.java.ValidationException;
import com.ingenico.connect.gateway.sdk.java.domain.dispute.DisputeResponse;
import com.ingenico.connect.gateway.sdk.java.domain.dispute.UploadDisputeFileResponse;
import com.ingenico.connect.gateway.sdk.java.domain.errors.ErrorResponse;

/**
 * Disputes client. Thread-safe.
 */
public class DisputesClient extends ApiResource {

	public DisputesClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/disputes/{disputeId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/disputes/get.html">Get dispute</a>
	 *
	 * @param disputeId String
	 * @return DisputeResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public DisputeResponse get(String disputeId) {
		return get(disputeId, null);
	}

	/**
	 * Resource /{merchantId}/disputes/{disputeId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/disputes/get.html">Get dispute</a>
	 *
	 * @param disputeId String
	 * @param context CallContext
	 * @return DisputeResponse
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
	public DisputeResponse get(String disputeId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("disputeId", disputeId);
		String uri = instantiateUri("/v1/{merchantId}/disputes/{disputeId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					DisputeResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/disputes/{disputeId}/submit
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/disputes/submit.html">Submit dispute</a>
	 *
	 * @param disputeId String
	 * @return DisputeResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public DisputeResponse submit(String disputeId) {
		return submit(disputeId, null);
	}

	/**
	 * Resource /{merchantId}/disputes/{disputeId}/submit
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/disputes/submit.html">Submit dispute</a>
	 *
	 * @param disputeId String
	 * @param context CallContext
	 * @return DisputeResponse
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
	public DisputeResponse submit(String disputeId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("disputeId", disputeId);
		String uri = instantiateUri("/v1/{merchantId}/disputes/{disputeId}/submit", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					DisputeResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/disputes/{disputeId}/cancel
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/disputes/cancel.html">Cancel dispute</a>
	 *
	 * @param disputeId String
	 * @return DisputeResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public DisputeResponse cancel(String disputeId) {
		return cancel(disputeId, null);
	}

	/**
	 * Resource /{merchantId}/disputes/{disputeId}/cancel
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/disputes/cancel.html">Cancel dispute</a>
	 *
	 * @param disputeId String
	 * @param context CallContext
	 * @return DisputeResponse
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
	public DisputeResponse cancel(String disputeId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("disputeId", disputeId);
		String uri = instantiateUri("/v1/{merchantId}/disputes/{disputeId}/cancel", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					DisputeResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/disputes/{disputeId}
	 * - <a href="https://epayments-api.developer-ingenico.com/fileserviceapi/v1/en_US/java/disputes/uploadFile.html">Upload File</a>
	 *
	 * @param disputeId String
	 * @param body UploadFileRequest
	 * @return UploadDisputeFileResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public UploadDisputeFileResponse uploadFile(String disputeId, UploadFileRequest body) {
		return uploadFile(disputeId, body, null);
	}

	/**
	 * Resource /{merchantId}/disputes/{disputeId}
	 * - <a href="https://epayments-api.developer-ingenico.com/fileserviceapi/v1/en_US/java/disputes/uploadFile.html">Upload File</a>
	 *
	 * @param disputeId String
	 * @param body UploadFileRequest
	 * @param context CallContext
	 * @return UploadDisputeFileResponse
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
	public UploadDisputeFileResponse uploadFile(String disputeId, UploadFileRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("disputeId", disputeId);
		String uri = instantiateUri("/files/v1/{merchantId}/disputes/{disputeId}", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					UploadDisputeFileResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
