package com.ingenico.connect.gateway.sdk.java.webhooks;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.List;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.Marshaller;
import com.ingenico.connect.gateway.sdk.java.RequestHeader;
import com.ingenico.connect.gateway.sdk.java.domain.webhooks.WebhooksEvent;

/**
 * Ingenico ePayments platform webhooks helper. Thread-safe.
 */
public class WebhooksHelper {

	private static final Charset CHARSET = Charset.forName("UTF-8");

	private final Marshaller marshaller;

	private final SecretKeyStore secretKeyStore;

	public WebhooksHelper(Marshaller marshaller, SecretKeyStore secretKeyStore) {
		if (marshaller == null) {
			throw new IllegalArgumentException("marshaller is required");
		}
		if (secretKeyStore == null) {
			throw new IllegalArgumentException("secretKeyStore is required");
		}
		this.marshaller = marshaller;
		this.secretKeyStore = secretKeyStore;
	}

	// body as InputStream

	/**
	 * Unmarshals the given input stream that contains the body,
	 * while also validating its contents using the given request headers.
	 * @return The input stream unmarshalled as a {@link WebhooksEvent}
	 * @throws IOException If the input stream could not be read.
	 * @throws SignatureValidationException If the input stream could not be validated successfully.
	 * @throws ApiVersionMismatchException If the resulting event has an API version that this version of the SDK does not support.
	 */
	public WebhooksEvent unmarshal(InputStream bodyStream, List<RequestHeader> requestHeaders) throws IOException {
		byte[] bodyBytes = getContent(bodyStream);
		return unmarshal(bodyBytes, requestHeaders);
	}

	private byte[] getContent(InputStream bodyStream) throws IOException {
		ByteArrayOutputStream output = new ByteArrayOutputStream(4096);

		byte[] buffer = new byte[4096];
		int len;
		while ((len = bodyStream.read(buffer)) != -1) {
			output.write(buffer, 0, len);
		}
		return output.toByteArray();
	}

	// body as byte array

	/**
	 * Unmarshals the given body, while also validating it using the given request headers.
	 * @return The body unmarshalled as a {@link WebhooksEvent}
	 * @throws SignatureValidationException If the body could not be validated successfully.
	 * @throws ApiVersionMismatchException If the resulting event has an API version that this version of the SDK does not support.
	 */
	public WebhooksEvent unmarshal(byte[] body, List<RequestHeader> requestHeaders) {
		validate(body, requestHeaders);

		WebhooksEvent event = marshaller.unmarshal(new String(body, CHARSET), WebhooksEvent.class);
		validateApiVersion(event);
		return event;
	}

	/**
	 * Validates the given body using the given request headers.
	 * @throws SignatureValidationException If the body could not be validated successfully.
	 */
	protected void validate(byte[] body, List<RequestHeader> requestHeaders) {
		try {
			validateBody(body, requestHeaders);

		} catch (GeneralSecurityException e) {
			throw new SignatureValidationException(e);
		}
	}

	// body as String

	/**
	 * Unmarshals the given body, while also validating it using the given request headers.
	 * @return The body unmarshalled as a {@link WebhooksEvent}
	 * @throws SignatureValidationException If the body could not be validated successfully.
	 * @throws ApiVersionMismatchException If the resulting event has an API version that this version of the SDK does not support.
	 */
	public WebhooksEvent unmarshal(String body, List<RequestHeader> requestHeaders) {
		validate(body, requestHeaders);

		WebhooksEvent event = marshaller.unmarshal(body, WebhooksEvent.class);
		validateApiVersion(event);
		return event;
	}

	/**
	 * Validates the given body using the given request headers.
	 * @throws SignatureValidationException If the body could not be validated successfully.
	 */
	protected void validate(String body, List<RequestHeader> requestHeaders) {
		validate(body.getBytes(CHARSET), requestHeaders);
	}

	// validation utility methods

	private void validateBody(byte[] body, List<RequestHeader> requestHeaders) throws GeneralSecurityException {
		String signature = getHeaderValue(requestHeaders, "X-GCS-Signature");
		String keyId = getHeaderValue(requestHeaders, "X-GCS-KeyId");
		String secretKey = secretKeyStore.getSecretKey(keyId);

		Mac hmac = Mac.getInstance("HmacSHA256");
		SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(CHARSET), "HmacSHA256");
		hmac.init(key);

		byte[] unencodedResult = hmac.doFinal(body);
		String expectedSignature = Base64.encodeBase64String(unencodedResult);

		boolean isValid = areEqualSignatures(signature, expectedSignature);
		if (!isValid) {
			throw new SignatureValidationException("failed to validate signature '" + signature + "'");
		}
	}

	static boolean areEqualSignatures(String signature, String expectedSignature) {
		// don't use a simple equals call, as that may leak timing information (it fails fast)

		final int length = signature.length();
		final int expectedLength = expectedSignature.length();

		// always check at least 256 characters, to also not leak timing information about the length of the expected signature
		int limit = Math.max(Math.max(length, expectedLength), 256);

		boolean result = true;

		// the loop below uses result &= false instead of result = false and result &= true instead of nothing
		// because those might leak timing information
		for (int i = 0; i < limit; i++) {
			if (i < length && i < expectedLength) {
				// both within string boundaries
				result &= signature.charAt(i) == expectedSignature.charAt(i);
			} else if (i >= length && i >= expectedLength) {
				// past both string boundaries
				result &= true;
			} else {
				// i >= length || i >= expectedLength but not both
				result &= false;
			}
		}

		return result;
	}

	// general utility methods

	private void validateApiVersion(WebhooksEvent event) {
		if (!Client.API_VERSION.equals(event.getApiVersion())) {
			throw new ApiVersionMismatchException(event.getApiVersion(), Client.API_VERSION);
		}
	}

	private String getHeaderValue(List<RequestHeader> requestHeaders, String headerName) {
		String value = null;
		for (RequestHeader header : requestHeaders) {
			if (headerName.equalsIgnoreCase(header.getName())) {
				if (value == null) {
					value = header.getValue();
				} else {
					throw new SignatureValidationException("enocuntered multiple occurrences of header '" + headerName + "'");
				}
			}
		}
		if (value == null) {
			throw new SignatureValidationException("could not find header '" + headerName + "'");
		}
		return value;
	}
}
