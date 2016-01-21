package com.globalcollect.gateway.sdk.java.gc.merchant.products;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.TypeWrapper;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.paymentproduct.PaymentProductClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.paymentproduct.PaymentProductClientImpl;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProductResponse;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProducts;
import java.util.Map;
import java.util.TreeMap;

public class ProductsClientImpl extends GcApiResource implements ProductsClient {

	public ProductsClientImpl(GcApiResource parent, Map<String, String> context) {
		super(parent, context);
	}

	/**
	 * Resource /{merchantId}/products/{paymentProductId}
	 * 
	 * @param paymentProductId Integer
	 * @return PaymentProduct
	 */
	@Override
	public PaymentProductClient paymentProduct(Integer paymentProductId) {
		Map<String, String> subcontext = new TreeMap<String, String>();
		subcontext.put("paymentProductId", paymentProductId.toString());
		return new PaymentProductClientImpl(this, subcontext);
	}

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
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	@Override
	public PaymentProducts find(FindParams query) {
		TypeWrapper<PaymentProducts> typeWrapper = new TypeWrapper<PaymentProducts>(PaymentProducts.class);
		String uri = instantiateUri("/{merchantId}/products", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
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
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	@Override
	public PaymentProductResponse get(Integer paymentProductId, GetParams query) {
		TypeWrapper<PaymentProductResponse> typeWrapper = new TypeWrapper<PaymentProductResponse>(PaymentProductResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("paymentProductId", paymentProductId.toString());
		String uri = instantiateUri("/{merchantId}/products/{paymentProductId}", callcontext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
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
