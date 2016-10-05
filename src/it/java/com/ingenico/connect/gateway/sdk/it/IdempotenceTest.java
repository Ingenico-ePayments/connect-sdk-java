package com.ingenico.connect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.CallContext;
import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CreatePaymentRequest;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CreatePaymentResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Customer;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Order;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RedirectPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RedirectPaymentProduct809SpecificInput;

public class IdempotenceTest extends ItTest {

	/**
	 * Smoke test for idempotence.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		CreatePaymentRequest body = new CreatePaymentRequest();

		Order order = new Order();

		AmountOfMoney amountOfMoney = new AmountOfMoney();
		amountOfMoney.setCurrencyCode("EUR");
		amountOfMoney.setAmount(100L);
		order.setAmountOfMoney(amountOfMoney);

		Customer customer = new Customer();
		customer.setLocale("en");

		Address billingAddress = new Address();
		billingAddress.setCountryCode("NL");
		customer.setBillingAddress(billingAddress);

		order.setCustomer(customer);
		body.setOrder(order);

		RedirectPaymentMethodSpecificInput paymentMethodSpecificInput = new RedirectPaymentMethodSpecificInput();
		paymentMethodSpecificInput.setReturnUrl("http://example.com/");
		paymentMethodSpecificInput.setPaymentProductId(809);

		RedirectPaymentProduct809SpecificInput paymentProductSpecificInput = new RedirectPaymentProduct809SpecificInput();
		paymentProductSpecificInput.setIssuerId("INGBNL2A");
		paymentMethodSpecificInput.setPaymentProduct809SpecificInput(paymentProductSpecificInput);

		body.setRedirectPaymentMethodSpecificInput(paymentMethodSpecificInput);

		String idempotenceKey = UUID.randomUUID().toString();
		CallContext context = new CallContext().withIdempotenceKey(idempotenceKey);

		Client client = getClient();
		try {
			CreatePaymentResponse response = client.merchant("20000").payments().create(body, context);
			String paymentId = response.getPayment().getId();

			Assert.assertEquals(idempotenceKey, context.getIdempotenceKey());
			Assert.assertNull(context.getIdempotenceRequestTimestamp());

			response = client.merchant("20000").payments().create(body, context);

			Assert.assertEquals(paymentId, response.getPayment().getId());

			Assert.assertEquals(idempotenceKey, context.getIdempotenceKey());
			Assert.assertNotNull(context.getIdempotenceRequestTimestamp());

		} finally {
			client.close();
		}
	}
}
