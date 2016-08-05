package com.globalcollect.gateway.sdk.java;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import com.globalcollect.gateway.sdk.java.defaultimpl.AuthorizationType;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcAuthenticator;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcConnection;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcConnectionTest;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcMarshaller;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcMetaDataProvider;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcSession;
import com.globalcollect.gateway.sdk.java.util.ReflectionUtil;

public class GcFactoryTest {

	public static final URI PROPERTIES_URI;
	public static final String API_KEY_ID		= "d8b5c5c457d80349";
	public static final String SECRET_API_KEY	= "KbaFESwwqgwidbbhf2GECxGFayerrnbT2bPznc3Vfdg=";

	static {
		try {
			PROPERTIES_URI = GcFactoryTest.class.getResource("configuration.properties").toURI();
		} catch (URISyntaxException e) {
			InstantiationError error = new InstantiationError(e.getMessage());
			error.initCause(e);
			throw error;
		}
	}

	@Test
	public void testCreateDefaultConfiguration() {
		GcDefaultConfiguration defaultConfiguration = GcFactory.createDefaultConfiguration(PROPERTIES_URI, API_KEY_ID, SECRET_API_KEY);
		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), defaultConfiguration.getApiEndpoint());
		Assert.assertEquals(AuthorizationType.V1HMAC, defaultConfiguration.getAuthorizationType());
		Assert.assertEquals(-1, defaultConfiguration.getConnectTimeout());
		Assert.assertEquals(-1, defaultConfiguration.getSocketTimeout());
		Assert.assertEquals(100, defaultConfiguration.getMaxConnections());
		Assert.assertEquals(API_KEY_ID, defaultConfiguration.getApiKeyId());
		Assert.assertEquals(SECRET_API_KEY, defaultConfiguration.getSecretApiKey());
		Assert.assertNull(defaultConfiguration.getProxyConfiguration());
	}

	@Test
	public void testCreateCommunicator() {
		@SuppressWarnings("resource")
		GcCommunicator communicator = GcFactory.createCommunicator(PROPERTIES_URI, API_KEY_ID, SECRET_API_KEY);

		Assert.assertSame(DefaultGcMarshaller.INSTANCE, communicator.getMarshaller());

		DefaultGcSession session = ReflectionUtil.getField(communicator, "session", DefaultGcSession.class);

		@SuppressWarnings("resource")
		GcConnection connection = session.getConnection();
		Assert.assertTrue(connection instanceof DefaultGcConnection);
		DefaultGcConnectionTest.assertConnection((DefaultGcConnection) connection, -1, -1, 100, null);

		GcAuthenticator authenticator = session.getAuthenticator();
		Assert.assertTrue(authenticator instanceof DefaultGcAuthenticator);
		Assert.assertEquals(AuthorizationType.V1HMAC, ReflectionUtil.getField(authenticator, "authorizationType", AuthorizationType.class));
		Assert.assertEquals(API_KEY_ID, ReflectionUtil.getField(authenticator, "apiKeyId", String.class));
		Assert.assertEquals(SECRET_API_KEY, ReflectionUtil.getField(authenticator, "secretApiKey", String.class));

		GcMetaDataProvider metaDataProvider = session.getMetaDataProvider();
		Assert.assertTrue(metaDataProvider instanceof DefaultGcMetaDataProvider);
		Collection<RequestHeader> requestHeaders = metaDataProvider.getServerMetaDataHeaders();
		Assert.assertEquals(1, requestHeaders.size());
		RequestHeader requestHeader = requestHeaders.iterator().next();
		Assert.assertEquals("X-GCS-ServerMetaInfo", requestHeader.getName());
	}
}
