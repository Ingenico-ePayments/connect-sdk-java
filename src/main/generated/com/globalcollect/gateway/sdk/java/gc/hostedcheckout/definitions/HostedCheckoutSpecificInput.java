package com.globalcollect.gateway.sdk.java.gc.hostedcheckout.definitions;


public class HostedCheckoutSpecificInput {

	private Boolean isRecurring = null;

	private String locale = null;

	private String returnUrl = null;

	private Boolean showResultPage = null;

	private String tokens = null;

	private String variant = null;

	public Boolean getIsRecurring() {
		return isRecurring;
	}

	public void setIsRecurring(Boolean value) {
		this.isRecurring = value;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String value) {
		this.locale = value;
	}

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String value) {
		this.returnUrl = value;
	}

	public Boolean getShowResultPage() {
		return showResultPage;
	}

	public void setShowResultPage(Boolean value) {
		this.showResultPage = value;
	}

	public String getTokens() {
		return tokens;
	}

	public void setTokens(String value) {
		this.tokens = value;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String value) {
		this.variant = value;
	}
}
