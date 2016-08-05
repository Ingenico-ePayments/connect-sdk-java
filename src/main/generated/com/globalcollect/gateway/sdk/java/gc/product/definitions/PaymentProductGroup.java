package com.globalcollect.gateway.sdk.java.gc.product.definitions;

import com.globalcollect.gateway.sdk.java.gc.product.definitions.AccountOnFile;
import com.globalcollect.gateway.sdk.java.gc.product.definitions.PaymentProductDisplayHints;
import com.globalcollect.gateway.sdk.java.gc.product.definitions.PaymentProductField;
import java.util.List;

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
