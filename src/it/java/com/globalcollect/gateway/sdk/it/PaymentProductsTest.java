package com.globalcollect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.DirectoryParams;
import com.globalcollect.gateway.sdk.java.gc.product.Directory;

public class PaymentProductsTest extends ItTest {

	/**
	 * Smoke test for products service.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		DirectoryParams params = new DirectoryParams();
		params.setCountryCode("NL");
		params.setCurrencyCode("EUR");

		GcClient client = getGcClient();
		try {
			Directory response = client.merchant("8500").products().directory(809, params);

			Assert.assertTrue(response.getEntries().size() > 0);

		} finally {
			client.close();
		}
	}
}
