package com.ingenico.connect.gateway.sdk.java;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpStatus;
import org.apache.http.client.utils.URIBuilder;

import com.ingenico.connect.gateway.sdk.java.logging.CommunicatorLogger;
import com.ingenico.connect.gateway.sdk.java.logging.LoggingCapable;

/**
 * Used to communicate with the Ingenico ePayments platform web services.
 * <p>
 * It contains all the logic to transform a request object to a HTTP request and
 * a HTTP response to a response object.
 * <p>
 * Thread-safe.
 */
public class Communicator implements Closeable, LoggingCapable {

	private final Session session;

	private final Marshaller marshaller;

	public Communicator(Session session, Marshaller marshaller) {
		if (session ==  null) {
			throw new IllegalArgumentException("session is required");
		}
		if (marshaller == null) {
			throw new IllegalArgumentException("marshaller is required");
		}
		this.session = session;
		this.marshaller = marshaller;
	}

	/**
	 * Releases any system resources associated with this object.
	 */
	@Override
	public void close() throws IOException {
		session.getConnection().close();
	}

	/**
	 * Corresponds to the HTTP GET method.
	 *
	 * @param relativePath The path to call, relative to the base URI.
	 * @param requestHeaders An optional list of request headers.
	 * @param requestParameters An optional set of request parameters.
	 * @param responseType The type of response to return.
	 * @param context The optional call context to use.
	 * @throws CommunicationException when an exception occurred communicating with the Ingenico ePayments platform
	 * @throws ResponseException when an error response was received from the Ingenico ePayments platform
	 * @throws ApiException when an error response was received from the Ingenico ePayments platform which contained a list of errors
	 */
	@SuppressWarnings("resource")
	public <P extends ParamRequest, O> O get(String relativePath, List<RequestHeader> requestHeaders, P requestParameters,
			Class<O> responseType, CallContext context) {

		Connection connection = session.getConnection();

		List<RequestParam> requestParameterList = requestParameters == null ? null : requestParameters.toRequestParameters();
		URI uri = toAbsoluteURI(relativePath, requestParameterList);

		if (requestHeaders == null) {
			requestHeaders = new ArrayList<RequestHeader>();
		}

		addGenericHeaders("GET", uri, requestHeaders, context);

		Response response = connection.get(uri, requestHeaders);
		return processResponse(response, responseType, relativePath, context);
	}

	/**
	 * Corresponds to the HTTP DELETE method.
	 *
	 * @param relativePath The path to call, relative to the base URI.
	 * @param requestHeaders An optional list of request headers.
	 * @param requestParameters An optional set of request parameters.
	 * @param responseType The type of response to return.
	 * @param context The optional call context to use.
	 * @throws CommunicationException when an exception occurred communicating with the Ingenico ePayments platform
	 * @throws ResponseException when an error response was received from the Ingenico ePayments platform
	 * @throws ApiException when an error response was received from the Ingenico ePayments platform which contained a list of errors
	 */
	@SuppressWarnings("resource")
	public <P extends ParamRequest, O> O delete(String relativePath, List<RequestHeader> requestHeaders, P requestParameters,
			Class<O> responseType, CallContext context) {

		Connection connection = session.getConnection();

		List<RequestParam> requestParameterList = requestParameters == null ? null : requestParameters.toRequestParameters();
		URI uri = toAbsoluteURI(relativePath, requestParameterList);

		if (requestHeaders == null) {
			requestHeaders = new ArrayList<RequestHeader>();
		}

		addGenericHeaders("DELETE", uri, requestHeaders, context);

		Response response = connection.delete(uri, requestHeaders);
		return processResponse(response, responseType, relativePath, context);
	}

