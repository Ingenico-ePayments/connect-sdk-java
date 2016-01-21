package com.globalcollect.gateway.sdk.java.defaultimpl;

import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import com.globalcollect.gateway.sdk.java.GcAuthenticator;
import com.globalcollect.gateway.sdk.java.GcCommunicator;
import com.globalcollect.gateway.sdk.java.GcConnection;
import com.globalcollect.gateway.sdk.java.GcMarshaller;
import com.globalcollect.gateway.sdk.java.GcParamRequest;
import com.globalcollect.gateway.sdk.java.GcSession;
import com.globalcollect.gateway.sdk.java.RequestHeader;
import com.globalcollect.gateway.sdk.java.RequestParam;
import com.globalcollect.gateway.sdk.java.TypeWrapper;

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
	public <P extends GcParamRequest, O> O get(String relativePath, List<RequestHeader> requestHeaders, P requestParametersObject, TypeWrapper<O> responseTypeWrapper) {

		GcConnection connection = session.getConnection();
		
		List<RequestParam> requestParameters = requestParametersObject == null ? null : requestParametersObject.toRequestParameters();
		URI uri = connection.toURI(relativePath, requestParameters);
		
		if (requestHeaders == null) {
			requestHeaders = new ArrayList<RequestHeader>();
		}
		
		addGenericHeaders("GET", uri, requestHeaders);
		
		String responseJson = connection.get(relativePath, requestHeaders, requestParameters);
		return marshaller.unmarshal(responseJson, responseTypeWrapper);
	}

	@Override
	public <P extends GcParamRequest, O> O delete(String relativePath, List<RequestHeader> requestHeaders, P requestrequestParameters, TypeWrapper<O> responseTypeWrapper) {

		GcConnection connection = session.getConnection();
		
		List<RequestParam> requestParameters = requestrequestParameters == null ? null : requestrequestParameters.toRequestParameters();
		URI uri = connection.toURI(relativePath, requestParameters);
		
		if (requestHeaders == null) {
			requestHeaders = new ArrayList<RequestHeader>();
		}
		
		addGenericHeaders("DELETE", uri, requestHeaders);
		
		String responseJson = connection.delete(relativePath, requestHeaders, requestParameters);
		return marshaller.unmarshal(responseJson, responseTypeWrapper);
	}

	@Override
	public <P extends GcParamRequest, O> O post(String relativePath, List<RequestHeader> requestHeaders, P requestParamObject, Object requestBody, TypeWrapper<O> responseTypeWrapper) {

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
		
		addGenericHeaders("POST", uri, requestHeaders);
		
		String responseJson = connection.post(relativePath, requestHeaders, requestParameters, requestJson);
		return marshaller.unmarshal(responseJson, responseTypeWrapper);
	}

	@Override
	public <P extends GcParamRequest, O> O put(String relativePath, List<RequestHeader> requestHeaders, P requestParamObject, Object requestBody, TypeWrapper<O> responseTypeWrapper) {

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
		
		addGenericHeaders("PUT", uri, requestHeaders);
		
		String responseJson = connection.put(relativePath, requestHeaders, requestParameters, requestJson);
		return marshaller.unmarshal(responseJson, responseTypeWrapper);				
	}
	
	@Override
	public GcMarshaller getMarshaller() {
		return marshaller;
	}
	
	protected void addGenericHeaders(String httpMethod, URI uri, List<RequestHeader> requestHeaders) {
		
		// add server meta info headers
		requestHeaders.addAll(session.getMetaDataProvider().getServerMetaDataHeaders());
		
		// add date header
		requestHeaders.add(new RequestHeader("Date", getHeaderDateString()));
		
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
}
