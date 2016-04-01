package com.globalcollect.gateway.sdk.java.gc.merchant.products.paymentproduct;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.product.Directory;
import java.util.Map;

public class PaymentProductClientImpl extends GcApiResource implements PaymentProductClient {

	public PaymentProductClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public Directory directory(DirectoryParams query) {
		return directory(query, null);
	}

	@Override
	public Directory directory(DirectoryParams query, CallContext context) {
		String uri = instantiateUri("/{merchantId}/products/{paymentProductId}/directory", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					Directory.class,
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
