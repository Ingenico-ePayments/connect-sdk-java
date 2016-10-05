/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.payment.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.KeyValuePair;
import com.ingenico.connect.gateway.sdk.java.domain.payment.definitions.RedirectData;
import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_MerchantAction">MerchantAction</a>
 */
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
