/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.FraudFields;
import com.ingenico.connect.gateway.sdk.java.domain.riskassessments.definitions.OrderRiskAssessment;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_RiskAssessment">RiskAssessment</a>
 */
public class RiskAssessment {

	private FraudFields fraudFields = null;

	private OrderRiskAssessment order = null;

	private Integer paymentProductId = null;

	public FraudFields getFraudFields() {
		return fraudFields;
	}

	public void setFraudFields(FraudFields value) {
		this.fraudFields = value;
	}

	public OrderRiskAssessment getOrder() {
		return order;
	}

	public void setOrder(OrderRiskAssessment value) {
		this.order = value;
	}

	public Integer getPaymentProductId() {
		return paymentProductId;
	}

	public void setPaymentProductId(Integer value) {
		this.paymentProductId = value;
	}
}
