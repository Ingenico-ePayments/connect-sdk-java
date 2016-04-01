package com.globalcollect.gateway.sdk.java;

import java.net.URI;
import java.util.Properties;

import com.globalcollect.gateway.sdk.java.defaultimpl.AuthorizationType;

/**
 * Configuration for the default components.
 */
public class GcDefaultConfiguration {

	/** The default number of maximum connections. */
	public static final int DEFAULT_MAX_CONNECTIONS = 10;

	private URI baseUri;

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
			baseUri 			= URI.create(defaultProperties.getProperty("gcs.api.baseUri"));
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

	/**
	 * Returns the GlobalCollect platform base URI.
	 */
	public URI getBaseUri() {
		return baseUri;
	}
	public void setBaseUri(URI baseUri) {
		this.baseUri = baseUri;
	}
	public GcDefaultConfiguration withBaseUri(URI baseUri) {
		this.baseUri = baseUri;
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
		this.apiKeyId = apiKeyId;
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
		this.secretApiKey = secretApiKey;
		return this;
	}

	public AuthorizationType getAuthorizationType() {
		return authorizationType;
	}
	public void setAuthorizationType(AuthorizationType authorizationType) {
		this.authorizationType = authorizationType;
	}
	public GcDefaultConfiguration withAuthorizationType(AuthorizationType authorizationType) {
		this.authorizationType = authorizationType;
		return this;
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}
	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}
	public GcDefaultConfiguration withConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
		return this;
	}

	public int getSocketTimeout() {
		return socketTimeout;
	}
	public void setSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}
	public GcDefaultConfiguration withSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
		return this;
	}

	public int getMaxConnections() {
		return maxConnections;
	}
	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}
	public GcDefaultConfiguration withMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
		return this;
	}

	public GcProxyConfiguration getProxyConfiguration() {
		return proxyConfiguration;
	}
	public void setProxyConfiguration(GcProxyConfiguration proxyConfiguration) {
		this.proxyConfiguration = proxyConfiguration;
	}
	public GcDefaultConfiguration withProxyConfiguration(GcProxyConfiguration proxyConfiguration) {
		this.proxyConfiguration = proxyConfiguration;
		return this;
	}
}
