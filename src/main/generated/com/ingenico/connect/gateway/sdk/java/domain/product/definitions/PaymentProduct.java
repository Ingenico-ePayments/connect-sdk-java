/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

public class PaymentProduct {

	private List<AccountOnFile> accountsOnFile = null;

	private String acquirerCountry = null;

	private Boolean allowsInstallments = null;

	private Boolean allowsRecurring = null;

	private Boolean allowsTokenization = null;

	private AuthenticationIndicator authenticationIndicator = null;

	private Boolean autoTokenized = null;

	private Boolean canBeIframed = null;

	private Boolean deviceFingerprintEnabled = null;

	private PaymentProductDisplayHints displayHints = null;

	private List<PaymentProductField> fields = null;

	private String fieldsWarning = null;

	private Integer id = null;

	private Boolean isJavaScriptRequired = null;

	private Long maxAmount = null;

	private Long minAmount = null;

	private String mobileIntegrationLevel = null;

	private String paymentMethod = null;

	private PaymentProduct302SpecificData paymentProduct302SpecificData = null;

	private PaymentProduct320SpecificData paymentProduct320SpecificData = null;

	private PaymentProduct863SpecificData paymentProduct863SpecificData = null;

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
	 * ISO 3166-1 alpha-2 country code which indicates the most likely country code of the acquirer that will process the transaction. For Google Pay (paymentProductId 320) transactions this acquirerCountry is should be provided in the <a href="https://developers.google.com/pay/api/web/reference/request-objects#TransactionInfo">transactionInfo.countryCode</a> for merchants that use an acquirer that is based in one of the European Economic Area (EEA) countries to make sure the transaction is compliant with the PSD2 Strong Customer Authentication (SCA) requirements. More information on Strong Customer Authentication compliance for Google Pay can be found at <a href="https://developers.google.com/pay/api/web/guides/resources/sca">https://developers.google.com/pay/api/web/guides/resources/sca</a>
	 */
	public String getAcquirerCountry() {
		return acquirerCountry;
	}

	/**
	 * ISO 3166-1 alpha-2 country code which indicates the most likely country code of the acquirer that will process the transaction. For Google Pay (paymentProductId 320) transactions this acquirerCountry is should be provided in the <a href="https://developers.google.com/pay/api/web/reference/request-objects#TransactionInfo">transactionInfo.countryCode</a> for merchants that use an acquirer that is based in one of the European Economic Area (EEA) countries to make sure the transaction is compliant with the PSD2 Strong Customer Authentication (SCA) requirements. More information on Strong Customer Authentication compliance for Google Pay can be found at <a href="https://developers.google.com/pay/api/web/guides/resources/sca">https://developers.google.com/pay/api/web/guides/resources/sca</a>
	 */
	public void setAcquirerCountry(String value) {
		this.acquirerCountry = value;
	}

	/**
	 * Indicates if the product supports installments
	 * <ul class="paragraph-width">
	 * <li>true - This payment supports installments
	 * <li>false - This payment does not support installments
	 * </ul>
	 */
	public Boolean getAllowsInstallments() {
		return allowsInstallments;
	}

	/**
	 * Indicates if the product supports installments
	 * <ul class="paragraph-width">
	 * <li>true - This payment supports installments
	 * <li>false - This payment does not support installments
	 * </ul>
	 */
	public void setAllowsInstallments(Boolean value) {
		this.allowsInstallments = value;
	}

	/**
	 * Indicates if the product supports recurring payments
	 * <ul class="paragraph-width">
	 * <li>true - This payment product supports recurring payments
	 * <li>false - This payment product does not support recurring transactions and can only be used for one-off payments
	 * </ul>
	 */
	public Boolean getAllowsRecurring() {
		return allowsRecurring;
	}

	/**
	 * Indicates if the product supports recurring payments
	 * <ul class="paragraph-width">
	 * <li>true - This payment product supports recurring payments
	 * <li>false - This payment product does not support recurring transactions and can only be used for one-off payments
	 * </ul>
	 */
	public void setAllowsRecurring(Boolean value) {
		this.allowsRecurring = value;
	}

	/**
	 * Indicates if the payment details can be tokenized for future re-use
	 * <ul class="paragraph-width">
	 * <li>true - Payment details from payments done with this payment product can be tokenized for future re-use
	 * <li>false - Payment details from payments done with this payment product can not be tokenized
	 * </ul>
	 */
	public Boolean getAllowsTokenization() {
		return allowsTokenization;
	}

