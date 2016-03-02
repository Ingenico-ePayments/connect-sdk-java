package com.globalcollect.gateway.sdk.java.gc.merchant.payouts;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcDeclinedPayoutException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.TypeWrapper;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.payout.ApprovePayoutRequest;
import com.globalcollect.gateway.sdk.java.gc.payout.CreatePayoutRequest;
import com.globalcollect.gateway.sdk.java.gc.payout.PayoutErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.payout.PayoutResponse;
import java.util.Map;
import java.util.TreeMap;

public class PayoutsClientImpl extends GcApiResource implements PayoutsClient {

	public PayoutsClientImpl(GcApiResource parent, Map<String, String> context) {
		super(parent, context);
	}

	/**
	 * Resource /{merchantId}/payouts/{payoutId}/cancel
	 * Cancel payout
	 * 
	 * @param payoutId String
	 * @return Void
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
	public Void cancel(String payoutId) {
		TypeWrapper<Void> typeWrapper = new TypeWrapper<Void>(Void.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("payoutId", payoutId);
		String uri = instantiateUri("/{merchantId}/payouts/{payoutId}/cancel", callcontext);
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
	 * Resource /{merchantId}/payouts
	 * Create payout
	 * 
	 * @param body CreatePayoutRequest
	 * @return PayoutResponse
	 * @throws GcDeclinedPayoutException if the GlobalCollect platform declined / rejected the payout. The payout result will be available from the exception.
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
	public PayoutResponse create(CreatePayoutRequest body) {
		TypeWrapper<PayoutResponse> typeWrapper = new TypeWrapper<PayoutResponse>(PayoutResponse.class);
		String uri = instantiateUri("/{merchantId}/payouts", null);
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
				errorTypeWrapper = new TypeWrapper<PayoutErrorResponse>(PayoutErrorResponse.class);
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
	 * Resource /{merchantId}/payouts/{payoutId}/approve
	 * Approve payout
	 * 
	 * @param payoutId String
	 * @param body ApprovePayoutRequest
	 * @return PayoutResponse
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
	public PayoutResponse approve(String payoutId, ApprovePayoutRequest body) {
		TypeWrapper<PayoutResponse> typeWrapper = new TypeWrapper<PayoutResponse>(PayoutResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("payoutId", payoutId);
		String uri = instantiateUri("/{merchantId}/payouts/{payoutId}/approve", callcontext);
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
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

	/**
	 * Resource /{merchantId}/payouts/{payoutId}/cancelapproval
	 * Undo approve payout
	 * 
	 * @param payoutId String
	 * @return Void
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
	public Void cancelapproval(String payoutId) {
		TypeWrapper<Void> typeWrapper = new TypeWrapper<Void>(Void.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("payoutId", payoutId);
		String uri = instantiateUri("/{merchantId}/payouts/{payoutId}/cancelapproval", callcontext);
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
	 * Resource /{merchantId}/payouts/{payoutId}
	 * Retrieve payout
	 * 
	 * @param payoutId String
	 * @return PayoutResponse
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
	public PayoutResponse get(String payoutId) {
		TypeWrapper<PayoutResponse> typeWrapper = new TypeWrapper<PayoutResponse>(PayoutResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("payoutId", payoutId);
		String uri = instantiateUri("/{merchantId}/payouts/{payoutId}", callcontext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
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
