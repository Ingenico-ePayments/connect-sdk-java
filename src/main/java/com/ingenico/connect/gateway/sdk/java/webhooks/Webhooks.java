package com.ingenico.connect.gateway.sdk.java.webhooks;

import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultMarshaller;

/**
 * Ingenico ePayments platform factory for several webhooks components.
 */
public final class Webhooks {

	private Webhooks() {}

	/**
	 * Creates a {@link WebhooksHelperBuilder} that will use the given {@link SecretKeyStore}.
	 */
	public static WebhooksHelperBuilder createHelperBuilder(SecretKeyStore secretKeyStore) {

		return new WebhooksHelperBuilder()
				.withMarshaller(DefaultMarshaller.INSTANCE)
				.withSecretKeyStore(secretKeyStore);
	}

	/**
	 * Creates a {@link WebhooksHelper} that will use the given {@link SecretKeyStore}.
	 */
	public static WebhooksHelper createHelper(SecretKeyStore secretKeyStore) {
		WebhooksHelperBuilder webhooksHelperBuilder = createHelperBuilder(secretKeyStore);
		return webhooksHelperBuilder.build();
	}
}
