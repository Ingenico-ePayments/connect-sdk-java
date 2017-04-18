/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_PaymentProductGroup">PaymentProductGroup</a>
 */
public class PaymentProductGroup {

	private List<AccountOnFile> accountsOnFile = null;

	private PaymentProductDisplayHints displayHints = null;

	private List<PaymentProductField> fields = null;

	private String id = null;

	public List<AccountOnFile> getAccountsOnFile() {
		return accountsOnFile;
	}

	public void setAccountsOnFile(List<AccountOnFile> value) {
		this.accountsOnFile = value;
	}

	public PaymentProductDisplayHints getDisplayHints() {
		return displayHints;
	}

	public void setDisplayHints(PaymentProductDisplayHints value) {
		this.displayHints = value;
	}

	public List<PaymentProductField> getFields() {
		return fields;
	}

	public void setFields(List<PaymentProductField> value) {
		this.fields = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String value) {
		this.id = value;
	}
}
