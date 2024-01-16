/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

public class AbstractToken {

	private String alias = null;

	/**
	 * An alias for the token. This can be used to visually represent the token.<br>
	 * If no alias is given in Create token calls, a payment product specific default is used, e.g. the obfuscated card number for card payment products.<br>
	 * Do not include any unobfuscated sensitive data in the alias.
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * An alias for the token. This can be used to visually represent the token.<br>
	 * If no alias is given in Create token calls, a payment product specific default is used, e.g. the obfuscated card number for card payment products.<br>
	 * Do not include any unobfuscated sensitive data in the alias.
	 */
	public void setAlias(String value) {
		this.alias = value;
	}
}
