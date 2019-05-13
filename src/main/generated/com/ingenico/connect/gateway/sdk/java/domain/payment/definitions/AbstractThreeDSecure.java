/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class AbstractThreeDSecure {

	private String authenticationFlow = null;

	private String challengeCanvasSize = null;

	private String challengeIndicator = null;

	private ThreeDSecureData priorThreeDSecureData = null;

	private SdkDataInput sdkData = null;

	private Boolean skipAuthentication = null;

	public String getAuthenticationFlow() {
		return authenticationFlow;
	}

	public void setAuthenticationFlow(String value) {
		this.authenticationFlow = value;
	}

	public String getChallengeCanvasSize() {
		return challengeCanvasSize;
	}

	public void setChallengeCanvasSize(String value) {
		this.challengeCanvasSize = value;
	}

	public String getChallengeIndicator() {
		return challengeIndicator;
	}

	public void setChallengeIndicator(String value) {
		this.challengeIndicator = value;
	}

	public ThreeDSecureData getPriorThreeDSecureData() {
		return priorThreeDSecureData;
	}

	public void setPriorThreeDSecureData(ThreeDSecureData value) {
		this.priorThreeDSecureData = value;
	}

	public SdkDataInput getSdkData() {
		return sdkData;
	}

	public void setSdkData(SdkDataInput value) {
		this.sdkData = value;
	}

	public Boolean getSkipAuthentication() {
		return skipAuthentication;
	}

	public void setSkipAuthentication(Boolean value) {
		this.skipAuthentication = value;
	}
}
