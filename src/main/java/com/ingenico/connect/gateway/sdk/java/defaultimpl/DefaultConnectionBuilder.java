package com.ingenico.connect.gateway.sdk.java.defaultimpl;

import java.util.Set;

import org.apache.http.NoHttpResponseException;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.ProxyConfiguration;

/**
 * Builder for {@link DefaultConnection} objects.
 */
public class DefaultConnectionBuilder {

	final int connectTimeout;
	final int socketTimeout;
	int maxConnections;
	boolean connectionReuse;
	ProxyConfiguration proxyConfiguration;
	SSLConnectionSocketFactory sslConnectionSocketFactory;

	public DefaultConnectionBuilder(int connectTimeout, int socketTimeout) {
		this.connectTimeout = connectTimeout;
		this.socketTimeout = socketTimeout;

		maxConnections = CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS;
		sslConnectionSocketFactory = DefaultConnection.createSSLConnectionSocketFactory(CommunicatorConfiguration.DEFAULT_HTTPS_PROTOCOLS);
		connectionReuse = true;
	}

	/**
	 * Sets the maximum number of connections. Defaults to {@link CommunicatorConfiguration#DEFAULT_MAX_CONNECTIONS}.
	 */
	public DefaultConnectionBuilder withMaxConnections(int maxConnections) {
		this.maxConnections = maxConnections;
		return this;
	}

	/**
	 * Sets whether or not connections should be reused. Defaults to on ({@code true}).
	 * <p>
	 * This method can be used to turn off connection reuse. This may be necessary in case (proxy) servers do not
	 * handle reused connections well. This may lead to instances of {@link NoHttpResponseException} to be thrown.
	 */
	public DefaultConnectionBuilder withConnectionReuse(boolean connectionReuse) {
		this.connectionReuse = connectionReuse;
		return this;
	}

	/**
	 * Sets the proxy configuration to use. Defaults to no proxy configuration.
	 */
	public DefaultConnectionBuilder withProxyConfiguration(ProxyConfiguration proxyConfiguration) {
		this.proxyConfiguration = proxyConfiguration;
		return this;
	}

	/**
	 * Sets the HTTPS protocols to support. Defaults to {@link CommunicatorConfiguration#DEFAULT_HTTPS_PROTOCOLS}.
	 * <p>
	 * This method is mutually exclusive with {@link #withSslConnectionSocketFactory(SSLConnectionSocketFactory)}.
	 */
	public DefaultConnectionBuilder withHttpsProtocols(Set<String> httpsProtocols) {
		return withSslConnectionSocketFactory(DefaultConnection.createSSLConnectionSocketFactory(httpsProtocols));
	}

	/**
	 * Sets a custom SSL connection socket factory to use.
	 * <p>
	 * This method can be used to provide a fully customizable SSL connection socket factory,
	 * in case the SSL connection socket factory that is created by default cannot be used due to SSL issues.
	 * <p>
	 * This method is mutually exclusive with {@link #withHttpsProtocols(Set)}.
	 */
	public DefaultConnectionBuilder withSslConnectionSocketFactory(SSLConnectionSocketFactory sslConnectionSocketFactory) {
		this.sslConnectionSocketFactory = sslConnectionSocketFactory;
		return this;
	}

	/**
	 * Creates a fully initialized {@link DefaultConnection} object.
	 */
	public DefaultConnection build() {
		return new DefaultConnection(this);
	}
}
