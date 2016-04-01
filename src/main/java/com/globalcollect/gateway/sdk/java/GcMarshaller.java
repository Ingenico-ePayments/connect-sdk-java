package com.globalcollect.gateway.sdk.java;

/**
 * Used to marshal and unmarshal GlobalCollect platform request and response objects to and from JSON. Thread-safe.
 */
public interface GcMarshaller {

	/**
	 * Marshal a request object to a JSON string.
	 */
	String marshal(Object requestObject);

	/**
	 * Unmarshal a JSON string to a response object, in case of an error.
	 *
	 * @param statusCode This can be used to determine a specific course of action in case the JSON is not valid
	 * @param requestPath Used for exception message
	 * @param type The response object type.
	 * @throws GcMarshallerSyntaxException if the JSON is not a valid representation for an object of the given type
	 */
	<T> T unmarshal(String responseJson, int statusCode, String requestPath, Class<T> type);

	/**
	 * Unmarshal a JSON string to a response object.
	 *
	 * @param type The response object type.
	 * @throws GcMarshallerSyntaxException if the JSON is not a valid representation for an object of the given type
	 */
	<T> T unmarshal(String responseJson, Class<T> type);
}
