package com.ingenico.connect.gateway.sdk.java.logging;

import java.io.PrintStream;
import java.util.Date;

/**
 * A communicator logger that prints its message to {@link System#out}.
 * It includes a timestamp in yyyy-MM-ddTHH:mm:ss format in the system time zone.
 */
public final class SysOutCommunicatorLogger implements CommunicatorLogger {

	public static final SysOutCommunicatorLogger INSTANCE = new SysOutCommunicatorLogger();

	private SysOutCommunicatorLogger() {}

	@Override
	public void log(String message) {
		// System.out can be changed using System.setOut; make sure the same object is used for locking and printing
		final PrintStream sysOut = System.out;
		synchronized (sysOut) {
			sysOut.println(getDatePrefix() + message);
		}
	}

	@Override
	public void log(String message, Throwable thrown) {
		// System.out can be changed using System.setOut; make sure the same object is used for locking and printing
		final PrintStream sysOut = System.out;
		synchronized (sysOut) {
			sysOut.println(getDatePrefix() + message);
			if (thrown != null) {
				thrown.printStackTrace(sysOut);
			}
		}
	}

	private String getDatePrefix() {
		return String.format("%1$tY-%1$tm-%1$tdT%1$tH:%1$tM:%1$tS ", new Date());
	}
}
