/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProduct">PaymentProduct</a>
 */
public class PaymentProduct {

	private List<AccountOnFile> accountsOnFile = null;

	private Boolean allowsRecurring = null;

	private Boolean allowsTokenization = null;

	private Boolean autoTokenized = null;

	private Boolean canBeIframed = null;

	private PaymentProductDisplayHints displayHints = null;

	private List<PaymentProductField> fields = null;

	private Integer id = null;

	private Long maxAmount = null;

	private Long minAmount = null;

	private String mobileIntegrationLevel = null;

	private String paymentMethod = null;

	private String paymentProductGroup = null;

	private Boolean usesRedirectionTo3rdParty = null;

	public List<AccountOnFile> getAccountsOnFile() {
		return accountsOnFile;
	}

	public void setAccountsOnFile(List<AccountOnFile> value) {
		this.accountsOnFile = value;
	}

	public Boolean getAllowsRecurring() {
		return allowsRecurring;
	}

	public void setAllowsRecurring(Boolean value) {
		this.allowsRecurring = value;
	}

	public Boolean getAllowsTokenization() {
		return allowsTokenization;
	}

	public void setAllowsTokenization(Boolean value) {
		this.allowsTokenization = value;
	}

	public Boolean getAutoTokenized() {
		return autoTokenized;
	}

	public void setAutoTokenized(Boolean value) {
		this.autoTokenized = value;
	}

	public Boolean getCanBeIframed() {
		return canBeIframed;
	}

	public void setCanBeIframed(Boolean value) {
		this.canBeIframed = value;
	}

	public PaymentProductDisplayHints getDisplayHints() {
		return displayHints;
	}

	public void setDisplayHints(PaymentProductDisplayHints value) {
		this.displayHints = value;
	}

	public List<PaymentProductField> getFields() {
		return fields;
	}

	public void setFields(List<PaymentProductField> value) {
		this.fields = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer value) {
		this.id = value;
	}

	public Long getMaxAmount() {
		return maxAmount;
	}

	public void setMaxAmount(Long value) {
		this.maxAmount = value;
	}

	public Long getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(Long value) {
		this.minAmount = value;
	}

	public String getMobileIntegrationLevel() {
		return mobileIntegrationLevel;
	}

	public void setMobileIntegrationLevel(String value) {
		this.mobileIntegrationLevel = value;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String value) {
		this.paymentMethod = value;
	}

	public String getPaymentProductGroup() {
		return paymentProductGroup;
	}

	public void setPaymentProductGroup(String value) {
		this.paymentProductGroup = value;
	}

	public Boolean getUsesRedirectionTo3rdParty() {
		return usesRedirectionTo3rdParty;
	}

	public void setUsesRedirectionTo3rdParty(Boolean value) {
		this.usesRedirectionTo3rdParty = value;
	}
}
