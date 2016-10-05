package com.ingenico.connect.gateway.sdk.java.defaultimpl;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.ingenico.connect.gateway.sdk.java.Marshaller;
import com.ingenico.connect.gateway.sdk.java.MarshallerSyntaxException;

/**
 * {@link Marshaller} implementation based on {@link Gson}.
 */
public class DefaultMarshaller implements Marshaller {

	// Gson instances are thread-safe, so reuse one single instance
	private static final Gson GSON = new Gson();

	public static final DefaultMarshaller INSTANCE = new DefaultMarshaller();

	protected DefaultMarshaller() {}

	@Override
	public String marshal(Object requestObject) {
		return GSON.toJson(requestObject);
	}

	@Override
	public <T> T unmarshal(String responseJson, Class<T> type) {
		try {
			return GSON.fromJson(responseJson, type);
		} catch (JsonSyntaxException e) {
			throw new MarshallerSyntaxException(e);
		}
	}
}
