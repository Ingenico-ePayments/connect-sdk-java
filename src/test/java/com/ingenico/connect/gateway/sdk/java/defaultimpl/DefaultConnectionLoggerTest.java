package com.ingenico.connect.gateway.sdk.java.defaultimpl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.localserver.LocalServerTestBase;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import com.ingenico.connect.gateway.sdk.java.Authenticator;
import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicationException;
import com.ingenico.connect.gateway.sdk.java.Communicator;
import com.ingenico.connect.gateway.sdk.java.Connection;
import com.ingenico.connect.gateway.sdk.java.DeclinedPaymentException;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.GlobalCollectException;
import com.ingenico.connect.gateway.sdk.java.MetaDataProvider;
import com.ingenico.connect.gateway.sdk.java.NotFoundException;
import com.ingenico.connect.gateway.sdk.java.Session;
import com.ingenico.connect.gateway.sdk.java.ValidationException;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Address;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.AmountOfMoney;
import com.ingenico.connect.gateway.sdk.java.domain.definitions.Card;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CreatePaymentRequest;
import com.ingenico.connect.gateway.sdk.java.domain.payment.CreatePaymentResponse;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.CardPaymentMethodSpecificInput;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Customer;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Order;
import com.ingenico.connect.gateway.sdk.java.domain.services.ConvertAmount;
import com.ingenico.connect.gateway.sdk.java.domain.services.TestConnection;
import com.ingenico.connect.gateway.sdk.java.logging.CommunicatorLogger;
import com.ingenico.connect.gateway.sdk.java.merchant.services.ConvertAmountParams;

@RunWith(MockitoJUnitRunner.class)
public class DefaultConnectionLoggerTest extends LocalServerTestBase {

	@Mock HttpRequestHandler requestHandler;

	@Test
	public void testLoggingTestConnection() throws Exception {
		// GET with no query params

		serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
		HttpHost host = start();

		Client client = createClient(host);
		TestLogger logger = new TestLogger();
		client.enableLogging(logger);

		setupRequestHandler(setOKJsonResponse("testConnection.json"));

		try {
			TestConnection response = client.merchant("1234").services().testconnection();

			Assert.assertNotNull(response);
			Assert.assertEquals("OK", response.getResult());

		} finally {
			client.close();
		}

		Assert.assertEquals(2, logger.entries.size());

		TestLoggerEntry requestEntry = logger.entries.get(0);

		Assert.assertNotNull(requestEntry.message);
		Assert.assertNull(requestEntry.thrown);

		TestLoggerEntry responseEntry = logger.entries.get(1);

		Assert.assertNotNull(responseEntry.message);
		Assert.assertNull(responseEntry.thrown);

		assertRequestAndResponse(requestEntry.message, responseEntry.message, "testConnection");
	}

	@Test
	public void testLoggingConvertAmount() throws Exception {
		// GET with query params

		serverBootstrap.registerHandler("/v1/1234/services/convert/amount", requestHandler);
		HttpHost host = start();

		Client client = createClient(host);
		TestLogger logger = new TestLogger();
		client.enableLogging(logger);

		setupRequestHandler(setOKJsonResponse("convertAmount.json"));

		try {
			ConvertAmountParams query = new ConvertAmountParams();
			query.setAmount(1000L);
			query.setSource("EUR");
			query.setTarget("USD");
			ConvertAmount response = client.merchant("1234").services().convertAmount(query);

			Assert.assertNotNull(response);
			Assert.assertNotNull(response.getConvertedAmount());

		} finally {
			client.close();
		}

		Assert.assertEquals(2, logger.entries.size());

		TestLoggerEntry requestEntry = logger.entries.get(0);

		Assert.assertNotNull(requestEntry.message);
		Assert.assertNull(requestEntry.thrown);

		TestLoggerEntry responseEntry = logger.entries.get(1);

		Assert.assertNotNull(responseEntry.message);
		Assert.assertNull(responseEntry.thrown);

		assertRequestAndResponse(requestEntry.message, responseEntry.message, "convertAmount");
	}

