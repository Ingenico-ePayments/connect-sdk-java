/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.merchant.hostedmandatemanagements;

import java.util.Map;
import java.util.TreeMap;

import com.ingenico.connect.gateway.sdk.java.ApiException;
import com.ingenico.connect.gateway.sdk.java.ApiResource;
import com.ingenico.connect.gateway.sdk.java.AuthorizationException;
import com.ingenico.connect.gateway.sdk.java.CallContext;
import com.ingenico.connect.gateway.sdk.java.GlobalCollectException;
import com.ingenico.connect.gateway.sdk.java.IdempotenceException;
import com.ingenico.connect.gateway.sdk.java.ReferenceException;
import com.ingenico.connect.gateway.sdk.java.ResponseException;
import com.ingenico.connect.gateway.sdk.java.ValidationException;
import com.ingenico.connect.gateway.sdk.java.domain.errors.ErrorResponse;
import com.ingenico.connect.gateway.sdk.java.domain.hostedmandatemanagement.CreateHostedMandateManagementRequest;
import com.ingenico.connect.gateway.sdk.java.domain.hostedmandatemanagement.CreateHostedMandateManagementResponse;
import com.ingenico.connect.gateway.sdk.java.domain.hostedmandatemanagement.GetHostedMandateManagementResponse;

/**
 * Hostedmandatemanagements client. Thread-safe.
 */
public class HostedmandatemanagementsClient extends ApiResource {

	public HostedmandatemanagementsClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/hostedmandatemanagements
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/hostedmandatemanagements/create.html">Create hosted mandate management</a>
	 *
	 * @param body CreateHostedMandateManagementRequest
	 * @return CreateHostedMandateManagementResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public CreateHostedMandateManagementResponse create(CreateHostedMandateManagementRequest body) {
		return create(body, null);
	}

	/**
	 * Resource /{merchantId}/hostedmandatemanagements
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/hostedmandatemanagements/create.html">Create hosted mandate management</a>
	 *
	 * @param body CreateHostedMandateManagementRequest
	 * @param context CallContext
	 * @return CreateHostedMandateManagementResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public CreateHostedMandateManagementResponse create(CreateHostedMandateManagementRequest body, CallContext context) {
		String uri = instantiateUri("/v1/{merchantId}/hostedmandatemanagements", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					CreateHostedMandateManagementResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/hostedmandatemanagements/{hostedMandateManagementId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/hostedmandatemanagements/get.html">Get hosted mandate management status</a>
	 *
	 * @param hostedMandateManagementId String
	 * @return GetHostedMandateManagementResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public GetHostedMandateManagementResponse get(String hostedMandateManagementId) {
		return get(hostedMandateManagementId, null);
	}

	/**
	 * Resource /{merchantId}/hostedmandatemanagements/{hostedMandateManagementId}
	 * - <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/hostedmandatemanagements/get.html">Get hosted mandate management status</a>
	 *
	 * @param hostedMandateManagementId String
	 * @param context CallContext
	 * @return GetHostedMandateManagementResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the Ingenico ePayments platform,
	 *            the Ingenico ePayments platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the Ingenico ePayments platform returned any other error
	 */
	public GetHostedMandateManagementResponse get(String hostedMandateManagementId, CallContext context) {
		Map<String, String> pathContext = new TreeMap<String, String>();
		pathContext.put("hostedMandateManagementId", hostedMandateManagementId);
		String uri = instantiateUri("/v1/{merchantId}/hostedmandatemanagements/{hostedMandateManagementId}", pathContext);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					GetHostedMandateManagementResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
