/*
 * This class was auto-generated from the API references found at
 * https://developer.globalcollect.com/documentation/api/server/
 */
package com.ingenico.connect.gateway.sdk.java.domain.product.definitions;

import com.ingenico.connect.gateway.sdk.java.domain.product.definitions.LabelTemplateElement;
import java.util.List;

/**
 * Class <a href="https://developer.globalcollect.com/documentation/api/server/#schema_AccountOnFileDisplayHints">AccountOnFileDisplayHints</a>
 */
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
