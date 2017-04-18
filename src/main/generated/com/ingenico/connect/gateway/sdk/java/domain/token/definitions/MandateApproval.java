/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.token.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_MandateApproval">MandateApproval</a>
 */
public class MandateApproval {

	private String mandateSignatureDate = null;

	private String mandateSignaturePlace = null;

	private Boolean mandateSigned = null;

	public String getMandateSignatureDate() {
		return mandateSignatureDate;
	}

	public void setMandateSignatureDate(String value) {
		this.mandateSignatureDate = value;
	}

	public String getMandateSignaturePlace() {
		return mandateSignaturePlace;
	}

	public void setMandateSignaturePlace(String value) {
		this.mandateSignaturePlace = value;
	}

	public Boolean getMandateSigned() {
		return mandateSigned;
	}

	public void setMandateSigned(Boolean value) {
		this.mandateSigned = value;
	}
}
