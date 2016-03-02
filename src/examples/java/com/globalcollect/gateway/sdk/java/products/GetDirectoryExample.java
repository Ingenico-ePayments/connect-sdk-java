package com.globalcollect.gateway.sdk.java.products;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.paymentproduct.DirectoryParams;
import com.globalcollect.gateway.sdk.java.gc.product.Directory;

public class GetDirectoryExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		DirectoryParams queryParameters = new DirectoryParams();

		queryParameters.setCurrencyCode("USD");
		queryParameters.setCountryCode("US");

		Directory response = client.merchant("merchantId").products().paymentProduct(809).directory(queryParameters);
	}
}
