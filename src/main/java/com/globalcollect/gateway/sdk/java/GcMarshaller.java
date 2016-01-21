package com.globalcollect.gateway.sdk.java;

/**
 * Used to marshal and unmarshal GlobalCollect request and response objects to and from JSON. Thread-safe.
 */
public interface GcMarshaller {

	/**
	 * Unmarshal a request object to a JSON string.
	 */
	String marshal(Object requestObject);
	
	/**
	 * Marshal a JSON string to a response object, in case of an error.
	 * 
	 * @param statusCode this can be used to determine a specific course of action in case the JSON is not valid
	 * @param requestPath used for exception message
	 * 
	 * @throws GcMarshallerSyntaxException
	 *             if the JSON is not a valid representation for an object of
	 *             type classOfT
	 */
	<T> T unmarshal(String responseJson, int statusCode, String requestPath, TypeWrapper<T> typeWrapper);
	
	/**
	 * Marshal a JSON string to a response object.
	 * 
	 * @throws GcMarshallerSyntaxException
	 *             if the JSON is not a valid representation for an object of
	 *             type classOfT
	 */
	<T> T unmarshal(String responseJson, TypeWrapper<T> typeWrapper);
}
