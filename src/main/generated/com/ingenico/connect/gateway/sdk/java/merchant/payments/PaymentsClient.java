/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.payments;

import java.util.Map;
import java.util.TreeMap;

import com.ingenico.connect.gateway.sdk.java.ApiException;
import com.ingenico.connect.gateway.sdk.java.ApiResource;
import com.ingenico.connect.gateway.sdk.java.AuthorizationException;
import com.ingenico.connect.gateway.sdk.java.CallContext;
import com.ingenico.connect.gateway.sdk.java.DeclinedPaymentException;
import com.ingenico.connect.gateway.sdk.java.DeclinedRefundException;
import com.ingenico.connect.gateway.sdk.java.GlobalCollectException;
import com.ingenico.connect.gateway.sdk.java.IdempotenceException;
import com.ingenico.connect.gateway.sdk.java.ReferenceException;
import com.ingenico.connect.gateway.sdk.java.ResponseException;
import com.ingenico.connect.gateway.sdk.java.ValidationException;
import com.ingenico.connect.gateway.sdk.java.domain.errors.ErrorResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.ApprovePaymentRequest;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CancelApprovalPaymentResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CancelPaymentResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CreatePaymentRequest;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CreatePaymentResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.PaymentApprovalResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.PaymentErrorResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.PaymentResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.TokenizePaymentRequest;
import com.ingenico.connect.gateway.sdk.java.domain.refund.RefundErrorResponse;
import com.ingenico.connect.gateway.sdk.java.domain.refund.RefundRequest;
import com.ingenico.connect.gateway.sdk.java.domain.refund.RefundResponse;
import com.ingenico.connect.gateway.sdk.java.domain.token.CreateTokenResponse;

/**
 * Payments client. Thread-safe.
 */
public class PaymentsClient extends ApiResource {

	public PaymentsClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/payments
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments_post">Create payment</a>
	 *
	 * @param body CreatePaymentRequest
	 * @return CreatePaymentResponse
	 * @throws DeclinedPaymentException if the GlobalCollect platform declined / rejected the payment. The payment result will be available from the exception.
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public CreatePaymentResponse create(CreatePaymentRequest body) {
		return create(body, null);
	}

	/**
	 * Resource /{merchantId}/payments
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments_post">Create payment</a>
	 *
	 * @param body CreatePaymentRequest
	 * @param context CallContext
	 * @return CreatePaymentResponse
	 * @throws DeclinedPaymentException if the GlobalCollect platform declined / rejected the payment. The payment result will be available from the exception.
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public CreatePaymentResponse create(CreatePaymentRequest body, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/payments", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					CreatePaymentResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 400:
				errorType = PaymentErrorResponse.class;
				break;
			case 402:
				errorType = PaymentErrorResponse.class;
				break;
			case 403:
				errorType = PaymentErrorResponse.class;
				break;
			case 502:
				errorType = PaymentErrorResponse.class;
				break;
			case 503:
				errorType = PaymentErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__get">Get payment</a>
	 *
	 * @param paymentId String
	 * @return PaymentResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentResponse get(String paymentId) {
		return get(paymentId, null);
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__get">Get payment</a>
	 *
	 * @param paymentId String
	 * @param context CallContext
	 * @return PaymentResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentResponse get(String paymentId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/payments/{paymentId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					PaymentResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/approve
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__approve_post">Capture payment</a>
	 *
	 * @param paymentId String
	 * @param body ApprovePaymentRequest
	 * @return PaymentApprovalResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentApprovalResponse approve(String paymentId, ApprovePaymentRequest body) {
		return approve(paymentId, body, null);
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/approve
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__approve_post">Capture payment</a>
	 *
	 * @param paymentId String
	 * @param body ApprovePaymentRequest
	 * @param context CallContext
	 * @return PaymentApprovalResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentApprovalResponse approve(String paymentId, ApprovePaymentRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/payments/{paymentId}/approve", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					PaymentApprovalResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 402:
				errorType = ErrorResponse.class;
				break;
			case 404:
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/cancel
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__cancel_post">Cancel payment</a>
	 *
	 * @param paymentId String
	 * @return CancelPaymentResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public CancelPaymentResponse cancel(String paymentId) {
		return cancel(paymentId, null);
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/cancel
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__cancel_post">Cancel payment</a>
	 *
	 * @param paymentId String
	 * @param context CallContext
	 * @return CancelPaymentResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public CancelPaymentResponse cancel(String paymentId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/payments/{paymentId}/cancel", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					CancelPaymentResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 402:
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/cancelapproval
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__cancelapproval_post">Undo capture payment request</a>
	 *
	 * @param paymentId String
	 * @return CancelApprovalPaymentResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public CancelApprovalPaymentResponse cancelapproval(String paymentId) {
		return cancelapproval(paymentId, null);
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/cancelapproval
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__cancelapproval_post">Undo capture payment request</a>
	 *
	 * @param paymentId String
	 * @param context CallContext
	 * @return CancelApprovalPaymentResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public CancelApprovalPaymentResponse cancelapproval(String paymentId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/payments/{paymentId}/cancelapproval", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					CancelApprovalPaymentResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 404:
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/processchallenged
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__processchallenged_post">Approves challenged payment</a>
	 *
	 * @param paymentId String
	 * @return PaymentResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentResponse processchallenged(String paymentId) {
		return processchallenged(paymentId, null);
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/processchallenged
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__processchallenged_post">Approves challenged payment</a>
	 *
	 * @param paymentId String
	 * @param context CallContext
	 * @return PaymentResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentResponse processchallenged(String paymentId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/payments/{paymentId}/processchallenged", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					PaymentResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 404:
				errorType = ErrorResponse.class;
				break;
			case 405:
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/refund
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__refund_post">Create refund</a>
	 *
	 * @param paymentId String
	 * @param body RefundRequest
	 * @return RefundResponse
	 * @throws DeclinedRefundException if the GlobalCollect platform declined / rejected the refund. The refund result will be available from the exception.
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public RefundResponse refund(String paymentId, RefundRequest body) {
		return refund(paymentId, body, null);
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/refund
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__refund_post">Create refund</a>
	 *
	 * @param paymentId String
	 * @param body RefundRequest
	 * @param context CallContext
	 * @return RefundResponse
	 * @throws DeclinedRefundException if the GlobalCollect platform declined / rejected the refund. The refund result will be available from the exception.
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public RefundResponse refund(String paymentId, RefundRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/payments/{paymentId}/refund", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					RefundResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 400:
				errorType = RefundErrorResponse.class;
				break;
			case 404:
				errorType = RefundErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/tokenize
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__tokenize_post">Create a token from payment</a>
	 *
	 * @param paymentId String
	 * @param body TokenizePaymentRequest
	 * @return CreateTokenResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public CreateTokenResponse tokenize(String paymentId, TokenizePaymentRequest body) {
		return tokenize(paymentId, body, null);
	}

	/**
	 * Resource /{merchantId}/payments/{paymentId}/tokenize
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__payments__paymentId__tokenize_post">Create a token from payment</a>
	 *
	 * @param paymentId String
	 * @param body TokenizePaymentRequest
	 * @param context CallContext
	 * @return CreateTokenResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public CreateTokenResponse tokenize(String paymentId, TokenizePaymentRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/payments/{paymentId}/tokenize", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					CreateTokenResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 404:
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
