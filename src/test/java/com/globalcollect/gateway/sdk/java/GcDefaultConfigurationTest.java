package com.globalcollect.gateway.sdk.java;

import java.net.URI;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

import com.globalcollect.gateway.sdk.java.defaultimpl.AuthorizationType;

public class GcDefaultConfigurationTest {

	@Test
	public void testConstructFromPropertiesWithoutProxy() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/v1");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com/v1"), configuration.getBaseUri());
		Assert.assertEquals(AuthorizationType.V1HMAC, configuration.getAuthorizationType());
		Assert.assertEquals(20000, configuration.getConnectTimeout());
		Assert.assertEquals(10000, configuration.getSocketTimeout());
		Assert.assertEquals(GcDefaultConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
		Assert.assertNull(configuration.getApiKeyId());
		Assert.assertNull(configuration.getSecretApiKey());
		Assert.assertNull(configuration.getProxyConfiguration());
	}

	@Test
	public void testConstructFromPropertiesWithProxyWithoutAuthentication() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/v1");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");
		properties.setProperty("gcs.api.proxy.uri", "http://proxy.example.org:3128");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com/v1"), configuration.getBaseUri());
		Assert.assertEquals(AuthorizationType.V1HMAC, configuration.getAuthorizationType());
		Assert.assertEquals(20000, configuration.getConnectTimeout());
		Assert.assertEquals(10000, configuration.getSocketTimeout());
		Assert.assertEquals(GcDefaultConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
		Assert.assertNull(configuration.getApiKeyId());
		Assert.assertNull(configuration.getSecretApiKey());

		Assert.assertNotNull(configuration.getProxyConfiguration());
		GcProxyConfiguration proxyConfiguration = configuration.getProxyConfiguration();
		Assert.assertEquals("http", proxyConfiguration.getScheme());
		Assert.assertEquals("proxy.example.org", proxyConfiguration.getHost());
		Assert.assertEquals(3128, proxyConfiguration.getPort());
		Assert.assertNull(proxyConfiguration.getUsername());
		Assert.assertNull(proxyConfiguration.getPassword());
	}

	@Test
	public void testConstructFromPropertiesWithProxyWithAuthentication() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/v1");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");
		properties.setProperty("gcs.api.proxy.uri", "http://proxy.example.org:3128");
		properties.setProperty("gcs.api.proxy.username", "global-collect-username");
		properties.setProperty("gcs.api.proxy.password", "global-collect-password");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com/v1"), configuration.getBaseUri());
		Assert.assertEquals(AuthorizationType.V1HMAC, configuration.getAuthorizationType());
		Assert.assertEquals(20000, configuration.getConnectTimeout());
		Assert.assertEquals(10000, configuration.getSocketTimeout());
		Assert.assertEquals(GcDefaultConfiguration.DEFAULT_MAX_CONNECTIONS, configuration.getMaxConnections());
		Assert.assertNull(configuration.getApiKeyId());
		Assert.assertNull(configuration.getSecretApiKey());

		Assert.assertNotNull(configuration.getProxyConfiguration());
		GcProxyConfiguration proxyConfiguration = configuration.getProxyConfiguration();
		Assert.assertEquals("http", proxyConfiguration.getScheme());
		Assert.assertEquals("proxy.example.org", proxyConfiguration.getHost());
		Assert.assertEquals(3128, proxyConfiguration.getPort());
		Assert.assertEquals("global-collect-username", proxyConfiguration.getUsername());
		Assert.assertEquals("global-collect-password", proxyConfiguration.getPassword());
	}

	@Test
	public void testConstructFromPropertiesWithMaxConnections() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/v1");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");
		properties.setProperty("gcs.api.maxConnections", "100");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com/v1"), configuration.getBaseUri());
		Assert.assertEquals(AuthorizationType.V1HMAC, configuration.getAuthorizationType());
		Assert.assertEquals(20000, configuration.getConnectTimeout());
		Assert.assertEquals(10000, configuration.getSocketTimeout());
		Assert.assertEquals(100, configuration.getMaxConnections());
		Assert.assertNull(configuration.getApiKeyId());
		Assert.assertNull(configuration.getSecretApiKey());
		Assert.assertNull(configuration.getProxyConfiguration());
	}
}
