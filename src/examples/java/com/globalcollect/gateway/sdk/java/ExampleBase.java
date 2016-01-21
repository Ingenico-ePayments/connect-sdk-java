package com.globalcollect.gateway.sdk.java;

import java.net.URISyntaxException;
import java.net.URL;

import com.globalcollect.gateway.sdk.java.gc.GcClient;

public abstract class ExampleBase {

	public GcClient getGcClient() throws URISyntaxException {
		URL propertiesUrl = getClass().getResource("/example-configuration.properties");
		GcDefaultConfiguration defaultConfiguration = GcFactory.createDefaultConfiguration(propertiesUrl.toURI(), "d8b5c5c457d80349", "KbaFESwwqgwidbbhf2GECxGFayerrnbT2bPznc3Vfdg=");
		return GcFactory.createClient(defaultConfiguration);
	}
}
