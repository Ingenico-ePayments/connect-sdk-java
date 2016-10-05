package com.ingenico.connect.gateway.sdk.java.util;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

import com.ingenico.connect.gateway.sdk.java.domain.metadata.ShoppingCartExtension;

public class ShoppingCartExtensionMatcher extends TypeSafeDiagnosingMatcher<ShoppingCartExtension> {

	private final String creator;
	private final String name;
	private final String version;

	public ShoppingCartExtensionMatcher(ShoppingCartExtension shoppingCartExtension) {
		this(shoppingCartExtension.getCreator(), shoppingCartExtension.getName(), shoppingCartExtension.getVersion());
	}

	public ShoppingCartExtensionMatcher(String creator, String name, String version) {
		this.creator = creator;
		this.name = name;
		this.version = version;
	}

	@Override
	protected boolean matchesSafely(ShoppingCartExtension item, Description mismatchDescription) {
		return (creator == null ? item.getCreator() == null : creator.equals(item.getCreator()))
				&& (name == null ? item.getName() == null : name.equals(item.getName()))
				&& (version == null ? item.getVersion() == null : version.equals(item.getVersion()));
	}

	@Override
	public void describeTo(Description description) {
		description
				.appendText("creator is")
				.appendValue(creator)
				.appendText(", name is ")
				.appendValue(name)
				.appendText(", version is ")
				.appendValue(version);
	}
}
