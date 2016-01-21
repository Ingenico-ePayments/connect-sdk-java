package com.globalcollect.gateway.sdk.it;

import java.net.URISyntaxException;
import java.net.URL;

import com.globalcollect.gateway.sdk.java.GcDefaultConfiguration;
import com.globalcollect.gateway.sdk.java.GcFactory;
import com.globalcollect.gateway.sdk.java.gc.GcClient;

abstract class ItTest {
	
	private static final String PROPERTIES_URL			= "/itconfiguration.properties";
	private static final String PROPERTIES_URL_PROXY	= "/itconfiguration.proxy.properties";
	private static final String API_KEY_ID				= "d8b5c5c457d80349";
	private static final String SECRET_API_KEY			= "KbaFESwwqgwidbbhf2GECxGFayerrnbT2bPznc3Vfdg=";
	
	protected GcDefaultConfiguration getDefaultConfiguration() throws URISyntaxException {
		URL propertiesUrl = getClass().getResource(PROPERTIES_URL);
		return GcFactory.createDefaultConfiguration(propertiesUrl.toURI(), API_KEY_ID, SECRET_API_KEY);
	}

	protected GcDefaultConfiguration getDefaultConfigurationWithProxy() throws URISyntaxException {
		URL propertiesUrl = getClass().getResource(PROPERTIES_URL_PROXY);
		return GcFactory.createDefaultConfiguration(propertiesUrl.toURI(), API_KEY_ID, SECRET_API_KEY);
	}

	protected GcClient getGcClient() throws URISyntaxException {
		URL propertiesUrl = getClass().getResource(PROPERTIES_URL);
		return GcFactory
			.createClient(propertiesUrl.toURI(), API_KEY_ID, SECRET_API_KEY)
			.withClientMetaInfo("{\"test\":\"test\"}")
		;
	}

	protected GcClient getGcClientWithProxy() throws URISyntaxException {
		URL propertiesUrl = getClass().getResource(PROPERTIES_URL_PROXY);
		return GcFactory
			.createClient(propertiesUrl.toURI(), API_KEY_ID, SECRET_API_KEY)
			.withClientMetaInfo("{\"test\":\"test\"}")
		;
	}
	
}
