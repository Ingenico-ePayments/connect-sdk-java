/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RetailDecisionsCCFraudCheckOutput">RetailDecisionsCCFraudCheckOutput</a>
 */
public class RetailDecisionsCCFraudCheckOutput {

	private String fraudCode = null;

	private String fraudNeural = null;

	private String fraudRCF = null;

	public String getFraudCode() {
		return fraudCode;
	}

	public void setFraudCode(String value) {
		this.fraudCode = value;
	}

	public String getFraudNeural() {
		return fraudNeural;
	}

	public void setFraudNeural(String value) {
		this.fraudNeural = value;
	}

	public String getFraudRCF() {
		return fraudRCF;
	}

	public void setFraudRCF(String value) {
		this.fraudRCF = value;
	}
}
