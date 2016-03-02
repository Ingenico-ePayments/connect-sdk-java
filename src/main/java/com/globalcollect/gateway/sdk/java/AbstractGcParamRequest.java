package com.globalcollect.gateway.sdk.java;

import java.util.List;

/**
 * Base class for a {@link GcParamRequest}s.
 */
public abstract class AbstractGcParamRequest implements GcParamRequest {

	protected void addParameter(List<RequestParam> requestParameters, String name, Object value) {
		if (value != null) {
			if (value instanceof String) {
				requestParameters.add(new RequestParam(name, (String)value));
			} else if (value instanceof Long) {
				requestParameters.add(new RequestParam(name, String.valueOf(value)));
			} else {
				throw new IllegalArgumentException("Unsupported request parameter type");
			}
		}
	}
}
