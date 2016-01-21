package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.KeyValuePair;
import com.globalcollect.gateway.sdk.java.gc.payment.definitions.RedirectData;
import java.util.List;

public class MerchantAction {

	private String actionType = null;

	private RedirectData redirectData = null;

	private String renderingData = null;

	private List<KeyValuePair> showData = null;

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String value) {
		this.actionType = value;
	}

	public RedirectData getRedirectData() {
		return redirectData;
	}

	public void setRedirectData(RedirectData value) {
		this.redirectData = value;
	}

	public String getRenderingData() {
		return renderingData;
	}

	public void setRenderingData(String value) {
		this.renderingData = value;
	}

	public List<KeyValuePair> getShowData() {
		return showData;
	}

	public void setShowData(List<KeyValuePair> value) {
		this.showData = value;
	}
}