	/**
	 * Corresponds to the HTTP POST method.
	 *
	 * @param relativePath The path to call, relative to the base URI.
	 * @param requestHeaders An optional list of request headers.
	 * @param requestParameters An optional set of request parameters.
	 * @param requestBody The optional request body to send.
	 * @param responseType The type of response to return.
	 * @param context The optional call context to use.
	 * @throws CommunicationException when an exception occurred communicating with the Ingenico ePayments platform
	 * @throws ResponseException when an error response was received from the Ingenico ePayments platform
	 * @throws ApiException when an error response was received from the Ingenico ePayments platform which contained a list of errors
	 */
	@SuppressWarnings("resource")
	public <P extends ParamRequest, O> O post(String relativePath, List<RequestHeader> requestHeaders, P requestParameters, Object requestBody,
			Class<O> responseType, CallContext context) {

		Connection connection = session.getConnection();

		List<RequestParam> requestParameterList = requestParameters == null ? null : requestParameters.toRequestParameters();
		URI uri = toAbsoluteURI(relativePath, requestParameterList);

		if (requestHeaders == null) {
			requestHeaders = new ArrayList<RequestHeader>();
		}

		String requestJson = null;
		if (requestBody != null) {
			requestHeaders.add(new RequestHeader("Content-Type", "application/json"));
			requestJson = marshaller.marshal(requestBody);
		}

		addGenericHeaders("POST", uri, requestHeaders, context);

		Response response = connection.post(uri, requestHeaders, requestJson);
		return processResponse(response, responseType, relativePath, context);
	}

	/**
	 * Corresponds to the HTTP PUT method.
	 *
	 * @param relativePath The path to call, relative to the base URI.
	 * @param requestHeaders An optional list of request headers.
	 * @param requestParameters An optional set of request parameters.
	 * @param requestBody The optional request body to send.
	 * @param responseType The type of response to return.
	 * @param context The optional call context to use.
	 * @throws CommunicationException when an exception occurred communicating with the Ingenico ePayments platform
	 * @throws ResponseException when an error response was received from the Ingenico ePayments platform
	 * @throws ApiException when an error response was received from the Ingenico ePayments platform which contained a list of errors
	 */
	@SuppressWarnings("resource")
	public <P extends ParamRequest, O> O put(String relativePath, List<RequestHeader> requestHeaders, P requestParameters, Object requestBody,
			Class<O> responseType, CallContext context) {

		Connection connection = session.getConnection();

		List<RequestParam> requestParameterList = requestParameters == null ? null : requestParameters.toRequestParameters();
		URI uri = toAbsoluteURI(relativePath, requestParameterList);

		if (requestHeaders == null) {
			requestHeaders = new ArrayList<RequestHeader>();
		}

		String requestJson = null;
		if (requestBody != null) {
			requestHeaders.add(new RequestHeader("Content-Type", "application/json"));
			requestJson = marshaller.marshal(requestBody);
		}

		addGenericHeaders("PUT", uri, requestHeaders, context);

		Response response = connection.put(uri, requestHeaders, requestJson);
		return processResponse(response, responseType, relativePath, context);
	}

	/**
	 * @return The {@link Marshaller} object associated with this communicator. Never {@code null}.
	 */
	public Marshaller getMarshaller() {
		return marshaller;
	}

	protected URI toAbsoluteURI(String relativePath, List<RequestParam> requestParameters) {

		URI apiEndpoint = session.getApiEndpoint();

		if (apiEndpoint.getPath() != null && !apiEndpoint.getPath().isEmpty()) {
			throw new IllegalStateException("apiEndpoint should not contain a path");
		}
		if (apiEndpoint.getUserInfo() != null
				|| apiEndpoint.getQuery() != null
				|| apiEndpoint.getFragment() != null) {

			throw new IllegalStateException("apiEndpoint should not contain user info, query or fragment");
		}

		String absolutePath;
		if (relativePath.startsWith("/")) {
			absolutePath = relativePath;
		} else {
			absolutePath = "/" + relativePath;
		}

		URIBuilder uriBuilder = new URIBuilder()
				.setScheme(apiEndpoint.getScheme())
				.setHost(apiEndpoint.getHost())
				.setPort(apiEndpoint.getPort())
				.setPath(absolutePath);

		if (requestParameters != null) {
			for (RequestParam nvp: requestParameters) {
				uriBuilder.addParameter(nvp.getName(), nvp.getValue());
			}
		}

		try {
			return uriBuilder.build();
		} catch (URISyntaxException e) {
			throw new IllegalArgumentException("Unable to construct URI", e);
		}
	}

