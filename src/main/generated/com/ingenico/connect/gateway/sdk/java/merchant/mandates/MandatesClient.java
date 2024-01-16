/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.mandates;

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
import com.ingenico.connect.gateway.sdk.java.domain.errors.ErrorResponse;
import com.ingenico.connect.gateway.sdk.java.domain.mandates.CreateMandateRequest;
import com.ingenico.connect.gateway.sdk.java.domain.mandates.CreateMandateResponse;
import com.ingenico.connect.gateway.sdk.java.domain.mandates.GetMandateResponse;

/**
 * Mandates client. Thread-safe.
 */
public class MandatesClient extends ApiResource {

	public MandatesClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/mandates
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/create.html">Create mandate</a>
	 *
	 * @param body CreateMandateRequest
	 * @return CreateMandateResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public CreateMandateResponse create(CreateMandateRequest body) {
		return create(body, null);
	}

	/**
	 * Resource /{merchantId}/mandates
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/create.html">Create mandate</a>
	 *
	 * @param body CreateMandateRequest
	 * @param context CallContext
	 * @return CreateMandateResponse
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
	public CreateMandateResponse create(CreateMandateRequest body, CallContext context) {
		String uri = instantiateUri("/v1/{merchantId}/mandates", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					CreateMandateResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/mandates/{uniqueMandateReference}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/createWithMandateReference.html">Create mandate with mandatereference</a>
	 *
	 * @param uniqueMandateReference String
	 * @param body CreateMandateRequest
	 * @return CreateMandateResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public CreateMandateResponse createWithMandateReference(String uniqueMandateReference, CreateMandateRequest body) {
		return createWithMandateReference(uniqueMandateReference, body, null);
	}

	/**
	 * Resource /{merchantId}/mandates/{uniqueMandateReference}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/createWithMandateReference.html">Create mandate with mandatereference</a>
	 *
	 * @param uniqueMandateReference String
	 * @param body CreateMandateRequest
	 * @param context CallContext
	 * @return CreateMandateResponse
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
	public CreateMandateResponse createWithMandateReference(String uniqueMandateReference, CreateMandateRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("uniqueMandateReference", uniqueMandateReference);
		String uri = instantiateUri("/v1/{merchantId}/mandates/{uniqueMandateReference}", pathContext);
		try {
			return communicator.put(
					uri,
					getClientHeaders(),
					null,
					body,
					CreateMandateResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/mandates/{uniqueMandateReference}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/get.html">Get mandate</a>
	 *
	 * @param uniqueMandateReference String
	 * @return GetMandateResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public GetMandateResponse get(String uniqueMandateReference) {
		return get(uniqueMandateReference, null);
	}

	/**
	 * Resource /{merchantId}/mandates/{uniqueMandateReference}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/get.html">Get mandate</a>
	 *
	 * @param uniqueMandateReference String
	 * @param context CallContext
	 * @return GetMandateResponse
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
	public GetMandateResponse get(String uniqueMandateReference, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("uniqueMandateReference", uniqueMandateReference);
		String uri = instantiateUri("/v1/{merchantId}/mandates/{uniqueMandateReference}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					GetMandateResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/mandates/{uniqueMandateReference}/block
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/block.html">Block mandate</a>
	 *
	 * @param uniqueMandateReference String
	 * @return GetMandateResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public GetMandateResponse block(String uniqueMandateReference) {
		return block(uniqueMandateReference, null);
	}

	/**
	 * Resource /{merchantId}/mandates/{uniqueMandateReference}/block
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/block.html">Block mandate</a>
	 *
	 * @param uniqueMandateReference String
	 * @param context CallContext
	 * @return GetMandateResponse
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
	public GetMandateResponse block(String uniqueMandateReference, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("uniqueMandateReference", uniqueMandateReference);
		String uri = instantiateUri("/v1/{merchantId}/mandates/{uniqueMandateReference}/block", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					GetMandateResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/mandates/{uniqueMandateReference}/unblock
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/unblock.html">Unblock mandate</a>
	 *
	 * @param uniqueMandateReference String
	 * @return GetMandateResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public GetMandateResponse unblock(String uniqueMandateReference) {
		return unblock(uniqueMandateReference, null);
	}

	/**
	 * Resource /{merchantId}/mandates/{uniqueMandateReference}/unblock
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/unblock.html">Unblock mandate</a>
	 *
	 * @param uniqueMandateReference String
	 * @param context CallContext
	 * @return GetMandateResponse
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
	public GetMandateResponse unblock(String uniqueMandateReference, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("uniqueMandateReference", uniqueMandateReference);
		String uri = instantiateUri("/v1/{merchantId}/mandates/{uniqueMandateReference}/unblock", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					GetMandateResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/mandates/{uniqueMandateReference}/revoke
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/revoke.html">Revoke mandate</a>
	 *
	 * @param uniqueMandateReference String
	 * @return GetMandateResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public GetMandateResponse revoke(String uniqueMandateReference) {
		return revoke(uniqueMandateReference, null);
	}

	/**
	 * Resource /{merchantId}/mandates/{uniqueMandateReference}/revoke
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/mandates/revoke.html">Revoke mandate</a>
	 *
	 * @param uniqueMandateReference String
	 * @param context CallContext
	 * @return GetMandateResponse
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
	public GetMandateResponse revoke(String uniqueMandateReference, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("uniqueMandateReference", uniqueMandateReference);
		String uri = instantiateUri("/v1/{merchantId}/mandates/{uniqueMandateReference}/revoke", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					GetMandateResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
