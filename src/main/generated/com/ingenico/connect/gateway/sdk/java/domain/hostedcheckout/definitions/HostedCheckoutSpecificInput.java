/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_HostedCheckoutSpecificInput">HostedCheckoutSpecificInput</a>
 */
public class HostedCheckoutSpecificInput {

	private Boolean isRecurring = null;

	private String locale = null;

	private PaymentProductFiltersHostedCheckout paymentProductFilters = null;

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

	public PaymentProductFiltersHostedCheckout getPaymentProductFilters() {
		return paymentProductFilters;
	}

	public void setPaymentProductFilters(PaymentProductFiltersHostedCheckout value) {
		this.paymentProductFilters = value;
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
