package com.ingenico.connect.gateway.sdk.java.defaultimpl;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.RequestLine;
import org.apache.http.auth.AUTH;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.SystemDefaultCredentialsProvider;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.impl.conn.DefaultSchemePortResolver;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import com.ingenico.connect.gateway.sdk.java.CommunicationException;
import com.ingenico.connect.gateway.sdk.java.Connection;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.PooledConnection;
import com.ingenico.connect.gateway.sdk.java.ProxyConfiguration;
import com.ingenico.connect.gateway.sdk.java.RequestHeader;
import com.ingenico.connect.gateway.sdk.java.Response;
import com.ingenico.connect.gateway.sdk.java.ResponseHeader;
import com.ingenico.connect.gateway.sdk.java.logging.CommunicatorLogger;
import com.ingenico.connect.gateway.sdk.java.logging.LogMessageBuilder;
import com.ingenico.connect.gateway.sdk.java.logging.RequestLogMessageBuilder;
import com.ingenico.connect.gateway.sdk.java.logging.ResponseLogMessageBuilder;

/**
 * {@link Connection} implementation based on {@link HttpClient}.
 */
public class DefaultConnection implements PooledConnection {

	private static final Charset CHARSET = Charset.forName("UTF-8");

	private static final String REQUEST_ID_ATTRIBUTE = DefaultConnection.class.getName() + ".requestId";
	private static final String START_TIMME_ATTRIBUTE = DefaultConnection.class.getName() + ".startTme";

	// CloseableHttpClient is marked to be thread safe
	protected final CloseableHttpClient httpClient;

	// PoolingHttpClientConnectionManager, the implementation used, is marked to be thread safe
	private final HttpClientConnectionManager connectionManager;

	// RequestConfig is marked to be immutable
	protected final RequestConfig requestConfig;

	private volatile CommunicatorLogger communicatorLogger;

	public DefaultConnection(int connectTimeout, int socketTimeout) {
		this(connectTimeout, socketTimeout, null);
	}

	public DefaultConnection(int connectTimeout, int socketTimeout, int maxConnections) {
		this(connectTimeout, socketTimeout, maxConnections, null);
	}

	public DefaultConnection(int connectTimeout, int socketTimeout, ProxyConfiguration proxyConfiguration) {
		this(connectTimeout, socketTimeout, CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, proxyConfiguration);
	}

	public DefaultConnection(int connectTimeout, int socketTimeout, int maxConnections, ProxyConfiguration proxyConfiguration) {
		requestConfig = createRequestConfig(connectTimeout, socketTimeout);
		connectionManager = createHttpClientConnectionManager(maxConnections);
		httpClient = createHttpClient(proxyConfiguration);
	}

	private RequestConfig createRequestConfig(int connectTimeout, int socketTimeout) {
		return RequestConfig.custom()
				.setSocketTimeout(socketTimeout)
				.setConnectTimeout(connectTimeout)
				.build();
	}

	private HttpClientConnectionManager createHttpClientConnectionManager(int maxConnections) {

		PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
		connectionManager.setDefaultMaxPerRoute(maxConnections);
		connectionManager.setMaxTotal(maxConnections + 20);
		return connectionManager;
	}

	private CloseableHttpClient createHttpClient(ProxyConfiguration proxyConfiguration) {

		HttpClientBuilder builder = HttpClients.custom()
				.setConnectionManager(connectionManager);

		HttpRoutePlanner routePlanner;
		CredentialsProvider credentialsProvider;

		if (proxyConfiguration != null) {
			HttpHost proxy = new HttpHost(proxyConfiguration.getHost(), proxyConfiguration.getPort(), proxyConfiguration.getScheme());
			routePlanner = new DefaultProxyRoutePlanner(proxy, DefaultSchemePortResolver.INSTANCE);
			credentialsProvider = new BasicCredentialsProvider();

			if (proxyConfiguration.getUsername() != null) {
				AuthScope authscope = new AuthScope(proxyConfiguration.getHost(), proxyConfiguration.getPort());
				final Credentials credentials = new UsernamePasswordCredentials(proxyConfiguration.getUsername(), proxyConfiguration.getPassword());

				credentialsProvider.setCredentials(authscope, credentials);

				// enable preemptive authentication
				HttpRequestInterceptor proxyAuthenticationInterceptor = new HttpRequestInterceptor() {

					@Override
					public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {
						Header header = request.getFirstHeader(AUTH.PROXY_AUTH_RESP);
						if (header == null) {
							header = new BasicScheme((Charset) null).authenticate(credentials, request, context);
							if (!AUTH.PROXY_AUTH_RESP.equals(header.getName())) {
								header = new BasicHeader(AUTH.PROXY_AUTH_RESP, header.getValue());
							}
							request.setHeader(header);
						}
					}
				};
				builder = builder.addInterceptorLast(proxyAuthenticationInterceptor);
			}

		} else {
			// add support for system properties
			routePlanner = new SystemDefaultRoutePlanner(DefaultSchemePortResolver.INSTANCE, ProxySelector.getDefault());
			credentialsProvider = new SystemDefaultCredentialsProvider();
		}

		// add logging - last for requests, first for responses
		LoggingInterceptor loggingInterceptor = new LoggingInterceptor();
		builder = builder.addInterceptorLast((HttpRequestInterceptor) loggingInterceptor);
		builder = builder.addInterceptorFirst((HttpResponseInterceptor) loggingInterceptor);

		return builder
				.setRoutePlanner(routePlanner)
				.setDefaultCredentialsProvider(credentialsProvider)
				.build();
	}

