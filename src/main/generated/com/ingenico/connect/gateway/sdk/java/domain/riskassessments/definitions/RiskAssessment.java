/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */

package com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudFields;

public class RiskAssessment {

	private FraudFields fraudFields = null;

	private MerchantRiskAssessment merchant = null;

	private OrderRiskAssessment order = null;

	private Integer paymentProductId = null;

	/**
	 * Object containing additional data that will be used to assess the risk of fraud
	 */
	public FraudFields getFraudFields() {
		return fraudFields;
	}

	/**
	 * Object containing additional data that will be used to assess the risk of fraud
	 */
	public void setFraudFields(FraudFields value) {
		this.fraudFields = value;
	}

	public MerchantRiskAssessment getMerchant() {
		return merchant;
	}

	public void setMerchant(MerchantRiskAssessment value) {
		this.merchant = value;
	}

	public OrderRiskAssessment getOrder() {
		return order;
	}

	public void setOrder(OrderRiskAssessment value) {
		this.order = value;
	}

	/**
	 * Payment product identifier<br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
	 */
	public Integer getPaymentProductId() {
		return paymentProductId;
	}

	/**
	 * Payment product identifier<br>
	 * Please see <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
	 */
	public void setPaymentProductId(Integer value) {
		this.paymentProductId = value;
	}
}
