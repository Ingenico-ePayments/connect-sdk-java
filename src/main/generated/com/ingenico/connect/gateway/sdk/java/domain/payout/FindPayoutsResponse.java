/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/
 */

package com.ingenico.connect.gateway.sdk.java.domain.payout;

import java.util.List;

import com.ingenico.connect.gateway.sdk.java.domain.payout.definitions.PayoutResult;

public class FindPayoutsResponse {

	private Integer limit = null;

	private Integer offset = null;

	private List<PayoutResult> payouts = null;

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
	 * A list of payouts that matched your filter, starting at the given offset and limited to the given limit.
	 */
	public List<PayoutResult> getPayouts() {
		return payouts;
	}

	/**
	 * A list of payouts that matched your filter, starting at the given offset and limited to the given limit.
	 */
	public void setPayouts(List<PayoutResult> value) {
		this.payouts = value;
	}

	/**
	 * The total number of payouts that matched your filter.
	 */
	public Integer getTotalCount() {
		return totalCount;
	}

	/**
	 * The total number of payouts that matched your filter.
	 */
	public void setTotalCount(Integer value) {
		this.totalCount = value;
	}
}
