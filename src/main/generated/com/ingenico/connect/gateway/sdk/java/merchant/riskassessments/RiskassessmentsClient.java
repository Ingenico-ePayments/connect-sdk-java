/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.riskassessments;

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
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.RiskAssessmentBankAccount;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.RiskAssessmentCard;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.RiskAssessmentResponse;
import java.util.Map;

/**
 * Riskassessments client. Thread-safe.
 */
public class RiskassessmentsClient extends ApiResource {

	public RiskassessmentsClient(ApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	/**
	 * Resource /{merchantId}/riskassessments/bankaccounts
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__riskassessments_bankaccounts_post">Risk-assess bank account</a>
	 *
	 * @param body RiskAssessmentBankAccount
	 * @return RiskAssessmentResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public RiskAssessmentResponse bankaccounts(RiskAssessmentBankAccount body) {
		return bankaccounts(body, null);
	}

	/**
	 * Resource /{merchantId}/riskassessments/bankaccounts
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__riskassessments_bankaccounts_post">Risk-assess bank account</a>
	 *
	 * @param body RiskAssessmentBankAccount
	 * @param context CallContext
	 * @return RiskAssessmentResponse
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
	public RiskAssessmentResponse bankaccounts(RiskAssessmentBankAccount body, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/riskassessments/bankaccounts", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					RiskAssessmentResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	/**
	 * Resource /{merchantId}/riskassessments/cards
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__riskassessments_cards_post">Risk-assess card</a>
	 *
	 * @param body RiskAssessmentCard
	 * @return RiskAssessmentResponse
	 * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong at the GlobalCollect platform,
	 *            the GlobalCollect platform was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws ApiException if the GlobalCollect platform returned any other error
	 */
	public RiskAssessmentResponse cards(RiskAssessmentCard body) {
		return cards(body, null);
	}

	/**
	 * Resource /{merchantId}/riskassessments/cards
	 * <a href="https://developer.globalcollect.com/documentation/api/server/#__merchantId__riskassessments_cards_post">Risk-assess card</a>
	 *
	 * @param body RiskAssessmentCard
	 * @param context CallContext
	 * @return RiskAssessmentResponse
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
	public RiskAssessmentResponse cards(RiskAssessmentCard body, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/riskassessments/cards", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					RiskAssessmentResponse.class,
					context);
		} catch (ResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}
}
