package com.ingenico.connect.gateway.sdk.java.webhooks;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * An in-memory secret key store.
 * This implementation can be used in applications where secret keys can be specified at application startup.
 * Thread-safe.
 */
public final class InMemorySecretKeyStore implements SecretKeyStore {

	public static final InMemorySecretKeyStore INSTANCE = new InMemorySecretKeyStore();

	private final Map<String, String> store = new ConcurrentHashMap<String, String>();

	private InMemorySecretKeyStore() {
	}

	@Override
	public String getSecretKey(String keyId) {
		String secretKey = store.get(keyId);
		if (secretKey == null) {
			throw new SecretKeyNotAvailableException("could not find secret key for key id " + keyId, keyId);
		}
		return secretKey;
	}

	/**
	 * Stores the given secret key for the given key id.
	 */
	public void storeSecretKey(String keyId, String secretKey) {
		if (keyId == null || keyId.trim().isEmpty()) {
			throw new IllegalArgumentException("keyId is required");
		}
		if (secretKey == null || secretKey.trim().isEmpty()) {
			throw new IllegalArgumentException("secretKey is required");
		}
		store.put(keyId, secretKey);
	}

	/**
	 * Removes the secret key for the given key id.
	 */
	public void removeSecretKey(String keyId) {
		store.remove(keyId);
	}

	/**
	 * Removes all stored secret keys.
	 */
	public void clear() {
		store.clear();
	}
}
