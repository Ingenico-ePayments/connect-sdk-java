package com.globalcollect.gateway.sdk.java.defaultimpl;

import org.apache.http.HttpStatus;

import com.globalcollect.gateway.sdk.java.GcMarshaller;
import com.globalcollect.gateway.sdk.java.GcMarshallerSyntaxException;
import com.globalcollect.gateway.sdk.java.GcNotFoundException;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * {@link GcMarshaller} implementation based on {@link Gson}.
 */
public class DefaultGcMarshaller implements GcMarshaller {

	// Gson instances are thread-safe, so reuse one single instance
	private static final Gson GSON = new Gson();

	public static final DefaultGcMarshaller INSTANCE = new DefaultGcMarshaller();

	protected DefaultGcMarshaller() {}

	@Override
	public String marshal(Object requestObject) {
		return GSON.toJson(requestObject);
	}

	@Override
	public <T> T unmarshal(String responseJson, int statusCode, String requestPath, Class<T> type) {
		try {
			return GSON.fromJson(responseJson, type);
		} catch (JsonSyntaxException e) {
			if (statusCode == HttpStatus.SC_NOT_FOUND) {
				throw new GcNotFoundException("The requested resource was not found; invalid path: " + requestPath, e);
			} else {
				throw new GcMarshallerSyntaxException(e);
			}
		}
	}

	@Override
	public <T> T unmarshal(String responseJson, Class<T> type) {
		try {
			return GSON.fromJson(responseJson, type);
		} catch (JsonSyntaxException e) {
			throw new GcMarshallerSyntaxException(e);
		}
	}
}
