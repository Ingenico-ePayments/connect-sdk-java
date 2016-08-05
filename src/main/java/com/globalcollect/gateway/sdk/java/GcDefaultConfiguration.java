package com.globalcollect.gateway.sdk.java;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

import com.globalcollect.gateway.sdk.java.defaultimpl.AuthorizationType;
import com.globalcollect.gateway.sdk.java.gc.GcClient;

/**
 * Configuration for the default components.
 */
public class GcDefaultConfiguration {

	/** The default number of maximum connections. */
	public static final int DEFAULT_MAX_CONNECTIONS = 10;

	private URI apiEndpoint;

	private int connectTimeout;

	private int socketTimeout;

	private int maxConnections;

	private AuthorizationType authorizationType;

	private String apiKeyId;

	private String secretApiKey;

	private GcProxyConfiguration proxyConfiguration;

	public GcDefaultConfiguration() {}

	public GcDefaultConfiguration(Properties defaultProperties) {
		if (defaultProperties != null) {
			apiEndpoint			= getApiEndpoint(defaultProperties);
			authorizationType	= AuthorizationType.valueOf(defaultProperties.getProperty("gcs.api.authorizationType"));
			connectTimeout		= Integer.parseInt(defaultProperties.getProperty("gcs.api.connectTimeout"));
			socketTimeout		= Integer.parseInt(defaultProperties.getProperty("gcs.api.socketTimeout"));
			maxConnections		= getProperty(defaultProperties, "gcs.api.maxConnections", DEFAULT_MAX_CONNECTIONS);

			String proxyURI		= defaultProperties.getProperty("gcs.api.proxy.uri");
			String proxyUser	= defaultProperties.getProperty("gcs.api.proxy.username");
			String proxyPass	= defaultProperties.getProperty("gcs.api.proxy.password");
			if (proxyURI != null) {
				proxyConfiguration = new GcProxyConfiguration(URI.create(proxyURI), proxyUser, proxyPass);
			}
		}
	}

	private int getProperty(Properties properties, String key, int defaultValue) {
		String propertyValue = properties.getProperty(key, null);
		return propertyValue != null ? Integer.parseInt(propertyValue) : defaultValue;
	}

	private URI getApiEndpoint(Properties properties) {
		String baseUri	= properties.getProperty("gcs.api.baseUri");

		String host		= properties.getProperty("gcs.api.endpoint.host");
		String scheme	= properties.getProperty("gcs.api.endpoint.scheme");
		String port		= properties.getProperty("gcs.api.endpoint.port");

		if (baseUri != null && (host != null || scheme != null || port != null)) {
			throw new IllegalArgumentException("use either gcs.api.endpoint.host, gcs.api.endpoint.scheme and gcs.api.endpoint.port, "
					+ "or gcs.api.baseUri, but not both");
		}

		if (baseUri != null) {
			// no host, scheme or port
			URI base = URI.create(baseUri);
			String path = base.getPath();
			if (!isValidPath(path)) {
				throw new IllegalArgumentException("baseUri contains invalid path: " + baseUri);
			}
			if (base.getUserInfo() != null
					|| base.getQuery() != null
					|| base.getFragment() != null) {

				throw new IllegalArgumentException("baseUri must not contain user info, query or fragment");
			}
			// base.resolve("") and base.resolve("/") each will contain a path of / which is not what we want
			return createURI(base.getScheme(), base.getHost(), base.getPort());
		}

		return createURI(scheme != null ? scheme : "https", host, port != null ? Integer.parseInt(port) : -1);
	}

	private boolean isValidPath(String path) {
		if (path == null || path.isEmpty()) {
			return true;
		} else {
			return "/".equals(path) || ("/" + GcClient.API_VERSION).equals(path) || ("/" + GcClient.API_VERSION + "/").equals(path);
		}
	}

	private URI createURI(String scheme, String host, int port) {
		try {
			return new URI(scheme, null, host, port, null, null, null);
		} catch (URISyntaxException e) {
			throw new IllegalArgumentException("Unable to construct API endpoint URI", e);
		}
	}

	/**
	 * Returns the GlobalCollect platform base URI.
	 */
	public URI getApiEndpoint() {
		return apiEndpoint;
	}
	public void setApiEndpoint(URI apiEndpoint) {
		if (apiEndpoint != null && apiEndpoint.getPath() != null && !apiEndpoint.getPath().isEmpty()) {
			throw new IllegalArgumentException("apiEndpoint should not contain a path");
		}
		if (apiEndpoint != null
				&& apiEndpoint.getUserInfo() != null
				|| apiEndpoint.getQuery() != null
				|| apiEndpoint.getFragment() != null) {

			throw new IllegalArgumentException("apiEndpoint should not contain user info, query or fragment");
		}
		this.apiEndpoint = apiEndpoint;
	}
	public GcDefaultConfiguration withApiEndpoint(URI apiEndpoint) {
		setApiEndpoint(apiEndpoint);
		return this;
	}

	/**
	 * An identifier for the secret API key. The {@code apiKeyId} can be
	 * retrieved from the Configuration Center. This identifier is visible in
	 * the HTTP request and is also used to identify the correct account.
	 */
	public String getApiKeyId() {
		return apiKeyId;
	}
	public void setApiKeyId(String apiKeyId) {
		this.apiKeyId = apiKeyId;
	}
	public GcDefaultConfiguration withApiKeyId(String apiKeyId) {
		setApiKeyId(apiKeyId);
		return this;
	}

	/**
	 * A shared secret. The shared secret can be retrieved from the
	 * Configuration Center. An {@code apiKeyId} and {@code secretApiKey} always
	 * go hand-in-hand, the difference is that {@code secretApiKey} is never
	 * visible in the HTTP request. This secret is used as input for the HMAC
	 * algorithm.
	 */
	public String getSecretApiKey() {
		return secretApiKey;
	}
	public void setSecretApiKey(String secretApiKey) {
		this.secretApiKey = secretApiKey;
	}
	public GcDefaultConfiguration withSecretApiKey(String secretApiKey) {
		setSecretApiKey(secretApiKey);
		return this;
	}

	public AuthorizationType getAuthorizationType() {
		return authorizationType;
	}
	public void setAuthorizationType(AuthorizationType authorizationType) {
		this.authorizationType = authorizationType;
	}
	public GcDefaultConfiguration withAuthorizationType(AuthorizationType authorizationType) {
		setAuthorizationType(authorizationType);
		return this;
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}
	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}
	public GcDefaultConfiguration withConnectTimeout(int connectTimeout) {
		setConnectTimeout(connectTimeout);
		return this;
	}

	public int getSocketTimeout() {
		return socketTimeout;
	}
	public void setSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}
	public GcDefaultConfiguration withSocketTimeout(int socketTimeout) {
		setSocketTimeout(socketTimeout);
		return this;
	}

	public int getMaxConnections() {
		return maxConnections;
	}
	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}
	public GcDefaultConfiguration withMaxConnections(int maxConnections) {
		setMaxConnections(maxConnections);
		return this;
	}

	public GcProxyConfiguration getProxyConfiguration() {
		return proxyConfiguration;
	}
	public void setProxyConfiguration(GcProxyConfiguration proxyConfiguration) {
		this.proxyConfiguration = proxyConfiguration;
	}
	public GcDefaultConfiguration withProxyConfiguration(GcProxyConfiguration proxyConfiguration) {
		setProxyConfiguration(proxyConfiguration);
		return this;
	}
}
