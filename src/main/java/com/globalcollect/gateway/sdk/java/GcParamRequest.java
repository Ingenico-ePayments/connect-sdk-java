package com.globalcollect.gateway.sdk.java;

import java.util.List;

/**
 * Represents a set of request parameters.
 */
public interface GcParamRequest {

	List<RequestParam> toRequestParameters();
	
}
