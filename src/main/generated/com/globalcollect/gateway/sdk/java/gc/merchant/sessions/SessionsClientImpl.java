package com.globalcollect.gateway.sdk.java.gc.merchant.sessions;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.sessions.SessionRequest;
import com.globalcollect.gateway.sdk.java.gc.sessions.SessionResponse;
import java.util.Map;

public class SessionsClientImpl extends GcApiResource implements SessionsClient {

	public SessionsClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public SessionResponse create(SessionRequest body) {
		return create(body, null);
	}

	@Override
	public SessionResponse create(SessionRequest body, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/sessions", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					SessionResponse.class,
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
