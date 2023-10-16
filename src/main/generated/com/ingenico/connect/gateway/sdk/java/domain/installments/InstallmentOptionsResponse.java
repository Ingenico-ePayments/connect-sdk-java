/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.installments;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.installments.definitions.InstallmentOptions;

/**
 * The response contains the details of the installment options
 */
public class InstallmentOptionsResponse {

	private List<InstallmentOptions> installmentOptions = null;

	/**
	 * Array containing installment options their details and characteristics
	 */
	public List<InstallmentOptions> getInstallmentOptions() {
		return installmentOptions;
	}

	/**
	 * Array containing installment options their details and characteristics
	 */
	public void setInstallmentOptions(List<InstallmentOptions> value) {
		this.installmentOptions = value;
	}
}
