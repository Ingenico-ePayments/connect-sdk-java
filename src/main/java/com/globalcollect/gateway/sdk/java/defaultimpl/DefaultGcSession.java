package com.globalcollect.gateway.sdk.java.defaultimpl;

import java.net.URI;

import com.globalcollect.gateway.sdk.java.GcAuthenticator;
import com.globalcollect.gateway.sdk.java.GcConnection;
import com.globalcollect.gateway.sdk.java.GcMetaDataProvider;
import com.globalcollect.gateway.sdk.java.GcSession;

/**
 * Default {@link GcSession} implementation.
 */
public class DefaultGcSession implements GcSession {

	private final URI apiEndpoint;

	private final GcConnection connection;

	private final GcAuthenticator authenticator;

	private final GcMetaDataProvider metaDataProvider;

	public DefaultGcSession(URI apiEndpoint, GcConnection connection, GcAuthenticator authenticator, GcMetaDataProvider metaDataProvider) {
		if (apiEndpoint == null) {
			throw new IllegalArgumentException("apiEndpoint is required");
		}
		if (apiEndpoint.getPath() != null && !apiEndpoint.getPath().isEmpty()) {
			throw new IllegalArgumentException("apiEndpoint should not contain a path");
		}
		if (apiEndpoint.getUserInfo() != null
				|| apiEndpoint.getQuery() != null
				|| apiEndpoint.getFragment() != null) {

			throw new IllegalArgumentException("apiEndpoint should not contain user info, query or fragment");
		}

		if (connection == null) {
			throw new IllegalArgumentException("connection is required");
		}
		if (authenticator == null) {
			throw new IllegalArgumentException("authenticator is required");
		}
		if (metaDataProvider == null) {
			throw new IllegalArgumentException("metaDataProvider is required");
		}
		this.apiEndpoint = apiEndpoint;
		this.connection = connection;
		this.authenticator = authenticator;
		this.metaDataProvider = metaDataProvider;
	}

	@Override
	public URI getApiEndpoint() {
		return apiEndpoint;
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
