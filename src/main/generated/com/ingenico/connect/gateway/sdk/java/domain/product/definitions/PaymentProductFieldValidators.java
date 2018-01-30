/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

public class PaymentProductFieldValidators {

	private BoletoBancarioRequirednessValidator boletoBancarioRequiredness = null;

	private EmptyValidator emailAddress = null;

	private EmptyValidator expirationDate = null;

	private FixedListValidator fixedList = null;

	private EmptyValidator iban = null;

	private LengthValidator length = null;

	private EmptyValidator luhn = null;

	private RangeValidator range = null;

	private RegularExpressionValidator regularExpression = null;

	private EmptyValidator termsAndConditions = null;

	/**
	 * Indicates the requiredness of the field based on the fiscalnumber for Boleto Bancario
	 */
	public BoletoBancarioRequirednessValidator getBoletoBancarioRequiredness() {
		return boletoBancarioRequiredness;
	}

	/**
	 * Indicates the requiredness of the field based on the fiscalnumber for Boleto Bancario
	 */
	public void setBoletoBancarioRequiredness(BoletoBancarioRequirednessValidator value) {
		this.boletoBancarioRequiredness = value;
	}

	/**
	 * Indicates that the content should be validated against the rules for an email address
	 */
	public EmptyValidator getEmailAddress() {
		return emailAddress;
	}

	/**
	 * Indicates that the content should be validated against the rules for an email address
	 */
	public void setEmailAddress(EmptyValidator value) {
		this.emailAddress = value;
	}

	/**
	 * Indicates that the content should be validated against the rules for an expiration date (it should be in the future)
	 */
	public EmptyValidator getExpirationDate() {
		return expirationDate;
	}

	/**
	 * Indicates that the content should be validated against the rules for an expiration date (it should be in the future)
	 */
	public void setExpirationDate(EmptyValidator value) {
		this.expirationDate = value;
	}

	/**
	 * Indicates that content should be one of the, in this object, listed items
	 */
	public FixedListValidator getFixedList() {
		return fixedList;
	}

	/**
	 * Indicates that content should be one of the, in this object, listed items
	 */
	public void setFixedList(FixedListValidator value) {
		this.fixedList = value;
	}

	/**
	 * Indicates that the content of this (iban) field needs to validated against format checks and modulo check (as described in ISO 7064)
	 */
	public EmptyValidator getIban() {
		return iban;
	}

	/**
	 * Indicates that the content of this (iban) field needs to validated against format checks and modulo check (as described in ISO 7064)
	 */
	public void setIban(EmptyValidator value) {
		this.iban = value;
	}

	/**
	 * Indicates that the content needs to be validated against length criteria defined in this object
	 */
	public LengthValidator getLength() {
		return length;
	}

	/**
	 * Indicates that the content needs to be validated against length criteria defined in this object
	 */
	public void setLength(LengthValidator value) {
		this.length = value;
	}

	/**
	 * Indicates that the content needs to be validated using a LUHN check
	 */
	public EmptyValidator getLuhn() {
		return luhn;
	}

	/**
	 * Indicates that the content needs to be validated using a LUHN check
	 */
	public void setLuhn(EmptyValidator value) {
		this.luhn = value;
	}

	/**
	 * Indicates that the content needs to be validated against a, in this object, defined range
	 */
	public RangeValidator getRange() {
		return range;
	}

	/**
	 * Indicates that the content needs to be validated against a, in this object, defined range
	 */
	public void setRange(RangeValidator value) {
		this.range = value;
	}

	/**
	 * A string representing the regular expression to check
	 */
	public RegularExpressionValidator getRegularExpression() {
		return regularExpression;
	}

	/**
	 * A string representing the regular expression to check
	 */
	public void setRegularExpression(RegularExpressionValidator value) {
		this.regularExpression = value;
	}

	/**
	 * Indicates that the content should be validated as such that the consumer has accepted the field as if they were terms and conditions of a service
	 */
	public EmptyValidator getTermsAndConditions() {
		return termsAndConditions;
	}

	/**
	 * Indicates that the content should be validated as such that the consumer has accepted the field as if they were terms and conditions of a service
	 */
	public void setTermsAndConditions(EmptyValidator value) {
		this.termsAndConditions = value;
	}
}
