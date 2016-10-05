package com.ingenico.connect.gateway.sdk.java;

import java.util.Collection;
import java.util.List;

/**
 * Base class for a {@link ParamRequest}s.
 */
public abstract class AbstractParamRequest implements ParamRequest {

	/**
	 * Adds a request parameter with the given name and value to the given list, unless if the value is {@code null}.
	 * <p>
	 * The following types are supported:
	 * <ul>
	 * <li>{@link String}
	 * <li>{@link Integer}
	 * <li>{@link Long}
	 * <li>{@link Boolean}
	 * <li>{@link Collection}s of the above
	 * </ul>
	 */
	protected void addParameter(List<RequestParam> requestParameters, String name, Object value) {
		addParameter(requestParameters, name, value, true);
	}

	private void addParameter(List<RequestParam> requestParameters, String name, Object value, boolean allowCollection) {
		if (value instanceof String) {
			requestParameters.add(new RequestParam(name, (String) value));
		} else if (value instanceof Integer || value instanceof Long || value instanceof Boolean) {
			requestParameters.add(new RequestParam(name, value.toString()));
		} else if (allowCollection && value instanceof Collection<?>) {
			Collection<?> values = (Collection<?>) value;
			for (Object element : values) {
				addParameter(requestParameters, name, element, false);
			}
		} else if (value != null) {
			throw new IllegalArgumentException("Unsupported request parameter type");
		}
	}
}
