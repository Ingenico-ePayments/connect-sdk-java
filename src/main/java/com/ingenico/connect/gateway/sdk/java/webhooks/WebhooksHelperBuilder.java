package com.ingenico.connect.gateway.sdk.java.webhooks;

import com.ingenico.connect.gateway.sdk.java.Marshaller;

/**
 * Builder for a {@link WebhooksHelper} object.
 */
public class WebhooksHelperBuilder {

	private Marshaller marshaller;

	private SecretKeyStore secretKeyStore;

	/**
	 * Sets the {@link Marshaller} to use.
	 */
	public WebhooksHelperBuilder withMarshaller(Marshaller marshaller) {
		this.marshaller = marshaller;
		return this;
	}

	/**
	 * Sets the {@link SecretKeyStore} to use.
	 */
	public WebhooksHelperBuilder withSecretKeyStore(SecretKeyStore secretKeyStore) {
		this.secretKeyStore = secretKeyStore;
		return this;
	}

	/**
	 * Creates a fully initialized {@link WebhooksHelper} object.
	 *
	 * @throws IllegalArgumentException if not all required components are set
	 */
	public WebhooksHelper build() {
		return new WebhooksHelper(marshaller, secretKeyStore);
	}
}
