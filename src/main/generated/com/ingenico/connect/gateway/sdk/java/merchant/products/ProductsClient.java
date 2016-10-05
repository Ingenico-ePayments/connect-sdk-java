/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.products;

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
import com.ingenico.connect.gateway.sdk.java.domain.product.Directory;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProductResponse;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProducts;
import java.util.Map;
import java.util.TreeMap;

/**
 * Products client. Thread-safe.
 */
public class ProductsClient extends ApiResource {

	public ProductsClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/directory
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__products__paymentProductId__directory_get">Get payment product directory</a>
	 *
	 * @param paymentProductId Integer
	 * @param query DirectoryParams
	 * @return Directory
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public Directory directory(Integer paymentProductId, DirectoryParams query) {
		return directory(paymentProductId, query, null);
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/directory
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__products__paymentProductId__directory_get">Get payment product directory</a>
	 *
	 * @param paymentProductId Integer
	 * @param query DirectoryParams
	 * @param context CallContext
	 * @return Directory
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
	public Directory directory(Integer paymentProductId, DirectoryParams query, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentProductId", paymentProductId.toString());
		String uri = instantiateUri("/{apiVersion}/{merchantId}/products/{paymentProductId}/directory", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					Directory.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 404 :
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/products
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__products_get">Get payment products</a>
	 *
	 * @param query FindProductsParams
	 * @return PaymentProducts
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentProducts find(FindProductsParams query) {
		return find(query, null);
	}

	/**
	 * Resource /{merchantId}/products
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__products_get">Get payment products</a>
	 *
	 * @param query FindProductsParams
	 * @param context CallContext
	 * @return PaymentProducts
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
	public PaymentProducts find(FindProductsParams query, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/products", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					PaymentProducts.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__products__paymentProductId__get">Get payment product</a>
	 *
	 * @param paymentProductId Integer
	 * @param query GetProductParams
	 * @return PaymentProductResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public PaymentProductResponse get(Integer paymentProductId, GetProductParams query) {
		return get(paymentProductId, query, null);
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__products__paymentProductId__get">Get payment product</a>
	 *
	 * @param paymentProductId Integer
	 * @param query GetProductParams
	 * @param context CallContext
	 * @return PaymentProductResponse
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
	public PaymentProductResponse get(Integer paymentProductId, GetProductParams query, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentProductId", paymentProductId.toString());
		String uri = instantiateUri("/{apiVersion}/{merchantId}/products/{paymentProductId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					PaymentProductResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
