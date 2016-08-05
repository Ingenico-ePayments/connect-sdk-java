package com.globalcollect.gateway.sdk.java.gc.merchant.productgroups;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProductGroupResponse;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProductGroups;
import java.util.Map;
import java.util.TreeMap;

public class ProductgroupsClientImpl extends GcApiResource implements ProductgroupsClient {

	public ProductgroupsClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public PaymentProductGroups find(FindParams query) {
		return find(query, null);
	}

	@Override
	public PaymentProductGroups find(FindParams query, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/productgroups", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					PaymentProductGroups.class,
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
	public PaymentProductGroupResponse get(String paymentProductGroupId, GetParams query) {
		return get(paymentProductGroupId, query, null);
	}

	@Override
	public PaymentProductGroupResponse get(String paymentProductGroupId, GetParams query, CallContext context) {
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
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 404 :
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
