package com.globalcollect.gateway.sdk.java.gc.merchant.payouts;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.payout.ApprovePayoutRequest;
import com.globalcollect.gateway.sdk.java.gc.payout.CreatePayoutRequest;
import com.globalcollect.gateway.sdk.java.gc.payout.PayoutErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.payout.PayoutResponse;
import java.util.Map;
import java.util.TreeMap;

public class PayoutsClientImpl extends GcApiResource implements PayoutsClient {

	public PayoutsClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public Void cancel(String payoutId) {
		return cancel(payoutId, null);
	}

	@Override
	public Void cancel(String payoutId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("payoutId", payoutId);
		String uri = instantiateUri("/{merchantId}/payouts/{payoutId}/cancel", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					Void.class,
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
	public PayoutResponse create(CreatePayoutRequest body) {
		return create(body, null);
	}

	@Override
	public PayoutResponse create(CreatePayoutRequest body, CallContext context) {
		String uri = instantiateUri("/{merchantId}/payouts", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					PayoutResponse.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 400 :
				errorType = PayoutErrorResponse.class;
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
	public PayoutResponse approve(String payoutId, ApprovePayoutRequest body) {
		return approve(payoutId, body, null);
	}

	@Override
	public PayoutResponse approve(String payoutId, ApprovePayoutRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("payoutId", payoutId);
		String uri = instantiateUri("/{merchantId}/payouts/{payoutId}/approve", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					PayoutResponse.class,
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
	public Void cancelapproval(String payoutId) {
		return cancelapproval(payoutId, null);
	}

	@Override
	public Void cancelapproval(String payoutId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("payoutId", payoutId);
		String uri = instantiateUri("/{merchantId}/payouts/{payoutId}/cancelapproval", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					null,
					Void.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
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
	public PayoutResponse get(String payoutId) {
		return get(payoutId, null);
	}

	@Override
	public PayoutResponse get(String payoutId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("payoutId", payoutId);
		String uri = instantiateUri("/{merchantId}/payouts/{payoutId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					PayoutResponse.class,
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
