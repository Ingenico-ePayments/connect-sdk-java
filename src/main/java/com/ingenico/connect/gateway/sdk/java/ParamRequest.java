package com.ingenico.connect.gateway.sdk.java;

import java.util.List;

/**
 * Represents a set of request parameters.
 */
public interface ParamRequest {

	List<RequestParam> toRequestParameters();
}
