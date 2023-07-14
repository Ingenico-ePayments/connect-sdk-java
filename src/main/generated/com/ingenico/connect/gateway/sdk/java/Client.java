/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;

import com.ingenico.connect.gateway.sdk.java.logging.BodyObfuscator;
import com.ingenico.connect.gateway.sdk.java.logging.CommunicatorLogger;
import com.ingenico.connect.gateway.sdk.java.logging.HeaderObfuscator;
import com.ingenico.connect.gateway.sdk.java.logging.LoggingCapable;
import com.ingenico.connect.gateway.sdk.java.logging.ObfuscationCapable;
import com.ingenico.connect.gateway.sdk.java.merchant.MerchantClient;

/**
 * Ingenico ePayments platform client.
 * <p>
 * This client and all its child clients are bound to one specific value for the <i>X-GCS-ClientMetaInfo</i> header.
 * To get a new client with a different header value, use {@link #withClientMetaInfo(String)}.
 * <p>
 * Thread-safe.
 */
public class Client extends ApiResource implements Closeable, LoggingCapable, ObfuscationCapable {

	public static final String API_VERSION = "v1";

	private static final Charset CHARSET = Charset.forName("UTF-8");

	public Client(Communicator communicator) {
		this(communicator, null);
	}

	private Client(Communicator communicator, String clientMetaInfo) {
		super(communicator, clientMetaInfo, null);
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
	 *
	 * @see Communicator#closeIdleConnections(long, TimeUnit)
	 * @see PooledConnection#closeIdleConnections(long, TimeUnit)
	 */
	public void closeIdleConnections(long idleTime, TimeUnit timeUnit) {
		communicator.closeIdleConnections(idleTime, timeUnit);
	}

	/**
	 * Utility method that delegates the call to this client's communicator.
	 *
	 * @see Communicator#closeExpiredConnections()
	 * @see PooledConnection#closeExpiredConnections()
	 */
	public void closeExpiredConnections() {
		communicator.closeExpiredConnections();
	}

	@Override
	public void setBodyObfuscator(BodyObfuscator bodyObfuscator) {
		// delegate to the communicator
		communicator.setBodyObfuscator(bodyObfuscator);
	}

	@Override
	public void setHeaderObfuscator(HeaderObfuscator headerObfuscator) {
		// delegate to the communicator
		communicator.setHeaderObfuscator(headerObfuscator);
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
