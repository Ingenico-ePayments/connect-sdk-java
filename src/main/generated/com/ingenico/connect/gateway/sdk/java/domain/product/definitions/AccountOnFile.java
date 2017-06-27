/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

/**
 * Elements from the AccountsOnFile array
 */
public class AccountOnFile {

	private List<AccountOnFileAttribute> attributes = null;

	private AccountOnFileDisplayHints displayHints = null;

	private Integer id = null;

	private Integer paymentProductId = null;

	/**
	 * Array containing the details of the stored token
	 */
	public List<AccountOnFileAttribute> getAttributes() {
		return attributes;
	}

	/**
	 * Array containing the details of the stored token
	 */
	public void setAttributes(List<AccountOnFileAttribute> value) {
		this.attributes = value;
	}

	/**
	 * Object containing information for the client on how best to display this field
	 */
	public AccountOnFileDisplayHints getDisplayHints() {
		return displayHints;
	}

	/**
	 * Object containing information for the client on how best to display this field
	 */
	public void setDisplayHints(AccountOnFileDisplayHints value) {
		this.displayHints = value;
	}

	/**
	 * ID of the account on file record
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * ID of the account on file record
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Payment product identifier<br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
	 */
	public Integer getPaymentProductId() {
		return paymentProductId;
	}

	/**
	 * Payment product identifier<br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
	 */
	public void setPaymentProductId(Integer value) {
		this.paymentProductId = value;
	}
}
