package com.ingenico.connect.gateway.sdk.java.logging;

/**
 * Used to log messages from communicators. Thread-safe.
 */
public interface CommunicatorLogger {

	/**
	 * Logs a message.
	 * @param message The message to log.
	 */
	void log(String message);

	/**
	 * Logs a throwable with an accompanying message.
	 * @param message The message accompanying the throwable.
	 * @param thrown The throwable to log.
	 */
	void log(String message, Throwable thrown);
}
