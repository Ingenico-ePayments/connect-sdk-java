/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

/**
 * Definition of the details of a single payment product group
 */
public class PaymentProductGroup {

	private List<AccountOnFile> accountsOnFile = null;

	private Boolean deviceFingerprintEnabled = null;

	private PaymentProductDisplayHints displayHints = null;

	private List<PaymentProductField> fields = null;

	private String id = null;

	/**
	 * Only populated in the Client API
	 */
	public List<AccountOnFile> getAccountsOnFile() {
		return accountsOnFile;
	}

	/**
	 * Only populated in the Client API
	 */
	public void setAccountsOnFile(List<AccountOnFile> value) {
		this.accountsOnFile = value;
	}

	/**
	 * Indicates if device fingerprint is enabled for the product group
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public Boolean getDeviceFingerprintEnabled() {
		return deviceFingerprintEnabled;
	}

	/**
	 * Indicates if device fingerprint is enabled for the product group
	 * <ul class="paragraph-width"><li>true
	 * <li>false
	 * </ul>
	 */
	public void setDeviceFingerprintEnabled(Boolean value) {
		this.deviceFingerprintEnabled = value;
	}

	/**
	 * Object containing display hints like the order of the group when shown in a list, the name of the group and the logo. Note that the order of the group is the lowest order among the payment products that belong to the group.
	 */
	public PaymentProductDisplayHints getDisplayHints() {
		return displayHints;
	}

	/**
	 * Object containing display hints like the order of the group when shown in a list, the name of the group and the logo. Note that the order of the group is the lowest order among the payment products that belong to the group.
	 */
	public void setDisplayHints(PaymentProductDisplayHints value) {
		this.displayHints = value;
	}

	/**
	 * Object containing all the fields and their details that are associated with this payment product group. If you are not interested in the these fields you can have us filter them our (using hide=fields in the query-string)
	 */
	public List<PaymentProductField> getFields() {
		return fields;
	}

	/**
	 * Object containing all the fields and their details that are associated with this payment product group. If you are not interested in the these fields you can have us filter them our (using hide=fields in the query-string)
	 */
	public void setFields(List<PaymentProductField> value) {
		this.fields = value;
	}

	/**
	 * The ID of the payment product group in our system
	 */
	public String getId() {
		return id;
	}

	/**
	 * The ID of the payment product group in our system
	 */
	public void setId(String value) {
		this.id = value;
	}
}
