package com.ingenico.connect.gateway.sdk.java;

import java.net.URI;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.defaultimpl.AuthorizationType;

public class CommunicatorConfigurationTest {

	@Test
	public void testConstructFromPropertiesWithoutProxy() {

		Properties properties = new Properties();
		properties.setProperty("connect.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("connect.api.authorizationType", "V1HMAC");
		properties.setProperty("connect.api.connectTimeout", "20000");
		properties.setProperty("connect.api.socketTimeout", "10000");

		CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
		Assert.assertEquals(AuthorizationType.V1HMAC, configuration.getAuthorizationType());
		Assert.assertEquals(20000, configuration.getConnectTimeout());
		Assert.assertEquals(10000, configuration.getSocketTimeout());
		Assert.assertEquals(CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
		Assert.assertNull(configuration.getApiKeyId());
		Assert.assertNull(configuration.getSecretApiKey());
		Assert.assertNull(configuration.getProxyConfiguration());
		Assert.assertNull(configuration.getIntegrator());
		Assert.assertNull(configuration.getShoppingCartExtension());
	}

	@Test
	public void testConstructFromPropertiesWithProxyWithoutAuthentication() {

		Properties properties = new Properties();
		properties.setProperty("connect.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("connect.api.authorizationType", "V1HMAC");
		properties.setProperty("connect.api.connectTimeout", "20000");
		properties.setProperty("connect.api.socketTimeout", "10000");
		properties.setProperty("connect.api.proxy.uri", "http://proxy.example.org:3128");

		CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
		Assert.assertEquals(AuthorizationType.V1HMAC, configuration.getAuthorizationType());
		Assert.assertEquals(20000, configuration.getConnectTimeout());
		Assert.assertEquals(10000, configuration.getSocketTimeout());
		Assert.assertEquals(CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
		Assert.assertNull(configuration.getApiKeyId());
		Assert.assertNull(configuration.getSecretApiKey());

		Assert.assertNotNull(configuration.getProxyConfiguration());
		ProxyConfiguration proxyConfiguration = configuration.getProxyConfiguration();
		Assert.assertEquals("http", proxyConfiguration.getScheme());
		Assert.assertEquals("proxy.example.org", proxyConfiguration.getHost());
		Assert.assertEquals(3128, proxyConfiguration.getPort());
		Assert.assertNull(proxyConfiguration.getUsername());
		Assert.assertNull(proxyConfiguration.getPassword());
	}

	@Test
	public void testConstructFromPropertiesWithProxyWithAuthentication() {

		Properties properties = new Properties();
		properties.setProperty("connect.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("connect.api.authorizationType", "V1HMAC");
		properties.setProperty("connect.api.connectTimeout", "20000");
		properties.setProperty("connect.api.socketTimeout", "10000");
		properties.setProperty("connect.api.proxy.uri", "http://proxy.example.org:3128");
		properties.setProperty("connect.api.proxy.username", "connect-username");
		properties.setProperty("connect.api.proxy.password", "connect-password");

		CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
		Assert.assertEquals(AuthorizationType.V1HMAC, configuration.getAuthorizationType());
		Assert.assertEquals(20000, configuration.getConnectTimeout());
		Assert.assertEquals(10000, configuration.getSocketTimeout());
		Assert.assertEquals(CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
		Assert.assertNull(configuration.getApiKeyId());
		Assert.assertNull(configuration.getSecretApiKey());

		Assert.assertNotNull(configuration.getProxyConfiguration());
		ProxyConfiguration proxyConfiguration = configuration.getProxyConfiguration();
		Assert.assertEquals("http", proxyConfiguration.getScheme());
		Assert.assertEquals("proxy.example.org", proxyConfiguration.getHost());
		Assert.assertEquals(3128, proxyConfiguration.getPort());
		Assert.assertEquals("connect-username", proxyConfiguration.getUsername());
		Assert.assertEquals("connect-password", proxyConfiguration.getPassword());
	}

	@Test
	public void testConstructFromPropertiesWithMaxConnections() {

		Properties properties = new Properties();
		properties.setProperty("connect.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("connect.api.authorizationType", "V1HMAC");
		properties.setProperty("connect.api.connectTimeout", "20000");
		properties.setProperty("connect.api.socketTimeout", "10000");
		properties.setProperty("connect.api.maxConnections", "100");

		CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
		Assert.assertEquals(AuthorizationType.V1HMAC, configuration.getAuthorizationType());
		Assert.assertEquals(20000, configuration.getConnectTimeout());
		Assert.assertEquals(10000, configuration.getSocketTimeout());
		Assert.assertEquals(100, configuration.getMaxConnections());
		Assert.assertNull(configuration.getApiKeyId());
		Assert.assertNull(configuration.getSecretApiKey());
		Assert.assertNull(configuration.getProxyConfiguration());
	}

	@Test
	public void testConstructFromPropertiesWithHost() {

		Properties properties = new Properties();
		properties.setProperty("connect.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("connect.api.authorizationType", "V1HMAC");
		properties.setProperty("connect.api.connectTimeout", "20000");
		properties.setProperty("connect.api.socketTimeout", "10000");

		CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
	}

	@Test
	public void testConstructFromPropertiesWithHostAndScheme() {

		Properties properties = new Properties();
		properties.setProperty("connect.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("connect.api.endpoint.scheme", "http");
		properties.setProperty("connect.api.authorizationType", "V1HMAC");
		properties.setProperty("connect.api.connectTimeout", "20000");
		properties.setProperty("connect.api.socketTimeout", "10000");

		CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

		Assert.assertEquals(URI.create("http://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
	}

	@Test
	public void testConstructFromPropertiesWithHostAndPort() {

		Properties properties = new Properties();
		properties.setProperty("connect.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("connect.api.endpoint.port", "8443");
		properties.setProperty("connect.api.authorizationType", "V1HMAC");
		properties.setProperty("connect.api.connectTimeout", "20000");
		properties.setProperty("connect.api.socketTimeout", "10000");

		CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com:8443"), configuration.getApiEndpoint());
	}

	@Test
	public void testConstructFromPropertiesWithHostSchemeAndPort() {

		Properties properties = new Properties();
		properties.setProperty("connect.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("connect.api.endpoint.scheme", "http");
		properties.setProperty("connect.api.endpoint.port", "8080");
		properties.setProperty("connect.api.authorizationType", "V1HMAC");
		properties.setProperty("connect.api.connectTimeout", "20000");
		properties.setProperty("connect.api.socketTimeout", "10000");

		CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

		Assert.assertEquals(URI.create("http://api-sandbox.globalcollect.com:8080"), configuration.getApiEndpoint());
	}

	@Test
	public void testConstructFromPropertiesWithIPv6Host() {

		Properties properties = new Properties();
		properties.setProperty("connect.api.endpoint.host", "::1");
		properties.setProperty("connect.api.authorizationType", "V1HMAC");
		properties.setProperty("connect.api.connectTimeout", "20000");
		properties.setProperty("connect.api.socketTimeout", "10000");

		CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

		Assert.assertEquals(URI.create("https://[::1]"), configuration.getApiEndpoint());
	}

	@Test
	public void testConstructFromPropertiesWithMetaData() {

		Properties properties = new Properties();
		properties.setProperty("connect.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("connect.api.authorizationType", "V1HMAC");
		properties.setProperty("connect.api.connectTimeout", "20000");
		properties.setProperty("connect.api.socketTimeout", "10000");
		properties.setProperty("connect.api.integrator", "Ingenico.Integrator");
		properties.setProperty("connect.api.shoppingCartExtension.creator", "Ingenico.Creator");
		properties.setProperty("connect.api.shoppingCartExtension.name", "Ingenico.ShoppingCarts");
		properties.setProperty("connect.api.shoppingCartExtension.version", "1.0");

		CommunicatorConfiguration configuration = new CommunicatorConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
		Assert.assertEquals(AuthorizationType.V1HMAC, configuration.getAuthorizationType());
		Assert.assertEquals(20000, configuration.getConnectTimeout());
		Assert.assertEquals(10000, configuration.getSocketTimeout());
		Assert.assertEquals(CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
		Assert.assertNull(configuration.getApiKeyId());
		Assert.assertNull(configuration.getSecretApiKey());
		Assert.assertNull(configuration.getProxyConfiguration());
		Assert.assertEquals("Ingenico.Integrator", configuration.getIntegrator());
		Assert.assertNotNull(configuration.getShoppingCartExtension());
		Assert.assertEquals("Ingenico.Creator", configuration.getShoppingCartExtension().getCreator());
		Assert.assertEquals("Ingenico.ShoppingCarts", configuration.getShoppingCartExtension().getName());
		Assert.assertEquals("1.0", configuration.getShoppingCartExtension().getVersion());
	}
}
