package com.globalcollect.gateway.sdk.java.gc.merchant.services;

import com.globalcollect.gateway.sdk.java.GcParamRequest;
import com.globalcollect.gateway.sdk.java.RequestParam;
import java.util.LinkedList;
import java.util.List;

public class ConvertAmountParams implements GcParamRequest {

	private String source;

	private Long amount;

	private String target;

	public String getSource() {
		return source;
	}

	public void setSource(String value) {
		this.source = value;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long value) {
		this.amount = value;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String value) {
		this.target = value;
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		if (source != null) {
			result.add(new RequestParam("source", source.toString()));
		}
		if (amount != null) {
			result.add(new RequestParam("amount", amount.toString()));
		}
		if (target != null) {
			result.add(new RequestParam("target", target.toString()));
		}
		return result;
	}
}
