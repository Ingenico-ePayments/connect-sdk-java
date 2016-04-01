package com.globalcollect.gateway.sdk.java.defaultimpl;

import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.http.HttpStatus;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcAuthenticator;
import com.globalcollect.gateway.sdk.java.GcCommunicationException;
import com.globalcollect.gateway.sdk.java.GcCommunicator;
import com.globalcollect.gateway.sdk.java.GcConnection;
import com.globalcollect.gateway.sdk.java.GcMarshaller;
import com.globalcollect.gateway.sdk.java.GcNotFoundException;
import com.globalcollect.gateway.sdk.java.GcParamRequest;
import com.globalcollect.gateway.sdk.java.GcResponse;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcSession;
import com.globalcollect.gateway.sdk.java.RequestHeader;
import com.globalcollect.gateway.sdk.java.RequestParam;

/**
 * {@link GcCommunicator} implementation based on the components provided by {@link GcSession}.
 */
public class DefaultGcCommunicator implements GcCommunicator {

	private final GcSession session;

	private final GcMarshaller marshaller;

	public DefaultGcCommunicator(GcSession session, GcMarshaller marshaller) {
		if (session ==  null) {
			throw new IllegalArgumentException("session is required");
		}
		if (marshaller == null) {
			throw new IllegalArgumentException("marshaller is required");
		}
		this.session = session;
		this.marshaller = marshaller;
	}

	@Override
	public void close() throws IOException {
		session.getConnection().close();
	}

	@Override
	public <P extends GcParamRequest, O> O get(String relativePath, List<RequestHeader> requestHeaders, P requestParametersObject,
			Class<O> responseType, CallContext context) {

		GcConnection connection = session.getConnection();

		List<RequestParam> requestParameters = requestParametersObject == null ? null : requestParametersObject.toRequestParameters();
		URI uri = connection.toURI(relativePath, requestParameters);

		if (requestHeaders == null) {
			requestHeaders = new ArrayList<RequestHeader>();
		}

		addGenericHeaders("GET", uri, requestHeaders, context);

		GcResponse response = connection.get(uri, requestHeaders);
		return processResponse(response, responseType, relativePath, context);
	}

	@Override
	public <P extends GcParamRequest, O> O delete(String relativePath, List<RequestHeader> requestHeaders, P requestrequestParameters,
			Class<O> responseType, CallContext context) {

		GcConnection connection = session.getConnection();

		List<RequestParam> requestParameters = requestrequestParameters == null ? null : requestrequestParameters.toRequestParameters();
		URI uri = connection.toURI(relativePath, requestParameters);

		if (requestHeaders == null) {
			requestHeaders = new ArrayList<RequestHeader>();
		}

		addGenericHeaders("DELETE", uri, requestHeaders, context);

		GcResponse response = connection.delete(uri, requestHeaders);
		return processResponse(response, responseType, relativePath, context);
	}

	@Override
	public <P extends GcParamRequest, O> O post(String relativePath, List<RequestHeader> requestHeaders, P requestParamObject, Object requestBody,
			Class<O> responseType, CallContext context) {

		GcConnection connection = session.getConnection();

		List<RequestParam> requestParameters = requestParamObject == null ? null : requestParamObject.toRequestParameters();

		if (requestHeaders == null) {
			requestHeaders = new ArrayList<RequestHeader>();
		}

		URI uri = connection.toURI(relativePath, requestParameters);

		String requestJson = null;
		if (requestBody != null) {
			requestHeaders.add(new RequestHeader("Content-Type", "application/json"));
			requestJson = marshaller.marshal(requestBody);
		}

		addGenericHeaders("POST", uri, requestHeaders, context);

		GcResponse response = connection.post(uri, requestHeaders, requestJson);
		return processResponse(response, responseType, relativePath, context);
	}

	@Override
	public <P extends GcParamRequest, O> O put(String relativePath, List<RequestHeader> requestHeaders, P requestParamObject, Object requestBody,
			Class<O> responseType, CallContext context) {

		GcConnection connection = session.getConnection();

		List<RequestParam> requestParameters = requestParamObject == null ? null : requestParamObject.toRequestParameters();

		if (requestHeaders == null) {
			requestHeaders = new ArrayList<RequestHeader>();
		}

		URI uri = connection.toURI(relativePath, requestParameters);

		String requestJson = null;
		if (requestBody != null) {
			requestHeaders.add(new RequestHeader("Content-Type", "application/json"));
			requestJson = marshaller.marshal(requestBody);
		}

		addGenericHeaders("PUT", uri, requestHeaders, context);

		GcResponse response = connection.put(uri, requestHeaders, requestJson);
		return processResponse(response, responseType, relativePath, context);
	}

	@Override
	public GcMarshaller getMarshaller() {
		return marshaller;
	}

	protected void addGenericHeaders(String httpMethod, URI uri, List<RequestHeader> requestHeaders, CallContext context) {

		// add server meta info headers
		requestHeaders.addAll(session.getMetaDataProvider().getServerMetaDataHeaders());

		// add date header
		requestHeaders.add(new RequestHeader("Date", getHeaderDateString()));

		// add context specific headers
		if (context != null && context.getIdempotenceKey() != null) {
			requestHeaders.add(new RequestHeader("X-GCS-Idempotence-Key", context.getIdempotenceKey()));
		}

		// add signature
		GcAuthenticator authenticator = session.getAuthenticator();
		String authenticationSignature = authenticator.createSimpleAuthenticationSignature(httpMethod, uri, requestHeaders);
		requestHeaders.add(new RequestHeader("Authorization", authenticationSignature));
	}

	/**
	 * Returns the date in the preferred format for the HTTP date header (RFC1123).
	 */
	protected String getHeaderDateString() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		return dateFormat.format(calendar.getTime());
	}

	protected <O> O processResponse(GcResponse response, Class<O> responseType, String requestPath, CallContext context) {

		if (context != null) {
			updateContext(response, context);
		}
		throwExceptionIfNecessary(response, requestPath);
		return marshaller.unmarshal(response.getBody(), responseType);
	}

	protected void updateContext(GcResponse response, CallContext context) {

		String idempotenceRequestTimestampValue = response.getHeaderValue("X-GCS-Idempotence-Request-Timestamp");
		if (idempotenceRequestTimestampValue != null) {
			Long idempotenceRequestTimestamp = Long.valueOf(idempotenceRequestTimestampValue);
			context.setIdempotenceRequestTimestamp(idempotenceRequestTimestamp);
		} else {
			context.setIdempotenceRequestTimestamp(null);
		}
	}

	/**
	 * Checks the {@link GcResponse} for errors and throws an exception if necessary.
	 */
	protected void throwExceptionIfNecessary(GcResponse response, String requestPath) throws GcResponseException, GcCommunicationException, GcNotFoundException {

		int statusCode = response.getStatusCode();
		// status codes in the 100 or 300 range are not expected
		if (statusCode < 200 || statusCode >= 300) {
			String body = response.getBody();
			if (body != null && !isJson(response)) {
				GcResponseException cause = new GcResponseException(response);
				if (statusCode == HttpStatus.SC_NOT_FOUND) {
					throw new GcNotFoundException("The requested resource was not found; invalid path: " + requestPath, cause);
				} else {
					throw new GcCommunicationException(cause);
				}
			} else {
				throw new GcResponseException(response);
			}
		}
	}

	private boolean isJson(GcResponse response) {
		String contentType = response.getHeaderValue("Content-Type");
		return contentType == null || "application/json".equalsIgnoreCase(contentType) || contentType.toLowerCase().startsWith("application/json");
	}
}
