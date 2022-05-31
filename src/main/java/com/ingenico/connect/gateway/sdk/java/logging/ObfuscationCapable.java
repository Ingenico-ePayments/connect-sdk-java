package com.ingenico.connect.gateway.sdk.java.logging;

/**
 * Classes that implement this interface support obfuscating bodies and headers.
 */
public interface ObfuscationCapable {

	/**
	 * Sets the current non-{@code null} body obfuscator to use.
	 */
	void setBodyObfuscator(BodyObfuscator bodyObfuscator);

	/**
	 * Sets the current non-{@code null} header obfuscator to use.
	 */
	void setHeaderObfuscator(HeaderObfuscator headerObfuscator);
}
