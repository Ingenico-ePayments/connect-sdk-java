/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Object containing data on the authentication used by the customer to access their account
 */
public class CustomerAccountAuthentication {

	private String data = null;

	private String method = null;

	private String utcTimestamp = null;

	/**
	 * Data that documents and supports a specific authentication process submitted using the order.customer.account.authentication.method property. The data submitted using this property will be used by the issuer to validate the used authentication method.
	 * <br>For example, if the order.customer.account.authentication.method is:
	 * <ul class="paragraph-width"><li>federated-id, then this element can carry information about the provider of the federated ID and related information.
	 * <li>fido-authentication, then this element can carry the FIDO attestation data (including the signature).
	 * <li>fido-authentication-with-signed-assurance-data, then this element can carry FIDO Attestation data with the FIDO assurance data signed.
	 * <li>src-assurance-data, then this element can carry the SRC assurance data</ul>
	 */
	public String getData() {
		return data;
	}

	/**
	 * Data that documents and supports a specific authentication process submitted using the order.customer.account.authentication.method property. The data submitted using this property will be used by the issuer to validate the used authentication method.
	 * <br>For example, if the order.customer.account.authentication.method is:
	 * <ul class="paragraph-width"><li>federated-id, then this element can carry information about the provider of the federated ID and related information.
	 * <li>fido-authentication, then this element can carry the FIDO attestation data (including the signature).
	 * <li>fido-authentication-with-signed-assurance-data, then this element can carry FIDO Attestation data with the FIDO assurance data signed.
	 * <li>src-assurance-data, then this element can carry the SRC assurance data</ul>
	 */
	public void setData(String value) {
		this.data = value;
	}

	/**
	 * Authentication used by the customer on your website or app
	 * <br>Possible values :
	 * <ul class="paragraph-width"><li>guest = no login occurred, customer is 'logged in' as guest
	 * <li>merchant-credentials = the customer logged in using credentials that are specific to you 
	 * <li>federated-id = the customer logged in using a federated ID
	 * <li>issuer-credentials = the customer logged in using credentials from the card issuer (of the card used in this transaction)
	 * <li>third-party-authentication = the customer logged in using third-party authentication
	 * <li>fido-authentication = the customer logged in using a FIDO authenticator
	 * <li>fido-authentication-with-signed-assurance-data = the customer logged in using a FIDO authenticator which also provides signed assurance data
	 * <li>src-assurance-data = the customer authenticated themselves during a Secure Remote Commerce session</ul>
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * Authentication used by the customer on your website or app
	 * <br>Possible values :
	 * <ul class="paragraph-width"><li>guest = no login occurred, customer is 'logged in' as guest
	 * <li>merchant-credentials = the customer logged in using credentials that are specific to you 
	 * <li>federated-id = the customer logged in using a federated ID
	 * <li>issuer-credentials = the customer logged in using credentials from the card issuer (of the card used in this transaction)
	 * <li>third-party-authentication = the customer logged in using third-party authentication
	 * <li>fido-authentication = the customer logged in using a FIDO authenticator
	 * <li>fido-authentication-with-signed-assurance-data = the customer logged in using a FIDO authenticator which also provides signed assurance data
	 * <li>src-assurance-data = the customer authenticated themselves during a Secure Remote Commerce session</ul>
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
