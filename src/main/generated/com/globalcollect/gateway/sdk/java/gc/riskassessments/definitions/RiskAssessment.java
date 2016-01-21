package com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.FraudFields;
import com.globalcollect.gateway.sdk.java.gc.riskassessments.definitions.OrderRiskAssessment;

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
