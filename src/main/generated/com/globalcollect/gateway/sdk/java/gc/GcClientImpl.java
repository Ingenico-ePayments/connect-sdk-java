package com.globalcollect.gateway.sdk.java.gc;

import com.globalcollect.gateway.sdk.java.GcApiResource;
import com.globalcollect.gateway.sdk.java.GcCommunicator;
import com.globalcollect.gateway.sdk.java.TypeWrapper;
import com.globalcollect.gateway.sdk.java.gc.merchant.MerchantClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.MerchantClientImpl;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.codec.binary.Base64;

public class GcClientImpl extends GcApiResource implements GcClient {

	private static final Charset CHARSET = Charset.forName("UTF-8");
	
	public GcClientImpl(GcCommunicator communicator) {
		this(communicator, null);
	}

	private GcClientImpl(GcCommunicator communicator, String clientMetaInfo) {
		super(communicator, clientMetaInfo, null);
	}

	@Override
	public GcClient withClientMetaInfo(String clientMetaInfo) {
		
		if (this.clientMetaInfo == null && clientMetaInfo == null) {
			return this;
		} else if (clientMetaInfo == null) {
			return new GcClientImpl(communicator, null);
		} else {
			// Checking to see if this is valid JSON (no JSON parse exceptions)
			communicator.getMarshaller().unmarshal(clientMetaInfo, new TypeWrapper<Object>(Object.class));
			
			clientMetaInfo = Base64.encodeBase64String(clientMetaInfo.getBytes(CHARSET));
			
			if (clientMetaInfo.equals(this.clientMetaInfo)) {
				return this;
			} else {
				return new GcClientImpl(communicator, clientMetaInfo);
			}
		}
	}

	@Override
	public void close() throws IOException {
		communicator.close();
	}

	/**
	 * Resource /{merchantId}
	 * 
	 * @param merchantId String
	 * @return Merchant
	 */
	@Override
	public MerchantClient merchant(String merchantId) {
		Map<String, String> subcontext = new TreeMap<String, String>();
		subcontext.put("merchantId", merchantId);
		return new MerchantClientImpl(this, subcontext);
	}

}
