package com.globalcollect.gateway.sdk.java.productgroups;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.productgroups.GetParams;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProductGroupResponse;

public class GetPaymentProductGroupExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		GetParams queryParameters = new GetParams();

		queryParameters.setAmount(1000L);
		queryParameters.setCurrencyCode("USD");
		queryParameters.setLocale("en_US");
		queryParameters.setCountryCode("US");
		queryParameters.setIsRecurring(true);

		PaymentProductGroupResponse response = client.merchant("merchantId").productgroups().get("cards", queryParameters);
	}
}
