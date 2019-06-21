/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.tokens;

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
import com.ingenico.connect.gateway.sdk.java.domain.token.ApproveTokenRequest;
import com.ingenico.connect.gateway.sdk.java.domain.token.CreateTokenRequest;
import com.ingenico.connect.gateway.sdk.java.domain.token.CreateTokenResponse;
import com.ingenico.connect.gateway.sdk.java.domain.token.TokenResponse;
import com.ingenico.connect.gateway.sdk.java.domain.token.UpdateTokenRequest;

/**
 * Tokens client. Thread-safe.
 */
public class TokensClient extends ApiResource {

	public TokensClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/tokens
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/tokens/create.html">Create token</a>
	 *
	 * @param body CreateTokenRequest
	 * @return CreateTokenResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public CreateTokenResponse create(CreateTokenRequest body) {
		return create(body, null);
	}

	/**
	 * Resource /{merchantId}/tokens
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/tokens/create.html">Create token</a>
	 *
	 * @param body CreateTokenRequest
	 * @param context CallContext
	 * @return CreateTokenResponse
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
	public CreateTokenResponse create(CreateTokenRequest body, CallContext context) {
		String uri = instantiateUri("/v1/{merchantId}/tokens", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					CreateTokenResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/tokens/{tokenId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/tokens/get.html">Get token</a>
	 *
	 * @param tokenId String
	 * @return TokenResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public TokenResponse get(String tokenId) {
		return get(tokenId, null);
	}

	/**
	 * Resource /{merchantId}/tokens/{tokenId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/tokens/get.html">Get token</a>
	 *
	 * @param tokenId String
	 * @param context CallContext
	 * @return TokenResponse
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
	public TokenResponse get(String tokenId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("tokenId", tokenId);
		String uri = instantiateUri("/v1/{merchantId}/tokens/{tokenId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					TokenResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/tokens/{tokenId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/tokens/update.html">Update token</a>
	 *
	 * @param tokenId String
	 * @param body UpdateTokenRequest
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public void update(String tokenId, UpdateTokenRequest body) {
		update(tokenId, body, null);
	}

	/**
	 * Resource /{merchantId}/tokens/{tokenId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/tokens/update.html">Update token</a>
	 *
	 * @param tokenId String
	 * @param body UpdateTokenRequest
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
	public void update(String tokenId, UpdateTokenRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("tokenId", tokenId);
		String uri = instantiateUri("/v1/{merchantId}/tokens/{tokenId}", pathContext);
		try {
			communicator.put(
					uri,
					getClientHeaders(),
					null,
					body,
					void.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/tokens/{tokenId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/tokens/delete.html">Delete token</a>
	 *
	 * @param tokenId String
	 * @param query DeleteTokenParams
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public void delete(String tokenId, DeleteTokenParams query) {
		delete(tokenId, query, null);
	}

	/**
	 * Resource /{merchantId}/tokens/{tokenId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/tokens/delete.html">Delete token</a>
	 *
	 * @param tokenId String
	 * @param query DeleteTokenParams
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
	public void delete(String tokenId, DeleteTokenParams query, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("tokenId", tokenId);
		String uri = instantiateUri("/v1/{merchantId}/tokens/{tokenId}", pathContext);
		try {
			communicator.delete(
					uri,
					getClientHeaders(),
					query,
					void.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/tokens/{tokenId}/approvesepadirectdebit
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/tokens/approvesepadirectdebit.html">Approve SEPA DD mandate</a>
	 *
	 * @param tokenId String
	 * @param body ApproveTokenRequest
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public void approvesepadirectdebit(String tokenId, ApproveTokenRequest body) {
		approvesepadirectdebit(tokenId, body, null);
	}

	/**
	 * Resource /{merchantId}/tokens/{tokenId}/approvesepadirectdebit
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/tokens/approvesepadirectdebit.html">Approve SEPA DD mandate</a>
	 *
	 * @param tokenId String
	 * @param body ApproveTokenRequest
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
	public void approvesepadirectdebit(String tokenId, ApproveTokenRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("tokenId", tokenId);
		String uri = instantiateUri("/v1/{merchantId}/tokens/{tokenId}/approvesepadirectdebit", pathContext);
		try {
			communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					void.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
