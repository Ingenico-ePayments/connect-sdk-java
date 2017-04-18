/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;

import com.ingenico.connect.gateway.sdk.java.logging.CommunicatorLogger;
import com.ingenico.connect.gateway.sdk.java.logging.LoggingCapable;
import com.ingenico.connect.gateway.sdk.java.merchant.MerchantClient;

/**
 * GlobalCollect platform client.
 * <p>
 * This client and all its child clients are bound to one specific value for the <i>X-GCS-ClientMetaInfo</i> header.
 * To get a new client with a different header value, use {@link #withClientMetaInfo(String)}.
 * <p>
 * Thread-safe.
 */
public class Client extends ApiResource implements Closeable, LoggingCapable {

	public static final String API_VERSION = "v1";

	private static final Charset CHARSET = Charset.forName("UTF-8");

	public Client(Communicator communicator) {
		this(communicator, null);
	}

	private Client(Communicator communicator, String clientMetaInfo) {
		super(communicator, clientMetaInfo, Collections.singletonMap("apiVersion", API_VERSION));
	}

	/**
	 * Returns a new {@link Client} which uses the passed meta data for the
	 * <i>X-GCS-ClientMetaInfo</i> header.
	 *
	 * @param clientMetaInfo
	 *            JSON string containing the meta data for the client
	 * @throws MarshallerSyntaxException
	 *            if the given clientMetaInfo is not a valid JSON string
	 */
	public Client withClientMetaInfo(String clientMetaInfo) {

		if (this.clientMetaInfo == null && clientMetaInfo == null) {
			return this;
		} else if (clientMetaInfo == null) {
			return new Client(communicator, null);
		} else {
			// Checking to see if this is valid JSON (no JSON parse exceptions)
			communicator.getMarshaller().unmarshal(clientMetaInfo, Object.class);

			clientMetaInfo = Base64.encodeBase64String(clientMetaInfo.getBytes(CHARSET));

			if (clientMetaInfo.equals(this.clientMetaInfo)) {
				return this;
			} else {
				return new Client(communicator, clientMetaInfo);
			}
		}
	}

	/**
	 * Utility method that delegates the call to this client's communicator.
	 * @see Communicator#closeIdleConnections(long, TimeUnit)
	 * @see PooledConnection#closeIdleConnections(long, TimeUnit)
	 */
	public void closeIdleConnections(long idleTime, TimeUnit timeUnit) {
		communicator.closeIdleConnections(idleTime, timeUnit);
	}

	/**
	 * Utility method that delegates the call to this client's communicator.
	 * @see Communicator#closeExpiredConnections()
	 * @see PooledConnection#closeExpiredConnections()
	 */
	public void closeExpiredConnections() {
		communicator.closeExpiredConnections();
	}

	@Override
	public void enableLogging(CommunicatorLogger communicatorLogger) {
		// delegate to the communicator
		communicator.enableLogging(communicatorLogger);
	}

	@Override
	public void disableLogging() {
		// delegate to the communicator
		communicator.disableLogging();
	}

	/**
	 * Releases any system resources associated with this object.
	 */
	@Override
	public void close() throws IOException {
		communicator.close();
	}

	/**
	 * Resource /{merchantId}
	 *
	 * @param merchantId String
	 * @return MerchantClient
	 */
	public MerchantClient merchant(String merchantId) {
		Map<String, String> subContext = new TreeMap<String, String>();
		subContext.put("merchantId", merchantId);
		return new MerchantClient(this, subContext);
	}
}
