package com.globalcollect.gateway.sdk.it;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URISyntaxException;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.junit.Assert;
import org.junit.Test;

import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcDefaultConfiguration;
import com.globalcollect.gateway.sdk.java.GcProxyConfiguration;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcCommunicator;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcConnection;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcSession;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.services.ConvertAmountParams;
import com.globalcollect.gateway.sdk.java.gc.merchant.services.ServicesClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.services.ServicesClientImpl;
import com.globalcollect.gateway.sdk.java.gc.services.ConvertAmount;

public class SDKProxyTest extends ItTest {

	/**
	 * Smoke test for using a proxy configured through SDK properties.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		ConvertAmountParams request = new ConvertAmountParams();
		request.setAmount(123L);
		request.setSource("USD");
		request.setTarget("EUR");

		GcClient client = getGcClientWithProxy();
		try {
			ServicesClient services = client.merchant("9991").services();

			Assert.assertTrue(services instanceof ServicesClientImpl);
			GcDefaultConfiguration configuration = getDefaultConfigurationWithProxy();
			Assert.assertNotNull(configuration.getProxyConfiguration());
			assertProxySet((ServicesClientImpl) services, configuration.getProxyConfiguration());

			ConvertAmount response = services.convertAmount(request);

			Assert.assertNotNull(response.getConvertedAmount());

		} finally {
			client.close();
		}
	}

	@SuppressWarnings("resource")
	private void assertProxySet(GcApiResource resource, GcProxyConfiguration proxyConfiguration) {
		DefaultGcCommunicator communicator = getField(resource, "communicator", DefaultGcCommunicator.class);
		DefaultGcSession session = getField(communicator, "session", DefaultGcSession.class);
		DefaultGcConnection connection = getField(session, "connection", DefaultGcConnection.class);
		CloseableHttpClient httpClient = getField(connection, "httpClient", CloseableHttpClient.class);
		DefaultProxyRoutePlanner routePlanner = getField(httpClient, "routePlanner", DefaultProxyRoutePlanner.class);
		HttpHost proxy = getField(routePlanner, "proxy", HttpHost.class);
		Assert.assertEquals(proxyConfiguration.getScheme(), proxy.getSchemeName());
		Assert.assertEquals(proxyConfiguration.getPort(), proxy.getPort());

		BasicCredentialsProvider credentialsProvider = getField(httpClient, "credentialsProvider", BasicCredentialsProvider.class);
		AuthScope authScope = new AuthScope(proxy);
		Credentials credentials = credentialsProvider.getCredentials(authScope);
		Assert.assertTrue(credentials instanceof UsernamePasswordCredentials);
		UsernamePasswordCredentials usernamePasswordCredentials = (UsernamePasswordCredentials) credentials;
		Assert.assertEquals(proxyConfiguration.getUsername(), usernamePasswordCredentials.getUserName());
		Assert.assertEquals(proxyConfiguration.getPassword(), usernamePasswordCredentials.getPassword());
	}

	private <T> T getField(Object object, String fieldName, Class<T> fieldType) {
		Class<?> clazz = object.getClass();
		while (clazz != Object.class) {
			try {
				Field field = clazz.getDeclaredField(fieldName);
				field.setAccessible(true);
				Object fieldValue = field.get(object);
				Assert.assertTrue(fieldType.isInstance(fieldValue));
				return fieldType.cast(fieldValue);
			} catch (NoSuchFieldException e) {
				// try next class
			} catch (IllegalAccessException e) {
				// should no longer occur
				throw new RuntimeException(e);
			}

			clazz = clazz.getSuperclass();
		}

		return null;
	}
}
