package com.globalcollect.gateway.sdk.java.gc.product.definitions;

import com.globalcollect.gateway.sdk.java.gc.product.definitions.AccountOnFileAttribute;
import com.globalcollect.gateway.sdk.java.gc.product.definitions.AccountOnFileDisplayHints;
import java.util.List;

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
