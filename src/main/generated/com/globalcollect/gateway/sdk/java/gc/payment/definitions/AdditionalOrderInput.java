package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.AirlineData;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.Level3SummaryData;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.OrderTypeInformation;

public class AdditionalOrderInput {

	private AirlineData airlineData = null;

	private Level3SummaryData level3SummaryData = null;

	private Long numberOfInstallments = null;

	private String orderDate = null;

	private OrderTypeInformation typeInformation = null;

	public AirlineData getAirlineData() {
		return airlineData;
	}

	public void setAirlineData(AirlineData value) {
		this.airlineData = value;
	}

	public Level3SummaryData getLevel3SummaryData() {
		return level3SummaryData;
	}

	public void setLevel3SummaryData(Level3SummaryData value) {
		this.level3SummaryData = value;
	}

	public Long getNumberOfInstallments() {
		return numberOfInstallments;
	}

	public void setNumberOfInstallments(Long value) {
		this.numberOfInstallments = value;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String value) {
		this.orderDate = value;
	}

	public OrderTypeInformation getTypeInformation() {
		return typeInformation;
	}

	public void setTypeInformation(OrderTypeInformation value) {
		this.typeInformation = value;
	}
}