	@Test
	public void testDeleteToken() throws Exception {
		// POST with no request body and a void response

		serverBootstrap.registerHandler("/v1/1234/tokens/5678", requestHandler);
		HttpHost host = start();

		Client client = createClient(host);
		TestLogger logger = new TestLogger();
		client.enableLogging(logger);

		setupRequestHandler(setVoidResponse());

		try {
			client.merchant("1234").tokens().delete("5678", null);

		} finally {
			client.close();
		}

		Assert.assertEquals(2, logger.entries.size());

		TestLoggerEntry requestEntry = logger.entries.get(0);

		Assert.assertNotNull(requestEntry.message);
		Assert.assertNull(requestEntry.thrown);

		TestLoggerEntry responseEntry = logger.entries.get(1);

		Assert.assertNotNull(responseEntry.message);
		Assert.assertNull(responseEntry.thrown);

		assertRequestAndResponse(requestEntry.message, responseEntry.message, "deleteToken");
	}

	@Test
	public void testCreatePayment() throws Exception {
		// POST with a success (201) response

		serverBootstrap.registerHandler("/v1/1234/payments", requestHandler);
		HttpHost host = start();

		Client client = createClient(host);
		TestLogger logger = new TestLogger();
		client.enableLogging(logger);

		setupRequestHandler(setCreatedJsonResponse("createPayment.json", "http://localhost/v1/1234/payments/000000123410000595980000100001"));

		try {
			AmountOfMoney amountOfMoney = new AmountOfMoney();
			amountOfMoney.setCurrencyCode("CAD");
			amountOfMoney.setAmount(2345L);

			Address billingAddress = new Address();
			billingAddress.setCountryCode("CA");

			Customer customer = new Customer();
			customer.setBillingAddress(billingAddress);

			Order order = new Order();
			order.setAmountOfMoney(amountOfMoney);
			order.setCustomer(customer);

			Card card = new Card();
			card.setCvv("123");
			card.setCardNumber("1234567890123456");
			card.setExpiryDate("1220");

			CardPaymentMethodSpecificInput paymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
			paymentMethodSpecificInput.setPaymentProductId(1);
			paymentMethodSpecificInput.setCard(card);

			CreatePaymentRequest request = new CreatePaymentRequest();
			request.setOrder(order);
			request.setCardPaymentMethodSpecificInput(paymentMethodSpecificInput);

			CreatePaymentResponse response = client.merchant("1234").payments().create(request);

			Assert.assertNotNull(response);
			Assert.assertNotNull(response.getPayment());
			Assert.assertNotNull(response.getPayment().getId());

		} finally {
			client.close();
		}

		Assert.assertEquals(2, logger.entries.size());

		TestLoggerEntry requestEntry = logger.entries.get(0);

		Assert.assertNotNull(requestEntry.message);
		Assert.assertNull(requestEntry.thrown);

		TestLoggerEntry responseEntry = logger.entries.get(1);

		Assert.assertNotNull(responseEntry.message);
		Assert.assertNull(responseEntry.thrown);

		assertRequestAndResponse(requestEntry.message, responseEntry.message, "createPayment");
	}

	@Test
	public void testCreatePaymentInvalidCardNumber() throws Exception {
		// an exception is thrown after logging the response

		serverBootstrap.registerHandler("/v1/1234/payments", requestHandler);
		HttpHost host = start();

		Client client = createClient(host);
		TestLogger logger = new TestLogger();
		client.enableLogging(logger);

		setupRequestHandler(setJsonResponse("createPayment.failure.invalidCardNumber.json", 400));

		try {
			AmountOfMoney amountOfMoney = new AmountOfMoney();
			amountOfMoney.setCurrencyCode("CAD");
			amountOfMoney.setAmount(2345L);

			Address billingAddress = new Address();
			billingAddress.setCountryCode("CA");

			Customer customer = new Customer();
			customer.setBillingAddress(billingAddress);

			Order order = new Order();
			order.setAmountOfMoney(amountOfMoney);
			order.setCustomer(customer);

			Card card = new Card();
			card.setCvv("123");
			card.setCardNumber("1234567890123456");
			card.setExpiryDate("1220");

			CardPaymentMethodSpecificInput paymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
			paymentMethodSpecificInput.setPaymentProductId(1);
			paymentMethodSpecificInput.setCard(card);

			CreatePaymentRequest request = new CreatePaymentRequest();
			request.setOrder(order);
			request.setCardPaymentMethodSpecificInput(paymentMethodSpecificInput);

			client.merchant("1234").payments().create(request);

			Assert.fail("expected ValidationException");

		} catch (@SuppressWarnings("unused") ValidationException e) {

			// expected

		} finally {
			client.close();
		}

		Assert.assertEquals(2, logger.entries.size());

		TestLoggerEntry requestEntry = logger.entries.get(0);

		Assert.assertNotNull(requestEntry.message);
		Assert.assertNull(requestEntry.thrown);

		TestLoggerEntry responseEntry = logger.entries.get(1);

		Assert.assertNotNull(responseEntry.message);
		Assert.assertNull(responseEntry.thrown);

		assertRequestAndResponse(requestEntry.message, responseEntry.message, "createPayment.failure.invalidCardNumber");
	}

