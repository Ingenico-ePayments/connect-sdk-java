package com.ingenico.connect.gateway.sdk.java.defaultimpl;

import java.net.URI;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.SystemDefaultCredentialsProvider;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;
import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.ProxyConfiguration;
import com.ingenico.connect.gateway.sdk.java.util.ReflectionUtil;

public class DefaultConnectionTest {

	private static final int CONNECT_TIMEOUT	= 10000;
	private static final int SOCKET_TIMEOUT		= 20000;
	private static final int MAX_CONNECTIONS	= 100;

	@Test
	@SuppressWarnings("resource")
	public void testConstructWithoutProxy() {

		DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT);
		assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
		assertMaxConnections(connection, CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, null);
		assertNoProxy(connection);
	}

	@Test
	@SuppressWarnings("resource")
	public void testConstructWithProxyWithoutAuthentication() {
		ProxyConfiguration proxyConfiguration = new ProxyConfiguration(URI.create("http://test-proxy"));

		DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT, proxyConfiguration);
		assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
		assertMaxConnections(connection, CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, proxyConfiguration);
		assertProxy(connection, proxyConfiguration);
	}

	@Test
	@SuppressWarnings("resource")
	public void testConstructWithProxyWithAuthentication() {
		ProxyConfiguration proxyConfiguration = new ProxyConfiguration(URI.create("http://test-proxy"), "test-username", "test-password");

		DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT, proxyConfiguration);
		assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
		assertMaxConnections(connection, CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, proxyConfiguration);
		assertProxy(connection, proxyConfiguration);
	}

	@Test
	@SuppressWarnings("resource")
	public void testConstructWithMaxConnectionsWithoutProxy() {

		DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT, MAX_CONNECTIONS);
		assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
		assertMaxConnections(connection, MAX_CONNECTIONS, null);
		assertNoProxy(connection);
	}

	@Test
	@SuppressWarnings("resource")
	public void testConstructWithMaxConnectionsWithProxy() {
		ProxyConfiguration proxyConfiguration = new ProxyConfiguration(URI.create("http://test-proxy"));

		DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT, MAX_CONNECTIONS, proxyConfiguration);
		assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
		assertMaxConnections(connection, MAX_CONNECTIONS, proxyConfiguration);
		assertProxy(connection, proxyConfiguration);
	}

	public static void assertConnection(DefaultConnection connection, int connectTimeout, int socketTimeout, int maxConnections, ProxyConfiguration proxyConfiguration) {
		assertRequestConfig(connection, connectTimeout, socketTimeout);
		assertMaxConnections(connection, maxConnections, proxyConfiguration);
		if (proxyConfiguration != null) {
			assertProxy(connection, proxyConfiguration);
		} else {
			assertNoProxy(connection);
		}
	}

	private static void assertRequestConfig(DefaultConnection connection, int connectTimeout, int socketTimeout) {

		RequestConfig requestConfig = connection.requestConfig;
		Assert.assertEquals(connectTimeout, requestConfig.getConnectTimeout());
		Assert.assertEquals(socketTimeout, requestConfig.getSocketTimeout());
	}

	@SuppressWarnings("resource")
	private static void assertMaxConnections(DefaultConnection connection, int maxConnections, ProxyConfiguration proxyConfiguration) {
		CloseableHttpClient httpClient = ReflectionUtil.getField(connection, "httpClient", CloseableHttpClient.class);
		PoolingHttpClientConnectionManager connectionManager = ReflectionUtil.getField(httpClient, "connManager", PoolingHttpClientConnectionManager.class);
		Assert.assertEquals(maxConnections, connectionManager.getDefaultMaxPerRoute());
		Assert.assertTrue(maxConnections <= connectionManager.getMaxTotal());

		HttpHost target = new HttpHost("api-sandbox.globalcollect.com", -1, "https");
		HttpHost proxy = proxyConfiguration != null ? new HttpHost(proxyConfiguration.getHost(), proxyConfiguration.getPort(), proxyConfiguration.getScheme()) : null;
		HttpRoute route = proxy != null ? new HttpRoute(target, proxy) : new HttpRoute(target);
		Assert.assertEquals(maxConnections, connectionManager.getMaxPerRoute(route));
	}

	@SuppressWarnings("resource")
	private static void assertNoProxy(DefaultConnection connection) {
		CloseableHttpClient httpClient = ReflectionUtil.getField(connection, "httpClient", CloseableHttpClient.class);
		// don't inspect the route planner any further
		ReflectionUtil.getField(httpClient, "routePlanner", SystemDefaultRoutePlanner.class);
		// don't inspect the credentials provider any further
		ReflectionUtil.getField(httpClient, "credentialsProvider", SystemDefaultCredentialsProvider.class);
	}

	@SuppressWarnings("resource")
	private static void assertProxy(DefaultConnection connection, ProxyConfiguration proxyConfiguration) {
		CloseableHttpClient httpClient = ReflectionUtil.getField(connection, "httpClient", CloseableHttpClient.class);
		DefaultProxyRoutePlanner routePlanner = ReflectionUtil.getField(httpClient, "routePlanner", DefaultProxyRoutePlanner.class);
		HttpHost proxy = ReflectionUtil.getField(routePlanner, "proxy", HttpHost.class);
		Assert.assertEquals(proxyConfiguration.getScheme(), proxy.getSchemeName());
		Assert.assertEquals(proxyConfiguration.getPort(), proxy.getPort());

		BasicCredentialsProvider credentialsProvider = ReflectionUtil.getField(httpClient, "credentialsProvider", BasicCredentialsProvider.class);
		AuthScope authScope = new AuthScope(proxy);
		Credentials credentials = credentialsProvider.getCredentials(authScope);
		if (proxyConfiguration.getUsername() != null) {

			Assert.assertTrue(credentials instanceof UsernamePasswordCredentials);
			UsernamePasswordCredentials usernamePasswordCredentials = (UsernamePasswordCredentials) credentials;
			Assert.assertEquals(proxyConfiguration.getUsername(), usernamePasswordCredentials.getUserName());
			Assert.assertEquals(proxyConfiguration.getPassword(), usernamePasswordCredentials.getPassword());

		} else {
			Assert.assertNull(credentials);
		}
	}
}
