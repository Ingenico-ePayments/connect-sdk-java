package com.globalcollect.gateway.sdk.java.gc.merchant.services;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.gc.services.BINLookupRequest;
import com.globalcollect.gateway.sdk.java.gc.services.BINLookupResponse;
import com.globalcollect.gateway.sdk.java.gc.services.BankDetailsRequest;
import com.globalcollect.gateway.sdk.java.gc.services.BankDetailsResponse;
import com.globalcollect.gateway.sdk.java.gc.services.ConvertAmount;
import com.globalcollect.gateway.sdk.java.gc.services.TestConnection;

/**
 * Services client. Thread-safe.
 */
public interface ServicesClient {

	/**
	 * Resource /{merchantId}/services/convert/bankaccount
	 * Convert Bankaccount
	 * 
	 * @param body BankDetailsRequest
	 * @return BankDetailsResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	BankDetailsResponse bankaccount(BankDetailsRequest body);

	/**
	 * Resource /{merchantId}/services/testconnection
	 * Test connection
	 * 
	 * @return TestConnection
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	TestConnection testconnection();

	/**
	 * Resource /{merchantId}/services/getIINdetails
	 * Retrieve IIN details
	 * 
	 * @param body BINLookupRequest
	 * @return BINLookupResponse
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	BINLookupResponse getIINdetails(BINLookupRequest body);

	/**
	 * Resource /{merchantId}/services/convert/amount
	 * Convert amount
	 * 
	 * @param query ConvertAmountParams
	 * @return ConvertAmount
	 * @throws GcValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
	 * @throws GcAuthorizationException if the request was not allowed (HTTP status code 403)
	 * @throws GcReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
	 *            or there was a conflict (HTTP status code 404, 409 or 410)
	 * @throws GlobalCollectException if something went wrong on GlobalCollect's end,
	 *            GlobalCollect was unable to process a message from a downstream partner/acquirer,
	 *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
	 * @throws GcApiException if GlobalCollect returned any other error
	 */
	ConvertAmount convertAmount(ConvertAmountParams query);

}