	@Test
	public void testCreatePaymentRejected() throws Exception {
		// an exception is thrown after logging the response

		serverBootstrap.registerHandler("/v1/1234/payments", requestHandler);
		HttpHost host = start();

		Client client = createClient(host);
		TestLogger logger = new TestLogger();
		client.enableLogging(logger);

		setupRequestHandler(setJsonResponse("createPayment.failure.rejected.json", 402));

		try {
			AmountOfMoney amountOfMoney = new AmountOfMoney();
			amountOfMoney.setCurrencyCode("CAD");
			amountOfMoney.setAmount(2345L);

			Address billingAddress = new Address();
			billingAddress.setCountryCode("CA");

			Customer customer = new Customer();
			customer.setBillingAddress(billingAddress);

			Order order = new Order();
			order.setAmountOfMoney(amountOfMoney);
			order.setCustomer(customer);

			Card card = new Card();
			card.setCvv("123");
			card.setCardNumber("1234567890123452");
			card.setExpiryDate("1220");

			CardPaymentMethodSpecificInput paymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
			paymentMethodSpecificInput.setPaymentProductId(1);
			paymentMethodSpecificInput.setCard(card);

			CreatePaymentRequest request = new CreatePaymentRequest();
			request.setOrder(order);
			request.setCardPaymentMethodSpecificInput(paymentMethodSpecificInput);

			client.merchant("1234").payments().create(request);

			Assert.fail("expected DeclinedPaymentException");

		} catch (DeclinedPaymentException e) {

			// expected

			Assert.assertNotNull(e.getCreatePaymentResult());
			Assert.assertNotNull(e.getCreatePaymentResult().getPayment());
			Assert.assertNotNull(e.getCreatePaymentResult().getPayment().getId());

		} finally {
			client.close();
		}

		Assert.assertEquals(2, logger.entries.size());

		TestLoggerEntry requestEntry = logger.entries.get(0);

		Assert.assertNotNull(requestEntry.message);
		Assert.assertNull(requestEntry.thrown);

		TestLoggerEntry responseEntry = logger.entries.get(1);

		Assert.assertNotNull(responseEntry.message);
		Assert.assertNull(responseEntry.thrown);

		assertRequestAndResponse(requestEntry.message, responseEntry.message, "createPayment.failure.rejected");
	}

	@Test
	public void testLoggingUnknownServerError() throws Exception {
		// an exception is thrown after logging the response

		serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
		HttpHost host = start();

		Client client = createClient(host);
		TestLogger logger = new TestLogger();
		client.enableLogging(logger);

		setupRequestHandler(setJsonResponse("unknownServerError.json", 500));

		try {
			client.merchant("1234").services().testconnection();

			Assert.fail("expected GlobalCollectException");

		} catch (@SuppressWarnings("unused") GlobalCollectException e) {

			// expected

		} finally {
			client.close();
		}

		Assert.assertEquals(2, logger.entries.size());

		TestLoggerEntry requestEntry = logger.entries.get(0);

		Assert.assertNotNull(requestEntry.message);
		Assert.assertNull(requestEntry.thrown);

		TestLoggerEntry responseEntry = logger.entries.get(1);

		Assert.assertNotNull(responseEntry.message);
		Assert.assertNull(responseEntry.thrown);

		assertRequestAndResponse(requestEntry.message, responseEntry.message, "testConnection", "unknownServerError");
	}

	@Test
	public void testNonJson() throws Exception {
		// an exception is thrown after logging the response

		serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
		HttpHost host = start();

		Client client = createClient(host);
		TestLogger logger = new TestLogger();
		client.enableLogging(logger);

		setupRequestHandler(setHtmlResponse("notFound.html", 404));

		try {
			client.merchant("1234").services().testconnection();

			Assert.fail("expected NotFoundException");

		} catch (@SuppressWarnings("unused") NotFoundException e) {

			// expected

		} finally {
			client.close();
		}

		Assert.assertEquals(2, logger.entries.size());

		TestLoggerEntry requestEntry = logger.entries.get(0);

		Assert.assertNotNull(requestEntry.message);
		Assert.assertNull(requestEntry.thrown);

		TestLoggerEntry responseEntry = logger.entries.get(1);

		Assert.assertNotNull(responseEntry.message);
		Assert.assertNull(responseEntry.thrown);

		assertRequestAndResponse(requestEntry.message, responseEntry.message, "testConnection", "notFound");
	}

