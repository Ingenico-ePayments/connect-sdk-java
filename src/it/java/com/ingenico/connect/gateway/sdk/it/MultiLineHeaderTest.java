package com.ingenico.connect.gateway.sdk.it;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.Client;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.MetaDataProvider;
import com.ingenico.connect.gateway.sdk.java.MetaDataProviderBuilder;
import com.ingenico.connect.gateway.sdk.java.RequestHeader;
import com.ingenico.connect.gateway.sdk.java.Session;
import com.ingenico.connect.gateway.sdk.java.domain.product.Directory;
import com.ingenico.connect.gateway.sdk.java.merchant.products.DirectoryParams;

public class MultiLineHeaderTest extends ItTest {

	/**
	 * Smoke test for products service.
	 */
	@Test
	public void test() throws URISyntaxException, IOException {

		CommunicatorConfiguration configuration = getCommunicatorConfiguration();

		String multiLineHeader = " some value  \r\n \n with  some \r\n  spaces ";
		MetaDataProvider metaDataProvider = new MetaDataProviderBuilder("Ingenico")
				.withAdditionalRequestHeader(new RequestHeader("X-GCS-MultiLineHeader", multiLineHeader))
				.build();

		DirectoryParams params = new DirectoryParams();
		params.setCountryCode("NL");
		params.setCurrencyCode("EUR");

		Session session = Factory.createSessionBuilder(configuration)
				.withMetaDataProvider(metaDataProvider)
				.build();
		Client client = Factory.createClient(session);
		try {
			Directory response = client.merchant("8500").products().directory(809, params);

			Assert.assertTrue(response.getEntries().size() > 0);

		} finally {
			client.close();
		}
	}
}
