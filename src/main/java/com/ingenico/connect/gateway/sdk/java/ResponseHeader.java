package com.ingenico.connect.gateway.sdk.java;

/**
 * A single response header. Immutable.
 */
public class ResponseHeader {

	private final String name;
	private final String value;

	public ResponseHeader(String name, String value) {
		if (name == null) {
			throw new IllegalArgumentException("name is required");
		}
		this.name = name;
		this.value = value;
	}

	public String getName(){
		return name;
	}

	/**
	 * @return The un-encoded value.
	 */
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return getName() + ":" + getValue();
	}
}
