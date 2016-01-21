package com.globalcollect.gateway.sdk.java.gc.merchant.hostedcheckouts;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.TypeWrapper;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.CreateHostedCheckoutRequest;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.CreateHostedCheckoutResponse;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.GetHostedCheckoutResponse;
import java.util.Map;
import java.util.TreeMap;

public class HostedcheckoutsClientImpl extends GcApiResource implements HostedcheckoutsClient {

	public HostedcheckoutsClientImpl(GcApiResource parent, Map<String, String> context) {
		super(parent, context);
	}

	/**
	 * Resource /{merchantId}/hostedcheckouts
	 * Create hosted checkout
	 * 
	 * @param body CreateHostedCheckoutRequest
	 * @return CreateHostedCheckoutResponse
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
	public CreateHostedCheckoutResponse create(CreateHostedCheckoutRequest body) {
		TypeWrapper<CreateHostedCheckoutResponse> typeWrapper = new TypeWrapper<CreateHostedCheckoutResponse>(CreateHostedCheckoutResponse.class);
		String uri = instantiateUri("/{merchantId}/hostedcheckouts", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
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
	 * Resource /{merchantId}/hostedcheckouts/{hostedCheckoutId}
	 * Get hosted checkout status
	 * 
	 * @param hostedCheckoutId String
	 * @return GetHostedCheckoutResponse
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
	public GetHostedCheckoutResponse get(String hostedCheckoutId) {
		TypeWrapper<GetHostedCheckoutResponse> typeWrapper = new TypeWrapper<GetHostedCheckoutResponse>(GetHostedCheckoutResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("hostedCheckoutId", hostedCheckoutId);
		String uri = instantiateUri("/{merchantId}/hostedcheckouts/{hostedCheckoutId}", callcontext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
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
