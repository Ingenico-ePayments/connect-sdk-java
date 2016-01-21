package com.globalcollect.gateway.sdk.java.gc.merchant.refunds;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.TypeWrapper;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.refund.ApproveRefundRequest;
import com.globalcollect.gateway.sdk.java.gc.refund.RefundResponse;
import java.util.Map;
import java.util.TreeMap;

public class RefundsClientImpl extends GcApiResource implements RefundsClient {

	public RefundsClientImpl(GcApiResource parent, Map<String, String> context) {
		super(parent, context);
	}

	/**
	 * Resource /{merchantId}/refunds/{refundId}/cancel
	 * Cancel refund
	 * 
	 * @param refundId String
	 * @return Void
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	@Override
	public Void cancel(String refundId) {
		TypeWrapper<Void> typeWrapper = new TypeWrapper<Void>(Void.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("refundId", refundId);
		String uri = instantiateUri("/{merchantId}/refunds/{refundId}/cancel", callcontext);
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
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

	/**
	 * Resource /{merchantId}/refunds/{refundId}/approve
	 * Approve refund
	 * 
	 * @param refundId String
	 * @param body ApproveRefundRequest
	 * @return Void
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	@Override
	public Void approve(String refundId, ApproveRefundRequest body) {
		TypeWrapper<Void> typeWrapper = new TypeWrapper<Void>(Void.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("refundId", refundId);
		String uri = instantiateUri("/{merchantId}/refunds/{refundId}/approve", callcontext);
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
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

	/**
	 * Resource /{merchantId}/refunds/{refundId}/cancelapproval
	 * Undo approve refund
	 * 
	 * @param refundId String
	 * @return Void
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	@Override
	public Void cancelapproval(String refundId) {
		TypeWrapper<Void> typeWrapper = new TypeWrapper<Void>(Void.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("refundId", refundId);
		String uri = instantiateUri("/{merchantId}/refunds/{refundId}/cancelapproval", callcontext);
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
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

	/**
	 * Resource /{merchantId}/refunds/{refundId}
	 * Retrieve refund
	 * 
	 * @param refundId String
	 * @return RefundResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	@Override
	public RefundResponse get(String refundId) {
		TypeWrapper<RefundResponse> typeWrapper = new TypeWrapper<RefundResponse>(RefundResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("refundId", refundId);
		String uri = instantiateUri("/{merchantId}/refunds/{refundId}", callcontext);
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

}
