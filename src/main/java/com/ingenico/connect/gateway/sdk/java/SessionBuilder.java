package com.ingenico.connect.gateway.sdk.java;

import java.net.URI;

/**
 * Builder for a {@link Session} object.
 */
public class SessionBuilder {

	private URI apiEndpoint;

	private Connection connection;

	private MetaDataProvider metaDataProvider;

	private Authenticator authenticator;

	/**
	 * Sets the Ingenico ePayments platform API endpoint URI to use.
	 */
	public SessionBuilder withAPIEndpoint(URI apiEndpoint) {
		this.apiEndpoint = apiEndpoint;
		return this;
	}

	/**
	 * Sets the Ingenico ePayments platform API endpoint URI to use.
	 * @deprecated Use {@link #withAPIEndpoint(URI)} instead.
	 */
	@Deprecated
	public SessionBuilder using(URI apiEndpoint) {
		return withAPIEndpoint(apiEndpoint);
	}

	/**
	 * Sets the {@link Connection} to use.
	 */
	public SessionBuilder withConnection(Connection connection) {
		this.connection = connection;
		return this;
	}

	/**
	 * Sets the {@link Connection} to use.
	 * @deprecated Use {@link #withConnection(Connection)} instead.
	 */
	@Deprecated
	public SessionBuilder using(Connection connection) {
		return withConnection(connection);
	}

	/**
	 * Sets the {@link Authenticator} to use.
	 */
	public SessionBuilder withAuthenticator(Authenticator authenticator) {
		this.authenticator = authenticator;
		return this;
	}

	/**
	 * Sets the {@link Authenticator} to use.
	 * @deprecated Use {@link #withAuthenticator(Authenticator)} instead.
	 */
	@Deprecated
	public SessionBuilder using(Authenticator authenticator) {
		return withAuthenticator(authenticator);
	}

	/**
	 * Sets the {@link MetaDataProvider} to use.
	 */
	public SessionBuilder withMetaDataProvider(MetaDataProvider metaDataProvider) {
		this.metaDataProvider = metaDataProvider;
		return this;
	}

	/**
	 * Sets the {@link MetaDataProvider} to use.
	 * @deprecated Use {@link #withMetaDataProvider(MetaDataProvider)} instead.
	 */
	@Deprecated
	public SessionBuilder using(MetaDataProvider metaDataProvider) {
		return withMetaDataProvider(metaDataProvider);
	}

	/**
	 * Creates a fully initialized {@link Session} object.
	 *
	 * @throws IllegalArgumentException if not all required components are set
	 */
	public Session build() {
		return new Session(
				apiEndpoint,
				connection,
				authenticator,
				metaDataProvider
		);
	}
}
