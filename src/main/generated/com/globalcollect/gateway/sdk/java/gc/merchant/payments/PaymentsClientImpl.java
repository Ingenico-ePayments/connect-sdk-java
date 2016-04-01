package com.globalcollect.gateway.sdk.java.gc.merchant.payments;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcResponseException;
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

	public PaymentsClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public RefundResponse refund(String paymentId, RefundRequest body) {
		return refund(paymentId, body, null);
	}

	@Override
	public RefundResponse refund(String paymentId, RefundRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/refund", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					RefundResponse.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 400 :
				errorType = RefundErrorResponse.class;
				break;
			case 404 :
				errorType = RefundErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	@Override
	public PaymentResponse processchallenged(String paymentId) {
		return processchallenged(paymentId, null);
	}

	@Override
	public PaymentResponse processchallenged(String paymentId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/processchallenged", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					PaymentResponse.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 404 :
				errorType = ErrorResponse.class;
				break;
			case 405 :
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	@Override
	public PaymentResponse get(String paymentId) {
		return get(paymentId, null);
	}

	@Override
	public PaymentResponse get(String paymentId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					PaymentResponse.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	@Override
	public CreatePaymentResponse create(CreatePaymentRequest body) {
		return create(body, null);
	}

	@Override
	public CreatePaymentResponse create(CreatePaymentRequest body, CallContext context) {
		String uri = instantiateUri("/{merchantId}/payments", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					CreatePaymentResponse.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 400 :
				errorType = PaymentErrorResponse.class;
				break;
			case 402 :
				errorType = PaymentErrorResponse.class;
				break;
			case 403 :
				errorType = PaymentErrorResponse.class;
				break;
			case 502 :
				errorType = PaymentErrorResponse.class;
				break;
			case 503 :
				errorType = PaymentErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	@Override
	public CreateTokenResponse tokenize(String paymentId, TokenizePaymentRequest body) {
		return tokenize(paymentId, body, null);
	}

	@Override
	public CreateTokenResponse tokenize(String paymentId, TokenizePaymentRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/tokenize", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					CreateTokenResponse.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 404 :
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	@Override
	public CancelPaymentResponse cancel(String paymentId) {
		return cancel(paymentId, null);
	}

	@Override
	public CancelPaymentResponse cancel(String paymentId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/cancel", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					CancelPaymentResponse.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 402 :
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	@Override
	public PaymentApprovalResponse approve(String paymentId, ApprovePaymentRequest body) {
		return approve(paymentId, body, null);
	}

	@Override
	public PaymentApprovalResponse approve(String paymentId, ApprovePaymentRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/approve", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					PaymentApprovalResponse.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 402 :
				errorType = ErrorResponse.class;
				break;
			case 404 :
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	@Override
	public CancelApprovalPaymentResponse cancelapproval(String paymentId) {
		return cancelapproval(paymentId, null);
	}

	@Override
	public CancelApprovalPaymentResponse cancelapproval(String paymentId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentId", paymentId);
		String uri = instantiateUri("/{merchantId}/payments/{paymentId}/cancelapproval", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					CancelApprovalPaymentResponse.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 404 :
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
