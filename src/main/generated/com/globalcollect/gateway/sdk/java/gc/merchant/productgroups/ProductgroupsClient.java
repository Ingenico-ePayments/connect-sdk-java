package com.globalcollect.gateway.sdk.java.gc.merchant.productgroups;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcIdempotenceException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProductGroupResponse;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProductGroups;

/**
 * Productgroups client. Thread-safe.
 */
public interface ProductgroupsClient {

	/**
	 * Resource /{merchantId}/productgroups
	 * Get payment product groups
	 *
	 * @param query FindParams
	 * @return PaymentProductGroups
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	PaymentProductGroups find(FindParams query);

	/**
	 * Resource /{merchantId}/productgroups
	 * Get payment product groups
	 *
	 * @param query FindParams
	 * @param context CallContext
	 * @return PaymentProductGroups
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
	PaymentProductGroups find(FindParams query, CallContext context);

	/**
	 * Resource /{merchantId}/productgroups/{paymentProductGroupId}
	 * Get payment product group
	 *
	 * @param paymentProductGroupId String
	 * @param query GetParams
	 * @return PaymentProductGroupResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	PaymentProductGroupResponse get(String paymentProductGroupId, GetParams query);

	/**
	 * Resource /{merchantId}/productgroups/{paymentProductGroupId}
	 * Get payment product group
	 *
	 * @param paymentProductGroupId String
	 * @param query GetParams
	 * @param context CallContext
	 * @return PaymentProductGroupResponse
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
	PaymentProductGroupResponse get(String paymentProductGroupId, GetParams query, CallContext context);
}
