package com.globalcollect.gateway.sdk.java.gc;

import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

import com.globalcollect.gateway.sdk.java.GcFactory;
import com.globalcollect.gateway.sdk.java.GcFactoryTest;
import com.globalcollect.gateway.sdk.java.defaultimpl.DefaultGcMarshaller;

public class GcClientTest {

	@Test
	public void testWithClientMetaInfo() {

		GcClient client1 = GcFactory.createClient(GcFactoryTest.PROPERTIES_URI, GcFactoryTest.API_KEY_ID, GcFactoryTest.SECRET_API_KEY);

		GcClient client2 = client1.withClientMetaInfo(null);
		Assert.assertSame(client1, client2);

		String clientMetaInfo = DefaultGcMarshaller.INSTANCE.marshal(Collections.singletonMap("test", "test"));
		GcClient client3 = client1.withClientMetaInfo(clientMetaInfo);
		Assert.assertNotSame(client1, client3);

		GcClient client4 = client3.withClientMetaInfo(clientMetaInfo);
		Assert.assertSame(client3, client4);

		GcClient client5 = client3.withClientMetaInfo(null);
		Assert.assertNotSame(client3, client5);

		// nothing can be said about client1 and client5
	}
}
