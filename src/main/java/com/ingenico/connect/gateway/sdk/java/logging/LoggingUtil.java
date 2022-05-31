package com.ingenico.connect.gateway.sdk.java.logging;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

/**
 * A utility class to support logging.
 * @deprecated Use {@link BodyObfuscator} and {@link HeaderObfuscator} instead.
 */
@Deprecated
public final class LoggingUtil {

	private LoggingUtil() {}

	/**
	 * Obfuscates the given body as necessary.
	 */
	public static String obfuscateBody(CharSequence body) {
		return BodyObfuscator.defaultObfuscator().obfuscateBody(body);
	}

	/**
	 * Obfuscates the body from the given stream as necessary.
	 * @param charset The charset to use to read the body input stream.
	 */
	public static String obfuscateBody(InputStream bodyStream, Charset charset) throws IOException {
		return BodyObfuscator.defaultObfuscator().obfuscateBody(bodyStream, charset);
	}

	/**
	 * Obfuscates the body from the given stream as necessary.
	 */
	public static String obfuscateBody(Reader bodyStream) throws IOException {
		return BodyObfuscator.defaultObfuscator().obfuscateBody(bodyStream);
	}

	/**
	 * Obfuscates the value for the given header as necessary.
	 */
	public static String obfuscateHeader(String name, String value) {
		return HeaderObfuscator.defaultObfuscator().obfuscateHeader(name, value);
	}
}
