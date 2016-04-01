package com.globalcollect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.services.ConvertAmountParams;
import com.globalcollect.gateway.sdk.java.gc.services.ConvertAmount;

public class ConvertAmountTest extends ItTest {

	/**
	 * Smoke test for convert amount service.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		ConvertAmountParams request = new ConvertAmountParams();
		request.setAmount(123L);
		request.setSource("USD");
		request.setTarget("EUR");

		GcClient client = getGcClient();
		try {
			ConvertAmount response = client.merchant("9991").services().convertAmount(request);

			Assert.assertNotNull(response.getConvertedAmount());

		} finally {
			client.close();
		}
	}
}
