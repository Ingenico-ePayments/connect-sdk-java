package com.ingenico.connect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.domain.product.Directory;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProducts;
import com.ingenico.connect.gateway.sdk.java.merchant.products.DirectoryParams;
import com.ingenico.connect.gateway.sdk.java.merchant.products.FindProductsParams;

public class PaymentProductsTest extends ItTest {

	/**
	 * Smoke test for products service.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		FindProductsParams params = new FindProductsParams();
		params.setCountryCode("NL");
		params.setCurrencyCode("EUR");

		Client client = getClient();
		try {
			PaymentProducts response = client.merchant(getMerchantId()).products().find(params);

			Assert.assertTrue(response.getPaymentProducts().size() > 0);

		} finally {
			client.close();
		}
	}

	/**
	 * Smoke test for product directories service.
	 */
	@Test
	public void testDirectories() throws URISyntaxException, IOException {

		DirectoryParams params = new DirectoryParams();
		params.setCountryCode("NL");
		params.setCurrencyCode("EUR");

		Client client = getClient();
		try {
			Directory response = client.merchant(getMerchantId()).products().directory(809, params);

			Assert.assertTrue(response.getEntries().size() > 0);

		} finally {
			client.close();
		}
	}
}
