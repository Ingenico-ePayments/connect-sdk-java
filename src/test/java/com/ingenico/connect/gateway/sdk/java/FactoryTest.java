package com.ingenico.connect.gateway.sdk.java;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.defaultimpl.AuthorizationType;
import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultAuthenticator;
import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultConnection;
import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultConnectionTest;
import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultMarshaller;
import com.ingenico.connect.gateway.sdk.java.util.ReflectionUtil;

public class FactoryTest {

	public static final URI PROPERTIES_URI;
	public static final String API_KEY_ID		= "someKey";
	public static final String SECRET_API_KEY	= "someSecret";

	static {
		try {
			PROPERTIES_URI = FactoryTest.class.getResource("configuration.properties").toURI();
		} catch (URISyntaxException e) {
			InstantiationError error = new InstantiationError(e.getMessage());
			error.initCause(e);
			throw error;
		}
	}

	@Test
	public void testCreateConfiguration() {
		CommunicatorConfiguration configuration = Factory.createConfiguration(PROPERTIES_URI, API_KEY_ID, SECRET_API_KEY);
		Assert.assertEquals(URI.create("https://eu.sandbox.api-ingenico.com"), configuration.getApiEndpoint());
		Assert.assertEquals(AuthorizationType.V1HMAC, configuration.getAuthorizationType());
		Assert.assertEquals(-1, configuration.getConnectTimeout());
		Assert.assertEquals(-1, configuration.getSocketTimeout());
		Assert.assertEquals(100, configuration.getMaxConnections());
		Assert.assertEquals(API_KEY_ID, configuration.getApiKeyId());
		Assert.assertEquals(SECRET_API_KEY, configuration.getSecretApiKey());
		Assert.assertNull(configuration.getProxyConfiguration());
	}

	@Test
	public void testCreateCommunicator() {
		@SuppressWarnings("resource")
		Communicator communicator = Factory.createCommunicator(PROPERTIES_URI, API_KEY_ID, SECRET_API_KEY);

		Assert.assertSame(DefaultMarshaller.INSTANCE, communicator.getMarshaller());

		Session session = ReflectionUtil.getField(communicator, "session", Session.class);

		@SuppressWarnings("resource")
		Connection connection = session.getConnection();
		Assert.assertTrue(connection instanceof DefaultConnection);
		DefaultConnectionTest.assertConnection((DefaultConnection) connection, -1, -1, 100, null);

		Authenticator authenticator = session.getAuthenticator();
		Assert.assertTrue(authenticator instanceof DefaultAuthenticator);
		Assert.assertEquals(AuthorizationType.V1HMAC, ReflectionUtil.getField(authenticator, "authorizationType", AuthorizationType.class));
		Assert.assertEquals(API_KEY_ID, ReflectionUtil.getField(authenticator, "apiKeyId", String.class));
		Assert.assertEquals(SECRET_API_KEY, ReflectionUtil.getField(authenticator, "secretApiKey", String.class));

		MetaDataProvider metaDataProvider = session.getMetaDataProvider();
		Assert.assertEquals(MetaDataProvider.class, metaDataProvider.getClass());
		Collection<RequestHeader> requestHeaders = metaDataProvider.getServerMetaDataHeaders();
		Assert.assertEquals(1, requestHeaders.size());
		RequestHeader requestHeader = requestHeaders.iterator().next();
		Assert.assertEquals("X-GCS-ServerMetaInfo", requestHeader.getName());
	}
}
