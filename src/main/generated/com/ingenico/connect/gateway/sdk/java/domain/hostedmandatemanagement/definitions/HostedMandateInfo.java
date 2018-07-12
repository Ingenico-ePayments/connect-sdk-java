/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedmandatemanagement.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.mandates.definitions.MandateCustomer;

public class HostedMandateInfo {

	private String alias = null;

	private MandateCustomer customer = null;

	private String customerReference = null;

	private String recurrenceType = null;

	private String signatureType = null;

	private String uniqueMandateReference = null;

	/**
	 * An alias for the mandate. This can be used to visually represent the mandate.<br>
	 * Do not include any unobfuscated sensitive data in the alias.<br>
	 * Default value if not provided is the obfuscated IBAN of the customer.
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * An alias for the mandate. This can be used to visually represent the mandate.<br>
	 * Do not include any unobfuscated sensitive data in the alias.<br>
	 * Default value if not provided is the obfuscated IBAN of the customer.
	 */
	public void setAlias(String value) {
		this.alias = value;
	}

	/**
	 * Customer object containing customer specific inputs
	 */
	public MandateCustomer getCustomer() {
		return customer;
	}

	/**
	 * Customer object containing customer specific inputs
	 */
	public void setCustomer(MandateCustomer value) {
		this.customer = value;
	}

	/**
	 * The unique identifier of a customer
	 */
	public String getCustomerReference() {
		return customerReference;
	}

	/**
	 * The unique identifier of a customer
	 */
	public void setCustomerReference(String value) {
		this.customerReference = value;
	}

	/**
	 * Specifies whether the mandate is for one-off or recurring payments. Possible values are:<br>
	 * <ul>
	 *  <li>UNIQUE
	 * <li>RECURRING
	 * </ul>
	 */
	public String getRecurrenceType() {
		return recurrenceType;
	}

	/**
	 * Specifies whether the mandate is for one-off or recurring payments. Possible values are:<br>
	 * <ul>
	 *  <li>UNIQUE
	 * <li>RECURRING
	 * </ul>
	 */
	public void setRecurrenceType(String value) {
		this.recurrenceType = value;
	}

	/**
	 * Specifies whether the mandate is unsigned or singed by SMS. Possible values are:<br>
	 * <ul>
	 *  <li>UNSIGNED
	 * <li>SMS
	 * </ul>
	 */
	public String getSignatureType() {
		return signatureType;
	}

	/**
	 * Specifies whether the mandate is unsigned or singed by SMS. Possible values are:<br>
	 * <ul>
	 *  <li>UNSIGNED
	 * <li>SMS
	 * </ul>
	 */
	public void setSignatureType(String value) {
		this.signatureType = value;
	}

	/**
	 * The unique identifier of the mandate
	 */
	public String getUniqueMandateReference() {
		return uniqueMandateReference;
	}

	/**
	 * The unique identifier of the mandate
	 */
	public void setUniqueMandateReference(String value) {
		this.uniqueMandateReference = value;
	}
}
