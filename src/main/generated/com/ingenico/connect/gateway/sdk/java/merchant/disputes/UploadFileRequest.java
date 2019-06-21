/*
 * This class was auto-generated from the API references found at
 * https://epayments-api.developer-ingenico.com/s2sapi/v1/
 */
package com.ingenico.connect.gateway.sdk.java.merchant.disputes;

import com.ingenico.connect.gateway.sdk.java.MultipartFormDataObject;
import com.ingenico.connect.gateway.sdk.java.MultipartFormDataRequest;
import com.ingenico.connect.gateway.sdk.java.UploadableFile;

/**
 * Multipart/form-data parameters for
 * <a href="https://epayments-api.developer-ingenico.com/fileserviceapi/v1/en_US/java/disputes/uploadFile.html">Upload File</a>
 */
public class UploadFileRequest implements MultipartFormDataRequest {

	private UploadableFile file;

	/**
	 * The file that you will upload as evidence to support a dispute.
	 */
	public UploadableFile getFile() {
		return file;
	}

	/**
	 * The file that you will upload as evidence to support a dispute.
	 */
	public void setFile(UploadableFile value) {
		this.file = value;
	}

	@Override
	public MultipartFormDataObject toMultipartFormDataObject() {
		MultipartFormDataObject result = new MultipartFormDataObject();
		if (file != null) {
			result.addFile("file", file);
		}
		return result;
	}
}
