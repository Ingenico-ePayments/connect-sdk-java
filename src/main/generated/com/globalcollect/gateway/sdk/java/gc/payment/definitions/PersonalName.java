package com.globalcollect.gateway.sdk.java.gc.payment.definitions;

import com.globalcollect.gateway.sdk.java.gc.fei.definitions.PersonalNameBase;

public class PersonalName extends PersonalNameBase {

	private String title = null;

	public String getTitle() {
		return title;
	}

	public void setTitle(String value) {
		this.title = value;
	}
}
