package com.ingenico.connect.gateway.sdk.java.logging;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/**
 * A utility class to support logging.
 */
public final class LoggingUtil {

	private static final PropertyObfuscator PROPERTY_OBFUSCATOR = PropertyObfuscator.builder()
			.withKeepEndCount("cardNumber", 4)
			.withKeepEndCount("expiryDate", 2)
			.withAll("cvv")
			.withKeepEndCount("iban", 4)
			.withKeepEndCount("accountNumber", 4)
			.withKeepEndCount("reformattedAccountNumber", 4)
			.withKeepStartCount("bin", 6)
			// key-value pairs can contain any value, like credit card numbers or other private data; mask all values
			.withAll("value")
			.withFixedLength("keyId", 8)
			.withFixedLength("secretKey", 8)
			.withFixedLength("publicKey", 8)
			.withFixedLength("userAuthenticationToken", 8)
			// encrypted payload is a base64 string that contains an encrypted value; to make decrypting even harder, just mask the entire thing
			.withFixedLength("encryptedPayload", 8)
			// decrypted payload is a simple base64 string that may contain credit card numbers or other private data; just mask the entire thing
			.withFixedLength("decryptedPayload", 8)
			// encrypted customer input is similar to encrypted payload
			.withFixedLength("encryptedCustomerInput", 8)
			.build();

	private static final HeaderObfuscator HEADER_OBFUSCATOR = HeaderObfuscator.builder()
			.withFixedLength("Authorization", 8)
			.withFixedLength("WWW-Authenticate", 8)
			.withFixedLength("Proxy-Authenticate", 8)
			.withFixedLength("Proxy-Authorization", 8)
			.withFixedLength("X-GCS-Authentication-Token", 8)
			.withFixedLength("X-GCS-CallerPassword", 8)
			.build();

	private LoggingUtil() {}

	/**
	 * Obfuscates the given body as necessary.
	 */
	public static String obfuscateBody(CharSequence body) {
		return PROPERTY_OBFUSCATOR.obfuscate(body);
	}

	/**
	 * Obfuscates the body from the given stream as necessary.
	 * @param charset The charset to use to read the body input stream.
	 */
	public static String obfuscateBody(InputStream bodyStream, Charset charset) throws IOException {
		return obfuscateBody(new InputStreamReader(bodyStream, charset));
	}

	/**
	 * Obfuscates the body from the given stream as necessary.
	 */
	public static String obfuscateBody(Reader bodyStream) throws IOException {
		StringBuilder body = new StringBuilder();
		char[] buffer = new char[4096];
		int len;
		while ((len = bodyStream.read(buffer)) != -1) {
			body.append(buffer, 0, len);
		}

		return obfuscateBody(body);
	}

	/**
	 * Obfuscates the value for the given header as necessary.
	 */
	public static String obfuscateHeader(String name, String value) {
		return HEADER_OBFUSCATOR.obfuscateValue(name, value);
	}
}
