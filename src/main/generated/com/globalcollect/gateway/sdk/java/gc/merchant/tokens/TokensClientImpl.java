package com.globalcollect.gateway.sdk.java.gc.merchant.tokens;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.TypeWrapper;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.token.ApproveTokenRequest;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenRequest;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenResponse;
import com.globalcollect.gateway.sdk.java.gc.token.TokenResponse;
import com.globalcollect.gateway.sdk.java.gc.token.UpdateTokenRequest;
import java.util.Map;
import java.util.TreeMap;

public class TokensClientImpl extends GcApiResource implements TokensClient {

	public TokensClientImpl(GcApiResource parent, Map<String, String> context) {
		super(parent, context);
	}

	/**
	 * Resource /{merchantId}/tokens
	 * Create token
	 * 
	 * @param body CreateTokenRequest
	 * @return CreateTokenResponse
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
	public CreateTokenResponse create(CreateTokenRequest body) {
		TypeWrapper<CreateTokenResponse> typeWrapper = new TypeWrapper<CreateTokenResponse>(CreateTokenResponse.class);
		String uri = instantiateUri("/{merchantId}/tokens", null);
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
			case 403 :
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

	/**
	 * Resource /{merchantId}/tokens/{tokenId}/approvesepadirectdebit
	 * Approve SEPA DD mandate
	 * 
	 * @param tokenId String
	 * @param body ApproveTokenRequest
	 * @return Void
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
	public Void approvesepadirectdebit(String tokenId, ApproveTokenRequest body) {
		TypeWrapper<Void> typeWrapper = new TypeWrapper<Void>(Void.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("tokenId", tokenId);
		String uri = instantiateUri("/{merchantId}/tokens/{tokenId}/approvesepadirectdebit", callcontext);
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
	 * Resource /{merchantId}/tokens/{tokenId}
	 * Update token
	 * 
	 * @param tokenId String
	 * @param body UpdateTokenRequest
	 * @return Void
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
	public Void update(String tokenId, UpdateTokenRequest body) {
		TypeWrapper<Void> typeWrapper = new TypeWrapper<Void>(Void.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("tokenId", tokenId);
		String uri = instantiateUri("/{merchantId}/tokens/{tokenId}", callcontext);
		try {
			return communicator.put(
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
	 * Resource /{merchantId}/tokens/{tokenId}
	 * Retrieve token
	 * 
	 * @param tokenId String
	 * @return TokenResponse
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
	public TokenResponse get(String tokenId) {
		TypeWrapper<TokenResponse> typeWrapper = new TypeWrapper<TokenResponse>(TokenResponse.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("tokenId", tokenId);
		String uri = instantiateUri("/{merchantId}/tokens/{tokenId}", callcontext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					typeWrapper);
		} catch (GcResponseException e) {
			final TypeWrapper<?> errorTypeWrapper;
			switch (e.getStatusCode()) {
			case 404 :
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

	/**
	 * Resource /{merchantId}/tokens/{tokenId}
	 * Delete token
	 * 
	 * @param tokenId String
	 * @param query DeleteParams
	 * @return Void
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
	public Void delete(String tokenId, DeleteParams query) {
		TypeWrapper<Void> typeWrapper = new TypeWrapper<Void>(Void.class);
		Map<String, String> callcontext = new TreeMap<String, String>();
		callcontext.put("tokenId", tokenId);
		String uri = instantiateUri("/{merchantId}/tokens/{tokenId}", callcontext);
		try {
			return communicator.delete(
					uri,
					getClientHeaders(),
					query,
					typeWrapper);
		} catch (GcResponseException e) {
			final TypeWrapper<?> errorTypeWrapper;
			switch (e.getStatusCode()) {
			case 404 :
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			default:
				errorTypeWrapper = new TypeWrapper<ErrorResponse>(ErrorResponse.class);
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorTypeWrapper);
			throw createException(e.getStatusCode(), e.getBody(), errorObject);
		}
	}

}
