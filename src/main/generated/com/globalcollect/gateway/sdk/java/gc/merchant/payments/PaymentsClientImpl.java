package com.globalcollect.gateway.sdk.java.gc.merchant.payments;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcDeclinedPaymentException;
import com.globalcollect.gateway.sdk.java.GcDeclinedRefundException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.TypeWrapper;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.ApprovePaymentRequest;
import com.globalcollect.gateway.sdk.java.gc.payment.CancelApprovalPaymentResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.CancelPaymentResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.CreatePaymentRequest;
import com.globalcollect.gateway.sdk.java.gc.payment.CreatePaymentResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.PaymentApprovalResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.PaymentErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.PaymentResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.TokenizePaymentRequest;
import com.globalcollect.gateway.sdk.java.gc.refund.RefundErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.refund.RefundRequest;
import com.globalcollect.gateway.sdk.java.gc.refund.RefundResponse;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenResponse;
import java.util.Map;
import java.util.TreeMap;

public class PaymentsClientImpl extends GcApiResource implements PaymentsClient {

	public PaymentsClientImpl(GcApiResource parent, Map<String, String> context) {
		super(parent, context);
	}

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
	@Override
	public RefundResponse refund(String paymentId, RefundRequest body) {
		TypeWrapper<RefundResponse> typeWrapper = new TypeWrapper<RefundResponse>(RefundResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/refund", callcontext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					typeWrapper);
		} catch (GcResponseException e) {
			final TypeWrapper<?> errorTypeWrapper;
			switch (e.getStatusCode()) {
			case 400 :
				errorTypeWrapper = new TypeWrapper<RefundErrorResponse>(RefundErrorResponse.class);
				break;
			case 404 :
				errorTypeWrapper = new TypeWrapper<RefundErrorResponse>(RefundErrorResponse.class);
				break;
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

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
	@Override
	public PaymentResponse processchallenged(String paymentId) {
		TypeWrapper<PaymentResponse> typeWrapper = new TypeWrapper<PaymentResponse>(PaymentResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/processchallenged", callcontext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					typeWrapper);
		} catch (GcResponseException e) {
			final TypeWrapper<?> errorTypeWrapper;
			switch (e.getStatusCode()) {
			case 404 :
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			case 405 :
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

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
	@Override
	public PaymentResponse get(String paymentId) {
		TypeWrapper<PaymentResponse> typeWrapper = new TypeWrapper<PaymentResponse>(PaymentResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}", callcontext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					typeWrapper);
		} catch (GcResponseException e) {
			final TypeWrapper<?> errorTypeWrapper;
			switch (e.getStatusCode()) {
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

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
	@Override
	public CreatePaymentResponse create(CreatePaymentRequest body) {
		TypeWrapper<CreatePaymentResponse> typeWrapper = new TypeWrapper<CreatePaymentResponse>(CreatePaymentResponse.class);
		String uri = instantiateUri("/{merchantId}/payments", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					typeWrapper);
		} catch (GcResponseException e) {
			final TypeWrapper<?> errorTypeWrapper;
			switch (e.getStatusCode()) {
			case 400 :
				errorTypeWrapper = new TypeWrapper<PaymentErrorResponse>(PaymentErrorResponse.class);
				break;
			case 402 :
				errorTypeWrapper = new TypeWrapper<PaymentErrorResponse>(PaymentErrorResponse.class);
				break;
			case 403 :
				errorTypeWrapper = new TypeWrapper<PaymentErrorResponse>(PaymentErrorResponse.class);
				break;
			case 502 :
				errorTypeWrapper = new TypeWrapper<PaymentErrorResponse>(PaymentErrorResponse.class);
				break;
			case 503 :
				errorTypeWrapper = new TypeWrapper<PaymentErrorResponse>(PaymentErrorResponse.class);
				break;
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

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
	@Override
	public CreateTokenResponse tokenize(String paymentId, TokenizePaymentRequest body) {
		TypeWrapper<CreateTokenResponse> typeWrapper = new TypeWrapper<CreateTokenResponse>(CreateTokenResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/tokenize", callcontext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					typeWrapper);
		} catch (GcResponseException e) {
			final TypeWrapper<?> errorTypeWrapper;
			switch (e.getStatusCode()) {
			case 404 :
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

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
	@Override
	public CancelPaymentResponse cancel(String paymentId) {
		TypeWrapper<CancelPaymentResponse> typeWrapper = new TypeWrapper<CancelPaymentResponse>(CancelPaymentResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/cancel", callcontext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					typeWrapper);
		} catch (GcResponseException e) {
			final TypeWrapper<?> errorTypeWrapper;
			switch (e.getStatusCode()) {
			case 402 :
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

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
	@Override
	public PaymentApprovalResponse approve(String paymentId, ApprovePaymentRequest body) {
		TypeWrapper<PaymentApprovalResponse> typeWrapper = new TypeWrapper<PaymentApprovalResponse>(PaymentApprovalResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/approve", callcontext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					typeWrapper);
		} catch (GcResponseException e) {
			final TypeWrapper<?> errorTypeWrapper;
			switch (e.getStatusCode()) {
			case 402 :
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			case 404 :
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

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
	@Override
	public CancelApprovalPaymentResponse cancelapproval(String paymentId) {
		TypeWrapper<CancelApprovalPaymentResponse> typeWrapper = new TypeWrapper<CancelApprovalPaymentResponse>(CancelApprovalPaymentResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/cancelapproval", callcontext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					typeWrapper);
		} catch (GcResponseException e) {
			final TypeWrapper<?> errorTypeWrapper;
			switch (e.getStatusCode()) {
			case 404 :
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

}
