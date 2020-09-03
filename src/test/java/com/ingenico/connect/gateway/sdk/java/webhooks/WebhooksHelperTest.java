package com.ingenico.connect.gateway.sdk.java.webhooks;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import com.ingenico.connect.gateway.sdk.java.Connection;
import com.ingenico.connect.gateway.sdk.java.Marshaller;
import com.ingenico.connect.gateway.sdk.java.RequestHeader;
import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultMarshaller;
import com.ingenico.connect.gateway.sdk.java.domain.webhooks.WebhooksEvent;

@RunWith(MockitoJUnitRunner.class)
public class WebhooksHelperTest {

	private static final Charset CHARSET = Charset.forName("UTF-8");

	private static final String SIGNATURE_HEADER = "X-GCS-Signature";
	private static final String SIGNATURE = "2S7doBj/GnJnacIjSJzr5fxGM5xmfQyFAwxv1I53ZEk=";

	private static final String KEY_ID_HEADER = "X-GCS-KeyId";
	private static final String KEY_ID = "dummy-key-id";

	private static final String SECRET_KEY = "hello+world";

	@Mock Connection connection;

	@Before
	@After
	public void clearPublicKeyCache() {
		InMemorySecretKeyStore.INSTANCE.clear();
	}

	@Test(expected = ApiVersionMismatchException.class)
	public void testUnmarshalApiVersionMismatch() throws IOException {

		Marshaller marshaller = Mockito.mock(Marshaller.class);
		Mockito.when(marshaller.unmarshal(Matchers.anyString(), Matchers.<Class<?>>any())).thenAnswer(new Answer<Object>() {
			@Override
			public Object answer(InvocationOnMock invocation) throws Throwable {
				String responseJson = invocation.getArgumentAt(0, String.class);
				Class<?> type = invocation.getArgumentAt(1, Class.class);
				WebhooksEvent event = (WebhooksEvent) DefaultMarshaller.INSTANCE.unmarshal(responseJson, type);
				event.setApiVersion("v0");
				return event;
			}
		});

		WebhooksHelper helper = createHelper(marshaller);

		InMemorySecretKeyStore.INSTANCE.storeSecretKey(KEY_ID, SECRET_KEY);

		String body = new String(readResource("valid-body"), CHARSET);
		List<RequestHeader> requestHeaders = Arrays.asList(
				new RequestHeader(SIGNATURE_HEADER, SIGNATURE),
				new RequestHeader(KEY_ID_HEADER, KEY_ID)
		);

		helper.unmarshal(body, requestHeaders);
	}

	@Test(expected = SecretKeyNotAvailableException.class)
	public void testUnmarshalNoSecretKeyAvailable() throws IOException {
		WebhooksHelper helper = createHelper();

		String body = new String(readResource("valid-body"), CHARSET);
		List<RequestHeader> requestHeaders = Arrays.asList(
				new RequestHeader(SIGNATURE_HEADER, SIGNATURE),
				new RequestHeader(KEY_ID_HEADER, KEY_ID)
		);

		helper.unmarshal(body, requestHeaders);
	}

	@Test(expected = SignatureValidationException.class)
	public void testUnmarshalMissingHeaders() throws IOException {
		WebhooksHelper helper = createHelper();

		InMemorySecretKeyStore.INSTANCE.storeSecretKey(KEY_ID, SECRET_KEY);

		String body = new String(readResource("valid-body"), CHARSET);

		helper.unmarshal(body, Collections.<RequestHeader>emptyList());
	}

	@Test(expected = SignatureValidationException.class)
	public void testUnmarshalDuplicateHeaders() throws IOException {
		WebhooksHelper helper = createHelper();

		InMemorySecretKeyStore.INSTANCE.storeSecretKey(KEY_ID, SECRET_KEY);

		String body = new String(readResource("valid-body"), CHARSET);
		List<RequestHeader> requestHeaders = Arrays.asList(
				new RequestHeader(SIGNATURE_HEADER, SIGNATURE),
				new RequestHeader(KEY_ID_HEADER, KEY_ID),
				new RequestHeader(SIGNATURE_HEADER, SIGNATURE + "1")
		);

		helper.unmarshal(body, requestHeaders);
	}

