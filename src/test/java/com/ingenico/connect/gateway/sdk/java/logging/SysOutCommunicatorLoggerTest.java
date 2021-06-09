package com.ingenico.connect.gateway.sdk.java.logging;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SysOutCommunicatorLoggerTest {

	private static final Pattern MESSAGE_PATTERN = Pattern.compile("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2} (.*)", Pattern.DOTALL);

	private PrintStream originalSysOut;

	private ByteArrayOutputStream baos;

	@Before
	public void setup() {
		originalSysOut = System.out;

		baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));
	}

	@After
	public void cleanup() {
		baos = null;

		System.setOut(originalSysOut);
	}

	@Test
	public void testLog() throws UnsupportedEncodingException {

		SysOutCommunicatorLogger communicatorLogger = SysOutCommunicatorLogger.INSTANCE;
		communicatorLogger.log("Hello world");

		String content = baos.toString("UTF-8");

		assertMessage(content, "Hello world");
	}

	@Test
	public void testLogWithException() throws UnsupportedEncodingException {

		SysOutCommunicatorLogger communicatorLogger = SysOutCommunicatorLogger.INSTANCE;
		Exception exception = new Exception();
		communicatorLogger.log("Hello world", exception);

		String content = baos.toString("UTF-8");

		assertMessage(content, "Hello world", exception);
	}

	private String toString(Exception exception) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exception.printStackTrace(pw);
		pw.flush();
		return sw.toString();
	}

	private void assertMessage(String content, String message) {
		assertMessage(content, message, null);
	}

	private void assertMessage(String content, String message, Exception exception) {

		String expected = message + System.getProperty("line.separator");
		if (exception != null) {
			expected += toString(exception);
		}

		Matcher matcher = MESSAGE_PATTERN.matcher(content);
		Assert.assertTrue("content does not match pattern " + MESSAGE_PATTERN, matcher.matches());

		Assert.assertEquals(expected, matcher.group(1));
	}
}
