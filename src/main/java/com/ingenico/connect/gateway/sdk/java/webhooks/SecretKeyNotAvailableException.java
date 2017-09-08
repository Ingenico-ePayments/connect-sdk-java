package com.ingenico.connect.gateway.sdk.java.webhooks;

/**
 * Represents an error that causes a secret key to not be available.
 */
@SuppressWarnings("serial")
public class SecretKeyNotAvailableException extends SignatureValidationException {

	private final String keyId;

	public SecretKeyNotAvailableException(String message, String keyId) {
		super(message);
		this.keyId = keyId;
	}

	public SecretKeyNotAvailableException(String keyId, Throwable cause) {
		super(cause);
		this.keyId = keyId;
	}

	public SecretKeyNotAvailableException(String message, String keyId, Throwable cause) {
		super(message, cause);
		this.keyId = keyId;
	}

	public String getKeyId() {
		return keyId;
	}
}
