package com.globalcollect.gateway.sdk.java;

import java.lang.reflect.Type;

/**
 * This wrapper object can be used to pass {@link Type} information which would otherwise not be available at runtime.
 */
public class TypeWrapper<T> {

	private final Class<T> type;

	public TypeWrapper(Class<T> type) {
		this.type = type;
	}

	public Class<T> getType() {
		return this.type;
	}
}
