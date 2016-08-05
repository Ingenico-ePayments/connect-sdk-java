package com.globalcollect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import com.globalcollect.gateway.sdk.java.GcDefaultConfiguration;
import com.globalcollect.gateway.sdk.java.GcFactory;
import com.globalcollect.gateway.sdk.java.GcMetaDataProvider;
import com.globalcollect.gateway.sdk.java.GcSession;
import com.globalcollect.gateway.sdk.java.RequestHeader;
import com.globalcollect.gateway.sdk.java.gc.GcClient;
import com.globalcollect.gateway.sdk.java.gc.merchant.products.DirectoryParams;
import com.globalcollect.gateway.sdk.java.gc.product.Directory;

public class MultiLineHeaderTest extends ItTest {

	/**
	 * Smoke test for products service.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		GcDefaultConfiguration configuration = getDefaultConfiguration();
		GcMetaDataProvider metaDataProvider = new GcMetaDataProvider() {
			@Override
			public Collection<RequestHeader> getServerMetaDataHeaders() {
				String multiLineHeader = " some value  \r\n \n with  some \r\n  spaces ";
				return Arrays.asList(new RequestHeader("X-GCS-MultiLineHeader", multiLineHeader));
			}
		};

		DirectoryParams params = new DirectoryParams();
		params.setCountryCode("NL");
		params.setCurrencyCode("EUR");

		GcSession session = GcFactory.createSessionBuilder(configuration)
				.using(metaDataProvider)
				.build();
		GcClient client = GcFactory.createClient(session);
		try {
			Directory response = client.merchant("8500").products().directory(809, params);

			Assert.assertTrue(response.getEntries().size() > 0);

		} finally {
			client.close();
		}
	}
}
