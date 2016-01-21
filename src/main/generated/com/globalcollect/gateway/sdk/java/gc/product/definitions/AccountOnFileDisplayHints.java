package com.globalcollect.gateway.sdk.java.gc.product.definitions;

import com.globalcollect.gateway.sdk.java.gc.product.definitions.LabelTemplateElement;
import java.util.List;

public class AccountOnFileDisplayHints {

	private List<LabelTemplateElement> labelTemplate = null;

	private String logo = null;

	public List<LabelTemplateElement> getLabelTemplate() {
		return labelTemplate;
	}

	public void setLabelTemplate(List<LabelTemplateElement> value) {
		this.labelTemplate = value;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String value) {
		this.logo = value;
	}
}
