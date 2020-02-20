package com.ingenico.connect.gateway.sdk.it;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.ProxyConfiguration;

abstract class ItTest {

	private static final String PROPERTIES_URL			= "/itconfiguration.properties";
	private static final String API_KEY_ID;
	private static final String SECRET_API_KEY;
	private static final String MERCHANT_ID;

	static {
		API_KEY_ID = System.getProperty("connect.api.apiKeyId");
		SECRET_API_KEY = System.getProperty("connect.api.secretApiKey");
		if (API_KEY_ID == null || SECRET_API_KEY == null) {
			throw new IllegalStateException("System properties 'connect.api.apiKeyId' and 'connect.api.secretApiKey' must be set");
		}
		MERCHANT_ID = System.getProperty("connect.api.merchantId");
		if (MERCHANT_ID == null) {
			throw new IllegalStateException("System property 'connect.api.merchantId' must be set");
		}
	}

	private CommunicatorConfiguration getCommunicatorConfiguration(URL propertiesUrl) throws URISyntaxException {
		CommunicatorConfiguration configuration = Factory.createConfiguration(propertiesUrl.toURI(), API_KEY_ID, SECRET_API_KEY);

		String host = System.getProperty("connect.api.endpoint.host");
		if (host != null) {
			String scheme = System.getProperty("connect.api.endpoint.scheme", "https");
			int port = Integer.parseInt(System.getProperty("connect.api.endpoint.port", "-1"));
			URI apiEndpoint = new URI(scheme, null, host, port, null, null, null);
			configuration = configuration.withApiEndpoint(apiEndpoint);
		}

		String httpsProtocols = System.getProperty("connect.api.https.protocols");
		if (httpsProtocols != null) {
			configuration = configuration.withHttpsProtocols(httpsProtocols.split("\\s*,\\s*"));
		}

		return configuration;
	}

	protected CommunicatorConfiguration getCommunicatorConfiguration() throws URISyntaxException {
		URL propertiesUrl = getClass().getResource(PROPERTIES_URL);
		return getCommunicatorConfiguration(propertiesUrl);
	}

	protected CommunicatorConfiguration getCommunicatorConfigurationWithProxy() throws URISyntaxException {
		String proxyURI = System.getProperty("connect.api.proxy.uri");
		String proxyUsername = System.getProperty("connect.api.proxy.username");
		String proxyPassword = System.getProperty("connect.api.proxy.password");
		if (proxyURI == null) {
			throw new IllegalStateException("System property 'connect.api.proxy.uri' must be set");
		}

		return getCommunicatorConfiguration()
				.withProxyConfiguration(new ProxyConfiguration(new URI(proxyURI), proxyUsername, proxyPassword));
	}

	protected Client getClient() throws URISyntaxException {
		URL propertiesUrl = getClass().getResource(PROPERTIES_URL);
		CommunicatorConfiguration configuration = getCommunicatorConfiguration(propertiesUrl);
		return Factory
				.createClient(configuration)
				.withClientMetaInfo("{\"test\":\"test\"}");
	}

	protected Client getClientWithProxy() throws URISyntaxException {
		CommunicatorConfiguration configuration = getCommunicatorConfigurationWithProxy();
		return Factory
				.createClient(configuration)
				.withClientMetaInfo("{\"test\":\"test\"}");
	}

	protected String getMerchantId() {
		return MERCHANT_ID;
	}
}