	@Test
	public void testReadTimeout() throws Exception {
		// an exception is thrown before logging the response

		serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
		HttpHost host = start();

		Client client = createClient(host, 1000, 10);
		TestLogger logger = new TestLogger();
		client.enableLogging(logger);

		setupRequestHandler(delayedAnswer(setHtmlResponse("notFound.html", 404), 100));

		try {
			client.merchant("1234").services().testconnection();

			Assert.fail("expected CommunicationException");

		} catch (@SuppressWarnings("unused") CommunicationException e) {

			// expected

		} finally {
			client.close();
		}

		Assert.assertEquals(2, logger.entries.size());

		TestLoggerEntry requestEntry = logger.entries.get(0);

		Assert.assertNotNull(requestEntry.message);
		Assert.assertNull(requestEntry.thrown);

		TestLoggerEntry errorEntry = logger.entries.get(1);

		Assert.assertNotNull(errorEntry.message);
		Assert.assertNotNull(errorEntry.thrown);

		assertRequestAndError(requestEntry.message, errorEntry.message, "testConnection");

		Assert.assertEquals(SocketTimeoutException.class, errorEntry.thrown.getClass());
	}

	@Test
	public void testLogRequestOnly() throws Exception {
		// logging is disabled after the request is logged but before the response is logged

		serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
		HttpHost host = start();

		Client client = createClient(host);
		TestLogger logger = new TestLogger();
		client.enableLogging(logger);

		setupRequestHandler(disableLogging(setOKJsonResponse("testConnection.json"), client));

		try {
			TestConnection response = client.merchant("1234").services().testconnection();

			Assert.assertNotNull(response);
			Assert.assertEquals("OK", response.getResult());

		} finally {
			client.close();
		}

		Assert.assertEquals(1, logger.entries.size());

		TestLoggerEntry requestEntry = logger.entries.get(0);

		Assert.assertNotNull(requestEntry.message);
		Assert.assertNull(requestEntry.thrown);

		assertRequest(requestEntry.message, "testConnection");
	}

	@Test
	public void testLogResponseOnly() throws Exception {
		// logging is enabled after the request is logged but before the response is logged

		serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
		HttpHost host = start();

		Client client = createClient(host);
		TestLogger logger = new TestLogger();

		setupRequestHandler(enableLogging(setOKJsonResponse("testConnection.json"), client, logger));

		try {
			TestConnection response = client.merchant("1234").services().testconnection();

			Assert.assertNotNull(response);
			Assert.assertEquals("OK", response.getResult());

		} finally {
			client.close();
		}

		Assert.assertEquals(1, logger.entries.size());

		TestLoggerEntry responseEntry = logger.entries.get(0);

		Assert.assertNotNull(responseEntry.message);
		Assert.assertNull(responseEntry.thrown);

		assertResponse(responseEntry.message, "testConnection");
	}

	@Test
	public void testLogErrorOnly() throws Exception {
		// logging is enabled after the request is logged but before the error is logged

		serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
		HttpHost host = start();

		Client client = createClient(host, 1000, 100);
		TestLogger logger = new TestLogger();

		setupRequestHandler(enableLogging(delayedAnswer(setHtmlResponse("notFound.html", 404), 200), client, logger));

		try {
			client.merchant("1234").services().testconnection();

			Assert.fail("expected CommunicationException");

		} catch (@SuppressWarnings("unused") CommunicationException e) {

			// expected

		} finally {
			client.close();
		}

		Assert.assertEquals(1, logger.entries.size());

		TestLoggerEntry errorEntry = logger.entries.get(0);

		Assert.assertNotNull(errorEntry.message);
		Assert.assertNotNull(errorEntry.thrown);

		assertError(errorEntry.message);

		Assert.assertEquals(SocketTimeoutException.class, errorEntry.thrown.getClass());
	}

	// assertion utility methods

	private String assertRequestAndResponse(String requestMessage, String responseMessage, String resourcePrefix) throws IOException {
		return assertRequestAndResponse(requestMessage, responseMessage, resourcePrefix, resourcePrefix);
	}

