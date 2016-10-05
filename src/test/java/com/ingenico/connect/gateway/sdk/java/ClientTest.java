package com.ingenico.connect.gateway.sdk.java;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultMarshaller;
import com.ingenico.connect.gateway.sdk.java.util.RequestHeaderMatcher;

@RunWith(MockitoJUnitRunner.class)
public class ClientTest {

	@Mock PooledConnection pooledConnection;
	@Mock Connection connection;

	@Test
	@SuppressWarnings("resource")
	public void testWithClientMetaInfo() {

		Client client1 = Factory.createClient(FactoryTest.PROPERTIES_URI, FactoryTest.API_KEY_ID, FactoryTest.SECRET_API_KEY);
		assertNoClientHeaders(client1);

		Client client2 = client1.withClientMetaInfo(null);
		Assert.assertSame(client1, client2);

		String clientMetaInfo = DefaultMarshaller.INSTANCE.marshal(Collections.singletonMap("test", "test"));
		Client client3 = client1.withClientMetaInfo(clientMetaInfo);
		Assert.assertNotSame(client1, client3);
		assertClientHeaders(client3, clientMetaInfo);

		Client client4 = client3.withClientMetaInfo(clientMetaInfo);
		Assert.assertSame(client3, client4);

		Client client5 = client3.withClientMetaInfo(null);
		Assert.assertNotSame(client3, client5);
		assertNoClientHeaders(client5);

		// nothing can be said about client1 and client5 being the same or not
	}

	private void assertNoClientHeaders(Client client) {
		List<RequestHeader> headers = getHeaders(client);
		Assert.assertNull(headers);
	}

	private void assertClientHeaders(Client client, String clientMetaInfo) {
		List<RequestHeader> headers = getHeaders(client);

		final Charset charset = Charset.forName("UTF-8");
		String headerValue = Base64.encodeBase64String(clientMetaInfo.getBytes(charset));

		List<Matcher<? super RequestHeader>> matchers = new ArrayList<Matcher<? super RequestHeader>>();
		matchers.add(new RequestHeaderMatcher("X-GCS-ClientMetaInfo", headerValue));

		Assert.assertThat(headers, Matchers.containsInAnyOrder(matchers));
	}

	@SuppressWarnings("unchecked")
	private List<RequestHeader> getHeaders(Client client) {
		// ApiResource.getClientHeaders() is protected, so this test class has no access to it; use reflection to get it
		try {
			Method method = ApiResource.class.getDeclaredMethod("getClientHeaders");
			method.setAccessible(true);
			return (List<RequestHeader>) method.invoke(client);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		} catch (InvocationTargetException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	@SuppressWarnings("resource")
	public void testCloseIdleConnectionsNotPooled() {
		SessionBuilder builder = Factory.createSessionBuilder(FactoryTest.PROPERTIES_URI, FactoryTest.API_KEY_ID, FactoryTest.SECRET_API_KEY);
		Session session = builder.withConnection(connection).build();
		Client client = Factory.createClient(session);
		// with a connection that isn't a PooledConnection, this doesn't throw any exceptions
		client.closeIdleConnections(5, TimeUnit.SECONDS);
	}

	@Test
	@SuppressWarnings("resource")
	public void testCloseIdleConnectionsPooled() {
		SessionBuilder builder = Factory.createSessionBuilder(FactoryTest.PROPERTIES_URI, FactoryTest.API_KEY_ID, FactoryTest.SECRET_API_KEY);
		Session session = builder.withConnection(pooledConnection).build();
		Client client = Factory.createClient(session);
		// with a connection that is a PooledConnection, this gets delegated to pooledConnection
		client.closeIdleConnections(5, TimeUnit.SECONDS);

		Mockito.verify(pooledConnection).closeIdleConnections(5, TimeUnit.SECONDS);
	}

	@Test
	@SuppressWarnings("resource")
	public void testCloseExpiredConnectionsNotPooled() {
		SessionBuilder builder = Factory.createSessionBuilder(FactoryTest.PROPERTIES_URI, FactoryTest.API_KEY_ID, FactoryTest.SECRET_API_KEY);
		Session session = builder.withConnection(connection).build();
		Client client = Factory.createClient(session);
		// with a connection that isn't a PooledConnection, this doesn't throw any exceptions
		client.closeExpiredConnections();
	}

	@Test
	@SuppressWarnings("resource")
	public void testCloseExpiredConnectionsPooled() {
		SessionBuilder builder = Factory.createSessionBuilder(FactoryTest.PROPERTIES_URI, FactoryTest.API_KEY_ID, FactoryTest.SECRET_API_KEY);
		Session session = builder.withConnection(pooledConnection).build();
		Client client = Factory.createClient(session);
		// with a connection that is a PooledConnection, this gets delegated to pooledConnection
		client.closeExpiredConnections();

		Mockito.verify(pooledConnection).closeExpiredConnections();
	}
}
