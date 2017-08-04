package com.ingenico.connect.gateway.sdk.java;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

import com.ingenico.connect.gateway.sdk.java.defaultimpl.AuthorizationType;
import com.ingenico.connect.gateway.sdk.java.domain.metadata.ShoppingCartExtension;

/**
 * Configuration for the communicator.
 */
public class CommunicatorConfiguration {

	/** The default number of maximum connections. */
	public static final int DEFAULT_MAX_CONNECTIONS = 10;

	private URI apiEndpoint;

	private int connectTimeout;

	private int socketTimeout;

	private int maxConnections;

	private AuthorizationType authorizationType;

	private String apiKeyId;

	private String secretApiKey;

	private ProxyConfiguration proxyConfiguration;

	private String integrator;

	private ShoppingCartExtension shoppingCartExtension;

	public CommunicatorConfiguration() {}

	public CommunicatorConfiguration(Properties properties) {
		if (properties != null) {
			apiEndpoint			= getApiEndpoint(properties);
			authorizationType	= AuthorizationType.valueOf(properties.getProperty("connect.api.authorizationType"));
			connectTimeout		= Integer.parseInt(properties.getProperty("connect.api.connectTimeout"));
			socketTimeout		= Integer.parseInt(properties.getProperty("connect.api.socketTimeout"));
			maxConnections		= getProperty(properties, "connect.api.maxConnections", DEFAULT_MAX_CONNECTIONS);

			String proxyURI		= properties.getProperty("connect.api.proxy.uri");
			String proxyUser	= properties.getProperty("connect.api.proxy.username");
			String proxyPass	= properties.getProperty("connect.api.proxy.password");
			if (proxyURI != null) {
				proxyConfiguration = new ProxyConfiguration(URI.create(proxyURI), proxyUser, proxyPass);
			}

			integrator				= properties.getProperty("connect.api.integrator");
			shoppingCartExtension	= getShoppingCartExtension(properties);
		}
	}

	private int getProperty(Properties properties, String key, int defaultValue) {
		String propertyValue = properties.getProperty(key, null);
		return propertyValue != null ? Integer.parseInt(propertyValue) : defaultValue;
	}

	private URI getApiEndpoint(Properties properties) {
		String host		= properties.getProperty("connect.api.endpoint.host");
		String scheme	= properties.getProperty("connect.api.endpoint.scheme");
		String port		= properties.getProperty("connect.api.endpoint.port");

		return createURI(scheme != null ? scheme : "https", host, port != null ? Integer.parseInt(port) : -1);
	}

	private URI createURI(String scheme, String host, int port) {
		try {
			return new URI(scheme, null, host, port, null, null, null);
		} catch (URISyntaxException e) {
			throw new IllegalArgumentException("Unable to construct API endpoint URI", e);
		}
	}

	private ShoppingCartExtension getShoppingCartExtension(Properties properties) {
		String creator		= properties.getProperty("connect.api.shoppingCartExtension.creator");
		String name			= properties.getProperty("connect.api.shoppingCartExtension.name");
		String version		= properties.getProperty("connect.api.shoppingCartExtension.version");
		String extensionId	= properties.getProperty("connect.api.shoppingCartExtension.extensionId");

		if (creator == null && name == null && version == null && extensionId == null) {
			return null;
		} else if (extensionId == null) {
			return new ShoppingCartExtension(creator, name, version);
		} else {
			return new ShoppingCartExtension(creator, name, version, extensionId);
		}
	}

	/**
	 * Returns the GlobalCollect platform API endpoint URI.
	 */
	public URI getApiEndpoint() {
		return apiEndpoint;
	}
	public void setApiEndpoint(URI apiEndpoint) {
		if (apiEndpoint != null && apiEndpoint.getPath() != null && !apiEndpoint.getPath().isEmpty()) {
			throw new IllegalArgumentException("apiEndpoint should not contain a path");
		}
		if (apiEndpoint != null && (
				   apiEndpoint.getUserInfo() != null
				|| apiEndpoint.getQuery() != null
				|| apiEndpoint.getFragment() != null
		)) {
			throw new IllegalArgumentException("apiEndpoint should not contain user info, query or fragment");
		}
		this.apiEndpoint = apiEndpoint;
	}
	public CommunicatorConfiguration withApiEndpoint(URI apiEndpoint) {
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
	public CommunicatorConfiguration withApiKeyId(String apiKeyId) {
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
	public CommunicatorConfiguration withSecretApiKey(String secretApiKey) {
		setSecretApiKey(secretApiKey);
		return this;
	}

	public AuthorizationType getAuthorizationType() {
		return authorizationType;
	}
	public void setAuthorizationType(AuthorizationType authorizationType) {
		this.authorizationType = authorizationType;
	}
	public CommunicatorConfiguration withAuthorizationType(AuthorizationType authorizationType) {
		setAuthorizationType(authorizationType);
		return this;
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}
	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}
	public CommunicatorConfiguration withConnectTimeout(int connectTimeout) {
		setConnectTimeout(connectTimeout);
		return this;
	}

	public int getSocketTimeout() {
		return socketTimeout;
	}
	public void setSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}
	public CommunicatorConfiguration withSocketTimeout(int socketTimeout) {
		setSocketTimeout(socketTimeout);
		return this;
	}

	public int getMaxConnections() {
		return maxConnections;
	}
	public void setMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
	}
	public CommunicatorConfiguration withMaxConnections(int maxConnections) {
		setMaxConnections(maxConnections);
		return this;
	}

	public ProxyConfiguration getProxyConfiguration() {
		return proxyConfiguration;
	}
	public void setProxyConfiguration(ProxyConfiguration proxyConfiguration) {
		this.proxyConfiguration = proxyConfiguration;
	}
	public CommunicatorConfiguration withProxyConfiguration(ProxyConfiguration proxyConfiguration) {
		setProxyConfiguration(proxyConfiguration);
		return this;
	}

	public String getIntegrator() {
		return integrator;
	}
	public void setIntegrator(String integrator) {
		this.integrator = integrator;
	}
	public CommunicatorConfiguration withIntegrator(String integrator) {
		setIntegrator(integrator);
		return this;
	}

	public ShoppingCartExtension getShoppingCartExtension() {
		return shoppingCartExtension;
	}
	public void setShoppingCartExtension(ShoppingCartExtension shoppingCartExtension) {
		this.shoppingCartExtension = shoppingCartExtension;
	}
	public CommunicatorConfiguration withShoppingCartExtension(ShoppingCartExtension shoppingCartExtension) {
		setShoppingCartExtension(shoppingCartExtension);
		return this;
	}
}