	@Override
	public void close() throws IOException {
		httpClient.close();
	}

	@Override
	public Response get(URI uri, List<RequestHeader> requestHeaders) {

		HttpGet httpGet = new HttpGet(uri);
		httpGet.setConfig(requestConfig);
		addHeaders(httpGet, requestHeaders);
		return executeRequest(httpGet);
	}

	@Override
	public Response delete(URI uri, List<RequestHeader> requestHeaders) {

		HttpDelete httpDelete = new HttpDelete(uri);
		httpDelete.setConfig(requestConfig);
		addHeaders(httpDelete, requestHeaders);
		return executeRequest(httpDelete);
	}

	@Override
	public Response post(URI uri, List<RequestHeader> requestHeaders, String body) {

		HttpPost httpPost = new HttpPost(uri);
		httpPost.setConfig(requestConfig);
		addHeaders(httpPost, requestHeaders);
		if (body != null) {
			HttpEntity requestEntity = new JsonEntity(body, CHARSET);
			httpPost.setEntity(requestEntity);
		}
		return executeRequest(httpPost);
	}

	@Override
	public Response put(URI uri, List<RequestHeader> requestHeaders, String body) {

		HttpPut httpPut = new HttpPut(uri);
		httpPut.setConfig(requestConfig);
		addHeaders(httpPut, requestHeaders);
		if (body != null) {
			HttpEntity requestEntity = new JsonEntity(body, CHARSET);
			httpPut.setEntity(requestEntity);
		}
		return executeRequest(httpPut);
	}

	@SuppressWarnings("resource")
	protected Response executeRequest(HttpUriRequest request) {

		final String requestId = UUID.randomUUID().toString();
		final long startTime = System.currentTimeMillis();

		HttpContext context = new BasicHttpContext();
		context.setAttribute(REQUEST_ID_ATTRIBUTE, requestId);
		context.setAttribute(START_TIMME_ATTRIBUTE, startTime);

		try {
			CloseableHttpResponse httpResponse = httpClient.execute(request, context);
			HttpEntity entity = httpResponse.getEntity();
			try {
				int statusCode = httpResponse.getStatusLine().getStatusCode();
				String body = entity == null ? null : EntityUtils.toString(entity, CHARSET);
				List<ResponseHeader> headers = getHeaders(httpResponse);
				return new Response(statusCode, body, headers);

			} finally {
				/*
				 * Ensure that the entity content is fully consumed and the
				 * content stream, if exists, is closed so the connection can be
				 * reused. Do not close the httpResponse because that will
				 * prevent the connection from being reused.
				 */
				EntityUtils.consume(entity);
			}
		} catch (ClientProtocolException e) {
			logError(requestId, e, startTime, communicatorLogger);
			throw new CommunicationException(e);
		} catch (IOException e) {
			logError(requestId, e, startTime, communicatorLogger);
			throw new CommunicationException(e);
		} catch (RuntimeException e) {
			logError(requestId, e, startTime, communicatorLogger);
			throw e;
		}
	}

	protected void addHeaders(HttpRequestBase httpRequestBase, List<RequestHeader> requestHeaders) {
		if (requestHeaders != null) {
			for (RequestHeader requestHeader: requestHeaders) {
				httpRequestBase.addHeader(new BasicHeader(requestHeader.getName(), requestHeader.getValue()));
			}
		}
	}

	protected List<ResponseHeader> getHeaders(HttpResponse httpResponse) {
		Header[] headers = httpResponse.getAllHeaders();
		List<ResponseHeader> result = new ArrayList<ResponseHeader>(headers.length);
		for (Header header : headers) {
			result.add(new ResponseHeader(header.getName(), header.getValue()));
		}
		return result;
	}

	@Override
	public void closeIdleConnections(long idleTime, TimeUnit timeUnit) {
		connectionManager.closeIdleConnections(idleTime, timeUnit);
	}

	@Override
	public void closeExpiredConnections() {
		connectionManager.closeExpiredConnections();
	}

