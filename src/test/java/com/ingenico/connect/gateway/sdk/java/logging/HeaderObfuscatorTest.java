package com.ingenico.connect.gateway.sdk.java.logging;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeaderObfuscatorTest {

	@Test
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

	@Test
	public void testObfuscateCustomHeader() {
		HeaderObfuscator headerObfuscator = HeaderObfuscator.custom()
				.obfuscateAll("content-type")
				.build();

		testObfuscateHeaderWithMatch(headerObfuscator, "Authorization", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********");
		testObfuscateHeaderWithMatch(headerObfuscator, "authorization", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********");
		testObfuscateHeaderWithMatch(headerObfuscator, "AUTHORIZATION", "Basic QWxhZGRpbjpPcGVuU2VzYW1l", "********");

		testObfuscateHeaderWithMatch(headerObfuscator, "X-GCS-Authentication-Token", "foobar", "********");
		testObfuscateHeaderWithMatch(headerObfuscator, "x-gcs-authentication-token", "foobar", "********");
		testObfuscateHeaderWithMatch(headerObfuscator, "X-GCS-AUTHENTICATION-TOKEN", "foobar", "********");

		testObfuscateHeaderWithMatch(headerObfuscator, "X-GCS-CallerPassword", "foobar", "********");
		testObfuscateHeaderWithMatch(headerObfuscator, "x-gcs-callerpassword", "foobar", "********");
		testObfuscateHeaderWithMatch(headerObfuscator, "X-GCS-CALLERPASSWORD", "foobar", "********");

		testObfuscateHeaderWithMatch(headerObfuscator, "Content-Type", "application/json", "****************");
		testObfuscateHeaderWithMatch(headerObfuscator, "content-type", "application/json", "****************");
		testObfuscateHeaderWithMatch(headerObfuscator, "CONTENT-TYPE", "application/json", "****************");
	}

	private void testObfuscateHeaderWithMatch(String name, String originalValue, String expectedObfuscatedValue) {
		testObfuscateHeaderWithMatch(HeaderObfuscator.defaultObfuscator(), name, originalValue, expectedObfuscatedValue);
	}

	private void testObfuscateHeaderWithMatch(HeaderObfuscator headerObfuscator, String name, String originalValue, String expectedObfuscatedValue) {
		String obfuscatedValue = headerObfuscator.obfuscateHeader(name, originalValue);

		assertEquals(expectedObfuscatedValue, obfuscatedValue);
	}

	private void testObfuscateHeaderWithNoMatch(String name, String originalValue) {
		String obfuscatedValue = HeaderObfuscator.defaultObfuscator().obfuscateHeader(name, originalValue);

		assertEquals(originalValue, obfuscatedValue);
	}
}
