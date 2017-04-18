/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProductFieldDisplayHints">PaymentProductFieldDisplayHints</a>
 */
public class PaymentProductFieldDisplayHints {

	private Boolean alwaysShow = null;

	private Integer displayOrder = null;

	private PaymentProductFieldFormElement formElement = null;

	private String label = null;

	private String mask = null;

	private Boolean obfuscate = null;

	private String placeholderLabel = null;

	private String preferredInputType = null;

	private PaymentProductFieldTooltip tooltip = null;

	public Boolean getAlwaysShow() {
		return alwaysShow;
	}

	public void setAlwaysShow(Boolean value) {
		this.alwaysShow = value;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer value) {
		this.displayOrder = value;
	}

	public PaymentProductFieldFormElement getFormElement() {
		return formElement;
	}

	public void setFormElement(PaymentProductFieldFormElement value) {
		this.formElement = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String value) {
		this.label = value;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String value) {
		this.mask = value;
	}

	public Boolean getObfuscate() {
		return obfuscate;
	}

	public void setObfuscate(Boolean value) {
		this.obfuscate = value;
	}

	public String getPlaceholderLabel() {
		return placeholderLabel;
	}

	public void setPlaceholderLabel(String value) {
		this.placeholderLabel = value;
	}

	public String getPreferredInputType() {
		return preferredInputType;
	}

	public void setPreferredInputType(String value) {
		this.preferredInputType = value;
	}

	public PaymentProductFieldTooltip getTooltip() {
		return tooltip;
	}

	public void setTooltip(PaymentProductFieldTooltip value) {
		this.tooltip = value;
	}
}