	/**
	 * Indicates if the payment details can be tokenized for future re-use
	 * <ul class="paragraph-width">
	 * <li>true - Payment details from payments done with this payment product can be tokenized for future re-use
	 * <li>false - Payment details from payments done with this payment product can not be tokenized
	 * </ul>
	 */
	public void setAllowsTokenization(Boolean value) {
		this.allowsTokenization = value;
	}

	/**
	 * Indicates if the payment product supports 3D Security (mandatory, optional or not needed).
	 */
	public AuthenticationIndicator getAuthenticationIndicator() {
		return authenticationIndicator;
	}

	/**
	 * Indicates if the payment product supports 3D Security (mandatory, optional or not needed).
	 */
	public void setAuthenticationIndicator(AuthenticationIndicator value) {
		this.authenticationIndicator = value;
	}

	/**
	 * Indicates if the payment details can be automatically tokenized for future re-use
	 * <ul class="paragraph-width">
	 * <li>true - Payment details from payments done with this payment product can be automatically tokenized for future re-use
	 * <li>false - Payment details from payments done with this payment product can not be automatically tokenized
	 * </ul>
	 */
	public Boolean getAutoTokenized() {
		return autoTokenized;
	}

	/**
	 * Indicates if the payment details can be automatically tokenized for future re-use
	 * <ul class="paragraph-width">
	 * <li>true - Payment details from payments done with this payment product can be automatically tokenized for future re-use
	 * <li>false - Payment details from payments done with this payment product can not be automatically tokenized
	 * </ul>
	 */
	public void setAutoTokenized(Boolean value) {
		this.autoTokenized = value;
	}

	/**
	 * This property is only relevant for payment products that use third party redirects. This property indicates if the third party disallows their payment pages to be embedded in an iframe using the X-Frame-Options header.
	 * <ul class="paragraph-width">
	 * <li>true - the third party allows their payment pages to be embedded in an iframe.
	 * <li>false - the third party disallows their payment pages to be embedded in an iframe.
	 * </ul>
	 */
	public Boolean getCanBeIframed() {
		return canBeIframed;
	}

	/**
	 * This property is only relevant for payment products that use third party redirects. This property indicates if the third party disallows their payment pages to be embedded in an iframe using the X-Frame-Options header.
	 * <ul class="paragraph-width">
	 * <li>true - the third party allows their payment pages to be embedded in an iframe.
	 * <li>false - the third party disallows their payment pages to be embedded in an iframe.
	 * </ul>
	 */
	public void setCanBeIframed(Boolean value) {
		this.canBeIframed = value;
	}

	/**
	 * Indicates if device fingerprint is enabled for the product
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public Boolean getDeviceFingerprintEnabled() {
		return deviceFingerprintEnabled;
	}

	/**
	 * Indicates if device fingerprint is enabled for the product
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public void setDeviceFingerprintEnabled(Boolean value) {
		this.deviceFingerprintEnabled = value;
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
	 * Object containing all the fields and their details that are associated with this payment product. If you are not interested in the data in the fields you should have us filter them out (using filter=fields in the query-string)
	 */
	public List<PaymentProductField> getFields() {
		return fields;
	}

	/**
	 * Object containing all the fields and their details that are associated with this payment product. If you are not interested in the data in the fields you should have us filter them out (using filter=fields in the query-string)
	 */
	public void setFields(List<PaymentProductField> value) {
		this.fields = value;
	}

	/**
	 * If one or more of the payment product fields could not be constructed, no payment product fields will be returned and a message will be present in this property stating why.
	 */
	public String getFieldsWarning() {
		return fieldsWarning;
	}