	@Test
	public void testUnmarshalBytesSuccess() throws IOException {
		WebhooksHelper helper = createHelper();

		InMemorySecretKeyStore.INSTANCE.storeSecretKey(KEY_ID, SECRET_KEY);

		ByteArrayInputStream bodyStream = new ByteArrayInputStream(readResource("valid-body"));
		List<RequestHeader> requestHeaders = Arrays.asList(
				new RequestHeader(SIGNATURE_HEADER, SIGNATURE),
				new RequestHeader(KEY_ID_HEADER, KEY_ID)
		);

		WebhooksEvent event = helper.unmarshal(bodyStream, requestHeaders);

		Assert.assertEquals("v1", event.getApiVersion());
		Assert.assertEquals("8ee793f6-4553-4749-85dc-f2ef095c5ab0", event.getId());
		Assert.assertEquals("2017-02-02T11:24:14.040+0100", event.getCreated());
		Assert.assertEquals("20000", event.getMerchantId());
		Assert.assertEquals("payment.paid", event.getType());

		Assert.assertNull(event.getRefund());
		Assert.assertNull(event.getPayout());
		Assert.assertNull(event.getToken());

		Assert.assertNotNull(event.getPayment());
		Assert.assertEquals("00000200000143570012", event.getPayment().getId());
		Assert.assertNotNull(event.getPayment().getPaymentOutput());
		Assert.assertNotNull(event.getPayment().getPaymentOutput().getAmountOfMoney());
		Assert.assertEquals((Long) 1000L, event.getPayment().getPaymentOutput().getAmountOfMoney().getAmount());
		Assert.assertEquals("EUR", event.getPayment().getPaymentOutput().getAmountOfMoney().getCurrencyCode());
		Assert.assertNotNull(event.getPayment().getPaymentOutput().getReferences());
		Assert.assertEquals("200001681810", event.getPayment().getPaymentOutput().getReferences().getPaymentReference());
		Assert.assertEquals("bankTransfer", event.getPayment().getPaymentOutput().getPaymentMethod());

		Assert.assertNull(event.getPayment().getPaymentOutput().getCardPaymentMethodSpecificOutput());
		Assert.assertNull(event.getPayment().getPaymentOutput().getCashPaymentMethodSpecificOutput());
		Assert.assertNull(event.getPayment().getPaymentOutput().getDirectDebitPaymentMethodSpecificOutput());
		Assert.assertNull(event.getPayment().getPaymentOutput().getInvoicePaymentMethodSpecificOutput());
		Assert.assertNull(event.getPayment().getPaymentOutput().getRedirectPaymentMethodSpecificOutput());
		Assert.assertNull(event.getPayment().getPaymentOutput().getSepaDirectDebitPaymentMethodSpecificOutput());
		Assert.assertNotNull(event.getPayment().getPaymentOutput().getBankTransferPaymentMethodSpecificOutput());
		Assert.assertEquals((Integer) 11, event.getPayment().getPaymentOutput().getBankTransferPaymentMethodSpecificOutput().getPaymentProductId());

		Assert.assertEquals("PAID", event.getPayment().getStatus());
		Assert.assertNotNull(event.getPayment().getStatusOutput());
		Assert.assertEquals(false, event.getPayment().getStatusOutput().getIsCancellable());
		Assert.assertEquals("COMPLETED", event.getPayment().getStatusOutput().getStatusCategory());
		Assert.assertEquals((Integer) 1000, event.getPayment().getStatusOutput().getStatusCode());
		Assert.assertEquals("20170202112414", event.getPayment().getStatusOutput().getStatusCodeChangeDateTime());
		Assert.assertEquals(true, event.getPayment().getStatusOutput().getIsAuthorized());
	}

	@Test(expected = SignatureValidationException.class)
	public void testUnmarshalBytesInvalidBody() throws IOException {
		WebhooksHelper helper = createHelper();

		InMemorySecretKeyStore.INSTANCE.storeSecretKey(KEY_ID, SECRET_KEY);

		ByteArrayInputStream bodyStream = new ByteArrayInputStream(readResource("invalid-body"));
		List<RequestHeader> requestHeaders = Arrays.asList(
				new RequestHeader(SIGNATURE_HEADER, SIGNATURE),
				new RequestHeader(KEY_ID_HEADER, KEY_ID)
		);

		helper.unmarshal(bodyStream, requestHeaders);
	}

	@Test(expected = SignatureValidationException.class)
	public void testUnmarshalBytesInvalidSecretKey() throws IOException {
		WebhooksHelper helper = createHelper();

		String invalidSecretKey = "1" + SECRET_KEY;
		InMemorySecretKeyStore.INSTANCE.storeSecretKey(KEY_ID, invalidSecretKey);

		ByteArrayInputStream bodyStream = new ByteArrayInputStream(readResource("valid-body"));
		List<RequestHeader> requestHeaders = Arrays.asList(
				new RequestHeader(SIGNATURE_HEADER, SIGNATURE),
				new RequestHeader(KEY_ID_HEADER, KEY_ID)
		);

		helper.unmarshal(bodyStream, requestHeaders);
	}

