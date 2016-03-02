package com.globalcollect.gateway.sdk.java.gc.merchant.riskassessments;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.TypeWrapper;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentBankAccount;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentCard;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentResponse;
import java.util.Map;

public class RiskassessmentsClientImpl extends GcApiResource implements RiskassessmentsClient {

	public RiskassessmentsClientImpl(GcApiResource parent, Map<String, String> context) {
		super(parent, context);
	}

	/**
	 * Resource /{merchantId}/riskassessments/cards
	 * Risk-assess card
	 * 
	 * @param body RiskAssessmentCard
	 * @return RiskAssessmentResponse
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
	public RiskAssessmentResponse cards(RiskAssessmentCard body) {
		TypeWrapper<RiskAssessmentResponse> typeWrapper = new TypeWrapper<RiskAssessmentResponse>(RiskAssessmentResponse.class);
		String uri = instantiateUri("/{merchantId}/riskassessments/cards", null);
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
	 * Resource /{merchantId}/riskassessments/bankaccounts
	 * Risk-assess bank account
	 * 
	 * @param body RiskAssessmentBankAccount
	 * @return RiskAssessmentResponse
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
	public RiskAssessmentResponse bankaccounts(RiskAssessmentBankAccount body) {
		TypeWrapper<RiskAssessmentResponse> typeWrapper = new TypeWrapper<RiskAssessmentResponse>(RiskAssessmentResponse.class);
		String uri = instantiateUri("/{merchantId}/riskassessments/bankaccounts", null);
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