	private String assertRequestAndResponse(String requestMessage, String responseMessage, String requestResourcePrefix, String responseResourcePrefix) throws IOException {

		String requestId = assertRequest(requestMessage, requestResourcePrefix);
		requestId = assertResponse(responseMessage, responseResourcePrefix, requestId);
		return requestId;
	}

	private String assertRequestAndError(String requestMessage, String errorMessage, String resourcePrefix) throws IOException {

		String requestId = assertRequest(requestMessage, resourcePrefix);
		requestId = assertError(errorMessage, requestId);
		return requestId;
	}

	private String assertRequest(String requestMessage, String resourcePrefix) throws IOException {

		final String requestResource = resourcePrefix + ".request";

		Pattern requestPattern = Pattern.compile(normalizeLineBreaks(readResource(requestResource)), Pattern.DOTALL);

		Matcher requestMatcher = requestPattern.matcher(normalizeLineBreaks(requestMessage));
		Assert.assertTrue("request message '" + requestMessage + "' does not match pattern " + requestPattern, requestMatcher.matches());

		String requestId = requestMatcher.group(1);

		return requestId;
	}

	private String assertResponse(String responseMessage, String resourcePrefix) throws IOException {
		return assertResponse(responseMessage, resourcePrefix, null);
	}

	private String assertResponse(String responseMessage, String resourcePrefix, String requestId) throws IOException {

		final String responseResource = resourcePrefix + ".response";
		Pattern responsePattern = Pattern.compile(normalizeLineBreaks(readResource(responseResource)), Pattern.DOTALL);

		Matcher responseMatcher = responsePattern.matcher(normalizeLineBreaks(responseMessage));
		Assert.assertTrue("response message '" + responseMessage + "' does not match pattern " + responsePattern, responseMatcher.matches());

		String responseRequestId = responseMatcher.group(1);
		if (requestId != null) {
			Assert.assertEquals("response requestId '" + responseRequestId + "' does not match request requestId '" + requestId + "'",
					requestId, responseRequestId);
		} else {
			requestId = responseRequestId;
		}

		return requestId;
	}

	private String assertError(String errorMessage) throws IOException {
		return assertError(errorMessage, null);
	}

	private String assertError(String errorMessage, String requestId) throws IOException {

		final String errorResource = "generic.error";
		Pattern errorPattern = Pattern.compile(normalizeLineBreaks(readResource(errorResource)), Pattern.DOTALL);

		Matcher errorMatcher = errorPattern.matcher(normalizeLineBreaks(errorMessage));
		Assert.assertTrue("error message '" + errorMessage + "' does not match pattern " + errorPattern, errorMatcher.matches());

		String errorRequestId = errorMatcher.group(1);
		if (requestId != null) {
			Assert.assertEquals("error requestId '" + errorRequestId + "' does not match earlier requestId '" + requestId + "'",
					requestId, errorRequestId);
		} else {
			requestId = errorRequestId;
		}

		return requestId;
	}

	// Mockito answer utility methods

	private void setupRequestHandler(Answer<Void> answer) throws IOException, HttpException {
		Mockito.doAnswer(answer)
				.when(requestHandler).handle(Matchers.<HttpRequest>any(), Matchers.<HttpResponse>any(), Matchers.<HttpContext>any());
	}

	private Answer<Void> setVoidResponse() {
		return setVoidResponse(Collections.<String, String>emptyMap());
	}

