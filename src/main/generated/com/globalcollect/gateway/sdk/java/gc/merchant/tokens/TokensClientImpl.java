package com.globalcollect.gateway.sdk.java.gc.merchant.tokens;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.token.ApproveTokenRequest;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenRequest;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenResponse;
import com.globalcollect.gateway.sdk.java.gc.token.TokenResponse;
import com.globalcollect.gateway.sdk.java.gc.token.UpdateTokenRequest;
import java.util.Map;
import java.util.TreeMap;

public class TokensClientImpl extends GcApiResource implements TokensClient {

	public TokensClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public CreateTokenResponse create(CreateTokenRequest body) {
		return create(body, null);
	}

	@Override
	public CreateTokenResponse create(CreateTokenRequest body, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/tokens", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					CreateTokenResponse.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 403 :
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

	@Override
	public Void approvesepadirectdebit(String tokenId, ApproveTokenRequest body) {
		return approvesepadirectdebit(tokenId, body, null);
	}

	@Override
	public Void approvesepadirectdebit(String tokenId, ApproveTokenRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("tokenId", tokenId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/tokens/{tokenId}/approvesepadirectdebit", pathContext);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					Void.class,
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
	public Void update(String tokenId, UpdateTokenRequest body) {
		return update(tokenId, body, null);
	}

	@Override
	public Void update(String tokenId, UpdateTokenRequest body, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("tokenId", tokenId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/tokens/{tokenId}", pathContext);
		try {
			return communicator.put(
					uri,
					getClientHeaders(),
					null,
					body,
					Void.class,
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
	public TokenResponse get(String tokenId) {
		return get(tokenId, null);
	}

	@Override
	public TokenResponse get(String tokenId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("tokenId", tokenId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/tokens/{tokenId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					TokenResponse.class,
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

	@Override
	public Void delete(String tokenId, DeleteParams query) {
		return delete(tokenId, query, null);
	}

	@Override
	public Void delete(String tokenId, DeleteParams query, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("tokenId", tokenId);
		String uri = instantiateUri("/{apiVersion}/{merchantId}/tokens/{tokenId}", pathContext);
		try {
			return communicator.delete(
					uri,
					getClientHeaders(),
					query,
					Void.class,
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
