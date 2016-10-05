/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;


/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProductDisplayHints">PaymentProductDisplayHints</a>
 */
public class PaymentProductDisplayHints {

	private Integer displayOrder = null;

	private String label = null;

	private String logo = null;

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer value) {
		this.displayOrder = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String value) {
		this.label = value;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String value) {
		this.logo = value;
	}
}
