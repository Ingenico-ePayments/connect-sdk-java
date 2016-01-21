package com.globalcollect.gateway.sdk.java.products;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.GetParams;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProductResponse;

public class GetPaymentProductExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		GetParams queryParameters = new GetParams();

		queryParameters.setAmount(1000L);
		queryParameters.setCurrencyCode("USD");
		queryParameters.setLocale("en_US");
		queryParameters.setCountryCode("US");
		queryParameters.setIsRecurring(true);

		PaymentProductResponse response = client.merchant("merchantId").products().get(1, queryParameters);
	}

}
