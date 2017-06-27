/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.publickey;

public class PublicKey {

	private String keyId = null;

	private String publicKey = null;

	/**
	 * The identifier of the key that is used to encrypt sensitive data
	 */
	public String getKeyId() {
		return keyId;
	}

	/**
	 * The identifier of the key that is used to encrypt sensitive data
	 */
	public void setKeyId(String value) {
		this.keyId = value;
	}

	/**
	 * The public key that is used to encrypt the sensitive data with. Only we have the private key and will be able to decrypt the encrypted payment details.
	 */
	public String getPublicKey() {
		return publicKey;
	}

	/**
	 * The public key that is used to encrypt the sensitive data with. Only we have the private key and will be able to decrypt the encrypted payment details.
	 */
	public void setPublicKey(String value) {
		this.publicKey = value;
	}
}
