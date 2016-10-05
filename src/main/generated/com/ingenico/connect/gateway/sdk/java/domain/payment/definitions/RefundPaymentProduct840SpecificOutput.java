/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RefundPaymentProduct840CustomerAccount;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RefundPaymentProduct840SpecificOutput">RefundPaymentProduct840SpecificOutput</a>
 */
public class RefundPaymentProduct840SpecificOutput {

	private RefundPaymentProduct840CustomerAccount customerAccount = null;

	public RefundPaymentProduct840CustomerAccount getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(RefundPaymentProduct840CustomerAccount value) {
		this.customerAccount = value;
	}
}
