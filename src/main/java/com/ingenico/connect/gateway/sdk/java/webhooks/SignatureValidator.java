package com.ingenico.connect.gateway.sdk.java.webhooks;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.List;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.ingenico.connect.gateway.sdk.java.RequestHeader;

/**
 * Validator for webhooks signatures. Thread-safe.
 */
public class SignatureValidator {

	private static final Charset CHARSET = Charset.forName("UTF-8");

	private final SecretKeyStore secretKeyStore;

	public SignatureValidator(SecretKeyStore secretKeyStore) {
		if (secretKeyStore == null) {
			throw new IllegalArgumentException("secretKeyStore is required");
		}
		this.secretKeyStore = secretKeyStore;
	}

	// body as byte array

	/**
	 * Validates the given body using the given request headers.
	 *
	 * @throws SignatureValidationException If the body could not be validated successfully.
	 */
	public void validate(byte[] body, List<RequestHeader> requestHeaders) {
		try {
			validateBody(body, requestHeaders);

		} catch (GeneralSecurityException e) {
			throw new SignatureValidationException(e);
		}
	}

	// body as String

	/**
	 * Validates the given body using the given request headers.
	 *
	 * @throws SignatureValidationException If the body could not be validated successfully.
	 */
	public void validate(String body, List<RequestHeader> requestHeaders) {
		validate(body.getBytes(CHARSET), requestHeaders);
	}

	// utility methods

	private void validateBody(byte[] body, List<RequestHeader> requestHeaders) throws GeneralSecurityException {
		String signature = getHeaderValue(requestHeaders, "X-GCS-Signature");
		String keyId = getHeaderValue(requestHeaders, "X-GCS-KeyId");
		String secretKey = secretKeyStore.getSecretKey(keyId);

		Mac hmac = Mac.getInstance("HmacSHA256");
		SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(CHARSET), "HmacSHA256");
		hmac.init(key);

		byte[] unencodedResult = hmac.doFinal(body);
		byte[] expectedSignature = Base64.encodeBase64(unencodedResult);

		boolean isValid = MessageDigest.isEqual(signature.getBytes(CHARSET), expectedSignature);
		if (!isValid) {
			throw new SignatureValidationException("failed to validate signature '" + signature + "'");
		}
	}

	// general utility methods

	private static String getHeaderValue(List<RequestHeader> requestHeaders, String headerName) {
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
