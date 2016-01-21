package com.globalcollect.gateway.sdk.java.gc.hostedcheckout.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.KeyValuePair;
import java.util.List;

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