	@Override
	public void enableLogging(CommunicatorLogger communicatorLogger) {
		if (communicatorLogger == null) {
			throw new IllegalArgumentException("communicatorLogger is required");
		}
		this.communicatorLogger = communicatorLogger;
	}

	@Override
	public void disableLogging() {
		this.communicatorLogger = null;
	}

	// logging code

	private void logRequest(final HttpRequest request, final String requestId, final CommunicatorLogger logger) {

		try {
			RequestLine requestLine = request.getRequestLine();
			String method = requestLine.getMethod();
			String uri = requestLine.getUri();

			final RequestLogMessageBuilder logMessageBuilder = new RequestLogMessageBuilder(requestId, method, uri);
			addHeaders(logMessageBuilder, request.getAllHeaders());

			if (request instanceof HttpEntityEnclosingRequest) {

				final HttpEntityEnclosingRequest entityEnclosingRequest = (HttpEntityEnclosingRequest) request;

				HttpEntity entity = entityEnclosingRequest.getEntity();
				if (entity != null && !entity.isRepeatable()) {
					entity = new BufferedHttpEntity(entity);
					entityEnclosingRequest.setEntity(entity);
				}

				setBody(logMessageBuilder, entity, request.getFirstHeader(HttpHeaders.CONTENT_TYPE));
			}

			logger.log(logMessageBuilder.getMessage());

		} catch (Exception e) {

			logger.log(String.format("An error occurred trying to log request '%s'", requestId), e);
			return;
		}
	}

	private void logResponse(final HttpResponse response, final String requestId, final long startTime, final CommunicatorLogger logger) {

		final long endTime = System.currentTimeMillis();
		final long duration = endTime - startTime;

		try {
			final int statusCode = response.getStatusLine().getStatusCode();

			final ResponseLogMessageBuilder logMessageBuilder = new ResponseLogMessageBuilder(requestId, statusCode, duration);
			addHeaders(logMessageBuilder, response.getAllHeaders());

			HttpEntity entity = response.getEntity();
			if (entity != null && !entity.isRepeatable()) {
				entity = new BufferedHttpEntity(entity);
				response.setEntity(entity);
			}

			setBody(logMessageBuilder, entity, response.getFirstHeader(HttpHeaders.CONTENT_TYPE));

			logger.log(logMessageBuilder.getMessage());

		} catch (Exception e) {

			logger.log(String.format("An error occurred trying to log request '%s'", requestId), e);
			return;
		}
	}

	private void addHeaders(LogMessageBuilder logMessageBuilder, Header[] headers) {

		if (headers != null) {
			for (Header header : headers) {
				logMessageBuilder.addHeader(header.getName(), header.getValue());
			}
		}
	}

	private void setBody(LogMessageBuilder logMessageBuilder, HttpEntity entity, Header defaultHeader) throws IOException {

		Header contentTypeHeader = entity != null ? entity.getContentType() : null;
		if (contentTypeHeader == null) {
			contentTypeHeader = defaultHeader;
		}

		String contentType = contentTypeHeader != null ? contentTypeHeader.getValue() : null;

		if (entity == null) {
			logMessageBuilder.setBody("", contentType);

		} else if (entity instanceof JsonEntity) {

			String body = ((JsonEntity) entity).getString();
			logMessageBuilder.setBody(body, contentType);

		} else {

			logMessageBuilder.setBody(entity.getContent(), CHARSET, contentType);
		}
	}

	private void logError(final String requestId, final Exception error, final long startTime, final CommunicatorLogger logger) {

		if (logger != null) {

			final String messageTemplate = "Error occurred for outgoing request (requestId='%s', %d ms)";

			final long endTime = System.currentTimeMillis();
			final long duration = endTime - startTime;

			final String message = String.format(messageTemplate, requestId, duration);

			logger.log(message, error);
		}
	}

	private class LoggingInterceptor implements HttpRequestInterceptor, HttpResponseInterceptor {

		@Override
		public void process(HttpRequest request, HttpContext context) throws HttpException, IOException {

			final CommunicatorLogger logger = communicatorLogger;
			if (logger != null) {

				final String requestId = (String) context.getAttribute(REQUEST_ID_ATTRIBUTE);
				if (requestId != null) {
					logRequest(request, requestId, logger);
				}
				// else the context was not sent through executeRequest
			}
		}

		@Override
		public void process(HttpResponse response, HttpContext context) throws HttpException, IOException {

			final CommunicatorLogger logger = communicatorLogger;
			if (logger != null) {

				final String requestId = (String) context.getAttribute(REQUEST_ID_ATTRIBUTE);
				final Long startTime = (Long) context.getAttribute(START_TIMME_ATTRIBUTE);
				if (requestId != null && startTime != null) {
					logResponse(response, requestId, startTime, logger);
				}
				// else the context was not sent through executeRequest
			}
		}
	}
}
