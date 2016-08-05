package com.globalcollect.gateway.sdk.java.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A communicator logger that is backed by a {@link java.util.logging.Logger}.
 */
public class JdkCommunicatorLogger implements GcCommunicatorLogger {

	private final Logger logger;
	private final Level logLevel;
	private final Level errorLogLevel;

	/**
	 * Creates a new communicator logger.
	 * @param logger The backing logger.
	 * @param level The level to use when logging through both {@link #log(String)} and {@link #log(String, Throwable)}.
	 */
	public JdkCommunicatorLogger(Logger logger, Level level) {
		this(logger, level, level);
	}

	/**
	 * Creates a new communicator logger.
	 * @param logger The backing logger.
	 * @param logLevel The level to use when logging through {@link #log(String)}.
	 * @param errorLogLevel The level to use when logging through {@link #log(String, Throwable)}.
	 */
	public JdkCommunicatorLogger(Logger logger, Level logLevel, Level errorLogLevel) {
		if (logger == null) {
			throw new IllegalArgumentException("logger is required");
		}
		if (logLevel == null) {
			throw new IllegalArgumentException("logLevel is required");
		}
		if (errorLogLevel == null) {
			throw new IllegalArgumentException("exceptionLogLevel is required");
		}
		this.logger = logger;
		this.logLevel = logLevel;
		this.errorLogLevel = errorLogLevel;
	}

	@Override
	public void log(String message) {
		logger.log(logLevel, message);
	}

	@Override
	public void log(String message, Throwable thrown) {
		logger.log(errorLogLevel, message, thrown);
	}
}
