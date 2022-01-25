package com.ingenico.connect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.CallContext;
import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.DeclinedPaymentException;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CreatePaymentRequest;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CreatePaymentResult;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Customer;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Order;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RedirectPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RedirectPaymentProduct809SpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RedirectionData;

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

		RedirectionData redirectionData = new RedirectionData();
		redirectionData.setReturnUrl("http://example.com/");

		RedirectPaymentMethodSpecificInput paymentMethodSpecificInput = new RedirectPaymentMethodSpecificInput();
		paymentMethodSpecificInput.setRedirectionData(redirectionData);
		paymentMethodSpecificInput.setPaymentProductId(809);

		RedirectPaymentProduct809SpecificInput paymentProductSpecificInput = new RedirectPaymentProduct809SpecificInput();
		paymentProductSpecificInput.setIssuerId("INGBNL2A");
		paymentMethodSpecificInput.setPaymentProduct809SpecificInput(paymentProductSpecificInput);

		body.setRedirectPaymentMethodSpecificInput(paymentMethodSpecificInput);

		String idempotenceKey = UUID.randomUUID().toString();
		CallContext context = new CallContext().withIdempotenceKey(idempotenceKey);

		Client client = getClient();
		try {
			CreatePaymentResult result = doCreatePayment(client, body, context);
			String paymentId = result.getPayment().getId();
			String status = result.getPayment().getStatus();

			Assert.assertEquals(idempotenceKey, context.getIdempotenceKey());
			Assert.assertNull(context.getIdempotenceRequestTimestamp());

			result = doCreatePayment(client, body, context);

			Assert.assertEquals(paymentId, result.getPayment().getId());
			Assert.assertEquals(status, result.getPayment().getStatus());

			Assert.assertEquals(idempotenceKey, context.getIdempotenceKey());
			Assert.assertNotNull(context.getIdempotenceRequestTimestamp());

		} finally {
			client.close();
		}
	}

	private CreatePaymentResult doCreatePayment(Client client, CreatePaymentRequest body, CallContext context) {
		// For this test it doesn't matter if the response is successful or declined,
		// as long as idempotence is handled correctly
		try {
			return client.merchant(getMerchantId()).payments().create(body, context);
		} catch (DeclinedPaymentException e) {
			return e.getCreatePaymentResult();
		}
	}
}
