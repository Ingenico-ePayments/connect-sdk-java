package com.ingenico.connect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.domain.services.ConvertAmount;
import com.ingenico.connect.gateway.sdk.java.merchant.services.ConvertAmountParams;

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

		Client client = getClient();
		try {
			ConvertAmount response = client.merchant(getMerchantId()).services().convertAmount(request);

			Assert.assertNotNull(response.getConvertedAmount());

		} finally {
			client.close();
		}
	}
}
