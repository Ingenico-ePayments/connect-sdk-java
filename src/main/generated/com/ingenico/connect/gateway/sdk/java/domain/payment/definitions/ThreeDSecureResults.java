/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Object containing the 3-D Secure specific results
 */
public class ThreeDSecureResults {

	private String acsTransactionId = null;

	private String appliedExemption = null;

	private String cavv = null;

	private String directoryServerTransactionId = null;

	private String eci = null;

	private Integer schemeRiskScore = null;

	private SdkDataOutput sdkData = null;

	private ThreeDSecureData threeDSecureData = null;

	private String threeDSecureVersion = null;

	private String threeDServerTransactionId = null;

	private String xid = null;

	/**
	 * Identifier of the authenticated transaction at the ACS/Issuer
	 */
	public String getAcsTransactionId() {
		return acsTransactionId;
	}

	/**
	 * Identifier of the authenticated transaction at the ACS/Issuer
	 */
	public void setAcsTransactionId(String value) {
		this.acsTransactionId = value;
	}

	/**
	 * Exemption code from Carte Bancaire (130) (unknown possible values so far -free format)
	 */
	public String getAppliedExemption() {
		return appliedExemption;
	}

	/**
	 * Exemption code from Carte Bancaire (130) (unknown possible values so far -free format)
	 */
	public void setAppliedExemption(String value) {
		this.appliedExemption = value;
	}

	/**
	 * CAVV or AVV result indicating authentication validation value
	 */
	public String getCavv() {
		return cavv;
	}

	/**
	 * CAVV or AVV result indicating authentication validation value
	 */
	public void setCavv(String value) {
		this.cavv = value;
	}

	/**
	 * The 3-D Secure Directory Server transaction ID that is used for the 3D Authentication
	 */
	public String getDirectoryServerTransactionId() {
		return directoryServerTransactionId;
	}

	/**
	 * The 3-D Secure Directory Server transaction ID that is used for the 3D Authentication
	 */
	public void setDirectoryServerTransactionId(String value) {
		this.directoryServerTransactionId = value;
	}

	/**
	 * Indicates Authentication validation results returned after AuthenticationValidation
	 */
	public String getEci() {
		return eci;
	}

	/**
	 * Indicates Authentication validation results returned after AuthenticationValidation
	 */
	public void setEci(String value) {
		this.eci = value;
	}

	/**
	 * Global score calculated by the Carte Bancaire (130) Scoring platform. Possible values from 0 to 99
	 */
	public Integer getSchemeRiskScore() {
		return schemeRiskScore;
	}

	/**
	 * Global score calculated by the Carte Bancaire (130) Scoring platform. Possible values from 0 to 99
	 */
	public void setSchemeRiskScore(Integer value) {
		this.schemeRiskScore = value;
	}

	/**
	 * Object containing 3-D Secure in-app SDK data
	 */
	public SdkDataOutput getSdkData() {
		return sdkData;
	}

	/**
	 * Object containing 3-D Secure in-app SDK data
	 */
	public void setSdkData(SdkDataOutput value) {
		this.sdkData = value;
	}

	/**
	 * Object containing data regarding the 3-D Secure authentication
	 */
	public ThreeDSecureData getThreeDSecureData() {
		return threeDSecureData;
	}

	/**
	 * Object containing data regarding the 3-D Secure authentication
	 */
	public void setThreeDSecureData(ThreeDSecureData value) {
		this.threeDSecureData = value;
	}

	/**
	 * The 3-D Secure version used for the authentication.
	 * <p>This property is used in the communication with the acquirer
	 */
	public String getThreeDSecureVersion() {
		return threeDSecureVersion;
	}

	/**
	 * The 3-D Secure version used for the authentication.
	 * <p>This property is used in the communication with the acquirer
	 */
	public void setThreeDSecureVersion(String value) {
		this.threeDSecureVersion = value;
	}

	/**
	 * The 3-D Secure Server transaction ID that is used for the 3-D Secure version 2 Authentication.
	 */
	public String getThreeDServerTransactionId() {
		return threeDServerTransactionId;
	}

	/**
	 * The 3-D Secure Server transaction ID that is used for the 3-D Secure version 2 Authentication.
	 */
	public void setThreeDServerTransactionId(String value) {
		this.threeDServerTransactionId = value;
	}

	/**
	 * Transaction ID for the Authentication
	 */
	public String getXid() {
		return xid;
	}

	/**
	 * Transaction ID for the Authentication
	 */
	public void setXid(String value) {
		this.xid = value;
	}
}
