/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

/**
 * Object containing exemption output
 */
public class ExemptionOutput {

	private String exemptionRaised = null;

	private String exemptionRejectionReason = null;

	private String exemptionRequest = null;

	/**
	 * Type of strong customer authentication (SCA) exemption that was raised towards the acquirer for this transaction.
	 */
	public String getExemptionRaised() {
		return exemptionRaised;
	}

	/**
	 * Type of strong customer authentication (SCA) exemption that was raised towards the acquirer for this transaction.
	 */
	public void setExemptionRaised(String value) {
		this.exemptionRaised = value;
	}

	/**
	 * The request exemption could not be granted. The reason why is returned in this property.
	 */
	public String getExemptionRejectionReason() {
		return exemptionRejectionReason;
	}

	/**
	 * The request exemption could not be granted. The reason why is returned in this property.
	 */
	public void setExemptionRejectionReason(String value) {
		this.exemptionRejectionReason = value;
	}

	/**
	 * Type of strong customer authentication (SCA) exemption requested by you for this transaction.
	 */
	public String getExemptionRequest() {
		return exemptionRequest;
	}

	/**
	 * Type of strong customer authentication (SCA) exemption requested by you for this transaction.
	 */
	public void setExemptionRequest(String value) {
		this.exemptionRequest = value;
	}
}
