package com.globalcollect.gateway.sdk.java.gc.merchant.products;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.paymentproduct.PaymentProductClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.paymentproduct.PaymentProductClientImpl;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProductResponse;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProducts;
import java.util.Map;
import java.util.TreeMap;

public class ProductsClientImpl extends GcApiResource implements ProductsClient {

	public ProductsClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public PaymentProductClient paymentProduct(Integer paymentProductId) {
		Map<String, String> subContext = new TreeMap<String, String>();
		subContext.put("paymentProductId", paymentProductId.toString());
		return new PaymentProductClientImpl(this, subContext);
	}

	@Override
	public PaymentProducts find(FindParams query) {
		return find(query, null);
	}

	@Override
	public PaymentProducts find(FindParams query, CallContext context) {
		String uri = instantiateUri("/{merchantId}/products", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					PaymentProducts.class,
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
	public PaymentProductResponse get(Integer paymentProductId, GetParams query) {
		return get(paymentProductId, query, null);
	}

	@Override
	public PaymentProductResponse get(Integer paymentProductId, GetParams query, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("paymentProductId", paymentProductId.toString());
		String uri = instantiateUri("/{merchantId}/products/{paymentProductId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					PaymentProductResponse.class,
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
