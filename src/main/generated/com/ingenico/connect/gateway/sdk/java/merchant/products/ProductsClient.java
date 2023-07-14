/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.products;

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
import com.ingenico.connect.gateway.sdk.java.domain.product.CreatePaymentProductSessionRequest;
import com.ingenico.connect.gateway.sdk.java.domain.product.CreatePaymentProductSessionResponse;
import com.ingenico.connect.gateway.sdk.java.domain.product.DeviceFingerprintRequest;
import com.ingenico.connect.gateway.sdk.java.domain.product.DeviceFingerprintResponse;
import com.ingenico.connect.gateway.sdk.java.domain.product.Directory;
import com.ingenico.connect.gateway.sdk.java.domain.product.GetCustomerDetailsRequest;
import com.ingenico.connect.gateway.sdk.java.domain.product.GetCustomerDetailsResponse;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProductNetworksResponse;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProductResponse;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProducts;

/**
 * Products client. Thread-safe.
 */
public class ProductsClient extends ApiResource {

	public ProductsClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/products
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/find.html">Get payment products</a>
	 *
	 * @param query FindProductsParams
	 * @return PaymentProducts
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public PaymentProducts find(FindProductsParams query) {
		return find(query, null);
	}

	/**
	 * Resource /{merchantId}/products
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/find.html">Get payment products</a>
	 *
	 * @param query FindProductsParams
	 * @param context CallContext
	 * @return PaymentProducts
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public PaymentProducts find(FindProductsParams query, CallContext context) {
		String uri = instantiateUri("/v1/{merchantId}/products", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					PaymentProducts.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/get.html">Get payment product</a>
	 *
	 * @param paymentProductId Integer
	 * @param query GetProductParams
	 * @return PaymentProductResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public PaymentProductResponse get(Integer paymentProductId, GetProductParams query) {
		return get(paymentProductId, query, null);
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/get.html">Get payment product</a>
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
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public PaymentProductResponse get(Integer paymentProductId, GetProductParams query, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentProductId", paymentProductId.toString());
		String uri = instantiateUri("/v1/{merchantId}/products/{paymentProductId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					PaymentProductResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/directory
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/directory.html">Get payment product directory</a>
	 *
	 * @param paymentProductId Integer
	 * @param query DirectoryParams
	 * @return Directory
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public Directory directory(Integer paymentProductId, DirectoryParams query) {
		return directory(paymentProductId, query, null);
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/directory
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/directory.html">Get payment product directory</a>
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
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public Directory directory(Integer paymentProductId, DirectoryParams query, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentProductId", paymentProductId.toString());
		String uri = instantiateUri("/v1/{merchantId}/products/{paymentProductId}/directory", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					Directory.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/customerDetails
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/customerDetails.html">Get customer details</a>
	 *
	 * @param paymentProductId Integer
	 * @param body GetCustomerDetailsRequest
	 * @return GetCustomerDetailsResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public GetCustomerDetailsResponse customerDetails(Integer paymentProductId, GetCustomerDetailsRequest body) {
		return customerDetails(paymentProductId, body, null);
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/customerDetails
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/customerDetails.html">Get customer details</a>
	 *
	 * @param paymentProductId Integer
	 * @param body GetCustomerDetailsRequest
	 * @param context CallContext
	 * @return GetCustomerDetailsResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public GetCustomerDetailsResponse customerDetails(Integer paymentProductId, GetCustomerDetailsRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentProductId", paymentProductId.toString());
		String uri = instantiateUri("/v1/{merchantId}/products/{paymentProductId}/customerDetails", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					GetCustomerDetailsResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/deviceFingerprint
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/deviceFingerprint.html">Get device fingerprint</a>
	 *
	 * @param paymentProductId Integer
	 * @param body DeviceFingerprintRequest
	 * @return DeviceFingerprintResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public DeviceFingerprintResponse deviceFingerprint(Integer paymentProductId, DeviceFingerprintRequest body) {
		return deviceFingerprint(paymentProductId, body, null);
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/deviceFingerprint
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/deviceFingerprint.html">Get device fingerprint</a>
	 *
	 * @param paymentProductId Integer
	 * @param body DeviceFingerprintRequest
	 * @param context CallContext
	 * @return DeviceFingerprintResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public DeviceFingerprintResponse deviceFingerprint(Integer paymentProductId, DeviceFingerprintRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentProductId", paymentProductId.toString());
		String uri = instantiateUri("/v1/{merchantId}/products/{paymentProductId}/deviceFingerprint", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					DeviceFingerprintResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/networks
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/networks.html">Get payment product networks</a>
	 *
	 * @param paymentProductId Integer
	 * @param query NetworksParams
	 * @return PaymentProductNetworksResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public PaymentProductNetworksResponse networks(Integer paymentProductId, NetworksParams query) {
		return networks(paymentProductId, query, null);
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/networks
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/networks.html">Get payment product networks</a>
	 *
	 * @param paymentProductId Integer
	 * @param query NetworksParams
	 * @param context CallContext
	 * @return PaymentProductNetworksResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public PaymentProductNetworksResponse networks(Integer paymentProductId, NetworksParams query, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentProductId", paymentProductId.toString());
		String uri = instantiateUri("/v1/{merchantId}/products/{paymentProductId}/networks", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					PaymentProductNetworksResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/sessions
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/sessions.html">Create session for payment product</a>
	 *
	 * @param paymentProductId Integer
	 * @param body CreatePaymentProductSessionRequest
	 * @return CreatePaymentProductSessionResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public CreatePaymentProductSessionResponse sessions(Integer paymentProductId, CreatePaymentProductSessionRequest body) {
		return sessions(paymentProductId, body, null);
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}/sessions
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/products/sessions.html">Create session for payment product</a>
	 *
	 * @param paymentProductId Integer
	 * @param body CreatePaymentProductSessionRequest
	 * @param context CallContext
	 * @return CreatePaymentProductSessionResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public CreatePaymentProductSessionResponse sessions(Integer paymentProductId, CreatePaymentProductSessionRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentProductId", paymentProductId.toString());
		String uri = instantiateUri("/v1/{merchantId}/products/{paymentProductId}/sessions", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					CreatePaymentProductSessionResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
