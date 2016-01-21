package com.globalcollect.gateway.sdk.it;


import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.globalcollect.gateway.sdk.java.gc.merchant.products.paymentproduct.DirectoryParams;
import com.globalcollect.gateway.sdk.java.gc.product.Directory;

public class PaymentProductsTest extends ItTest {

	/**
	 * Smoke test for products service.
	 */
	@Test
	public void test() throws URISyntaxException {

		DirectoryParams params = new DirectoryParams();
		params.setCountryCode("NL");
		params.setCurrencyCode("EUR");
		Directory response = getGcClient().merchant("8500").products().paymentProduct(809).directory(params);

		Assert.assertTrue(response.getEntries().size() > 0);

	}

}
