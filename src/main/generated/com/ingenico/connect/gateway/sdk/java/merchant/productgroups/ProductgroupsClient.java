/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.productgroups;

import java.util.Map;
import java.util.TreeMap;

import com.ingenico.connect.gateway.sdk.java.ApiException;
import com.ingenico.connect.gateway.sdk.java.ApiResource;
import com.ingenico.connect.gateway.sdk.java.AuthorizationException;
import com.ingenico.connect.gateway.sdk.java.CallContext;
import com.ingenico.connect.gateway.sdk.java.GlobalCollectException;
import com.ingenico.connect.gateway.sdk.java.IdempotenceException;
import com.ingenico.connect.gateway.sdk.java.ReferenceException;
import com.ingenico.connect.gateway.sdk.java.ResponseException;
import com.ingenico.connect.gateway.sdk.java.ValidationException;
import com.ingenico.connect.gateway.sdk.java.domain.errors.ErrorResponse;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProductGroupResponse;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProductGroups;

/**
 * Productgroups client. Thread-safe.
 */
public class ProductgroupsClient extends ApiResource {

	public ProductgroupsClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/productgroups
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/productgroups/find.html">Get payment product groups</a>
	 *
	 * @param query FindProductgroupsParams
	 * @return PaymentProductGroups
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentProductGroups find(FindProductgroupsParams query) {
		return find(query, null);
	}

	/**
	 * Resource /{merchantId}/productgroups
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/productgroups/find.html">Get payment product groups</a>
	 *
	 * @param query FindProductgroupsParams
	 * @param context CallContext
	 * @return PaymentProductGroups
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentProductGroups find(FindProductgroupsParams query, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/productgroups", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					PaymentProductGroups.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/productgroups/{paymentProductGroupId}
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/productgroups/get.html">Get payment product group</a>
	 *
	 * @param paymentProductGroupId String
	 * @param query GetProductgroupParams
	 * @return PaymentProductGroupResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentProductGroupResponse get(String paymentProductGroupId, GetProductgroupParams query) {
		return get(paymentProductGroupId, query, null);
	}

	/**
	 * Resource /{merchantId}/productgroups/{paymentProductGroupId}
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/productgroups/get.html">Get payment product group</a>
	 *
	 * @param paymentProductGroupId String
	 * @param query GetProductgroupParams
	 * @param context CallContext
	 * @return PaymentProductGroupResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentProductGroupResponse get(String paymentProductGroupId, GetProductgroupParams query, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentProductGroupId", paymentProductGroupId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/productgroups/{paymentProductGroupId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					PaymentProductGroupResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
