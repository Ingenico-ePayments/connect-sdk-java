package com.globalcollect.gateway.sdk.java.gc.merchant.services;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcAuthorizationException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.GlobalCollectException;
import com.globalcollect.gateway.sdk.java.TypeWrapper;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.services.BINLookupRequest;
import com.globalcollect.gateway.sdk.java.gc.services.BINLookupResponse;
import com.globalcollect.gateway.sdk.java.gc.services.BankDetailsRequest;
import com.globalcollect.gateway.sdk.java.gc.services.BankDetailsResponse;
import com.globalcollect.gateway.sdk.java.gc.services.ConvertAmount;
import com.globalcollect.gateway.sdk.java.gc.services.TestConnection;
import java.util.Map;

public class ServicesClientImpl extends GcApiResource implements ServicesClient {

	public ServicesClientImpl(GcApiResource parent, Map<String, String> context) {
		super(parent, context);
	}

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
	@Override
	public BankDetailsResponse bankaccount(BankDetailsRequest body) {
		TypeWrapper<BankDetailsResponse> typeWrapper = new TypeWrapper<BankDetailsResponse>(BankDetailsResponse.class);
		String uri = instantiateUri("/{merchantId}/services/convert/bankaccount", null);
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
	@Override
	public TestConnection testconnection() {
		TypeWrapper<TestConnection> typeWrapper = new TypeWrapper<TestConnection>(TestConnection.class);
		String uri = instantiateUri("/{merchantId}/services/testconnection", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
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
	@Override
	public BINLookupResponse getIINdetails(BINLookupRequest body) {
		TypeWrapper<BINLookupResponse> typeWrapper = new TypeWrapper<BINLookupResponse>(BINLookupResponse.class);
		String uri = instantiateUri("/{merchantId}/services/getIINdetails", null);
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
	@Override
	public ConvertAmount convertAmount(ConvertAmountParams query) {
		TypeWrapper<ConvertAmount> typeWrapper = new TypeWrapper<ConvertAmount>(ConvertAmount.class);
		String uri = instantiateUri("/{merchantId}/services/convert/amount", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
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
