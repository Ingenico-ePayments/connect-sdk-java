/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.hostedcheckout.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.definitions.KeyValuePair;
import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_DisplayedData">DisplayedData</a>
 */
public class DisplayedData {

	private String displayedDataType = null;

	private String renderingData = null;

	private List<KeyValuePair> showData = null;

	public String getDisplayedDataType() {
		return displayedDataType;
	}

	public void setDisplayedDataType(String value) {
		this.displayedDataType = value;
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
