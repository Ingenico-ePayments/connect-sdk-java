package com.ingenico.connect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.domain.product.Directory;
import com.ingenico.connect.gateway.sdk.java.merchant.products.DirectoryParams;

public class PaymentProductsTest extends ItTest {

	/**
	 * Smoke test for products service.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		DirectoryParams params = new DirectoryParams();
		params.setCountryCode("NL");
		params.setCurrencyCode("EUR");

		Client client = getClient();
		try {
			Directory response = client.merchant("8500").products().directory(809, params);

			Assert.assertTrue(response.getEntries().size() > 0);

		} finally {
			client.close();
		}
	}
}
