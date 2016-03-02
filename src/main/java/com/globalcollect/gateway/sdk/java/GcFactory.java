package com.globalcollect.gateway.sdk.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Properties;

import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcAuthenticator;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcCommunicator;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcConnection;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcMarshaller;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcMetaDataProvider;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcSessionBuilder;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.GcClientImpl;

/**
 * GlobalCollect platform factory for several SDK components.
 */
public final class GcFactory {

	private GcFactory() {}

	/**
	 * Creates a {@link GcDefaultConfiguration} based on the configuration
	 * values in {@code configurationFileUri} and {@code apiKeyId} and
	 * {@code secretApiKey}.
	 */
	public static GcDefaultConfiguration createDefaultConfiguration(URI configurationFileUri, String apiKeyId, String secretApiKey) {
		try {
			InputStream configurationFileInputStream = configurationFileUri.toURL().openStream();
			Properties defaultProperties = new Properties();
			try {
				defaultProperties.load(configurationFileInputStream);
			} finally {
				configurationFileInputStream.close();
			}
			GcDefaultConfiguration defaultConfiguration = new GcDefaultConfiguration(defaultProperties);
			defaultConfiguration.setApiKeyId(apiKeyId);
			defaultConfiguration.setSecretApiKey(secretApiKey);
			return defaultConfiguration;
		} catch (IOException e) {
			throw new RuntimeException("Unable to load default properties", e);
		}
	}

	/**
	 * Creates a {@link GcSessionBuilder} based on the configuration values in
	 * {@code configurationFileUri}, {@code apiKeyId} and {@code secretApiKey}.
	 */
	public static GcSessionBuilder createSessionBuilder(URI configurationFileUri, String apiKeyId, String secretApiKey) {
		GcDefaultConfiguration defaultConfiguration = createDefaultConfiguration(configurationFileUri, apiKeyId, secretApiKey);
		return createSessionBuilder(defaultConfiguration);
	}

	/**
	 * Creates a {@link GcSessionBuilder} based on the passed configuration.
	 */
	public static GcSessionBuilder createSessionBuilder(GcDefaultConfiguration defaultConfiguration) {

		GcSessionBuilder builder = new DefaultGcSessionBuilder();
		builder.using(new DefaultGcConnection(
				defaultConfiguration.getBaseUri(),
				defaultConfiguration.getConnectTimeout(),
				defaultConfiguration.getSocketTimeout(),
				defaultConfiguration.getMaxConnections(),
				defaultConfiguration.getProxyConfiguration()
		));
		builder.using(new DefaultGcMetaDataProvider());
		builder.using(new DefaultGcAuthenticator(
				defaultConfiguration.getAuthorizationType(),
				defaultConfiguration.getApiKeyId(),
				defaultConfiguration.getSecretApiKey()
		));
		return builder;
	}

	/**
	 * Creates a {@link GcCommunicator} based on the configuration values in
	 * {@code configurationFileUri}, {@code apiKeyId} and {@code secretApiKey}.
	 */
	public static GcCommunicator createCommunicator(URI configurationFileUri, String apiKeyId, String secretApiKey) {
		GcDefaultConfiguration defaultConfiguration = createDefaultConfiguration(configurationFileUri, apiKeyId, secretApiKey);
		return createCommunicator(defaultConfiguration);
	}

	/**
	 * Creates a {@link GcCommunicator} based on the passed configuration.
	 */
	public static GcCommunicator createCommunicator(GcDefaultConfiguration defaultConfiguration) {
		GcSessionBuilder createSessionBuilder = createSessionBuilder(defaultConfiguration);
		return createCommunicator(createSessionBuilder.build());
	}

	/**
	 * Creates a {@link GcCommunicator} based on the passed {@link GcSession}.
	 */
	public static GcCommunicator createCommunicator(GcSession session) {
		return new DefaultGcCommunicator(session, DefaultGcMarshaller.INSTANCE);
	}

	/**
	 * Creates a {@link GcClient} based on the configuration values in
	 * {@code configurationFileUri}, {@code apiKeyId} and {@code secretApiKey}.
	 */
	public static GcClient createClient(URI configurationFileUri, String apiKeyId, String secretApiKey) {
		return createClient(createCommunicator(configurationFileUri, apiKeyId, secretApiKey));
	}

	/**
	 * Creates a {@link GcClient} based on the passed configuration.
	 */
	public static GcClient createClient(GcDefaultConfiguration defaultConfiguration) {
		return createClient(createCommunicator(defaultConfiguration));
	}

	/**
	 * Creates a {@link GcClient} based on the passed {@link GcSession}.
	 */
	public static GcClient createClient(GcSession session) {
		return createClient(createCommunicator(session));
	}

	/**
	 * Creates a {@link GcClient} based on the passed {@link GcCommunicator}.
	 */
	public static GcClient createClient(GcCommunicator communicator) {
		return new GcClientImpl(communicator);
	}
}
