package com.globalcollect.gateway.sdk.java.gc.merchant.services;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.gc.errors.ErrorResponse;
import com.globalcollect.gateway.sdk.java.gc.services.BankDetailsRequest;
import com.globalcollect.gateway.sdk.java.gc.services.BankDetailsResponse;
import com.globalcollect.gateway.sdk.java.gc.services.ConvertAmount;
import com.globalcollect.gateway.sdk.java.gc.services.GetIINDetailsRequest;
import com.globalcollect.gateway.sdk.java.gc.services.GetIINDetailsResponse;
import com.globalcollect.gateway.sdk.java.gc.services.TestConnection;
import java.util.Map;

public class ServicesClientImpl extends GcApiResource implements ServicesClient {

	public ServicesClientImpl(GcApiResource parent, Map<String, String> pathContext) {
		super(parent, pathContext);
	}

	@Override
	public BankDetailsResponse bankaccount(BankDetailsRequest body) {
		return bankaccount(body, null);
	}

	@Override
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
	public TestConnection testconnection() {
		return testconnection(null);
	}

	@Override
	public TestConnection testconnection(CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/services/testconnection", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					null,
					TestConnection.class,
					context);
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 403 :
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	@Override
	public GetIINDetailsResponse getIINdetails(GetIINDetailsRequest body) {
		return getIINdetails(body, null);
	}

	@Override
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
		} catch (GcResponseException e) {
			final Class<?> errorType;
			switch (e.getStatusCode()) {
			case 404 :
				errorType = ErrorResponse.class;
				break;
			default:
				errorType = ErrorResponse.class;
				break;
			}
			final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), e.getStatusCode(), uri, errorType);
			throw createException(e.getStatusCode(), e.getBody(), errorObject, context);
		}
	}

	@Override
	public ConvertAmount convertAmount(ConvertAmountParams query) {
		return convertAmount(query, null);
	}

	@Override
	public ConvertAmount convertAmount(ConvertAmountParams query, CallContext context) {
		String uri = instantiateUri("/{apiVersion}/{merchantId}/services/convert/amount", null);
		try {
			return communicator.get(
					uri,
					getClientHeaders(),
					query,
					ConvertAmount.class,
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
