package com.ingenico.connect.gateway.sdk.it;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.domain.services.ConvertAmount;
import com.ingenico.connect.gateway.sdk.java.merchant.services.ConvertAmountParams;

public class SystemProxyTest extends ItTest {

	private boolean setHttpProxyHost;
	private boolean setHttpProxyPort;
	private boolean setHttpsProxyHost;
	private boolean setHttpsProxyPort;
	private boolean setHttpProxyUser;
	private boolean setHttpProxyPass;

	@Before
	public void setup() throws URISyntaxException {
		if (setupProxyHost("http")) {
			setHttpProxyHost = true;
			setHttpProxyPort = true;
		}
		if (setupProxyHost("https")) {
			setHttpsProxyHost = true;
			setHttpsProxyPort = true;
		}

		if (System.getProperty("http.proxyUser") == null) {
			System.setProperty("http.proxyUser", System.getProperty("connect.api.proxy.username"));
			setHttpProxyUser = true;
		}
		if (System.getProperty("http.proxyPass") == null) {
			System.setProperty("http.proxyPass", System.getProperty("connect.api.proxy.password"));
			setHttpProxyPass = true;
		}
	}

	private boolean setupProxyHost(String prefix) throws URISyntaxException {
		String proxyHostProperty = prefix + ".proxyHost";
		String proxyPortProperty = prefix + ".proxyPort";

		String proxyHost = System.getProperty(proxyPortProperty);
		String proxyPort = System.getProperty(proxyPortProperty);

		if (proxyHost == null && proxyPort == null) {
			String proxyURIString = System.getProperty("connect.api.proxy.uri");
			if (proxyURIString == null) {
				throw new IllegalStateException("Either system properties '" + proxyHostProperty + "' and '" + proxyPortProperty + "' must be set,"
						+ " or system property connect.api.proxy.uri must be set");
			}
			URI proxyURI = new URI(proxyURIString);
			System.setProperty(proxyHostProperty, proxyURI.getHost());
			System.setProperty(proxyPortProperty, Integer.toString(proxyURI.getPort()));

			return true;
		}
		if (proxyHost == null || proxyPort == null) {
			throw new IllegalStateException("Either system properties '" + proxyHostProperty + "' and '" + proxyPortProperty + "' must both be set,"
					+ " or neither must be set");
		}

		// did not setup the proxy host
		return false;
	}

	@After
	public void cleanup() {
		if (setHttpProxyHost) {
			System.clearProperty("http.proxyHost");
		}
		if (setHttpProxyPort) {
			System.clearProperty("http.proxyPort");
		}
		if (setHttpsProxyHost) {
			System.clearProperty("https.proxyHost");
		}
		if (setHttpsProxyPort) {
			System.clearProperty("https.proxyPort");
		}
		if (setHttpProxyUser) {
			System.clearProperty("http.proxyUser");
		}
		if (setHttpProxyPass) {
			System.clearProperty("http.proxyPass");
		}
	}

	/**
	 * Smoke test for using a proxy configured through system properties.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		final boolean[] authenticationCalled = { false };

		final String username = System.getProperty("http.proxyUser");
		final String password = System.getProperty("http.proxyPass");

		Authenticator.setDefault(new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {

				authenticationCalled[0] = true;

				return new PasswordAuthentication(username, password.toCharArray());
			}
		});

		ConvertAmountParams request = new ConvertAmountParams();
		request.setAmount(123L);
		request.setSource("USD");
		request.setTarget("EUR");

		CommunicatorConfiguration configuration = getCommunicatorConfiguration()
				.withProxyConfiguration(null);

		Client client = Factory.createClient(configuration);
		try {
			ConvertAmount response = client.merchant(getMerchantId()).services().convertAmount(request);

			Assert.assertNotNull(response.getConvertedAmount());

		} finally {
			client.close();
		}

		// Authentication may or may not be required, depending on the proxy configuration.
		// Therefore, no assertions can be made about authenticationCalled[0]
	}
}
