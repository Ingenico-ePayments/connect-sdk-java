package com.globalcollect.gateway.sdk.java.gc.merchant.refunds;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.refund.ApproveRefundRequest;
import com.globalcollect.gateway.sdk.java.gc.refund.RefundResponse;
import java.util.Map;
import java.util.TreeMap;

public class RefundsClientImpl extends GcApiResource implements RefundsClient {

	public RefundsClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public Void cancel(String refundId) {
		return cancel(refundId, null);
	}

	@Override
	public Void cancel(String refundId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("refundId", refundId);
		String uri = instantiateUri("/{merchantId}/refunds/{refundId}/cancel", pathContext);
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
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	@Override
	public Void approve(String refundId, ApproveRefundRequest body) {
		return approve(refundId, body, null);
	}

	@Override
	public Void approve(String refundId, ApproveRefundRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("refundId", refundId);
		String uri = instantiateUri("/{merchantId}/refunds/{refundId}/approve", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					Void.class,
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
	public Void cancelapproval(String refundId) {
		return cancelapproval(refundId, null);
	}

	@Override
	public Void cancelapproval(String refundId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("refundId", refundId);
		String uri = instantiateUri("/{merchantId}/refunds/{refundId}/cancelapproval", pathContext);
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
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	@Override
	public RefundResponse get(String refundId) {
		return get(refundId, null);
	}

	@Override
	public RefundResponse get(String refundId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("refundId", refundId);
		String uri = instantiateUri("/{merchantId}/refunds/{refundId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					RefundResponse.class,
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
}
