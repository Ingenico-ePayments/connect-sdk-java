package com.globalcollect.gateway.sdk.java.gc.merchant.payments;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import com.globalcollect.gateway.sdk.java.CallContext;
import com.globalcollect.gateway.sdk.java.GcApiException;
import com.globalcollect.gateway.sdk.java.GcCommunicationException;
import com.globalcollect.gateway.sdk.java.GcConnection;
import com.globalcollect.gateway.sdk.java.GcDeclinedPaymentException;
import com.globalcollect.gateway.sdk.java.GcFactory;
import com.globalcollect.gateway.sdk.java.GcIdempotenceException;
import com.globalcollect.gateway.sdk.java.GcNotFoundException;
import com.globalcollect.gateway.sdk.java.GcReferenceException;
import com.globalcollect.gateway.sdk.java.GcResponse;
import com.globalcollect.gateway.sdk.java.GcResponseException;
import com.globalcollect.gateway.sdk.java.GcSession;
import com.globalcollect.gateway.sdk.java.GcValidationException;
import com.globalcollect.gateway.sdk.java.RequestHeader;
import com.globalcollect.gateway.sdk.java.ResponseHeader;
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
		URI apiEndpoint = URI.create("http://localhost");
		session = new DefaultGcSession(apiEndpoint, connection, new DefaultGcAuthenticator(AuthorizationType.V1HMAC, "test", "test"), new DefaultGcMetaDataProvider());
	}

	/**
	 * Tests that a non-failure response will not throw an exception.
	 */
	@Test
	@SuppressWarnings("resource")
	public void testCreateSuccess() {

		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("pending_approval.json");
		whenPost().thenReturn(new GcResponse(201, responseBody, null));

		CreatePaymentRequest body = createRequest();

		CreatePaymentResponse response = client.merchant("merchantId").payments().create(body);
		Assert.assertEquals("000002000020142549460000100001", response.getPayment().getId());
		Assert.assertEquals("PENDING_APPROVAL", response.getPayment().getStatus());
	}

	/**
	 * Tests that a failure response with a payment result will throw a {@link GcDeclinedPaymentException}.
	 */
	@Test
	@SuppressWarnings("resource")
	public void testCreateRejected() {

		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("rejected.json");
		whenPost().thenReturn(new GcResponse(400, responseBody, null));

		CreatePaymentRequest body = createRequest();

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
	@SuppressWarnings("resource")
	public void testCreateInvalidRequest() {

		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("invalid_request.json");
		whenPost().thenReturn(new GcResponse(400, responseBody, null));

		CreatePaymentRequest body = createRequest();

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
	@SuppressWarnings("resource")
	public void testCreateInvalidAuthorization() {

		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("invalid_authorization.json");
		whenPost().thenReturn(new GcResponse(401, responseBody, null));

		CreatePaymentRequest body = createRequest();

		try {
			client.merchant("merchantId").payments().create(body);
			Assert.fail("Expected GcApiException");
		} catch (GcApiException e) {
			Assert.assertTrue(e.toString().contains(responseBody));
		}
	}

	/**
	 * Tests that a 409 failure response with a duplicate request code but without an idempotence key will throw a
	 * {@link GcReferenceException}.
	 */
	@Test
	@SuppressWarnings("resource")
	public void testCreateReferenceError() {

		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("duplicate_request.json");
		whenPost().thenReturn(new GcResponse(409, responseBody, null));

		CreatePaymentRequest body = createRequest();

		try {
			client.merchant("merchantId").payments().create(body);
			Assert.fail("Expected GcApiException");
		} catch (GcReferenceException e) {
			Assert.assertTrue(e.toString().contains(responseBody));
		}
	}

	/**
	 * Tests that a 409 failure response with a duplicate request code and an idempotence key will throw a {@link GcReferenceException}.
	 */
	@Test
	@SuppressWarnings("resource")
	public void testCreateIdempotenceError() {

		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("duplicate_request.json");
		whenPost().thenReturn(new GcResponse(409, responseBody, null));

		CreatePaymentRequest body = createRequest();

		CallContext context = new CallContext().withIdempotenceKey("key");

		try {
			client.merchant("merchantId").payments().create(body, context);
			Assert.fail("Expected GcApiException");
		} catch (GcIdempotenceException e) {
			Assert.assertTrue(e.toString().contains(responseBody));
			Assert.assertEquals(context.getIdempotenceKey(), e.getIdempotenceKey());
		}
	}

	/**
	 * Tests that a 404 response with a non-JSON response will throw a {@link GcNotFoundException}.
	 */
	@Test
	@SuppressWarnings("resource")
	public void testCreateNotFound() {

		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("not_found.html");
		whenPost().thenReturn(new GcResponse(404, responseBody, Arrays.asList(
				new ResponseHeader("content-type", "text/html")
		)));

		CreatePaymentRequest body = createRequest();

		try {
			client.merchant("merchantId").payments().create(body);
			Assert.fail("Expected GcNotFoundException");
		} catch (GcNotFoundException e) {
			Assert.assertNotNull(e.getCause());
			Assert.assertEquals(GcResponseException.class, e.getCause().getClass());
			Assert.assertTrue(e.getCause().toString().contains(responseBody));
		}
	}

	/**
	 * Tests that a 405 response with a non-JSON response will throw a {@link GcCommunicationException}.
	 */
	@Test
	@SuppressWarnings("resource")
	public void testCreateMethodNotAllowed() {

		GcClient client = GcFactory.createClient(session);
		String responseBody = getResource("method_not_allowed.html");
		whenPost().thenReturn(new GcResponse(405, responseBody, Arrays.asList(
				new ResponseHeader("content-type", "text/html")
		)));

		CreatePaymentRequest body = createRequest();

		try {
			client.merchant("merchantId").payments().create(body);
			Assert.fail("Expected GcCommunicationException");
		} catch (GcCommunicationException e) {
			Assert.assertNotNull(e.getCause());
			Assert.assertEquals(GcResponseException.class, e.getCause().getClass());
			Assert.assertTrue(e.getCause().toString().contains(responseBody));
		}
	}

	private OngoingStubbing<GcResponse> whenPost() {
		return Mockito.when(connection.post(Mockito.<URI>any(), Mockito.<List<RequestHeader>>any(), Mockito.anyString()));
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

	private CreatePaymentRequest createRequest() {

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

		return body;
	}
}
