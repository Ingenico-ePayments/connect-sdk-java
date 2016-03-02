package com.globalcollect.gateway.sdk.java.gc;

import com.globalcollect.gateway.sdk.java.GcMarshallerSyntaxException;
import com.globalcollect.gateway.sdk.java.gc.merchant.MerchantClient;
import java.io.Closeable;
import java.io.IOException;

/**
 * GlobalCollect platform client.
 * <p>
 * This client and all its child clients are bound to one specific value for the <i>X-GCS-ClientMetaInfo</i> header.
 * To get a new client with a different header value, use {@link #withClientMetaInfo(String)}.
 * <p>
 * Thread-safe.
 */
public interface GcClient extends Closeable {

	/**
	 * Returns a new {@link GcClient} which uses the passed meta data for the
	 * <i>X-GCS-ClientMetaInfo</i> header.
	 *
	 * @param clientMetaInfo
	 *            JSON string containing the meta data for the client
	 * @throws GcMarshallerSyntaxException
	 *            if the given clientMetaInfo is not a valid JSON string
	 */
	GcClient withClientMetaInfo(String clientMetaInfo);

	/**
	 * Releases any system resources associated with this object.
	 */
	@Override
	void close() throws IOException;

	/**
	 * Resource /{merchantId}
	 * 
	 * @param merchantId String
	 * @return Merchant
	 */
	MerchantClient merchant(String merchantId);

}
