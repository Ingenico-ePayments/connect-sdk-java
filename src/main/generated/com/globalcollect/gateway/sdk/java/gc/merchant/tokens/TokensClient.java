package com.globalcollect.gateway.sdk.java.gc.merchant.tokens;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcIdempotenceException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.gc.token.ApproveTokenRequest;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenRequest;
import com.globalcollect.gateway.sdk.java.gc.token.CreateTokenResponse;
import com.globalcollect.gateway.sdk.java.gc.token.TokenResponse;
import com.globalcollect.gateway.sdk.java.gc.token.UpdateTokenRequest;

/**
 * Tokens client. Thread-safe.
 */
public interface TokensClient {

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
	CreateTokenResponse create(CreateTokenRequest body);

	/**
	 * Resource /{merchantId}/tokens
	 * Create token
	 *
	 * @param body CreateTokenRequest
	 * @param context CallContext
	 * @return CreateTokenResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	CreateTokenResponse create(CreateTokenRequest body, CallContext context);

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
	Void approvesepadirectdebit(String tokenId, ApproveTokenRequest body);

	/**
	 * Resource /{merchantId}/tokens/{tokenId}/approvesepadirectdebit
	 * Approve SEPA DD mandate
	 *
	 * @param tokenId String
	 * @param body ApproveTokenRequest
	 * @param context CallContext
	 * @return Void
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	Void approvesepadirectdebit(String tokenId, ApproveTokenRequest body, CallContext context);

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
	Void update(String tokenId, UpdateTokenRequest body);

	/**
	 * Resource /{merchantId}/tokens/{tokenId}
	 * Update token
	 *
	 * @param tokenId String
	 * @param body UpdateTokenRequest
	 * @param context CallContext
	 * @return Void
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	Void update(String tokenId, UpdateTokenRequest body, CallContext context);

	/**
	 * Resource /{merchantId}/tokens/{tokenId}
	 * Get token
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
	TokenResponse get(String tokenId);

	/**
	 * Resource /{merchantId}/tokens/{tokenId}
	 * Get token
	 *
	 * @param tokenId String
	 * @param context CallContext
	 * @return TokenResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	TokenResponse get(String tokenId, CallContext context);

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
	Void delete(String tokenId, DeleteParams query);

	/**
	 * Resource /{merchantId}/tokens/{tokenId}
	 * Delete token
	 *
	 * @param tokenId String
	 * @param query DeleteParams
	 * @param context CallContext
	 * @return Void
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcIdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if the GlobalCollect platform returned any other error
	 */
	Void delete(String tokenId, DeleteParams query, CallContext context);
}
