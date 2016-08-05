package com.globalcollect.gateway.sdk.java;

import java.net.URI;

/**
 * Contains the components needed to communicate with the GlobalCollect platform. Thread-safe.
 */
public interface GcSession {

	/**
	 * @return The GlobalCollect platform API endpoint URI. This URI's path should be {@code null} or empty.
	 */
	URI getApiEndpoint();

	/**
	 * @return The {@link GcConnection} object associated with this session. Never {@code null}.
	 */
	GcConnection getConnection();

	/**
	 * @return The {@link GcMetaDataProvider} object associated with this session. Never {@code null}.
	 */
	GcMetaDataProvider getMetaDataProvider();

	/**
	 * @return The {@link GcAuthenticator} object associated with this session. Never {@code null}.
	 */
	GcAuthenticator getAuthenticator();
}
