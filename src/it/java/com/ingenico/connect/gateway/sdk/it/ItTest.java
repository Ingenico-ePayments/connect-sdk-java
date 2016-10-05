package com.ingenico.connect.gateway.sdk.it;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;

abstract class ItTest {

	private static final String PROPERTIES_URL			= "/itconfiguration.properties";
	private static final String PROPERTIES_URL_PROXY	= "/itconfiguration.proxy.properties";
	private static final String API_KEY_ID;
	private static final String SECRET_API_KEY;

	static {
		API_KEY_ID = System.getProperty("connect.api.apiKeyId");
		SECRET_API_KEY = System.getProperty("connect.api.secretApiKey");
		if (API_KEY_ID == null || SECRET_API_KEY == null) {
			throw new IllegalStateException("System properties 'connect.api.apiKeyId' and 'connect.api.secretApiKey' must be set");
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
		return configuration;
	}

	protected CommunicatorConfiguration getCommunicatorConfiguration() throws URISyntaxException {
		URL propertiesUrl = getClass().getResource(PROPERTIES_URL);
		return getCommunicatorConfiguration(propertiesUrl);
	}

	protected CommunicatorConfiguration getCommunicatorConfigurationWithProxy() throws URISyntaxException {
		URL propertiesUrl = getClass().getResource(PROPERTIES_URL_PROXY);
		return getCommunicatorConfiguration(propertiesUrl);
	}

	protected Client getClient() throws URISyntaxException {
		URL propertiesUrl = getClass().getResource(PROPERTIES_URL);
		CommunicatorConfiguration configuration = getCommunicatorConfiguration(propertiesUrl);
		return Factory
				.createClient(configuration)
				.withClientMetaInfo("{\"test\":\"test\"}");
	}

	protected Client getClientWithProxy() throws URISyntaxException {
		URL propertiesUrl = getClass().getResource(PROPERTIES_URL_PROXY);
		CommunicatorConfiguration configuration = getCommunicatorConfiguration(propertiesUrl);
		return Factory
				.createClient(configuration)
				.withClientMetaInfo("{\"test\":\"test\"}");
	}
}
