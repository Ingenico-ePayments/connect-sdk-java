package com.ingenico.connect.gateway.sdk.java.webhooks;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.Marshaller;
import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultMarshaller;
import com.ingenico.connect.gateway.sdk.java.util.ReflectionUtil;

public class WebhooksTest {

	@Test
	public void testCreateHelper() {
		WebhooksHelper helper = Webhooks.createHelper(InMemorySecretKeyStore.INSTANCE);

		Assert.assertSame(DefaultMarshaller.INSTANCE, ReflectionUtil.getField(helper, "marshaller", Marshaller.class));
		Assert.assertSame(InMemorySecretKeyStore.INSTANCE, ReflectionUtil.getField(helper, "secretKeyStore", SecretKeyStore.class));
	}
}
