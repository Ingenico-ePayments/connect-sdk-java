package com.globalcollect.gateway.sdk.java.gc.merchant.payments;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URI;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcConnection;
import com.globalcollect.gateway.sdk.java.GcDeclinedPaymentException;
import com.globalcollect.gateway.sdk.java.GcFactory;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcSession;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.RequestHeader;
import com.globalcollect.gateway.sdk.java.RequestParam;
import com.globalcollect.gateway.sdk.java.defaultimpl.AuthorizationType;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcAuthenticator;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcMetaDataProvider;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcSession;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Address;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AmountOfMoney;
import com.globalcollect.gateway.sdk.java.gc.fei.definitions.Card;
import com.globalcollect.gateway.sdk.java.gc.payment.CreatePaymentRequest;
import com.globalcollect.gateway.sdk.java.gc.payment.CreatePaymentResponse;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.CardPaymentMethodSpecificInput;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Customer;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Order;

@RunWith(MockitoJUnitRunner.class)
public class PaymentsClientTest {

	private GcSession session;
	
	@Mock private GcConnection connection;
	
	@Before
	public void initializeSession() {
		session = new DefaultGcSession(connection, new DefaultGcAuthenticator(AuthorizationType.V1HMAC, "test", "test"), new DefaultGcMetaDataProvider());
		
		Mockito.when(connection.toURI(Mockito.anyString(), Mockito.<List<RequestParam>>any())).then(new Answer<URI>() {
			@Override
			public URI answer(InvocationOnMock invocation) throws Throwable {
				return URI.create("http://localhost" + invocation.getArgumentAt(0, String.class));
			}
		});
	}
	
	/**
	 * Tests that a non-failure response will not throw an exception.
	 */
	@Test
	public void testCreateSuccess() {
		
		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("pending_approval.json");
		Mockito.when(connection.post(Mockito.anyString(), Mockito.<List<RequestHeader>>any(), Mockito.<List<RequestParam>>any(), Mockito.anyString()))
				.thenReturn(responseBody);
		
		CreatePaymentRequest body = new CreatePaymentRequest();
		
		Order order = new Order();
		
		AmountOfMoney amountOfMoney = new AmountOfMoney();
		amountOfMoney.setAmount(2345L);
		amountOfMoney.setCurrencyCode("CAD");
		order.setAmountOfMoney(amountOfMoney);
		
		Customer customer = new Customer();

		Address billingAddress = new Address();
		billingAddress.setCountryCode("CA");
		customer.setBillingAddress(billingAddress);
		
		order.setCustomer(customer);
		
		CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
		cardPaymentMethodSpecificInput.setPaymentProductId(1);
		
		Card card = new Card();
		card.setCvv("123");
		card.setCardNumber("4567350000427977");
		card.setExpiryDate("1220");
		cardPaymentMethodSpecificInput.setCard(card);
		
		body.setCardPaymentMethodSpecificInput(cardPaymentMethodSpecificInput);

		CreatePaymentResponse response = client.merchant("merchantId").payments().create(body);
		Assert.assertEquals("000002000020142549460000100001", response.getPayment().getId());
		Assert.assertEquals("PENDING_APPROVAL", response.getPayment().getStatus());
	}
	
	/**
	 * Tests that a failure response with a payment result will throw a {@link GcDeclinedPaymentException}.
	 */
	@Test
	public void testCreateRejected() {
		
		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("rejected.json");
		Mockito.when(connection.post(Mockito.anyString(), Mockito.<List<RequestHeader>>any(), Mockito.<List<RequestParam>>any(), Mockito.anyString()))
				.thenThrow(new GcResponseException(400, responseBody));
		
		CreatePaymentRequest body = new CreatePaymentRequest();
		
		Order order = new Order();
		
		AmountOfMoney amountOfMoney = new AmountOfMoney();
		amountOfMoney.setAmount(2345L);
		amountOfMoney.setCurrencyCode("CAD");
		order.setAmountOfMoney(amountOfMoney);
		
		Customer customer = new Customer();
	
		Address billingAddress = new Address();
		billingAddress.setCountryCode("CA");
		customer.setBillingAddress(billingAddress);
		
		order.setCustomer(customer);
		
		CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
		cardPaymentMethodSpecificInput.setPaymentProductId(1);
		
		Card card = new Card();
		card.setCvv("123");
		card.setCardNumber("4567350000427977");
		card.setExpiryDate("1220");
		cardPaymentMethodSpecificInput.setCard(card);
		
		body.setCardPaymentMethodSpecificInput(cardPaymentMethodSpecificInput);
		
		try {
			client.merchant("merchantId").payments().create(body);
			Assert.fail("Expected GcDeclinedPaymentException");
		} catch (GcDeclinedPaymentException e) {
			Assert.assertTrue(e.toString().contains("payment '000002000020142544360000100001'"));
			Assert.assertTrue(e.toString().contains("status 'REJECTED'"));
			Assert.assertTrue(e.toString().contains(responseBody));
			Assert.assertNotNull(e.getCreatePaymentResult());
			Assert.assertEquals("000002000020142544360000100001", e.getCreatePaymentResult().getPayment().getId());
			Assert.assertEquals("REJECTED", e.getCreatePaymentResult().getPayment().getStatus());
		}
	}

