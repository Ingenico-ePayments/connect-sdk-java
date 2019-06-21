/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.payouts;

import java.util.Map;
import java.util.TreeMap;

import com.ingenico.connect.gateway.sdk.java.ApiException;
import com.ingenico.connect.gateway.sdk.java.ApiResource;
import com.ingenico.connect.gateway.sdk.java.AuthorizationException;
import com.ingenico.connect.gateway.sdk.java.CallContext;
import com.ingenico.connect.gateway.sdk.java.DeclinedPayoutException;
import com.ingenico.connect.gateway.sdk.java.GlobalCollectException;
import com.ingenico.connect.gateway.sdk.java.IdempotenceException;
import com.ingenico.connect.gateway.sdk.java.ReferenceException;
import com.ingenico.connect.gateway.sdk.java.ResponseException;
import com.ingenico.connect.gateway.sdk.java.ValidationException;
import com.ingenico.connect.gateway.sdk.java.domain.errors.ErrorResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payout.ApprovePayoutRequest;
import com.ingenico.connect.gateway.sdk.java.domain.payout.CreatePayoutRequest;
import com.ingenico.connect.gateway.sdk.java.domain.payout.FindPayoutsResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payout.PayoutErrorResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payout.PayoutResponse;

/**
 * Payouts client. Thread-safe.
 */
public class PayoutsClient extends ApiResource {

	public PayoutsClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/payouts
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/create.html">Create payout</a>
	 *
	 * @param body CreatePayoutRequest
	 * @return PayoutResponse
	 * @throws DeclinedPayoutException if the Ingenico ePayments platform declined / rejected the payout. The payout result will be available from the exception.
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public PayoutResponse create(CreatePayoutRequest body) {
		return create(body, null);
	}

	/**
	 * Resource /{merchantId}/payouts
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/create.html">Create payout</a>
	 *
	 * @param body CreatePayoutRequest
	 * @param context CallContext
	 * @return PayoutResponse
	 * @throws DeclinedPayoutException if the Ingenico ePayments platform declined / rejected the payout. The payout result will be available from the exception.
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
	public PayoutResponse create(CreatePayoutRequest body, CallContext context) {
		String uri = instantiateUri("/v1/{merchantId}/payouts", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					PayoutResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = PayoutErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/payouts
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/find.html">Find payouts</a>
	 *
	 * @param query FindPayoutsParams
	 * @return FindPayoutsResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public FindPayoutsResponse find(FindPayoutsParams query) {
		return find(query, null);
	}

	/**
	 * Resource /{merchantId}/payouts
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/find.html">Find payouts</a>
	 *
	 * @param query FindPayoutsParams
	 * @param context CallContext
	 * @return FindPayoutsResponse
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
	public FindPayoutsResponse find(FindPayoutsParams query, CallContext context) {
		String uri = instantiateUri("/v1/{merchantId}/payouts", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					FindPayoutsResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/payouts/{payoutId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/get.html">Get payout</a>
	 *
	 * @param payoutId String
	 * @return PayoutResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public PayoutResponse get(String payoutId) {
		return get(payoutId, null);
	}

	/**
	 * Resource /{merchantId}/payouts/{payoutId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/get.html">Get payout</a>
	 *
	 * @param payoutId String
	 * @param context CallContext
	 * @return PayoutResponse
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
	public PayoutResponse get(String payoutId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("payoutId", payoutId);
		String uri = instantiateUri("/v1/{merchantId}/payouts/{payoutId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					PayoutResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/payouts/{payoutId}/approve
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/approve.html">Approve payout</a>
	 *
	 * @param payoutId String
	 * @param body ApprovePayoutRequest
	 * @return PayoutResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public PayoutResponse approve(String payoutId, ApprovePayoutRequest body) {
		return approve(payoutId, body, null);
	}

	/**
	 * Resource /{merchantId}/payouts/{payoutId}/approve
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/approve.html">Approve payout</a>
	 *
	 * @param payoutId String
	 * @param body ApprovePayoutRequest
	 * @param context CallContext
	 * @return PayoutResponse
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
	public PayoutResponse approve(String payoutId, ApprovePayoutRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("payoutId", payoutId);
		String uri = instantiateUri("/v1/{merchantId}/payouts/{payoutId}/approve", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					PayoutResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/payouts/{payoutId}/cancel
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/cancel.html">Cancel payout</a>
	 *
	 * @param payoutId String
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public void cancel(String payoutId) {
		cancel(payoutId, null);
	}

	/**
	 * Resource /{merchantId}/payouts/{payoutId}/cancel
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/cancel.html">Cancel payout</a>
	 *
	 * @param payoutId String
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
	public void cancel(String payoutId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("payoutId", payoutId);
		String uri = instantiateUri("/v1/{merchantId}/payouts/{payoutId}/cancel", pathContext);
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
	 * Resource /{merchantId}/payouts/{payoutId}/cancelapproval
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/cancelapproval.html">Undo approve payout</a>
	 *
	 * @param payoutId String
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public void cancelapproval(String payoutId) {
		cancelapproval(payoutId, null);
	}

	/**
	 * Resource /{merchantId}/payouts/{payoutId}/cancelapproval
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payouts/cancelapproval.html">Undo approve payout</a>
	 *
	 * @param payoutId String
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
	public void cancelapproval(String payoutId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("payoutId", payoutId);
		String uri = instantiateUri("/v1/{merchantId}/payouts/{payoutId}/cancelapproval", pathContext);
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
