package com.globalcollect.gateway.sdk.java.hostedcheckouts;

import java.net.URISyntaxException;

import com.globalcollect.gateway.sdk.java.ExampleBase;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.CreateHostedCheckoutRequest;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.CreateHostedCheckoutResponse;
import com.globalcollect.gateway.sdk.java.gc.hostedcheckout.definitions.HostedCheckoutSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Customer;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Order;

public class CreateHostedCheckoutExample extends ExampleBase {
	
	public void example() throws URISyntaxException {
		GcClient client = getGcClient();
		
		CreateHostedCheckoutRequest body = new CreateHostedCheckoutRequest();
		Order order = new Order();
		
		AmountOfMoney amountOfMoney = new AmountOfMoney();
		amountOfMoney.setCurrencyCode("USD");
		amountOfMoney.setAmount(2345L);
		order.setAmountOfMoney(amountOfMoney);
		
		Customer customer = new Customer();
		
		Address billingAddress = new Address();
		billingAddress.setCountryCode("US");
		customer.setBillingAddress(billingAddress);
		
		order.setCustomer(customer);
		
		body.setOrder(order);
		
		HostedCheckoutSpecificInput hostedCheckoutSpecificInput = new HostedCheckoutSpecificInput();
		hostedCheckoutSpecificInput.setLocale("en_GB");
		hostedCheckoutSpecificInput.setVariant("testVariant");
		body.setHostedCheckoutSpecificInput(hostedCheckoutSpecificInput);

		CreateHostedCheckoutResponse response = client.merchant("merchantId").hostedcheckouts().create(body);
	}

}
