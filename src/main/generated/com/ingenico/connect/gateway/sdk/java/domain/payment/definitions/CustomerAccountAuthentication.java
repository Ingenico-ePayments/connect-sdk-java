/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Object containing data on the authentication used by the customer to access their account
 */
public class CustomerAccountAuthentication {

	private String method = null;

	private String utcTimestamp = null;

	/**
	 * Authentication used by the customer on your website
	 * <br>Possible values :
	 * <ul class="paragraph-width"><li>guest = no login occurred, customer is 'logged in' as guest
	 * <li>merchant-credentials = the customer logged in using credentials that are specific to you 
	 * <li>federated-id = the customer logged in using a federated ID
	 * <li>issuer-credentials = the customer logged in using credentials from the card issuer (of the card used in this transaction)
	 * <li>third-party-authentication = the customer logged in using third-party authentication
	 * <li>fido-authentication = the customer logged in using a FIDO authenticator</ul>
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * Authentication used by the customer on your website
	 * <br>Possible values :
	 * <ul class="paragraph-width"><li>guest = no login occurred, customer is 'logged in' as guest
	 * <li>merchant-credentials = the customer logged in using credentials that are specific to you 
	 * <li>federated-id = the customer logged in using a federated ID
	 * <li>issuer-credentials = the customer logged in using credentials from the card issuer (of the card used in this transaction)
	 * <li>third-party-authentication = the customer logged in using third-party authentication
	 * <li>fido-authentication = the customer logged in using a FIDO authenticator</ul>
	 */
	public void setMethod(String value) {
		this.method = value;
	}

	/**
	 * Timestamp (YYYYMMDDHHmm) of the authentication of the customer to their account with you
	 */
	public String getUtcTimestamp() {
		return utcTimestamp;
	}

	/**
	 * Timestamp (YYYYMMDDHHmm) of the authentication of the customer to their account with you
	 */
	public void setUtcTimestamp(String value) {
		this.utcTimestamp = value;
	}
}
