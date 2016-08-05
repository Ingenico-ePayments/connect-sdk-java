package com.globalcollect.gateway.sdk.java.gc.merchant.hostedcheckouts;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.CreateHostedCheckoutRequest;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.CreateHostedCheckoutResponse;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.GetHostedCheckoutResponse;
import java.util.Map;
import java.util.TreeMap;

public class HostedcheckoutsClientImpl extends GcApiResource implements HostedcheckoutsClient {

	public HostedcheckoutsClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public CreateHostedCheckoutResponse create(CreateHostedCheckoutRequest body) {
		return create(body, null);
	}

	@Override
	public CreateHostedCheckoutResponse create(CreateHostedCheckoutRequest body, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/hostedcheckouts", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					CreateHostedCheckoutResponse.class,
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
	public GetHostedCheckoutResponse get(String hostedCheckoutId) {
		return get(hostedCheckoutId, null);
	}

	@Override
	public GetHostedCheckoutResponse get(String hostedCheckoutId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("hostedCheckoutId", hostedCheckoutId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/hostedcheckouts/{hostedCheckoutId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					GetHostedCheckoutResponse.class,
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
