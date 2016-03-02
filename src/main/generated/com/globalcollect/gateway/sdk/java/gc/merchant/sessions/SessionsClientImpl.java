package com.globalcollect.gateway.sdk.java.gc.merchant.sessions;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.TypeWrapper;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.sessions.SessionRequest;
import com.globalcollect.gateway.sdk.java.gc.sessions.SessionResponse;
import java.util.Map;

public class SessionsClientImpl extends GcApiResource implements SessionsClient {

	public SessionsClientImpl(GcApiResource parent, Map<String, String> context) {
		super(parent, context);
	}

	/**
	 * Resource /{merchantId}/sessions
	 * Create Session
	 * 
	 * @param body SessionRequest
	 * @return SessionResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	@Override
	public SessionResponse create(SessionRequest body) {
		TypeWrapper<SessionResponse> typeWrapper = new TypeWrapper<SessionResponse>(SessionResponse.class);
		String uri = instantiateUri("/{merchantId}/sessions", null);
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

}
