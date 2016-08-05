package com.globalcollect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.productgroups.GetParams;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProductGroupResponse;

public class PaymentProductGroupsTest extends ItTest {

	/**
	 * Smoke test for products service.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		GetParams params = new GetParams();
		params.setCountryCode("NL");
		params.setCurrencyCode("EUR");

		GcClient client = getGcClient();
		try {
			PaymentProductGroupResponse response = client.merchant("8500").productgroups().get("cards", params);

			Assert.assertEquals("cards", response.getId());

		} finally {
			client.close();
		}
	}
}
