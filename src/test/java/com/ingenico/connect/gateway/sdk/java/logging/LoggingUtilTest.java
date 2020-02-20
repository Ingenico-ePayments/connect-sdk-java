package com.ingenico.connect.gateway.sdk.java.logging;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.logging.LoggingUtil;

public class LoggingUtilTest {

	@Test
	public void testObfuscateBodyWithNullBody() {
		String body = null;

		String obfuscatedBody = LoggingUtil.obfuscateBody(body);

		assertNull(obfuscatedBody);
	}

	@Test
	public void testObfuscateBodyWithEmptyBody() {
		String body = "";

		String obfuscatedBody = LoggingUtil.obfuscateBody(body);

		assertEquals(body, obfuscatedBody);
	}

	@Test
	public void testObfuscateBodyWithCard() throws IOException {
		testObfuscateBodyWithMatches("bodyWithCardOriginal.json", "bodyWithCardObfuscated.json");
	}

	@Test
	public void testObfuscateBodyWithIban() throws IOException {
		testObfuscateBodyWithMatches("bodyWithIbanOriginal.json", "bodyWithIbanObfuscated.json");
	}

	@Test
	public void testObfuscateBodyWithBin() throws IOException {
		testObfuscateBodyWithMatches("bodyWithBinOriginal.json", "bodyWithBinObfuscated.json");
	}

	@Test
	public void testObfuscateBodyWithNoMatches() throws IOException {
		testObfuscateBodyWithNoMatches("bodyNoObfuscation.json");
	}

	@Test
	public void testObfuscateBodyWithObject() throws IOException {
		testObfuscateBodyWithMatches("bodyWithObjectOriginal.json", "bodyWithObjectObfuscated.json");
	}

	private void testObfuscateBodyWithMatches(String originalResource, String obfuscatedResource) throws IOException {
		String body = readResource(originalResource);
		String expected = readResource(obfuscatedResource);

		String obfuscatedBody = LoggingUtil.obfuscateBody(body);

		assertEquals(expected, obfuscatedBody);
	}

	private void testObfuscateBodyWithNoMatches(String resource) throws IOException {
		String body = readResource(resource);

		String obfuscatedBody = LoggingUtil.obfuscateBody(body);

		assertEquals(body, obfuscatedBody);
	}

	private String readResource(String resource) throws IOException {
		StringWriter writer = new StringWriter();

		Reader reader = new InputStreamReader(getClass().getResourceAsStream(resource));
		try {
			char[] buffer = new char[8192];
			int len;
			while ((len = reader.read(buffer)) != -1) {
				writer.write(buffer, 0, len);
			}
		} finally {
			reader.close();
		}

		return writer.toString();
	}

	public void testObfuscateHeader() {
		testObfuscateHeaderWithMatch("Authorization", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********");
		testObfuscateHeaderWithMatch("authorization", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********");
		testObfuscateHeaderWithMatch("AUTHORIZATION", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********");

		testObfuscateHeaderWithMatch("X-GCS-Authentication-Token", "foobar", "********");
		testObfuscateHeaderWithMatch("x-gcs-authentication-token", "foobar", "********");
		testObfuscateHeaderWithMatch("X-GCS-AUTHENTICATION-TOKEN", "foobar", "********");

		testObfuscateHeaderWithMatch("X-GCS-CallerPassword", "foobar", "********");
		testObfuscateHeaderWithMatch("x-gcs-callerpassword", "foobar", "********");
		testObfuscateHeaderWithMatch("X-GCS-CALLERPASSWORD", "foobar", "********");

		testObfuscateHeaderWithNoMatch("Content-Type", "application/json");
		testObfuscateHeaderWithNoMatch("content-type", "application/json");
		testObfuscateHeaderWithNoMatch("CONTENT-TYPE", "application/json");
	}

	private void testObfuscateHeaderWithMatch(String name, String originalValue, String expectedObfuscatedValue) {
		String obfuscatedValue = LoggingUtil.obfuscateHeader(name, originalValue);

		assertEquals(expectedObfuscatedValue, obfuscatedValue);
	}

	private void testObfuscateHeaderWithNoMatch(String name, String originalValue) {
		String obfuscatedValue = LoggingUtil.obfuscateHeader(name, originalValue);

		assertEquals(originalValue, obfuscatedValue);
	}
}
