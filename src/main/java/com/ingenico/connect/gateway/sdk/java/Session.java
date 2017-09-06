package com.ingenico.connect.gateway.sdk.java;

import java.net.URI;

/**
 * Contains the components needed to communicate with the Ingenico ePayments platform. Thread-safe.
 */
public class Session {

	private final URI apiEndpoint;

	private final Connection connection;

	private final Authenticator authenticator;

	private final MetaDataProvider metaDataProvider;

	public Session(URI apiEndpoint, Connection connection, Authenticator authenticator, MetaDataProvider metaDataProvider) {
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

	/**
	 * @return The Ingenico ePayments platform API endpoint URI. This URI's path will be {@code null} or empty.
	 */
	public URI getApiEndpoint() {
		return apiEndpoint;
	}

	/**
	 * @return The {@link Connection} object associated with this session. Never {@code null}.
	 */
	public Connection getConnection() {
		return connection;
	}

	/**
	 * @return The {@link MetaDataProvider} object associated with this session. Never {@code null}.
	 */
	public MetaDataProvider getMetaDataProvider() {
		return metaDataProvider;
	}

	/**
	 * @return The {@link Authenticator} object associated with this session. Never {@code null}.
	 */
	public Authenticator getAuthenticator() {
		return authenticator;
	}
}
