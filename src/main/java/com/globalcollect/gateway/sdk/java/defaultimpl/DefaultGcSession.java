package com.globalcollect.gateway.sdk.java.defaultimpl;

import com.globalcollect.gateway.sdk.java.GcAuthenticator;
import com.globalcollect.gateway.sdk.java.GcConnection;
import com.globalcollect.gateway.sdk.java.GcMetaDataProvider;
import com.globalcollect.gateway.sdk.java.GcSession;

/**
 * Default {@link GcSession} implementation.
 */
public class DefaultGcSession implements GcSession {

	private final GcConnection connection;
	
	private final GcAuthenticator authenticator;
	
	private final GcMetaDataProvider metaDataProvider;
	
	public DefaultGcSession(GcConnection connection, GcAuthenticator authenticator, GcMetaDataProvider metaDataProvider) {
		if (connection == null) {
			throw new IllegalArgumentException("connection is required");
		}
		if (authenticator == null) {
			throw new IllegalArgumentException("authenticator is required");
		}
		if (metaDataProvider == null) {
			throw new IllegalArgumentException("metaDataProvider is required");
		}
		this.connection = connection;
		this.authenticator = authenticator;
		this.metaDataProvider = metaDataProvider;
	}

	@Override
	public GcConnection getConnection() {
		return connection;
	}

	@Override
	public GcMetaDataProvider getMetaDataProvider() {
		return metaDataProvider;
	}

	@Override
	public GcAuthenticator getAuthenticator() {
		return authenticator;
	}

}
