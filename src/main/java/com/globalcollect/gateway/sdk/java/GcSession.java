package com.globalcollect.gateway.sdk.java;

/**
 * Contains the components needed to communicate with the GlobalCollect platform. Thread-safe.
 */
public interface GcSession {

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
