package com.globalcollect.gateway.sdk.java.gc.merchant.riskassessments;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentBankAccount;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentCard;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentResponse;
import java.util.Map;

public class RiskassessmentsClientImpl extends GcApiResource implements RiskassessmentsClient {

	public RiskassessmentsClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public RiskAssessmentResponse cards(RiskAssessmentCard body) {
		return cards(body, null);
	}

	@Override
	public RiskAssessmentResponse cards(RiskAssessmentCard body, CallContext context) {
		String uri = instantiateUri("/{merchantId}/riskassessments/cards", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					RiskAssessmentResponse.class,
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
	public RiskAssessmentResponse bankaccounts(RiskAssessmentBankAccount body) {
		return bankaccounts(body, null);
	}

	@Override
	public RiskAssessmentResponse bankaccounts(RiskAssessmentBankAccount body, CallContext context) {
		String uri = instantiateUri("/{merchantId}/riskassessments/bankaccounts", null);
		try {
			return communicator.post(
					uri,
					getClientHeaders(),
					null,
					body,
					RiskAssessmentResponse.class,
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
