package com.globalcollect.gateway.sdk.java.gc.merchant.hostedcheckouts;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.CreateHostedCheckoutRequest;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.CreateHostedCheckoutResponse;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.GetHostedCheckoutResponse;

/**
 * Hostedcheckouts client. Thread-safe.
 */
public interface HostedcheckoutsClient {

	/**
	 * Resource /{merchantId}/hostedcheckouts
	 * Create hosted checkout
	 * 
	 * @param body CreateHostedCheckoutRequest
	 * @return CreateHostedCheckoutResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	CreateHostedCheckoutResponse create(CreateHostedCheckoutRequest body);

	/**
	 * Resource /{merchantId}/hostedcheckouts/{hostedCheckoutId}
	 * Get hosted checkout status
	 * 
	 * @param hostedCheckoutId String
	 * @return GetHostedCheckoutResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	GetHostedCheckoutResponse get(String hostedCheckoutId);

}
