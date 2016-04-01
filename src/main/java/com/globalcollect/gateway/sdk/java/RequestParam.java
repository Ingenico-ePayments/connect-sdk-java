package com.globalcollect.gateway.sdk.java;

/**
 * A single request parameter. Immutable.
 */
public class RequestParam {

	private final String name;
	private final String value;

	public RequestParam(String name, String value) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("name is required");
		}
		this.name = name;
		this.value = value;
	}

	public String getName(){
		return name;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return getName() + ":" + getValue();
	}
}
