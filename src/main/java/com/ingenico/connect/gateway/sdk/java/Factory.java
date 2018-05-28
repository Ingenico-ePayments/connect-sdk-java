package com.ingenico.connect.gateway.sdk.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Properties;

import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultAuthenticator;
import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultConnection;
import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultMarshaller;

/**
 * Ingenico ePayments platform factory for several SDK components.
 */
public final class Factory {

	private Factory() {}

	/**
	 * Creates a {@link CommunicatorConfiguration} based on the configuration
	 * values in {@code configurationFileUri} and {@code apiKeyId} and
	 * {@code secretApiKey}.
	 */
	public static CommunicatorConfiguration createConfiguration(URI configurationFileUri, String apiKeyId, String secretApiKey) {
		try {
			Properties properties = new Properties();
			InputStream configurationFileInputStream = configurationFileUri.toURL().openStream();
			try {
				properties.load(configurationFileInputStream);
			} finally {
				configurationFileInputStream.close();
			}
			return new CommunicatorConfiguration(properties)
					.withApiKeyId(apiKeyId)
					.withSecretApiKey(secretApiKey);
		} catch (IOException e) {
			throw new RuntimeException("Unable to load properties", e);
		}
	}

	/**
	 * Creates a {@link SessionBuilder} based on the configuration values in
	 * {@code configurationFileUri}, {@code apiKeyId} and {@code secretApiKey}.
	 */
	public static SessionBuilder createSessionBuilder(URI configurationFileUri, String apiKeyId, String secretApiKey) {
		CommunicatorConfiguration configuration = createConfiguration(configurationFileUri, apiKeyId, secretApiKey);
		return createSessionBuilder(configuration);
	}

	/**
	 * Creates a {@link SessionBuilder} based on the passed configuration.
	 */
	@SuppressWarnings("resource")
	public static SessionBuilder createSessionBuilder(CommunicatorConfiguration configuration) {

		MetaDataProvider metaDataProvider = new MetaDataProviderBuilder(configuration.getIntegrator())
				.withShoppingCartExtension(configuration.getShoppingCartExtension())
				.build();

		return new SessionBuilder()
				.withAPIEndpoint(configuration.getApiEndpoint())
				.withConnection(new DefaultConnection(
						configuration.getConnectTimeout(),
						configuration.getSocketTimeout(),
						configuration.getMaxConnections(),
						configuration.getProxyConfiguration(),
						configuration.getHttpsProtocols()
				))
				.withMetaDataProvider(metaDataProvider)
				.withAuthenticator(new DefaultAuthenticator(
						configuration.getAuthorizationType(),
						configuration.getApiKeyId(),
						configuration.getSecretApiKey()
				));
	}

	/**
	 * Creates a {@link Communicator} based on the configuration values in
	 * {@code configurationFileUri}, {@code apiKeyId} and {@code secretApiKey}.
	 */
	public static Communicator createCommunicator(URI configurationFileUri, String apiKeyId, String secretApiKey) {
		CommunicatorConfiguration configuration = createConfiguration(configurationFileUri, apiKeyId, secretApiKey);
		return createCommunicator(configuration);
	}

	/**
	 * Creates a {@link Communicator} based on the passed configuration.
	 */
	public static Communicator createCommunicator(CommunicatorConfiguration configuration) {
		SessionBuilder sessionBuilder = createSessionBuilder(configuration);
		return createCommunicator(sessionBuilder.build());
	}

	/**
	 * Creates a {@link Communicator} based on the passed {@link Session}.
	 */
	public static Communicator createCommunicator(Session session) {
		return new Communicator(session, DefaultMarshaller.INSTANCE);
	}

	/**
	 * Creates a {@link Client} based on the configuration values in
	 * {@code configurationFileUri}, {@code apiKeyId} and {@code secretApiKey}.
	 */
	public static Client createClient(URI configurationFileUri, String apiKeyId, String secretApiKey) {
		return createClient(createCommunicator(configurationFileUri, apiKeyId, secretApiKey));
	}

	/**
	 * Creates a {@link Client} based on the passed configuration.
	 */
	public static Client createClient(CommunicatorConfiguration configuration) {
		return createClient(createCommunicator(configuration));
	}

	/**
	 * Creates a {@link Client} based on the passed {@link Session}.
	 */
	public static Client createClient(Session session) {
		return createClient(createCommunicator(session));
	}

	/**
	 * Creates a {@link Client} based on the passed {@link Communicator}.
	 */
	public static Client createClient(Communicator communicator) {
		return new Client(communicator);
	}
}
