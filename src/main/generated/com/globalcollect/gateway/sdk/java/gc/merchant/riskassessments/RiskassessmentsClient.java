package com.globalcollect.gateway.sdk.java.gc.merchant.riskassessments;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentBankAccount;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentCard;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.RiskAssessmentResponse;

/**
 * Riskassessments client. Thread-safe.
 */
public interface RiskassessmentsClient {

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
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	RiskAssessmentResponse cards(RiskAssessmentCard body);

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
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	RiskAssessmentResponse bankaccounts(RiskAssessmentBankAccount body);

}
