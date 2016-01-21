package com.globalcollect.gateway.sdk.java.products;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.FindParams;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProducts;

public class GetPaymentProductsExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		FindParams queryParameters = new FindParams();

		queryParameters.setAmount(1000L);
		queryParameters.setCountryCode("US");
		queryParameters.setCurrencyCode("USD");
		queryParameters.setHide("fields");
		queryParameters.setIsRecurring(true);
		queryParameters.setLocale("en_US");

		PaymentProducts response = client.merchant("merchantId").products().find(queryParameters);
	}

}
