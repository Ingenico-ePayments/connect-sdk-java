/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

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

	/**
	 * List of tokens for that payment product
	 */
	public List<AccountOnFile> getAccountsOnFile() {
		return accountsOnFile;
	}

	/**
	 * List of tokens for that payment product
	 */
	public void setAccountsOnFile(List<AccountOnFile> value) {
		this.accountsOnFile = value;
	}

	/**
	 * Indicates if the product supports recurring payments
	 * <ul>
	 * <li>true - This payment product supports recurring payments
	 * <li>false - This payment product does not support recurring transactions and can only be used for one-off payments
	 * </ul>
	 */
	public Boolean getAllowsRecurring() {
		return allowsRecurring;
	}

	/**
	 * Indicates if the product supports recurring payments
	 * <ul>
	 * <li>true - This payment product supports recurring payments
	 * <li>false - This payment product does not support recurring transactions and can only be used for one-off payments
	 * </ul>
	 */
	public void setAllowsRecurring(Boolean value) {
		this.allowsRecurring = value;
	}

	/**
	 * Indicates if the payment details can be tokenized for future re-use
	 * <ul>
	 * <li>true - Payment details from payments done with this payment product can be tokenized for future re-use
	 * <li>false - Payment details from payments done with this payment product can not be tokenized
	 * </ul>
	 */
	public Boolean getAllowsTokenization() {
		return allowsTokenization;
	}

	/**
	 * Indicates if the payment details can be tokenized for future re-use
	 * <ul>
	 * <li>true - Payment details from payments done with this payment product can be tokenized for future re-use
	 * <li>false - Payment details from payments done with this payment product can not be tokenized
	 * </ul>
	 */
	public void setAllowsTokenization(Boolean value) {
		this.allowsTokenization = value;
	}

	/**
	 * Indicates if the payment details can be automatically tokenized for future re-use
	 * <ul>
	 * <li>true - Payment details from payments done with this payment product can be automatically tokenized for future re-use
	 * <li>false - Payment details from payments done with this payment product can not be automatically tokenized
	 * </ul>
	 */
	public Boolean getAutoTokenized() {
		return autoTokenized;
	}

	/**
	 * Indicates if the payment details can be automatically tokenized for future re-use
	 * <ul>
	 * <li>true - Payment details from payments done with this payment product can be automatically tokenized for future re-use
	 * <li>false - Payment details from payments done with this payment product can not be automatically tokenized
	 * </ul>
	 */
	public void setAutoTokenized(Boolean value) {
		this.autoTokenized = value;
	}

	/**
	 * This field is only relevant for payment products that use third party redirects. This field indicates if the third party disallows their payment pages to be embedded in an iframe using the <span class="property">X-Frame-Options</span> header.
	 * <ul>
	 * <li>true - the third party allows their payment pages to be embedded in an iframe.
	 * <li>false - the third party disallows their payment pages to be embedded in an iframe.
	 * </ul>
	 */
	public Boolean getCanBeIframed() {
		return canBeIframed;
	}

	/**
	 * This field is only relevant for payment products that use third party redirects. This field indicates if the third party disallows their payment pages to be embedded in an iframe using the <span class="property">X-Frame-Options</span> header.
	 * <ul>
	 * <li>true - the third party allows their payment pages to be embedded in an iframe.
	 * <li>false - the third party disallows their payment pages to be embedded in an iframe.
	 * </ul>
	 */
	public void setCanBeIframed(Boolean value) {
		this.canBeIframed = value;
	}

	/**
	 * Object containing display hints like the order in which the product should be shown, the name of the product and the logo
	 */
	public PaymentProductDisplayHints getDisplayHints() {
		return displayHints;
	}

	/**
	 * Object containing display hints like the order in which the product should be shown, the name of the product and the logo
	 */
	public void setDisplayHints(PaymentProductDisplayHints value) {
		this.displayHints = value;
	}

	/**
	 * Object containing all the fields and their details that are associated with this payment product. If you are not interested in the data on the fields you should have us filter them our (using filter=fields in the query-string)
	 */
	public List<PaymentProductField> getFields() {
		return fields;
	}

	/**
	 * Object containing all the fields and their details that are associated with this payment product. If you are not interested in the data on the fields you should have us filter them our (using filter=fields in the query-string)
	 */
	public void setFields(List<PaymentProductField> value) {
		this.fields = value;
	}

	/**
	 * The ID of the payment product in our system
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * The ID of the payment product in our system
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Maximum amount in EUR cents (using 2 decimals, so 1 EUR becomes 100 cents) for transactions done with this payment product
	 */
	public Long getMaxAmount() {
		return maxAmount;
	}

	/**
	 * Maximum amount in EUR cents (using 2 decimals, so 1 EUR becomes 100 cents) for transactions done with this payment product
	 */
	public void setMaxAmount(Long value) {
		this.maxAmount = value;
	}

	/**
	 * Minimum amount in EUR cents (using 2 decimals, so 1 EUR becomes 100 cents) for transactions done with this payment product
	 */
	public Long getMinAmount() {
		return minAmount;
	}

	/**
	 * Minimum amount in EUR cents (using 2 decimals, so 1 EUR becomes 100 cents) for transactions done with this payment product
	 */
	public void setMinAmount(Long value) {
		this.minAmount = value;
	}

	/**
	 * This provides insight into the level of support for payments using a device with a smaller screen size. You can for instance use this to rank payment products differently on devices with a smaller screen. Possible values are:
	 * <ul>
	 * <li>BASIC_SUPPORT - The payment product has not optimized its user experience for devices with smaller screens
	 * <li>OPTIMIZED_SUPPORT - The payment product offers a user experience that has been optimized for devices with smaller screens
	 * </ul>
	 */
	public String getMobileIntegrationLevel() {
		return mobileIntegrationLevel;
	}

	/**
	 * This provides insight into the level of support for payments using a device with a smaller screen size. You can for instance use this to rank payment products differently on devices with a smaller screen. Possible values are:
	 * <ul>
	 * <li>BASIC_SUPPORT - The payment product has not optimized its user experience for devices with smaller screens
	 * <li>OPTIMIZED_SUPPORT - The payment product offers a user experience that has been optimized for devices with smaller screens
	 * </ul>
	 */
	public void setMobileIntegrationLevel(String value) {
		this.mobileIntegrationLevel = value;
	}

	/**
	 * Indicates which payment method will be used for this payment product. Payment method is one of:
	 * <ul>
	 * <li>card
	 * <li>directDebit
	 * <li>onlineBankTransfer
	 * <li>invoice
	 * <li>bankTransfer
	 * <li>redirect
	 * <li>cash
	 * </ul>
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * Indicates which payment method will be used for this payment product. Payment method is one of:
	 * <ul>
	 * <li>card
	 * <li>directDebit
	 * <li>onlineBankTransfer
	 * <li>invoice
	 * <li>bankTransfer
	 * <li>redirect
	 * <li>cash
	 * </ul>
	 */
	public void setPaymentMethod(String value) {
		this.paymentMethod = value;
	}

	/**
	 * The payment product group that has this payment product, if there is any. Not populated otherwise. Currently only one payment product group is supported:
	 * <ul>
	 * <li>cards
	 * </ul>
	 */
	public String getPaymentProductGroup() {
		return paymentProductGroup;
	}

	/**
	 * The payment product group that has this payment product, if there is any. Not populated otherwise. Currently only one payment product group is supported:
	 * <ul>
	 * <li>cards
	 * </ul>
	 */
	public void setPaymentProductGroup(String value) {
		this.paymentProductGroup = value;
	}

	/**
	 * Indicates whether the payment product requires redirection to a third party to complete the payment. You can use this to filter out products that require a redirect if you don't want to support that.
	 * <ul>
	 * <li>true - Redirection is required
	 * <li>false - No redirection is required
	 * </ul>
	 */
	public Boolean getUsesRedirectionTo3rdParty() {
		return usesRedirectionTo3rdParty;
	}

	/**
	 * Indicates whether the payment product requires redirection to a third party to complete the payment. You can use this to filter out products that require a redirect if you don't want to support that.
	 * <ul>
	 * <li>true - Redirection is required
	 * <li>false - No redirection is required
	 * </ul>
	 */
	public void setUsesRedirectionTo3rdParty(Boolean value) {
		this.usesRedirectionTo3rdParty = value;
	}
}
