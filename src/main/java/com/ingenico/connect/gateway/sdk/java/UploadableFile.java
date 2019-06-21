package com.ingenico.connect.gateway.sdk.java;

import java.io.InputStream;

/**
 * A file that can be uploaded.
 */
public class UploadableFile {

	private final String fileName;
	private final InputStream content;
	private final String contentType;
	private final long contentLength;

	public UploadableFile(String fileName, InputStream content, String contentType) {
		this(fileName, content, contentType, -1);
	}

	public UploadableFile(String fileName, InputStream content, String contentType, long contentLength) {
		if (fileName == null || fileName.trim().isEmpty()) {
			throw new IllegalArgumentException("fileName is required");
		}
		if (content == null) {
			throw new IllegalArgumentException("content is required");
		}
		if (contentType == null || contentType.trim().isEmpty()) {
			throw new IllegalArgumentException("contentType is required");
		}
		this.fileName = fileName;
		this.content = content;
		this.contentType = contentType;
		this.contentLength = Math.max(contentLength, -1);
	}

	/**
	 * @return The name of the file.
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @return An input stream with the file's content.
	 */
	public InputStream getContent() {
		return content;
	}

	/**
	 * @return The file's content type.
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @return The file's content length, or -1 if not known.
	 */
	public long getContentLength() {
		return contentLength;
	}
}
