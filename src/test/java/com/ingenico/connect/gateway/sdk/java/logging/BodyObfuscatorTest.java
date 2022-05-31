package com.ingenico.connect.gateway.sdk.java.logging;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;

import org.junit.Test;

public class BodyObfuscatorTest {

	@Test
	public void testObfuscateBodyWithNullBody() {
		String body = null;

		String obfuscatedBody = BodyObfuscator.defaultObfuscator().obfuscateBody(body);

		assertNull(obfuscatedBody);
	}

	@Test
	public void testObfuscateBodyWithEmptyBody() {
		String body = "";

		String obfuscatedBody = BodyObfuscator.defaultObfuscator().obfuscateBody(body);

		assertEquals(body, obfuscatedBody);
	}

	@Test
	public void testObfuscateBodyWithCard() throws IOException {
		testObfuscateBodyWithMatches("bodyWithCardOriginal.json", "bodyWithCardObfuscated.json");
	}

	@Test
	public void testObfuscateBodyWithCustomCardRule() throws IOException {
		ObfuscationRule obfuscationRule = new ObfuscationRule() {

			@Override
			public String obfuscateValue(String value) {
				char[] chars = value.toCharArray();
				for (int i = 6;  i < chars.length - 4; i++) {
					chars[i] = '*';
				}
				return new String(chars);
			}
		};

		BodyObfuscator bodyObfuscator = BodyObfuscator.custom()
				.obfuscateCustom("cardNumber", obfuscationRule)
				.build();

		testObfuscateBodyWithMatches(bodyObfuscator, "bodyWithCardOriginal.json", "bodyWithCardCustomObfuscated.json");
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
		testObfuscateBodyWithMatches(BodyObfuscator.defaultObfuscator(), originalResource, obfuscatedResource);
	}

	private void testObfuscateBodyWithMatches(BodyObfuscator bodyObfuscator, String originalResource, String obfuscatedResource) throws IOException {
		String body = readResource(originalResource);
		String expected = readResource(obfuscatedResource);

		String obfuscatedBody = bodyObfuscator.obfuscateBody(body);

		assertEquals(expected, obfuscatedBody);
	}

	private void testObfuscateBodyWithNoMatches(String resource) throws IOException {
		String body = readResource(resource);

		String obfuscatedBody = BodyObfuscator.defaultObfuscator().obfuscateBody(body);

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
}
