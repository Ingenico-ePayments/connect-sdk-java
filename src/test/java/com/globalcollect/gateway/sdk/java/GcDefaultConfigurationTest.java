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
		properties.setProperty("gcs.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
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
		properties.setProperty("gcs.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");
		properties.setProperty("gcs.api.proxy.uri", "http://proxy.example.org:3128");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
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
		properties.setProperty("gcs.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");
		properties.setProperty("gcs.api.proxy.uri", "http://proxy.example.org:3128");
		properties.setProperty("gcs.api.proxy.username", "global-collect-username");
		properties.setProperty("gcs.api.proxy.password", "global-collect-password");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
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
		properties.setProperty("gcs.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");
		properties.setProperty("gcs.api.maxConnections", "100");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

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
		properties.setProperty("gcs.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
	}

	@Test
	public void testConstructFromPropertiesWithHostAndScheme() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("gcs.api.endpoint.scheme", "http");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("http://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
	}

	@Test
	public void testConstructFromPropertiesWithHostAndPort() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("gcs.api.endpoint.port", "8443");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com:8443"), configuration.getApiEndpoint());
	}

	@Test
	public void testConstructFromPropertiesWithHostSchemeAndPort() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("gcs.api.endpoint.scheme", "http");
		properties.setProperty("gcs.api.endpoint.port", "8080");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("http://api-sandbox.globalcollect.com:8080"), configuration.getApiEndpoint());
	}

	@Test
	public void testConstructFromPropertiesWithBaseURI() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/v1");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());

		// with a trailing /

		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/v1/");

		configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());

		// no version

		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/");

		configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://api-sandbox.globalcollect.com"), configuration.getApiEndpoint());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructFromPropertiesWithHostAndBaseURI() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/v1");
		properties.setProperty("gcs.api.endpoint.host", "api-sandbox.globalcollect.com");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		new GcDefaultConfiguration(properties);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructFromPropertiesWithPortAndBaseURI() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/v1");
		properties.setProperty("gcs.api.endpoint.port", "80");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		new GcDefaultConfiguration(properties);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructFromPropertiesWithSchemeAndBaseURI() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/v1");
		properties.setProperty("gcs.api.endpoint.scheme", "http");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		new GcDefaultConfiguration(properties);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructFromPropertiesWithBaseURIWithInvalidVersion() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/v0");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		new GcDefaultConfiguration(properties);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructFromPropertiesWithInvalidBaseURI() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://api-sandbox.globalcollect.com/v1/hello");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		new GcDefaultConfiguration(properties);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructFromPropertiesWithBaseURIWithCredentials() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://test:test@api-sandbox.globalcollect.com/v1");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		new GcDefaultConfiguration(properties);
	}

	@Test
	public void testConstructFromPropertiesWithIPv6Host() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.endpoint.host", "::1");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://[::1]"), configuration.getApiEndpoint());
	}

	@Test
	public void testConstructFromPropertiesWithIPv6BaseURI() {

		Properties properties = new Properties();
		properties.setProperty("gcs.api.baseUri", "https://[::1]/v1");
		properties.setProperty("gcs.api.authorizationType", "V1HMAC");
		properties.setProperty("gcs.api.connectTimeout", "20000");
		properties.setProperty("gcs.api.socketTimeout", "10000");

		GcDefaultConfiguration configuration = new GcDefaultConfiguration(properties);

		Assert.assertEquals(URI.create("https://[::1]"), configuration.getApiEndpoint());
	}
}
