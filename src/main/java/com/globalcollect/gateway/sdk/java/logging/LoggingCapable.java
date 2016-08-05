package com.globalcollect.gateway.sdk.java.logging;

/**
 * Classes that implement this interface have support for logging messages from communicators.
 */
public interface LoggingCapable {

	/**
	 * Turns on logging using the given communicator logger.
	 * @throws IllegalArgumentException If the given communicator logger is <code>null</code>.
	 */
	void enableLogging(GcCommunicatorLogger communicatorLogger);

	/**
	 * Turns off logging.
	 */
	void disableLogging();
}