	private Answer<Void> setVoidResponse(final Map<String, String> additionalHeaders) {
		return new Answer<Void>() {
			@Override
			public Void answer(InvocationOnMock invocation) throws Throwable {
				HttpResponse response = invocation.getArgumentAt(1, HttpResponse.class);

				response.setStatusCode(204);

				response.setHeader("Dummy", null);

				for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
					response.setHeader(entry.getKey(), entry.getValue());
				}

				return null;
			}
		};
	}

	private Answer<Void> setOKJsonResponse(final String resource) {
		return setJsonResponse(resource, 200, Collections.<String, String>emptyMap());
	}

	private Answer<Void> setCreatedJsonResponse(final String resource, final String location) {
		return setJsonResponse(resource, 201, Collections.singletonMap("Location", location));
	}

	private Answer<Void> setJsonResponse(final String resource, final int statusCode) {
		return setJsonResponse(resource, statusCode, Collections.<String, String>emptyMap());
	}

	private Answer<Void> setJsonResponse(final String resource, final int statusCode, final Map<String, String> additionalHeaders) {
		return new Answer<Void>() {
			@Override
			public Void answer(InvocationOnMock invocation) throws Throwable {
				HttpResponse response = invocation.getArgumentAt(1, HttpResponse.class);

				response.setStatusCode(statusCode);
				response.setHeader("Content-Type", "application/json");

				response.setHeader("Dummy", null);

				for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
					response.setHeader(entry.getKey(), entry.getValue());
				}

				response.setEntity(new InputStreamEntity(DefaultConnectionLoggerTest.class.getResourceAsStream(resource)));

				return null;
			}
		};
	}

	private Answer<Void> setHtmlResponse(final String resource, final int statusCode) {
		return setHtmlResponse(resource, statusCode, Collections.<String, String>emptyMap());
	}

	private Answer<Void> setHtmlResponse(final String resource, final int statusCode, final Map<String, String> additionalHeaders) {
		return new Answer<Void>() {
			@Override
			public Void answer(InvocationOnMock invocation) throws Throwable {
				HttpResponse response = invocation.getArgumentAt(1, HttpResponse.class);

				response.setStatusCode(statusCode);
				response.setHeader("Content-Type", "text/html");

				response.setHeader("Dummy", null);

				for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
					response.setHeader(entry.getKey(), entry.getValue());
				}

				response.setEntity(new InputStreamEntity(DefaultConnectionLoggerTest.class.getResourceAsStream(resource)));

				return null;
			}
		};
	}

	private <T> Answer<T> delayedAnswer(final Answer<? extends T> answer, final int delay) {
		return new Answer<T>() {
			@Override
			public T answer(InvocationOnMock invocation) throws Throwable {
				Thread.sleep(delay);
				return answer.answer(invocation);
			}
		};
	}

	private <T> Answer<T> enableLogging(final Answer<? extends T> answer, final Client client, final CommunicatorLogger communicatorLogger) {
		return new Answer<T>() {
			@Override
			public T answer(InvocationOnMock invocation) throws Throwable {
				client.enableLogging(communicatorLogger);
				return answer.answer(invocation);
			}
		};
	}

	private <T> Answer<T> disableLogging(final Answer<? extends T> answer, final Client client) {
		return new Answer<T>() {
			@Override
			public T answer(InvocationOnMock invocation) throws Throwable {
				client.disableLogging();
				return answer.answer(invocation);
			}
		};
	}

	// general utility methods

	private Client createClient(HttpHost host) throws URISyntaxException {
		return createClient(host, 1000, 1000);
	}

	@SuppressWarnings("resource")
	private Client createClient(HttpHost host, int connectTimeout, int socketTimeout) throws URISyntaxException {

		URI uri = new URI(host.getSchemeName(), null, host.getHostName(), host.getPort(), null, null, null);

		Connection connection = new DefaultConnection(connectTimeout, socketTimeout);
		Authenticator authenticator = new DefaultAuthenticator(AuthorizationType.V1HMAC, "apiKey", "secret");
		MetaDataProvider metaDataProvider = new MetaDataProvider("Ingenico");
		Session session = new Session(uri, connection, authenticator, metaDataProvider);
		Communicator communicator = Factory.createCommunicator(session);
		Client client = Factory.createClient(communicator);
		return client;
	}

	private String readResource(String resource) throws IOException {

		StringBuilder result = new StringBuilder();
		Reader reader = new InputStreamReader(getClass().getResourceAsStream(resource), "UTF-8");
		try {
			char[] buffer = new char[4096];
			int len;
			while ((len = reader.read(buffer)) != -1) {
				result.append(buffer, 0, len);
			}
		} finally {
			reader.close();
		}
		return result.toString();
	}

	private String normalizeLineBreaks(String value) {
		// Normalize line breaks to always use the same, regardless of the operating system
		// See https://github.com/Ingenico-ePayments/connect-sdk-java/issues/3
		return value.replace("\r", "");
	}

	private static final class TestLogger implements CommunicatorLogger {

		private List<TestLoggerEntry> entries = new ArrayList<DefaultConnectionLoggerTest.TestLoggerEntry>();

		@Override
		public void log(String message) {
			log(message, null);
		}

		@Override
		public void log(String message, Throwable thrown) {
			entries.add(new TestLoggerEntry(message, thrown));
		}
	}

	private static final class TestLoggerEntry {

		private final String message;
		private final Throwable thrown;

		TestLoggerEntry(String message, Throwable thrown) {
			this.message = message;
			this.thrown = thrown;
		}
	}
}
