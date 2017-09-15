/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.payments;

import java.util.LinkedList;
import java.util.List;

import com.ingenico.connect.gateway.sdk.java.AbstractParamRequest;
import com.ingenico.connect.gateway.sdk.java.RequestParam;

/**
 * Query parameters for
 * <a href="https://epayments-api.developer-ingenico.com/s2sapi/v1/en_US/java/payments/find.html">Find payments</a>
 */
public class FindPaymentsParams extends AbstractParamRequest {

	private String merchantReference;

	private Long merchantOrderId;

	private Integer offset;

	private Integer limit;

	/**
	 * Your unique transaction reference to filter on.
	 */
	public String getMerchantReference() {
		return merchantReference;
	}

	/**
	 * Your unique transaction reference to filter on.
	 */
	public void setMerchantReference(String value) {
		this.merchantReference = value;
	}

	/**
	 * Your order identifier to filter on.
	 */
	public Long getMerchantOrderId() {
		return merchantOrderId;
	}

	/**
	 * Your order identifier to filter on.
	 */
	public void setMerchantOrderId(Long value) {
		this.merchantOrderId = value;
	}

	/**
	 * The zero-based index of the first payment in the result. If omitted, the offset will be 0.
	 */
	public Integer getOffset() {
		return offset;
	}

	/**
	 * The zero-based index of the first payment in the result. If omitted, the offset will be 0.
	 */
	public void setOffset(Integer value) {
		this.offset = value;
	}

	/**
	 * The maximum number of payments to return, with a maximum of 100. If omitted, the limit will be 10.
	 */
	public Integer getLimit() {
		return limit;
	}

	/**
	 * The maximum number of payments to return, with a maximum of 100. If omitted, the limit will be 10.
	 */
	public void setLimit(Integer value) {
		this.limit = value;
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		addParameter(result, "merchantReference", merchantReference);
		addParameter(result, "merchantOrderId", merchantOrderId);
		addParameter(result, "offset", offset);
		addParameter(result, "limit", limit);
		return result;
	}
}