	/**
	 * Adds the necessary headers to the given list of headers. This includes the authorization header, which uses
	 * other headers, so when you need to override this method, make sure to call {@code super.addGenericHeaders}
	 * at the <i>end</i> of your overridden method.
	 */
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
		Authenticator authenticator = session.getAuthenticator();
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

	protected <O> O processResponse(Response response, Class<O> responseType, String requestPath, CallContext context) {

		if (context != null) {
			updateContext(response, context);
		}
		throwExceptionIfNecessary(response, requestPath);
		return marshaller.unmarshal(response.getBody(), responseType);
	}

	/**
	 * Updates the given call context based on the contents of the given response.
	 */
	protected void updateContext(Response response, CallContext context) {

		String idempotenceRequestTimestampValue = response.getHeaderValue("X-GCS-Idempotence-Request-Timestamp");
		if (idempotenceRequestTimestampValue != null) {
			Long idempotenceRequestTimestamp = Long.valueOf(idempotenceRequestTimestampValue);
			context.setIdempotenceRequestTimestamp(idempotenceRequestTimestamp);
		} else {
			context.setIdempotenceRequestTimestamp(null);
		}
	}

	/**
	 * Checks the {@link Response} for errors and throws an exception if necessary.
	 */
	protected void throwExceptionIfNecessary(Response response, String requestPath) throws ResponseException, CommunicationException, NotFoundException {

		int statusCode = response.getStatusCode();
		// status codes in the 100 or 300 range are not expected
		if (statusCode < 200 || statusCode >= 300) {
			String body = response.getBody();
			if (body != null && !isJson(response)) {
				ResponseException cause = new ResponseException(response);
				if (statusCode == HttpStatus.SC_NOT_FOUND) {
					throw new NotFoundException("The requested resource was not found; invalid path: " + requestPath, cause);
				} else {
					throw new CommunicationException(cause);
				}
			} else {
				throw new ResponseException(response);
			}
		}
	}

	private boolean isJson(Response response) {
		String contentType = response.getHeaderValue("Content-Type");
		return contentType == null || "application/json".equalsIgnoreCase(contentType) || contentType.toLowerCase().startsWith("application/json");
	}

	/**
	 * Utility method that delegates the call to this communicator's session's connection if that's an instance of
	 * {@link PooledConnection}. If not this method does nothing.
	 * @see PooledConnection#closeIdleConnections(long, TimeUnit)
	 */
	public void closeIdleConnections(long idleTime, TimeUnit timeUnit) {
		@SuppressWarnings("resource")
		Connection connection = session.getConnection();
		if (connection instanceof PooledConnection) {
			((PooledConnection) connection).closeIdleConnections(idleTime, timeUnit);
		}
	}

	/**
	 * Utility method that delegates the call to this communicator's session's connection if that's an instance of
	 * {@link PooledConnection}. If not this method does nothing.
	 * @see PooledConnection#closeExpiredConnections()
	 */
	public void closeExpiredConnections() {
		@SuppressWarnings("resource")
		Connection connection = session.getConnection();
		if (connection instanceof PooledConnection) {
			((PooledConnection) connection).closeExpiredConnections();
		}
	}

	@Override
	public void enableLogging(CommunicatorLogger communicatorLogger) {
		// delegate to the connection
		session.getConnection().enableLogging(communicatorLogger);
	}

	@Override
	public void disableLogging() {
		// delegate to the connection
		session.getConnection().disableLogging();
	}
}
