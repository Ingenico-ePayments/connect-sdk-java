/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class ExternalCardholderAuthenticationData {

	private String cavv = null;

	private String cavvAlgorithm = null;

	private Integer eci = null;

	private String validationResult = null;

	private String xid = null;

	/**
	 * The CAVV (cardholder authentication verification value) or AAV (accountholder authentication value) provides an authentication validation value.
	 */
	public String getCavv() {
		return cavv;
	}

	/**
	 * The CAVV (cardholder authentication verification value) or AAV (accountholder authentication value) provides an authentication validation value.
	 */
	public void setCavv(String value) {
		this.cavv = value;
	}

	/**
	 * The algorithm, from your 3D Secure provider, used to generate the authentication CAVV.
	 */
	public String getCavvAlgorithm() {
		return cavvAlgorithm;
	}

	/**
	 * The algorithm, from your 3D Secure provider, used to generate the authentication CAVV.
	 */
	public void setCavvAlgorithm(String value) {
		this.cavvAlgorithm = value;
	}

	/**
	 * Electronic Commerce Indicator provides authentication validation results returned after AUTHENTICATIONVALIDATION
	 * <ul><li>0 = No authentication, Internet (no liability shift, not a 3D Secure transaction)
	 * <li>1 = Authentication attempted (MasterCard)
	 * <li>2 = Successful authentication (MasterCard)
	 * <li>5 = Successful authentication (Visa, Diners Club, Amex)
	 * <li>6 = Authentication attempted (Visa, Diners Club, Amex)
	 * <li>7 = No authentication, Internet (no liability shift, not a 3D Secure transaction)
	 * <li>(empty) = Not checked or not enrolled
	 * </ul>
	 */
	public Integer getEci() {
		return eci;
	}

	/**
	 * Electronic Commerce Indicator provides authentication validation results returned after AUTHENTICATIONVALIDATION
	 * <ul><li>0 = No authentication, Internet (no liability shift, not a 3D Secure transaction)
	 * <li>1 = Authentication attempted (MasterCard)
	 * <li>2 = Successful authentication (MasterCard)
	 * <li>5 = Successful authentication (Visa, Diners Club, Amex)
	 * <li>6 = Authentication attempted (Visa, Diners Club, Amex)
	 * <li>7 = No authentication, Internet (no liability shift, not a 3D Secure transaction)
	 * <li>(empty) = Not checked or not enrolled
	 * </ul>
	 */
	public void setEci(Integer value) {
		this.eci = value;
	}

	/**
	 * The 3D Secure authentication result from your 3D Secure provider.
	 */
	public String getValidationResult() {
		return validationResult;
	}

	/**
	 * The 3D Secure authentication result from your 3D Secure provider.
	 */
	public void setValidationResult(String value) {
		this.validationResult = value;
	}

	/**
	 * The transaction ID that is used for the 3D Authentication
	 */
	public String getXid() {
		return xid;
	}

	/**
	 * The transaction ID that is used for the 3D Authentication
	 */
	public void setXid(String value) {
		this.xid = value;
	}
}
