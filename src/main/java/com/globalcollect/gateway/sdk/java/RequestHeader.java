package com.globalcollect.gateway.sdk.java;

/**
 * A single request parameter.
 */
public class RequestHeader {

	private String name;
	private String value;

	public RequestHeader(String name, String value) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("name is required");
		}
		this.name = name;
		this.value = value;
	}

	public String getName(){
		return name;
	};

	/**
	 * Returns the unencoded value.
	 */
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return getName() + ":" + getValue();
	}
}
