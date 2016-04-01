package com.globalcollect.gateway.sdk.java.defaultimpl;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;

import com.globalcollect.gateway.sdk.java.GcMetaDataProvider;
import com.globalcollect.gateway.sdk.java.RequestHeader;

/**
 * Default {@link GcMetaDataProvider} implementation.
 */
public class DefaultGcMetaDataProvider implements GcMetaDataProvider {

	private static final Charset CHARSET = Charset.forName("UTF-8");

	@SuppressWarnings("unused")
	private static final class ServerMetaInfo {
		String platformIdentifier;
		String sdkIdentifier;
	}

	private final Collection<RequestHeader> metaDataHeaders;

	public DefaultGcMetaDataProvider() {

		ServerMetaInfo serverMetaInfo = new ServerMetaInfo();
		serverMetaInfo.platformIdentifier = getPlatformIdentifier();
		serverMetaInfo.sdkIdentifier = getSdkIdentifier();

		String serverMetaInfoString = DefaultGcMarshaller.INSTANCE.marshal(serverMetaInfo);
		RequestHeader serverMetaInfoHeader = new RequestHeader("X-GCS-ServerMetaInfo", Base64.encodeBase64String(serverMetaInfoString.getBytes(CHARSET)));
		metaDataHeaders = Collections.singletonList(serverMetaInfoHeader);
	}

	@Override
	public Collection<RequestHeader> getServerMetaDataHeaders() {
		return metaDataHeaders;
	}

	protected String getPlatformIdentifier() {
		Properties properties = System.getProperties();
		StringBuilder sb = new StringBuilder();
		sb.append(properties.get("os.name"));
		sb.append("/");
		sb.append(properties.get("os.version"));
		sb.append(" ");
		sb.append("Java");
		sb.append("/");
		sb.append(properties.get("java.vm.specification.version"));
		sb.append(" ");
		sb.append("(");
		sb.append(properties.get("java.vm.vendor"));
		sb.append("; ");
		sb.append(properties.get("java.vm.name"));
		sb.append("; ");
		sb.append(properties.get("java.version"));
		sb.append(")");
		return sb.toString();
	}

	protected String getSdkIdentifier() {
		String sdkIdentifier = "unknown";

		// don't use getClass() because of possible overrides
		InputStream pomProperties = DefaultGcMetaDataProvider.class.getResourceAsStream("/META-INF/maven/com.ingenico.connect.gateway/connect-sdk-java/pom.properties");
		if (pomProperties != null) {
			try {
				try {
					Properties properties = new Properties();
					properties.load(pomProperties);
					sdkIdentifier = properties.getProperty("version", sdkIdentifier);
				} finally {
					pomProperties.close();
				}
			} catch (IOException e) {
				// ignore the exception
			}
		}

		return sdkIdentifier;
	}
}
