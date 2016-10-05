package com.ingenico.connect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.domain.product.PaymentProductGroupResponse;
import com.ingenico.connect.gateway.sdk.java.merchant.productgroups.GetProductgroupParams;

public class PaymentProductGroupsTest extends ItTest {

	/**
	 * Smoke test for product groups service.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		GetProductgroupParams params = new GetProductgroupParams();
		params.setCountryCode("NL");
		params.setCurrencyCode("EUR");

		Client client = getClient();
		try {
			PaymentProductGroupResponse response = client.merchant("8500").productgroups().get("cards", params);

			Assert.assertEquals("cards", response.getId());

		} finally {
			client.close();
		}
	}
}
