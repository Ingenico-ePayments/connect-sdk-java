package com.globalcollect.gateway.sdk.java.productgroups;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.productgroups.FindParams;
import com.globalcollect.gateway.sdk.java.gc.product.PaymentProductGroups;

public class GetPaymentProductGroupsExample extends ExampleBase {

	public void example() throws URISyntaxException {
		GcClient client = getGcClient();

		FindParams queryParameters = new FindParams();

		queryParameters.setAmount(1000L);
		queryParameters.setCountryCode("US");
		queryParameters.setCurrencyCode("USD");
		queryParameters.setHide("fields");
		queryParameters.setIsRecurring(true);
		queryParameters.setLocale("en_US");

		PaymentProductGroups response = client.merchant("merchantId").productgroups().find(queryParameters);
	}
}
