/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.Payment;

public class FindPaymentsResponse {

	private Integer limit = null;

	private Integer offset = null;

	private List<Payment> payments = null;

	private Integer totalCount = null;

	/**
	 * The limit you used in the request.
	 */
	public Integer getLimit() {
		return limit;
	}

	/**
	 * The limit you used in the request.
	 */
	public void setLimit(Integer value) {
		this.limit = value;
	}

	/**
	 * The offset you used in the request.
	 */
	public Integer getOffset() {
		return offset;
	}

	/**
	 * The offset you used in the request.
	 */
	public void setOffset(Integer value) {
		this.offset = value;
	}

	/**
	 * A list of payments that matched your filter, starting at the given offset and limited to the given limit.
	 */
	public List<Payment> getPayments() {
		return payments;
	}

	/**
	 * A list of payments that matched your filter, starting at the given offset and limited to the given limit.
	 */
	public void setPayments(List<Payment> value) {
		this.payments = value;
	}

	/**
	 * The total number of payments that matched your filter.
	 */
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	 * The total number of payments that matched your filter.
	 */
	public void setTotalCount(Integer value) {
		this.totalCount = value;
	}
}
