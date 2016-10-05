package com.ingenico.connect.gateway.sdk.java.domain.metadata;

public class ShoppingCartExtension {

	private final String creator;
	private final String name;
	private final String version;

	public ShoppingCartExtension(String creator, String name, String version) {
		if (creator == null || creator.trim().isEmpty()) {
			throw new IllegalArgumentException("creator is required");
		}
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("name is required");
		}
		if (version == null || version.trim().isEmpty()) {
			throw new IllegalArgumentException("version is required");
		}
		this.creator = creator;
		this.name = name;
		this.version = version;
	}

	public String getCreator() {
		return creator;
	}

	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}
}