	/**
	 * If one or more of the payment product fields could not be constructed, no payment product fields will be returned and a message will be present in this property stating why.
	 */
	public void setFieldsWarning(String value) {
		this.fieldsWarning = value;
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
	 * This property indicates if the payment product requires JavaScript to be enabled on the customer's browser. This is usually only true if the payment product depends on a third party JavaScript integration.
	 * <ul class="paragraph-width">
	 * <li>true - the payment product requires JavaScript to be enabled.
	 * <li>false - the payment product does not require JavaScript to be enabled. This is the default value if the property is not present.
	 * </ul>
	 */
	public Boolean getIsJavaScriptRequired() {
		return isJavaScriptRequired;
	}

	/**
	 * This property indicates if the payment product requires JavaScript to be enabled on the customer's browser. This is usually only true if the payment product depends on a third party JavaScript integration.
	 * <ul class="paragraph-width">
	 * <li>true - the payment product requires JavaScript to be enabled.
	 * <li>false - the payment product does not require JavaScript to be enabled. This is the default value if the property is not present.
	 * </ul>
	 */
	public void setIsJavaScriptRequired(Boolean value) {
		this.isJavaScriptRequired = value;
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
	 * <ul class="paragraph-width">
	 * <li>NO_SUPPORT - The payment product does not work at all on a mobile device
	 * <li>BASIC_SUPPORT - The payment product has not optimized its user experience for devices with smaller screens
	 * <li>OPTIMISED_SUPPORT - The payment product offers a user experience that has been optimized for devices with smaller screens
	 * </ul>
	 */
	public String getMobileIntegrationLevel() {
		return mobileIntegrationLevel;
	}

	/**
	 * This provides insight into the level of support for payments using a device with a smaller screen size. You can for instance use this to rank payment products differently on devices with a smaller screen. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>NO_SUPPORT - The payment product does not work at all on a mobile device
	 * <li>BASIC_SUPPORT - The payment product has not optimized its user experience for devices with smaller screens
	 * <li>OPTIMISED_SUPPORT - The payment product offers a user experience that has been optimized for devices with smaller screens
	 * </ul>
	 */
	public void setMobileIntegrationLevel(String value) {
		this.mobileIntegrationLevel = value;
	}

	/**
	 * Indicates which payment method will be used for this payment product. Payment method is one of:
	 * <ul class="paragraph-width">
	 * <li>bankTransfer
	 * <li>card
	 * <li>cash
	 * <li>directDebit
	 * <li>eInvoice
	 * <li>invoice
	 * <li>redirect
	 * </ul>
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * Indicates which payment method will be used for this payment product. Payment method is one of:
	 * <ul class="paragraph-width">
	 * <li>bankTransfer
	 * <li>card
	 * <li>cash
	 * <li>directDebit
	 * <li>eInvoice
	 * <li>invoice
	 * <li>redirect
	 * </ul>
	 */
	public void setPaymentMethod(String value) {
		this.paymentMethod = value;
	}

	/**
	 * Apple Pay (payment product 302) specific details.
	 */
	public PaymentProduct302SpecificData getPaymentProduct302SpecificData() {
		return paymentProduct302SpecificData;
	}

	/**
	 * Apple Pay (payment product 302) specific details.
	 */
	public void setPaymentProduct302SpecificData(PaymentProduct302SpecificData value) {
		this.paymentProduct302SpecificData = value;
	}

	/**
	 * Google Pay (payment product 320) specific details.
	 */
	public PaymentProduct320SpecificData getPaymentProduct320SpecificData() {
		return paymentProduct320SpecificData;
	}

	/**
	 * Google Pay (payment product 320) specific details.
	 */
	public void setPaymentProduct320SpecificData(PaymentProduct320SpecificData value) {
		this.paymentProduct320SpecificData = value;
	}

	/**
	 * WeChat Pay (payment product 863) specific details.
	 */
	public PaymentProduct863SpecificData getPaymentProduct863SpecificData() {
		return paymentProduct863SpecificData;
	}

	/**
	 * WeChat Pay (payment product 863) specific details.
	 */
	public void setPaymentProduct863SpecificData(PaymentProduct863SpecificData value) {
		this.paymentProduct863SpecificData = value;
	}

	/**
	 * The payment product group that has this payment product, if there is any. Not populated otherwise. Currently only one payment product group is supported:
	 * <ul class="paragraph-width">
	 * <li>cards
	 * </ul>
	 */
	public String getPaymentProductGroup() {
		return paymentProductGroup;
	}

	/**
	 * The payment product group that has this payment product, if there is any. Not populated otherwise. Currently only one payment product group is supported:
	 * <ul class="paragraph-width">
	 * <li>cards
	 * </ul>
	 */
	public void setPaymentProductGroup(String value) {
		this.paymentProductGroup = value;
	}

	/**
	 * Indicates whether the payment product requires redirection to a third party to complete the payment. You can use this to filter out products that require a redirect if you don't want to support that.
	 * <ul class="paragraph-width">
	 * <li>true - Redirection is required
	 * <li>false - No redirection is required
	 * </ul>
	 */
	public Boolean getUsesRedirectionTo3rdParty() {
		return usesRedirectionTo3rdParty;
	}

	/**
	 * Indicates whether the payment product requires redirection to a third party to complete the payment. You can use this to filter out products that require a redirect if you don't want to support that.
	 * <ul class="paragraph-width">
	 * <li>true - Redirection is required
	 * <li>false - No redirection is required
	 * </ul>
	 */
	public void setUsesRedirectionTo3rdParty(Boolean value) {
		this.usesRedirectionTo3rdParty = value;
	}
}
