package com.globalcollect.gateway.sdk.java.gc.merchant.payments;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcDeclinedPaymentException;
import com.globalcollect.gateway.sdk.java.GcDeclinedRefundException;
import com.globalcollect.gateway.sdk.java.GcIdempotenceException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.gc.payment.ApprovePaymentRequest;
import com.globalcollect.gateway.sdk.java.gc.payment.CancelApprovalPaymentResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.CancelPaymentResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.CreatePaymentRequest;
import com.globalcollect.gateway.sdk.java.gc.payment.CreatePaymentResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.PaymentApprovalResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.PaymentResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.TokenizePaymentRequest;
import com.globalcollect.gateway.sdk.java.gc.refund.RefundRequest;
import com.globalcollect.gateway.sdk.java.gc.refund.RefundResponse;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenResponse;

/**
 * Payments client. Thread-safe.
 */
public interface PaymentsClient {

	/**
	 * Resource /{merchantId}/payments/{paymentId}/refund
	 * Create refund
	 *
	 * @param paymentId String
	 * @param body RefundRequest
	 * @return RefundResponse
	 * @throws GcDeclinedRefundException if the GlobalCollect platform declined / rejected the refund. The refund result will be available from the exception.
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	RefundResponse refund(String paymentId, RefundRequest body);

	/**
	 * Resource /{merchantId}/payments/{paymentId}/refund
	 * Create refund
	 *
	 * @param paymentId String
	 * @param body RefundRequest
	 * @param context CallContext
	 * @return RefundResponse
	 * @throws GcDeclinedRefundException if the GlobalCollect platform declined / rejected the refund. The refund result will be available from the exception.
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	RefundResponse refund(String paymentId, RefundRequest body, CallContext context);

	/**
	 * Resource /{merchantId}/payments/{paymentId}/processchallenged
	 * Approves challenged payment
	 *
	 * @param paymentId String
	 * @return PaymentResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	PaymentResponse processchallenged(String paymentId);

	/**
	 * Resource /{merchantId}/payments/{paymentId}/processchallenged
	 * Approves challenged payment
	 *
	 * @param paymentId String
	 * @param context CallContext
	 * @return PaymentResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	PaymentResponse processchallenged(String paymentId, CallContext context);

	/**
	 * Resource /{merchantId}/payments/{paymentId}
	 * Retrieve payment
	 *
	 * @param paymentId String
	 * @return PaymentResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	PaymentResponse get(String paymentId);

	/**
	 * Resource /{merchantId}/payments/{paymentId}
	 * Retrieve payment
	 *
	 * @param paymentId String
	 * @param context CallContext
	 * @return PaymentResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	PaymentResponse get(String paymentId, CallContext context);

	/**
	 * Resource /{merchantId}/payments
	 * Create payment
	 *
	 * @param body CreatePaymentRequest
	 * @return CreatePaymentResponse
	 * @throws GcDeclinedPaymentException if the GlobalCollect platform declined / rejected the payment. The payment result will be available from the exception.
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	CreatePaymentResponse create(CreatePaymentRequest body);

	/**
	 * Resource /{merchantId}/payments
	 * Create payment
	 *
	 * @param body CreatePaymentRequest
	 * @param context CallContext
	 * @return CreatePaymentResponse
	 * @throws GcDeclinedPaymentException if the GlobalCollect platform declined / rejected the payment. The payment result will be available from the exception.
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	CreatePaymentResponse create(CreatePaymentRequest body, CallContext context);

	/**
	 * Resource /{merchantId}/payments/{paymentId}/tokenize
	 * Create a token from payment
	 *
	 * @param paymentId String
	 * @param body TokenizePaymentRequest
	 * @return CreateTokenResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	CreateTokenResponse tokenize(String paymentId, TokenizePaymentRequest body);

	/**
	 * Resource /{merchantId}/payments/{paymentId}/tokenize
	 * Create a token from payment
	 *
	 * @param paymentId String
	 * @param body TokenizePaymentRequest
	 * @param context CallContext
	 * @return CreateTokenResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	CreateTokenResponse tokenize(String paymentId, TokenizePaymentRequest body, CallContext context);

	/**
	 * Resource /{merchantId}/payments/{paymentId}/cancel
	 * Cancel payment
	 *
	 * @param paymentId String
	 * @return CancelPaymentResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	CancelPaymentResponse cancel(String paymentId);

	/**
	 * Resource /{merchantId}/payments/{paymentId}/cancel
	 * Cancel payment
	 *
	 * @param paymentId String
	 * @param context CallContext
	 * @return CancelPaymentResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	CancelPaymentResponse cancel(String paymentId, CallContext context);

	/**
	 * Resource /{merchantId}/payments/{paymentId}/approve
	 * Capture payment
	 *
	 * @param paymentId String
	 * @param body ApprovePaymentRequest
	 * @return PaymentApprovalResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	PaymentApprovalResponse approve(String paymentId, ApprovePaymentRequest body);

	/**
	 * Resource /{merchantId}/payments/{paymentId}/approve
	 * Capture payment
	 *
	 * @param paymentId String
	 * @param body ApprovePaymentRequest
	 * @param context CallContext
	 * @return PaymentApprovalResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	PaymentApprovalResponse approve(String paymentId, ApprovePaymentRequest body, CallContext context);

	/**
	 * Resource /{merchantId}/payments/{paymentId}/cancelapproval
	 * Undo capture payment request
	 *
	 * @param paymentId String
	 * @return CancelApprovalPaymentResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	CancelApprovalPaymentResponse cancelapproval(String paymentId);

	/**
	 * Resource /{merchantId}/payments/{paymentId}/cancelapproval
	 * Undo capture payment request
	 *
	 * @param paymentId String
	 * @param context CallContext
	 * @return CancelApprovalPaymentResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	CancelApprovalPaymentResponse cancelapproval(String paymentId, CallContext context);
}
