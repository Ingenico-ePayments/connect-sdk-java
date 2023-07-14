/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.refund.definitions;

public class RefundReferences {

	private String merchantReference = null;

	/**
	 * <div class="alert alert-info">Note that the maximum length of this field for transactions processed on the GlobalCollect platform is 30.</div> Your unique reference of the transaction that is also returned in our report files. This is almost always used for your reconciliation of our report files.
	 */
	public String getMerchantReference() {
		return merchantReference;
	}

	/**
	 * <div class="alert alert-info">Note that the maximum length of this field for transactions processed on the GlobalCollect platform is 30.</div> Your unique reference of the transaction that is also returned in our report files. This is almost always used for your reconciliation of our report files.
	 */
	public void setMerchantReference(String value) {
		this.merchantReference = value;
	}
}
