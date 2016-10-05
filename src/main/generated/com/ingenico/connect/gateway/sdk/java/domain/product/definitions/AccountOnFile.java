/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.AccountOnFileAttribute;
import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.AccountOnFileDisplayHints;
import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_AccountOnFile">AccountOnFile</a>
 */
public class AccountOnFile {

	private List<AccountOnFileAttribute> attributes = null;

	private AccountOnFileDisplayHints displayHints = null;

	private Integer id = null;

	private Integer paymentProductId = null;

	public List<AccountOnFileAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<AccountOnFileAttribute> value) {
		this.attributes = value;
	}

	public AccountOnFileDisplayHints getDisplayHints() {
		return displayHints;
	}

	public void setDisplayHints(AccountOnFileDisplayHints value) {
		this.displayHints = value;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer value) {
		this.id = value;
	}

	public Integer getPaymentProductId() {
		return paymentProductId;
	}

	public void setPaymentProductId(Integer value) {
		this.paymentProductId = value;
	}
}
