package com.ingenico.connect.gateway.sdk.java.logging;

/**
 * Classes that implement this interface have support for logging messages from communicators.
 */
public interface LoggingCapable {

	/**
	 * Turns on logging using the given communicator logger.
	 *
	 * @throws IllegalArgumentException If the given communicator logger is {@code null}.
	 */
	void enableLogging(CommunicatorLogger communicatorLogger);

	/**
	 * Turns off logging.
	 */
	void disableLogging();
}
