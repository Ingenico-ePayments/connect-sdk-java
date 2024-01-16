/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

public class GPayThreeDSecure {

	private String challengeCanvasSize = null;

	private String challengeIndicator = null;

	private String exemptionRequest = null;

	private RedirectionData redirectionData = null;

	private Boolean skipAuthentication = null;

	/**
	 * Dimensions of the challenge window that potentially will be displayed to the customer. The challenge content is formatted to appropriately render in this window to provide the best possible user experience.<br>Preconfigured sizes are width x height in pixels of the window displayed in the customer browser window. Possible values are:<br><ul class="paragraph-width"><li>250x400 (default)</li><li>390x400</li><li>500x600</li><li>600x400</li><li>full-screen</li></ul>.
	 */
	public String getChallengeCanvasSize() {
		return challengeCanvasSize;
	}

	/**
	 * Dimensions of the challenge window that potentially will be displayed to the customer. The challenge content is formatted to appropriately render in this window to provide the best possible user experience.<br>Preconfigured sizes are width x height in pixels of the window displayed in the customer browser window. Possible values are:<br><ul class="paragraph-width"><li>250x400 (default)</li><li>390x400</li><li>500x600</li><li>600x400</li><li>full-screen</li></ul>.
	 */
	public void setChallengeCanvasSize(String value) {
		this.challengeCanvasSize = value;
	}

	/**
	 * Allows you to indicate if you want the customer to be challenged for extra security on this transaction.
	 * 
	 * Possible values:
	 * <ul class="paragraph-width"><li>no-preference - You have no preference whether or not to challenge the customer (default)</li>
	 * <li>no-challenge-requested - you prefer the cardholder not to be challenged</li>
	 * <li>challenge-requested - you prefer the customer to be challenged</li>
	 * <li>challenge-required - you require the customer to be challenged</li></ul>
	 */
	public String getChallengeIndicator() {
		return challengeIndicator;
	}

	/**
	 * Allows you to indicate if you want the customer to be challenged for extra security on this transaction.
	 * 
	 * Possible values:
	 * <ul class="paragraph-width"><li>no-preference - You have no preference whether or not to challenge the customer (default)</li>
	 * <li>no-challenge-requested - you prefer the cardholder not to be challenged</li>
	 * <li>challenge-requested - you prefer the customer to be challenged</li>
	 * <li>challenge-required - you require the customer to be challenged</li></ul>
	 */
	public void setChallengeIndicator(String value) {
		this.challengeIndicator = value;
	}

	/**
	 * Type of strong customer authentication (SCA) exemption requested for this transaction. Possible values:<ul class="paragraph-width"><li>none - No exemption flagging is to be used of this transaction (Default).</li>
	 * <li>automatic - Our systems will determine the best possible exemption based on the transaction parameters and the risk scores.</li>
	 * <li>transaction-risk-analysis - You have determined that this transaction is of low risk and are willing to take the liability. Please note that your fraud rate needs to stay below thresholds to allow your use of this exemption.</li>
	 * <li>low-value - The value of the transaction is below 30 EUR. Please note that the issuer will still require every 5th low-value transaction pithing 24 hours to be strongly authenticated. The issuer will also keep track of the cumulative amount authorized on the card. When this exceeds 100 EUR strong customer authentication is also required.</li>
	 * <li>whitelist - You have been whitelisted by the customer at the issuer.</li></ul>
	 */
	public String getExemptionRequest() {
		return exemptionRequest;
	}

	/**
	 * Type of strong customer authentication (SCA) exemption requested for this transaction. Possible values:<ul class="paragraph-width"><li>none - No exemption flagging is to be used of this transaction (Default).</li>
	 * <li>automatic - Our systems will determine the best possible exemption based on the transaction parameters and the risk scores.</li>
	 * <li>transaction-risk-analysis - You have determined that this transaction is of low risk and are willing to take the liability. Please note that your fraud rate needs to stay below thresholds to allow your use of this exemption.</li>
	 * <li>low-value - The value of the transaction is below 30 EUR. Please note that the issuer will still require every 5th low-value transaction pithing 24 hours to be strongly authenticated. The issuer will also keep track of the cumulative amount authorized on the card. When this exceeds 100 EUR strong customer authentication is also required.</li>
	 * <li>whitelist - You have been whitelisted by the customer at the issuer.</li></ul>
	 */
	public void setExemptionRequest(String value) {
		this.exemptionRequest = value;
	}

	/**
	 * Object containing browser specific redirection related data
	 */
	public RedirectionData getRedirectionData() {
		return redirectionData;
	}

	/**
	 * Object containing browser specific redirection related data
	 */
	public void setRedirectionData(RedirectionData value) {
		this.redirectionData = value;
	}

	/**
	 * <ul class="paragraph-width"><li>true = 3D Secure authentication will be skipped for this transaction. This setting should be used when isRecurring is set to true and recurringPaymentSequenceIndicator is set to recurring.
	 * <li>false = 3D Secure authentication will not be skipped for this transaction.
	 * </ul>
	 * Note: This is only possible if your account in our system is setup for 3D Secure authentication and if your configuration in our system allows you to override it per transaction.
	 */
	public Boolean getSkipAuthentication() {
		return skipAuthentication;
	}

	/**
	 * <ul class="paragraph-width"><li>true = 3D Secure authentication will be skipped for this transaction. This setting should be used when isRecurring is set to true and recurringPaymentSequenceIndicator is set to recurring.
	 * <li>false = 3D Secure authentication will not be skipped for this transaction.
	 * </ul>
	 * Note: This is only possible if your account in our system is setup for 3D Secure authentication and if your configuration in our system allows you to override it per transaction.
	 */
	public void setSkipAuthentication(Boolean value) {
		this.skipAuthentication = value;
	}
}
