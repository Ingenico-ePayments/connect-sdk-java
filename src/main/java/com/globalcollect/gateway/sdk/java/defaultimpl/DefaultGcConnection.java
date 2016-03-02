package com.globalcollect.gateway.sdk.java.defaultimpl;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
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
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.SystemDefaultCredentialsProvider;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.impl.conn.DefaultSchemePortResolver;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import com.globalcollect.gateway.sdk.java.GcCommunicationException;
import com.globalcollect.gateway.sdk.java.GcConnection;
import com.globalcollect.gateway.sdk.java.GcDefaultConfiguration;
import com.globalcollect.gateway.sdk.java.GcProxyConfiguration;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.RequestHeader;
import com.globalcollect.gateway.sdk.java.RequestParam;

/**
 * {@link GcConnection} implementation based on {@link HttpClient}.
 */
public class DefaultGcConnection implements GcConnection {

	private static final Charset CHARSET = Charset.forName("UTF-8");

	// CloseableHttpClient is marked to be thread safe
	protected final CloseableHttpClient httpClient;

	private final URI baseUri;

	protected final RequestConfig requestConfig;

	public DefaultGcConnection(String scheme, String host, int port, String basePath, int connectTimeout, int socketTimeout) {
		this(scheme, host, port, basePath, connectTimeout, socketTimeout, null);
	}

	public DefaultGcConnection(String scheme, String host, int port, String basePath, int connectTimeout, int socketTimeout, int maxConnections) {
		this(scheme, host, port, basePath, connectTimeout, socketTimeout, maxConnections, null);
	}

	public DefaultGcConnection(String scheme, String host, int port, String basePath, int connectTimeout, int socketTimeout, GcProxyConfiguration proxyConfiguration) {
		this(scheme, host, port, basePath, connectTimeout, socketTimeout, GcDefaultConfiguration.DEFAULT_MAX_CONNECTIONS, proxyConfiguration);
	}

	public DefaultGcConnection(String scheme, String host, int port, String basePath, int connectTimeout, int socketTimeout, int maxConnections,
			GcProxyConfiguration proxyConfiguration) {

		this(createURI(scheme, host, port, basePath), connectTimeout, socketTimeout, maxConnections, proxyConfiguration);
	}

	private static URI createURI(String scheme, String host, int port, String basePath) {
		if (scheme == null || scheme.trim().isEmpty()) {
			throw new IllegalArgumentException("scheme is required");
		}
		if (host == null || host.trim().isEmpty()) {
			throw new IllegalArgumentException("host is required");
		}
		if (basePath == null || basePath.trim().isEmpty()) {
			throw new IllegalArgumentException("basePath is required");
		}
		if (port <= 0 || port > 65535) {
			throw new IllegalArgumentException("port is invalid");
		}
		URIBuilder uriBuilder = new URIBuilder()
				.setScheme(scheme.trim())
				.setHost(host.trim())
				.setPort(port)
				.setPath(basePath.trim());
		try {
			return uriBuilder.build();
		} catch (URISyntaxException e) {
			throw new IllegalArgumentException("Unable to construct base URI", e);
		}
	}

	public DefaultGcConnection(URI baseUri, int connectTimeout, int socketTimeout) {
		this(baseUri, connectTimeout, socketTimeout, null);
	}

	public DefaultGcConnection(URI baseUri, int connectTimeout, int socketTimeout, int maxConnections) {
		this(baseUri, connectTimeout, socketTimeout, maxConnections, null);
	}

	public DefaultGcConnection(URI baseUri, int connectTimeout, int socketTimeout, GcProxyConfiguration proxyConfiguration) {
		this(baseUri, connectTimeout, socketTimeout, GcDefaultConfiguration.DEFAULT_MAX_CONNECTIONS, proxyConfiguration);
	}

	public DefaultGcConnection(URI baseUri, int connectTimeout, int socketTimeout, int maxConnections, GcProxyConfiguration proxyConfiguration) {
		if (baseUri == null) {
			throw new IllegalArgumentException("baseUri is required");
		}
		this.baseUri = baseUri;
		requestConfig = createRequestConfig(connectTimeout, socketTimeout);
		httpClient = createHttpClient(maxConnections, proxyConfiguration);
	}

	private RequestConfig createRequestConfig(int connectTimeout, int socketTimeout) {
		return RequestConfig.custom()
				.setSocketTimeout(socketTimeout)
				.setConnectTimeout(connectTimeout)
				.build();
	}

