package com.globalcollect.gateway.sdk.java.gc.merchant.tokens;

import com.globalcollect.gateway.sdk.java.GcParamRequest;
import com.globalcollect.gateway.sdk.java.RequestParam;
import java.util.LinkedList;
import java.util.List;

public class DeleteParams implements GcParamRequest {

	private String mandateCancelDate;

	public String getMandateCancelDate() {
		return mandateCancelDate;
	}

	public void setMandateCancelDate(String value) {
		this.mandateCancelDate = value;
	}

	@Override
	public List<RequestParam> toRequestParameters() {
		List<RequestParam> result = new LinkedList<RequestParam>();
		if (mandateCancelDate != null) {
			result.add(new RequestParam("mandateCancelDate", mandateCancelDate.toString()));
		}
		return result;
	}
}
