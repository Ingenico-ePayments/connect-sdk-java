/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.services;

import java.util.Map;

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
import com.ingenico.connect.gateway.sdk.java.domain.services.BankDetailsRequest;
import com.ingenico.connect.gateway.sdk.java.domain.services.BankDetailsResponse;
import com.ingenico.connect.gateway.sdk.java.domain.services.ConvertAmount;
import com.ingenico.connect.gateway.sdk.java.domain.services.GetIINDetailsRequest;
import com.ingenico.connect.gateway.sdk.java.domain.services.GetIINDetailsResponse;
import com.ingenico.connect.gateway.sdk.java.domain.services.TestConnection;

/**
 * Services client. Thread-safe.
 */
public class ServicesClient extends ApiResource {

	public ServicesClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/services/convert/amount
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/services/convertAmount.html">Convert amount</a>
	 *
	 * @param query ConvertAmountParams
	 * @return ConvertAmount
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public ConvertAmount convertAmount(ConvertAmountParams query) {
		return convertAmount(query, null);
	}

	/**
	 * Resource /{merchantId}/services/convert/amount
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/services/convertAmount.html">Convert amount</a>
	 *
	 * @param query ConvertAmountParams
	 * @param context CallContext
	 * @return ConvertAmount
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public ConvertAmount convertAmount(ConvertAmountParams query, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/services/convert/amount", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					ConvertAmount.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/services/convert/bankaccount
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/services/bankaccount.html">Convert bankaccount</a>
	 *
	 * @param body BankDetailsRequest
	 * @return BankDetailsResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public BankDetailsResponse bankaccount(BankDetailsRequest body) {
		return bankaccount(body, null);
	}

	/**
	 * Resource /{merchantId}/services/convert/bankaccount
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/services/bankaccount.html">Convert bankaccount</a>
	 *
	 * @param body BankDetailsRequest
	 * @param context CallContext
	 * @return BankDetailsResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public BankDetailsResponse bankaccount(BankDetailsRequest body, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/services/convert/bankaccount", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					BankDetailsResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/services/getIINdetails
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/services/getIINdetails.html">Get IIN details</a>
	 *
	 * @param body GetIINDetailsRequest
	 * @return GetIINDetailsResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public GetIINDetailsResponse getIINdetails(GetIINDetailsRequest body) {
		return getIINdetails(body, null);
	}

	/**
	 * Resource /{merchantId}/services/getIINdetails
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/services/getIINdetails.html">Get IIN details</a>
	 *
	 * @param body GetIINDetailsRequest
	 * @param context CallContext
	 * @return GetIINDetailsResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public GetIINDetailsResponse getIINdetails(GetIINDetailsRequest body, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/services/getIINdetails", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					GetIINDetailsResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/services/testconnection
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/services/testconnection.html">Test connection</a>
	 *
	 * @return TestConnection
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public TestConnection testconnection() {
		return testconnection(null);
	}

	/**
	 * Resource /{merchantId}/services/testconnection
	 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/services/testconnection.html">Test connection</a>
	 *
	 * @param context CallContext
	 * @return TestConnection
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public TestConnection testconnection(CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/services/testconnection", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					TestConnection.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType = ErrorResponse.class;
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