	@Test(expected = SignatureValidationException.class)
	public void testUnmarshalBytesInvalidSignature() throws IOException {
		WebhooksHelper helper = createHelper();

		InMemorySecretKeyStore.INSTANCE.storeSecretKey(KEY_ID, SECRET_KEY);

		ByteArrayInputStream bodyStream = new ByteArrayInputStream(readResource("valid-body"));
		List<RequestHeader> requestHeaders = Arrays.asList(
				new RequestHeader(SIGNATURE_HEADER, "1" + SIGNATURE),
				new RequestHeader(KEY_ID_HEADER, KEY_ID)
		);

		helper.unmarshal(bodyStream, requestHeaders);
	}

	@Test
	public void testUnmarshalStringSuccess() throws IOException {
		WebhooksHelper helper = createHelper();

		InMemorySecretKeyStore.INSTANCE.storeSecretKey(KEY_ID, SECRET_KEY);

		String body = new String(readResource("valid-body"), CHARSET);
		List<RequestHeader> requestHeaders = Arrays.asList(
				new RequestHeader(SIGNATURE_HEADER, SIGNATURE),
				new RequestHeader(KEY_ID_HEADER, KEY_ID)
		);

		WebhooksEvent event = helper.unmarshal(body, requestHeaders);

		Assert.assertEquals("v1", event.getApiVersion());
		Assert.assertEquals("8ee793f6-4553-4749-85dc-f2ef095c5ab0", event.getId());
		Assert.assertEquals("2017-02-02T11:24:14.040+0100", event.getCreated());
		Assert.assertEquals("20000", event.getMerchantId());
		Assert.assertEquals("payment.paid", event.getType());

		Assert.assertNull(event.getRefund());
		Assert.assertNull(event.getPayout());
		Assert.assertNull(event.getToken());

		Assert.assertNotNull(event.getPayment());
		Assert.assertEquals("00000200000143570012", event.getPayment().getId());
		Assert.assertNotNull(event.getPayment().getPaymentOutput());
		Assert.assertNotNull(event.getPayment().getPaymentOutput().getAmountOfMoney());
		Assert.assertEquals((Long) 1000L, event.getPayment().getPaymentOutput().getAmountOfMoney().getAmount());
		Assert.assertEquals("EUR", event.getPayment().getPaymentOutput().getAmountOfMoney().getCurrencyCode());
		Assert.assertNotNull(event.getPayment().getPaymentOutput().getReferences());
		Assert.assertEquals("200001681810", event.getPayment().getPaymentOutput().getReferences().getPaymentReference());
		Assert.assertEquals("bankTransfer", event.getPayment().getPaymentOutput().getPaymentMethod());

		Assert.assertNull(event.getPayment().getPaymentOutput().getCardPaymentMethodSpecificOutput());
		Assert.assertNull(event.getPayment().getPaymentOutput().getCashPaymentMethodSpecificOutput());
		Assert.assertNull(event.getPayment().getPaymentOutput().getDirectDebitPaymentMethodSpecificOutput());
		Assert.assertNull(event.getPayment().getPaymentOutput().getInvoicePaymentMethodSpecificOutput());
		Assert.assertNull(event.getPayment().getPaymentOutput().getRedirectPaymentMethodSpecificOutput());
		Assert.assertNull(event.getPayment().getPaymentOutput().getSepaDirectDebitPaymentMethodSpecificOutput());
		Assert.assertNotNull(event.getPayment().getPaymentOutput().getBankTransferPaymentMethodSpecificOutput());
		Assert.assertEquals((Integer) 11, event.getPayment().getPaymentOutput().getBankTransferPaymentMethodSpecificOutput().getPaymentProductId());

		Assert.assertEquals("PAID", event.getPayment().getStatus());
		Assert.assertNotNull(event.getPayment().getStatusOutput());
		Assert.assertEquals(false, event.getPayment().getStatusOutput().getIsCancellable());
		Assert.assertEquals("COMPLETED", event.getPayment().getStatusOutput().getStatusCategory());
		Assert.assertEquals((Integer) 1000, event.getPayment().getStatusOutput().getStatusCode());
		Assert.assertEquals("20170202112414", event.getPayment().getStatusOutput().getStatusCodeChangeDateTime());
		Assert.assertEquals(true, event.getPayment().getStatusOutput().getIsAuthorized());
	}

	@Test(expected = SignatureValidationException.class)
	public void testUnmarshalStringInvalidBody() throws IOException {
		WebhooksHelper helper = createHelper();

		InMemorySecretKeyStore.INSTANCE.storeSecretKey(KEY_ID, SECRET_KEY);

		String body = new String(readResource("invalid-body"), CHARSET);
		List<RequestHeader> requestHeaders = Arrays.asList(
				new RequestHeader(SIGNATURE_HEADER, SIGNATURE),
				new RequestHeader(KEY_ID_HEADER, KEY_ID)
		);

		helper.unmarshal(body, requestHeaders);
	}

