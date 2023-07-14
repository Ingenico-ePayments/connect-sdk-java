package com.ingenico.connect.gateway.sdk.java.defaultimpl;

public enum AuthorizationType {

	V1HMAC("v1HMAC");

	private final String signatureString;

	AuthorizationType(String signatureString) {
		this.signatureString = signatureString;
	}

	String getSignatureString() {
		return signatureString;
	}
}
