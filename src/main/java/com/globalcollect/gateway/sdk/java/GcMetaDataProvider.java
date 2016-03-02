package com.globalcollect.gateway.sdk.java;

import java.util.Collection;

/**
 * Provides meta info about the server. Thread-safe.
 */
public interface GcMetaDataProvider {

	/**
	 * @return The server related headers containing the META data to be associated with the request (if any).
	 *         Never {@code null}.
	 */
	Collection<RequestHeader> getServerMetaDataHeaders();
}