	@Test(expected = SignatureValidationException.class)
	public void testUnmarshalStringInvalidSecretKey() throws IOException {
		WebhooksHelper helper = createHelper();

		String invalidSecretKey = "1" + SECRET_KEY;
		InMemorySecretKeyStore.INSTANCE.storeSecretKey(KEY_ID, invalidSecretKey);

		String body = new String(readResource("valid-body"), CHARSET);
		List<RequestHeader> requestHeaders = Arrays.asList(
				new RequestHeader(SIGNATURE_HEADER, SIGNATURE),
				new RequestHeader(KEY_ID_HEADER, KEY_ID)
		);

		helper.unmarshal(body, requestHeaders);
	}

	@Test(expected = SignatureValidationException.class)
	public void testUnmarshalStringInvalidSignature() throws IOException {
		WebhooksHelper helper = createHelper();

		InMemorySecretKeyStore.INSTANCE.storeSecretKey(KEY_ID, SECRET_KEY);

		String body = new String(readResource("valid-body"), CHARSET);
		List<RequestHeader> requestHeaders = Arrays.asList(
				new RequestHeader(SIGNATURE_HEADER, "1" + SIGNATURE),
				new RequestHeader(KEY_ID_HEADER, KEY_ID)
		);

		helper.unmarshal(body, requestHeaders);
	}

	private byte[] readResource(String resource) throws IOException {

		/*
		 * The resources may contain \r on Windows machines, but the body from which the signature was created does not.
		 * Strip those out while reading.
		 *
		 * Note that this should not be done when creating webhooks endpoints. Signatures are created for bodies as they
		 * are sent. If such bodies contain \r then stripping out any \r will lead to a signature mismatch. Instead,
		 * it's best to read the body in chunks. For instance:
		 *
		 *     byte[] buffer = new byte[1024];
		 *     int len;
		 *     while ((len = input.read(buffer)) != -1) {
		 *         output.write(buffer, 0, len);
		 *     }
		 */

		ByteArrayOutputStream output = new ByteArrayOutputStream();
		InputStream input = new BufferedInputStream(getClass().getResourceAsStream(resource));
		try {
			int b;
			while ((b = input.read()) != -1) {
				if (b != '\r') {
					output.write(b);
				}
			}
			return output.toByteArray();

		} finally {
			input.close();
		}
	}

	@Test
	public void testAreEqualSignaturesEqual() {

		final String signature = UUID.randomUUID().toString();
		final String large = repeat(signature, 100);

		Assert.assertTrue(WebhooksHelper.areEqualSignatures(signature, signature));
		Assert.assertTrue(WebhooksHelper.areEqualSignatures(large, large));
	}

	@Test
	public void testAreEqualSignaturesNotEqual() {

		final String signature = UUID.randomUUID().toString();
		final String large = repeat(signature, 100);

		Assert.assertFalse(WebhooksHelper.areEqualSignatures("abc", signature));
		Assert.assertFalse(WebhooksHelper.areEqualSignatures(signature, "abc"));
		Assert.assertFalse(WebhooksHelper.areEqualSignatures(signature + "1", signature));
		Assert.assertFalse(WebhooksHelper.areEqualSignatures(signature, signature + "1"));
		Assert.assertFalse(WebhooksHelper.areEqualSignatures(signature.toLowerCase(), signature.toUpperCase()));
		Assert.assertFalse(WebhooksHelper.areEqualSignatures(signature.toUpperCase(), signature.toLowerCase()));

		Assert.assertFalse(WebhooksHelper.areEqualSignatures("abc", large));
		Assert.assertFalse(WebhooksHelper.areEqualSignatures(large, "abc"));
		Assert.assertFalse(WebhooksHelper.areEqualSignatures(large + "1", large));
		Assert.assertFalse(WebhooksHelper.areEqualSignatures(large, large + "1"));
		Assert.assertFalse(WebhooksHelper.areEqualSignatures(large.toLowerCase(), large.toUpperCase()));
		Assert.assertFalse(WebhooksHelper.areEqualSignatures(large.toUpperCase(), large.toLowerCase()));

		Assert.assertFalse(WebhooksHelper.areEqualSignatures(signature, large));
		Assert.assertFalse(WebhooksHelper.areEqualSignatures(large, signature));
	}

	private String repeat(String s, int times) {
		StringBuilder sb = new StringBuilder(times * s.length());
		for (int i = 0; i < times; i++) {
			sb.append(s);
		}
		return sb.toString();
	}

	private WebhooksHelper createHelper() {
		return createHelper(DefaultMarshaller.INSTANCE);
	}

	private WebhooksHelper createHelper(Marshaller marshaller) {
		return new WebhooksHelper(marshaller, InMemorySecretKeyStore.INSTANCE);
	}
}
