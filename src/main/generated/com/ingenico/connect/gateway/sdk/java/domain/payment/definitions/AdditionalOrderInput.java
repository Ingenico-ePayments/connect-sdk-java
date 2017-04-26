/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.AirlineData;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_AdditionalOrderInput">AdditionalOrderInput</a>
 */
public class AdditionalOrderInput {

	private AirlineData airlineData = null;

	@SuppressWarnings("deprecation")
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

	/**
	 * @deprecated Use Order.shoppingCart instead
	 */
	@Deprecated
	public Level3SummaryData getLevel3SummaryData() {
		return level3SummaryData;
	}

	/**
	 * @deprecated Use Order.shoppingCart instead
	 */
	@Deprecated
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
