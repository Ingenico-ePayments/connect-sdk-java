package com.ingenico.connect.gateway.sdk.java.defaultimpl;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.RequestHeader;

public class DefaultAuthenticatorTest {

	@Test
	public void testToCanonicalizeHeaderValue() {

		DefaultAuthenticator authenticator = new DefaultAuthenticator(AuthorizationType.V1HMAC, "apiKeyId", "secretApiKey");
		Assert.assertEquals("aap noot", authenticator.toCanonicalizeHeaderValue("aap\nnoot  "));
		Assert.assertEquals("aap noot", authenticator.toCanonicalizeHeaderValue(" aap\r\n  noot"));
	}

	@Test
	public void testToDataToSign() {

		DefaultAuthenticator authenticator = new DefaultAuthenticator(AuthorizationType.V1HMAC, "apiKeyId", "secretApiKey");
		List<RequestHeader> httpHeaders = new ArrayList<RequestHeader>();
		httpHeaders.add(new RequestHeader("X-GCS-ServerMetaInfo", "{\"platformIdentifier\":\"Windows 7/6.1 Java/1.7 (Oracle Corporation; Java HotSpot(TM) 64-Bit Server VM; 1.7.0_45)\",\"sdkIdentifier\":\"1.0\"}"));
		httpHeaders.add(new RequestHeader("Content-Type", 		  "application/json"));
		httpHeaders.add(new RequestHeader("X-GCS-ClientMetaInfo", "{\"aap\",\"noot\"}"));
		httpHeaders.add(new RequestHeader("User-Agent", 		  "Apache-HttpClient/4.3.4 (java 1.5)"));
		httpHeaders.add(new RequestHeader("Date", 				  "Mon, 07 Jul 2014 12:12:40 GMT"));
		String dataToSign = authenticator.toDataToSign("POST", URI.create("http://localhost:8080/v1/9991/services%20bla/convert/amount?aap=noot&mies=geen%20noot"), httpHeaders);

		String expectedStart =
			"POST\n" +
			"application/json\n"
		;
		String expectedEnd =
			"x-gcs-clientmetainfo:{\"aap\",\"noot\"}\n" +
			"x-gcs-servermetainfo:{\"platformIdentifier\":\"Windows 7/6.1 Java/1.7 (Oracle Corporation; Java HotSpot(TM) 64-Bit Server VM; 1.7.0_45)\",\"sdkIdentifier\":\"1.0\"}\n" +
			"/v1/9991/services%20bla/convert/amount?aap=noot&mies=geen noot\n"
		;

		String actualStart = dataToSign.substring(0, 22);
		String actualEnd = dataToSign.substring(52 , 308);

		Assert.assertEquals(expectedStart, actualStart);
		Assert.assertEquals(expectedEnd, actualEnd);
	}

	@Test
	public void testCreateAuthenticationSignature() {

		DefaultAuthenticator authenticator = new DefaultAuthenticator(AuthorizationType.V1HMAC, "apiKeyId", "secretApiKey");

		String dataToSign = "DELETE\n"+
			"application/json\n"+
			"Fri, 06 Jun 2014 13:39:43 GMT\n"+
			"x-gcs-clientmetainfo:processed header value\n"+
			"x-gcs-customerheader:processed header value\n"+
			"x-gcs-servermetainfo:processed header value\n"+
			"/v1/9991/tokens/123456789\n";

		String authenticationSignature = authenticator.createAuthenticationSignature(dataToSign);

		Assert.assertEquals("VfnXpPBQQoHZivTcAg0JvOWkhnzlPnaCPKpTQn/uMJM=", authenticationSignature);
	}

	@Test
	public void testCreateAuthenticationSignature2() {

		DefaultAuthenticator authenticator = new DefaultAuthenticator(AuthorizationType.V1HMAC, "EC36A74A98D21", "6Kj5HT0MQKC6D8eb7W3lTg71kVKVDSt1");

		String dataToSign = "GET\n"+
			"\n"+
			"Fri, 06 Jun 2014 13:39:43 GMT\n"+
			"/v1/9991/tokens/123456789\n";

		String authenticationSignature = authenticator.createAuthenticationSignature(dataToSign);

		Assert.assertEquals("9ond5EIN05dBXJGCLRK5om9pxHsyrh/12pZJ7bvmwNM=", authenticationSignature);
	}
}