	private CloseableHttpClient createHttpClient(int maxConnections, GcProxyConfiguration proxyConfiguration) {

		HttpClientBuilder builder = HttpClients.custom()
				.setMaxConnPerRoute(maxConnections)
				.setMaxConnTotal(maxConnections + 20);

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
	public URI toURI(String relativePath, List<RequestParam> requestParameters) {

		StringBuilder pathBuilder = new StringBuilder();
		pathBuilder.append(baseUri.getPath());
		if (!baseUri.getPath().endsWith("/") && !relativePath.startsWith("/") ) {
			pathBuilder.append("/");
		}
		pathBuilder.append(relativePath);

		URIBuilder uriBuilder = new URIBuilder()
				.setScheme(baseUri.getScheme())
				.setHost(baseUri.getHost())
				.setPort(baseUri.getPort())
				.setPath(pathBuilder.toString());

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

	@Override
	public String get(String relativePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters) {

		URI uri = toURI(relativePath, requestParameters);
		HttpGet httpGet = new HttpGet(uri);
		httpGet.setConfig(requestConfig);
		addHeaders(httpGet, requestHeaders);
		return executeRequest(httpGet);
	}

	@Override
	public String delete(String relativePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters) {

		URI uri = toURI(relativePath, requestParameters);
		HttpDelete httpDelete = new HttpDelete(uri);
		httpDelete.setConfig(requestConfig);
		addHeaders(httpDelete, requestHeaders);
		return executeRequest(httpDelete);
	}

	@Override
	public String post(String relativePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters, String body) {

		URI uri = toURI(relativePath, requestParameters);
		HttpPost httpPost = new HttpPost(uri);
		httpPost.setConfig(requestConfig);
		addHeaders(httpPost, requestHeaders);
		if (body != null) {
			HttpEntity requestEntity = new StringEntity(body, CHARSET);
			httpPost.setEntity(requestEntity);
		}
		return executeRequest(httpPost);
	}

	@Override
	public String put(String relativePath, List<RequestHeader> requestHeaders, List<RequestParam> requestParameters, String body) {

		URI uri = toURI(relativePath, requestParameters);
		HttpPut httpPut = new HttpPut(uri);
		httpPut.setConfig(requestConfig);
		addHeaders(httpPut, requestHeaders);
		if (body != null) {
			HttpEntity requestEntity = new StringEntity(body, CHARSET);
			httpPut.setEntity(requestEntity);
		}
		return executeRequest(httpPut);
	}

	protected String executeRequest(HttpUriRequest request) {

		try {
			CloseableHttpResponse httpResponse = httpClient.execute(request);
			HttpEntity entity = httpResponse.getEntity();
			try {
				throwExceptionIfNecessary(httpResponse);
				return entity == null ? null : EntityUtils.toString(entity, CHARSET);

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
			throw new GcCommunicationException(e);
		} catch (IOException e) {
			throw new GcCommunicationException(e);
		}
	}

	/**
	 * Checks the {@link HttpResponse} for errors and throws an exception if necessary.
	 */
	protected void throwExceptionIfNecessary(HttpResponse httpResponse) throws GcResponseException, IOException {

		int statusCode = httpResponse.getStatusLine().getStatusCode();
		if (statusCode >= 200 && statusCode < 300) { // status codes in the 300 range are not expected
			return;
		} else {
			String body = null;
			HttpEntity entity = httpResponse.getEntity();
			if (entity != null) {
				body = EntityUtils.toString(entity, CHARSET);
			}
			if (body != null && !isJson(httpResponse)) {
				throw new GcCommunicationException(new GcResponseException(statusCode, body));
			} else {
				throw new GcResponseException(statusCode, body);
			}
		}
	}

	private boolean isJson(HttpResponse httpResponse) {
		Header header = httpResponse.getFirstHeader("Content-Type");
		String contentType = header != null ? header.getValue() : null;
		return contentType == null || "application/json".equalsIgnoreCase(contentType) || contentType.toLowerCase().startsWith("application/json");
	}

	protected void addHeaders(HttpRequestBase httpRequestBase, List<RequestHeader> requestHeaders) {
		if (requestHeaders != null) {
			for (RequestHeader requestHeader: requestHeaders) {
				httpRequestBase.addHeader(new BasicHeader(requestHeader.getName(), requestHeader.getValue()));
			}
		}
	}
}
