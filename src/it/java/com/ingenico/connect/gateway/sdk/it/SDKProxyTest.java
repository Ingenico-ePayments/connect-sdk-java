package com.ingenico.connect.gateway.sdk.it;

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

import com.ingenico.connect.gateway.sdk.java.ApiResource;
import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.Communicator;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.ProxyConfiguration;
import com.ingenico.connect.gateway.sdk.java.Session;
import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultConnection;
import com.ingenico.connect.gateway.sdk.java.domain.services.ConvertAmount;
import com.ingenico.connect.gateway.sdk.java.merchant.services.ConvertAmountParams;
import com.ingenico.connect.gateway.sdk.java.merchant.services.ServicesClient;

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

		Client client = getClientWithProxy();
		try {
			ServicesClient services = client.merchant("9991").services();

			CommunicatorConfiguration configuration = getCommunicatorConfigurationWithProxy();
			Assert.assertNotNull(configuration.getProxyConfiguration());
			assertProxySet(services, configuration.getProxyConfiguration());

			ConvertAmount response = services.convertAmount(request);

			Assert.assertNotNull(response.getConvertedAmount());

		} finally {
			client.close();
		}
	}

	@SuppressWarnings("resource")
	private void assertProxySet(ApiResource resource, ProxyConfiguration proxyConfiguration) {
		Communicator communicator = getField(resource, "communicator", Communicator.class);
		Session session = getField(communicator, "session", Session.class);
		DefaultConnection connection = getField(session, "connection", DefaultConnection.class);
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
			} catch (@SuppressWarnings("unused") NoSuchFieldException e) {
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
