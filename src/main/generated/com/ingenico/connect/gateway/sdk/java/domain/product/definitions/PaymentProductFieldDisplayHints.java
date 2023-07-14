/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

public class PaymentProductFieldDisplayHints {

	private Boolean alwaysShow = null;

	private Integer displayOrder = null;

	private PaymentProductFieldFormElement formElement = null;

	private String label = null;

	private String link = null;

	private String mask = null;

	private Boolean obfuscate = null;

	private String placeholderLabel = null;

	private String preferredInputType = null;

	private PaymentProductFieldTooltip tooltip = null;

	/**
	 * <ul class="paragraph-width">
	 * <li>true - Indicates that this field is advised to be captured to increase the success rates even though it isn't marked as required. Please note that making the field required could hurt the success rates negatively. This boolean only indicates our advise to always show this field to the customer.
	 * <li>false - Indicates that this field is not to be shown unless it is a required field.
	 * </ul>
	 */
	public Boolean getAlwaysShow() {
		return alwaysShow;
	}

	/**
	 * <ul class="paragraph-width">
	 * <li>true - Indicates that this field is advised to be captured to increase the success rates even though it isn't marked as required. Please note that making the field required could hurt the success rates negatively. This boolean only indicates our advise to always show this field to the customer.
	 * <li>false - Indicates that this field is not to be shown unless it is a required field.
	 * </ul>
	 */
	public void setAlwaysShow(Boolean value) {
		this.alwaysShow = value;
	}

	/**
	 * The order in which the fields should be shown (ascending)
	 */
	public Integer getDisplayOrder() {
		return displayOrder;
	}

	/**
	 * The order in which the fields should be shown (ascending)
	 */
	public void setDisplayOrder(Integer value) {
		this.displayOrder = value;
	}

	/**
	 * Object detailing the type of form element that should be used to present the field
	 */
	public PaymentProductFieldFormElement getFormElement() {
		return formElement;
	}

	/**
	 * Object detailing the type of form element that should be used to present the field
	 */
	public void setFormElement(PaymentProductFieldFormElement value) {
		this.formElement = value;
	}

	/**
	 * Label/Name of the field to be used in the user interface
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Label/Name of the field to be used in the user interface
	 */
	public void setLabel(String value) {
		this.label = value;
	}

	/**
	 * Link that should be used to replace the '{link}' variable in the label.
	 */
	public String getLink() {
		return link;
	}

	/**
	 * Link that should be used to replace the '{link}' variable in the label.
	 */
	public void setLink(String value) {
		this.link = value;
	}

	/**
	 * A mask that can be used in the input field. You can use it to inject additional characters to provide a better user experience and to restrict the accepted character set (illegal characters to be ignored during typing).<br>
	 * * is used for wildcards (and also chars)<br>
	 * 9 is used for numbers<br>
	 * Everything outside {{ and }} is used as-is.
	 */
	public String getMask() {
		return mask;
	}

	/**
	 * A mask that can be used in the input field. You can use it to inject additional characters to provide a better user experience and to restrict the accepted character set (illegal characters to be ignored during typing).<br>
	 * * is used for wildcards (and also chars)<br>
	 * 9 is used for numbers<br>
	 * Everything outside {{ and }} is used as-is.
	 */
	public void setMask(String value) {
		this.mask = value;
	}

	/**
	 * <ul class="paragraph-width">
	 * <li>true - The data in this field should be obfuscated as it is entered, just like a password field
	 * <li>false - The data in this field does not need to be obfuscated
	 * </ul>
	 */
	public Boolean getObfuscate() {
		return obfuscate;
	}

	/**
	 * <ul class="paragraph-width">
	 * <li>true - The data in this field should be obfuscated as it is entered, just like a password field
	 * <li>false - The data in this field does not need to be obfuscated
	 * </ul>
	 */
	public void setObfuscate(Boolean value) {
		this.obfuscate = value;
	}

	/**
	 * A placeholder value for the form element
	 */
	public String getPlaceholderLabel() {
		return placeholderLabel;
	}

	/**
	 * A placeholder value for the form element
	 */
	public void setPlaceholderLabel(String value) {
		this.placeholderLabel = value;
	}

	/**
	 * The type of keyboard that can best be used to fill out the value of this field. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>PhoneNumberKeyboard - Keyboard that is normally used to enter phone numbers
	 * <li>StringKeyboard - Keyboard that is used to enter strings
	 * <li>IntegerKeyboard - Keyboard that is used to enter only numerical values
	 * <li>EmailAddressKeyboard - Keyboard that allows easier entry of email addresses
	 * </ul>
	 */
	public String getPreferredInputType() {
		return preferredInputType;
	}

	/**
	 * The type of keyboard that can best be used to fill out the value of this field. Possible values are:
	 * <ul class="paragraph-width">
	 * <li>PhoneNumberKeyboard - Keyboard that is normally used to enter phone numbers
	 * <li>StringKeyboard - Keyboard that is used to enter strings
	 * <li>IntegerKeyboard - Keyboard that is used to enter only numerical values
	 * <li>EmailAddressKeyboard - Keyboard that allows easier entry of email addresses
	 * </ul>
	 */
	public void setPreferredInputType(String value) {
		this.preferredInputType = value;
	}

	/**
	 * Object that contains an optional tooltip to assist the customer
	 */
	public PaymentProductFieldTooltip getTooltip() {
		return tooltip;
	}

	/**
	 * Object that contains an optional tooltip to assist the customer
	 */
	public void setTooltip(PaymentProductFieldTooltip value) {
		this.tooltip = value;
	}
}