	/**
	 * Tests that a 400 failure response without a payment result will throw a {@link GcValidationException}.
	 */
	@Test
	public void testCreateInvalidRequest() {
		
		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("invalid_request.json");
		Mockito.when(connection.post(Mockito.anyString(), Mockito.<List<RequestHeader>>any(), Mockito.<List<RequestParam>>any(), Mockito.anyString()))
				.thenThrow(new GcResponseException(400, responseBody));
		
		CreatePaymentRequest body = new CreatePaymentRequest();
		
		Order order = new Order();
		
		AmountOfMoney amountOfMoney = new AmountOfMoney();
		amountOfMoney.setAmount(2345L);
		amountOfMoney.setCurrencyCode("CAD");
		order.setAmountOfMoney(amountOfMoney);
		
		Customer customer = new Customer();

		Address billingAddress = new Address();
		billingAddress.setCountryCode("CA");
		customer.setBillingAddress(billingAddress);
		
		order.setCustomer(customer);
		
		CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
		cardPaymentMethodSpecificInput.setPaymentProductId(1);
		
		Card card = new Card();
		card.setCvv("123");
		card.setCardNumber("4567350000427977");
		card.setExpiryDate("1210");
		cardPaymentMethodSpecificInput.setCard(card);
		
		body.setCardPaymentMethodSpecificInput(cardPaymentMethodSpecificInput);
		
		try {
			client.merchant("merchantId").payments().create(body);
			Assert.fail("Expected GcValidationException");
		} catch (GcValidationException e) {
			Assert.assertTrue(e.toString().contains(responseBody));
		}
	}

	/**
	 * Tests that a 401 failure response without a payment result will throw a {@link GcApiException}.
	 */
	@Test
	public void testCreateInvalidAuthorization() {
		
		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("invalid_authorization.json");
		Mockito.when(connection.post(Mockito.anyString(), Mockito.<List<RequestHeader>>any(), Mockito.<List<RequestParam>>any(), Mockito.anyString()))
				.thenThrow(new GcResponseException(401, responseBody));
		
		CreatePaymentRequest body = new CreatePaymentRequest();
		
		Order order = new Order();
		
		AmountOfMoney amountOfMoney = new AmountOfMoney();
		amountOfMoney.setAmount(2345L);
		amountOfMoney.setCurrencyCode("CAD");
		order.setAmountOfMoney(amountOfMoney);
		
		Customer customer = new Customer();

		Address billingAddress = new Address();
		billingAddress.setCountryCode("CA");
		customer.setBillingAddress(billingAddress);
		
		order.setCustomer(customer);
		
		CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
		cardPaymentMethodSpecificInput.setPaymentProductId(1);
		
		Card card = new Card();
		card.setCvv("123");
		card.setCardNumber("4567350000427977");
		card.setExpiryDate("1210");
		cardPaymentMethodSpecificInput.setCard(card);
		
		body.setCardPaymentMethodSpecificInput(cardPaymentMethodSpecificInput);
		
		try {
			client.merchant("merchantId").payments().create(body);
			Assert.fail("Expected GcApiException");
		} catch (GcApiException e) {
			Assert.assertTrue(e.toString().contains(responseBody));
		}
	}
	
	private String getResource(String resource) {
		StringWriter sw = new StringWriter();
		try {
			Reader reader = new InputStreamReader(getClass().getResourceAsStream(resource));
			try {
				char[] buffer = new char[1024];
				int len;
				while ((len = reader.read(buffer)) != -1) {
					sw.write(buffer, 0, len);
				}
			} finally {
				reader.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return sw.toString();
	}
}
