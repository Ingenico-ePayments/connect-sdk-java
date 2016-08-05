package com.globalcollect.gateway.sdk.java.logging;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

public class JdkCommunicatorLoggerTest {

	@Test
	public void testLog() {

		Logger logger = Logger.getLogger(getClass().getName());
		TestHandler handler = new TestHandler();
		logger.addHandler(handler);

		JdkCommunicatorLogger communicatorLogger = new JdkCommunicatorLogger(logger, Level.INFO, Level.WARNING);
		communicatorLogger.log("Hello world");

		Assert.assertEquals(1, handler.records.size());

		LogRecord record = handler.records.get(0);

		Assert.assertEquals("Hello world", record.getMessage());
		Assert.assertEquals(Level.INFO, record.getLevel());
		Assert.assertEquals(getClass().getName(), record.getLoggerName());
		Assert.assertEquals(communicatorLogger.getClass().getName(), record.getSourceClassName());
		Assert.assertEquals("log", record.getSourceMethodName());
		Assert.assertNull(record.getThrown());
	}

	@Test
	public void testLogWithException() {

		Logger logger = Logger.getLogger(getClass().getName());
		TestHandler handler = new TestHandler();
		logger.addHandler(handler);

		JdkCommunicatorLogger communicatorLogger = new JdkCommunicatorLogger(logger, Level.INFO, Level.WARNING);
		Exception exception = new Exception();
		communicatorLogger.log("Hello world", exception);

		Assert.assertEquals(1, handler.records.size());

		LogRecord record = handler.records.get(0);

		Assert.assertEquals("Hello world", record.getMessage());
		Assert.assertEquals(Level.WARNING, record.getLevel());
		Assert.assertEquals(getClass().getName(), record.getLoggerName());
		Assert.assertEquals(communicatorLogger.getClass().getName(), record.getSourceClassName());
		Assert.assertEquals("log", record.getSourceMethodName());
		Assert.assertSame(exception, record.getThrown());
	}

	private static final class TestHandler extends Handler {

		private final List<LogRecord> records = new ArrayList<LogRecord>();

		@Override
		public void publish(LogRecord record) {
			records.add(record);
		}

		@Override
		public void flush() {}

		@Override
		public void close() throws SecurityException {}
	}
}
