package com.globalcollect.gateway.sdk.java.gc.merchant.products;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.paymentproduct.PaymentProductClient;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProductResponse;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProducts;

/**
 * Products client. Thread-safe.
 */
public interface ProductsClient {

	/**
	 * Resource /{merchantId}/products/{paymentProductId}
	 * 
	 * @param paymentProductId Integer
	 * @return PaymentProduct
	 */
	PaymentProductClient paymentProduct(Integer paymentProductId);

	/**
	 * Resource /{merchantId}/products
	 * Retrieve payment products
	 * 
	 * @param query FindParams
	 * @return PaymentProducts
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	PaymentProducts find(FindParams query);

	/**
	 * Resource /{merchantId}/products/{paymentProductId}
	 * Retrieve payment product fields
	 * 
	 * @param paymentProductId Integer
	 * @param query GetParams
	 * @return PaymentProductResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	PaymentProductResponse get(Integer paymentProductId, GetParams query);

}
