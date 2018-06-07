/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product;

public class DeviceFingerprintResponse {

	private String deviceFingerprintTransactionId = null;

	private String html = null;

	/**
	 * Contains the unique id which is used by the device fingerprint collector script. This must be used to set the property <span class="property">fraudFields.deviceFingerprintTransactionId</span> in either in the <span class="property">CreatePayment.fraudFields.deviceFingerprintTransactionId</span>, the <span class="property">CreateRiskAssessmentCards.fraudFields.deviceFingerprintTransactionId</span> or the <span class="property">CreateRiskAssessmentBankaccounts.fraudFields.deviceFingerprintTransactionId</span>.
	 */
	public String getDeviceFingerprintTransactionId() {
		return deviceFingerprintTransactionId;
	}

	/**
	 * Contains the unique id which is used by the device fingerprint collector script. This must be used to set the property <span class="property">fraudFields.deviceFingerprintTransactionId</span> in either in the <span class="property">CreatePayment.fraudFields.deviceFingerprintTransactionId</span>, the <span class="property">CreateRiskAssessmentCards.fraudFields.deviceFingerprintTransactionId</span> or the <span class="property">CreateRiskAssessmentBankaccounts.fraudFields.deviceFingerprintTransactionId</span>.
	 */
	public void setDeviceFingerprintTransactionId(String value) {
		this.deviceFingerprintTransactionId = value;
	}

	/**
	 * Contains the ready-to-use device fingerprint collector script. You have to inject it into your page and call it when the consumer presses the final payment submit button. You should only call it once per payment request.
	 */
	public String getHtml() {
		return html;
	}

	/**
	 * Contains the ready-to-use device fingerprint collector script. You have to inject it into your page and call it when the consumer presses the final payment submit button. You should only call it once per payment request.
	 */
	public void setHtml(String value) {
		this.html = value;
	}
}
