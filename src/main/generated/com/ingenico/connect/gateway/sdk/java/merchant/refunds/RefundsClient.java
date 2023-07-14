/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.refunds;

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
import com.ingenico.connect.gateway.sdk.java.domain.refund.ApproveRefundRequest;
import com.ingenico.connect.gateway.sdk.java.domain.refund.FindRefundsResponse;
import com.ingenico.connect.gateway.sdk.java.domain.refund.RefundResponse;

/**
 * Refunds client. Thread-safe.
 */
public class RefundsClient extends ApiResource {

	public RefundsClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/refunds
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/refunds/find.html">Find refunds</a>
	 *
	 * @param query FindRefundsParams
	 * @return FindRefundsResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public FindRefundsResponse find(FindRefundsParams query) {
		return find(query, null);
	}

	/**
	 * Resource /{merchantId}/refunds
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/refunds/find.html">Find refunds</a>
	 *
	 * @param query FindRefundsParams
	 * @param context CallContext
	 * @return FindRefundsResponse
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
	public FindRefundsResponse find(FindRefundsParams query, CallContext context) {
		String uri = instantiateUri("/v1/{merchantId}/refunds", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					FindRefundsResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/refunds/{refundId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/refunds/get.html">Get refund</a>
	 *
	 * @param refundId String
	 * @return RefundResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public RefundResponse get(String refundId) {
		return get(refundId, null);
	}

	/**
	 * Resource /{merchantId}/refunds/{refundId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/refunds/get.html">Get refund</a>
	 *
	 * @param refundId String
	 * @param context CallContext
	 * @return RefundResponse
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
	public RefundResponse get(String refundId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("refundId", refundId);
		String uri = instantiateUri("/v1/{merchantId}/refunds/{refundId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					RefundResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/refunds/{refundId}/approve
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/refunds/approve.html">Approve refund</a>
	 *
	 * @param refundId String
	 * @param body ApproveRefundRequest
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public void approve(String refundId, ApproveRefundRequest body) {
		approve(refundId, body, null);
	}

	/**
	 * Resource /{merchantId}/refunds/{refundId}/approve
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/refunds/approve.html">Approve refund</a>
	 *
	 * @param refundId String
	 * @param body ApproveRefundRequest
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
	public void approve(String refundId, ApproveRefundRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("refundId", refundId);
		String uri = instantiateUri("/v1/{merchantId}/refunds/{refundId}/approve", pathContext);
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

	/**
	 * Resource /{merchantId}/refunds/{refundId}/cancel
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/refunds/cancel.html">Cancel refund</a>
	 *
	 * @param refundId String
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public void cancel(String refundId) {
		cancel(refundId, null);
	}

	/**
	 * Resource /{merchantId}/refunds/{refundId}/cancel
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/refunds/cancel.html">Cancel refund</a>
	 *
	 * @param refundId String
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
	public void cancel(String refundId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("refundId", refundId);
		String uri = instantiateUri("/v1/{merchantId}/refunds/{refundId}/cancel", pathContext);
		try {
			communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					void.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/refunds/{refundId}/cancelapproval
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/refunds/cancelapproval.html">Undo approve refund</a>
	 *
	 * @param refundId String
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public void cancelapproval(String refundId) {
		cancelapproval(refundId, null);
	}

	/**
	 * Resource /{merchantId}/refunds/{refundId}/cancelapproval
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/refunds/cancelapproval.html">Undo approve refund</a>
	 *
	 * @param refundId String
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
	public void cancelapproval(String refundId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("refundId", refundId);
		String uri = instantiateUri("/v1/{merchantId}/refunds/{refundId}/cancelapproval", pathContext);
		try {
			communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					void.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
