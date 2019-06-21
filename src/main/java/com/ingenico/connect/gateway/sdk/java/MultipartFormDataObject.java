package com.ingenico.connect.gateway.sdk.java;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/**
 * A representation of a multipart/form-data object.
 */
public class MultipartFormDataObject {

	private final String boundary;
	private final String contentType;

	private final Map<String, String> values;
	private final Map<String, UploadableFile> files;

	public MultipartFormDataObject() {
		boundary = UUID.randomUUID().toString();
		contentType = "multipart/form-data; boundary=" + boundary;
		values = new LinkedHashMap<String, String>();
		files = new LinkedHashMap<String, UploadableFile>();
	}

	public String getBoundary() {
		return boundary;
	}

	public String getContentType() {
		return contentType;
	}

	public Map<String, String> getValues() {
		return Collections.unmodifiableMap(values);
	}

	public Map<String, UploadableFile> getFiles() {
		return Collections.unmodifiableMap(files);
	}

	public void addValue(String parameterName, String value) {
		if (parameterName == null || parameterName.trim().isEmpty()) {
			throw new IllegalArgumentException("parameterName is required");
		}
		if (value == null) {
			throw new IllegalArgumentException("value is required");
		}
		if (values.containsKey(parameterName) || files.containsKey(parameterName)) {
			throw new IllegalArgumentException("duplicate parameterName: " + parameterName);
		}
		values.put(parameterName, value);
	}

	public void addFile(String parameterName, UploadableFile file) {
		if (parameterName == null || parameterName.trim().isEmpty()) {
			throw new IllegalArgumentException("parameterName is required");
		}
		if (file == null) {
			throw new IllegalArgumentException("file is required");
		}
		if (values.containsKey(parameterName) || files.containsKey(parameterName)) {
			throw new IllegalArgumentException("duplicate parameterName: " + parameterName);
		}
		files.put(parameterName, file);
	}
}
