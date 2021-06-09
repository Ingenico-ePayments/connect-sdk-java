package com.ingenico.connect.gateway.sdk.java;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultMarshaller;

@RunWith(MockitoJUnitRunner.class)
public class CommunicatorTest {

	private static final URI BASE_URI = URI.create("https://eu.sandbox.api-ingenico.com");

	@Mock Session session;

	@Test
	public void testToURIWithoutRequestParams() {

		Mockito.when(session.getApiEndpoint()).thenReturn(BASE_URI);

		@SuppressWarnings("resource")
		Communicator communicator = new Communicator(session, DefaultMarshaller.INSTANCE);

		URI uri = communicator.toAbsoluteURI("v1/merchant/20000/convertamount", Collections.<RequestParam>emptyList());
		Assert.assertEquals(URI.create("https://eu.sandbox.api-ingenico.com/v1/merchant/20000/convertamount"), uri);

		uri = communicator.toAbsoluteURI("/v1/merchant/20000/convertamount", Collections.<RequestParam>emptyList());
		Assert.assertEquals(URI.create("https://eu.sandbox.api-ingenico.com/v1/merchant/20000/convertamount"), uri);
	}

	@Test
	public void testToURIWithRequestParams() {

		List<RequestParam> requestParams = Arrays.asList(
				new RequestParam("amount", "123"),
				new RequestParam("source", "USD"),
				new RequestParam("target", "EUR"),
				new RequestParam("dummy", "é&%=")
		);

		Mockito.when(session.getApiEndpoint()).thenReturn(BASE_URI);

		@SuppressWarnings("resource")
		Communicator communicator = new Communicator(session, DefaultMarshaller.INSTANCE);

		URI uri = communicator.toAbsoluteURI("v1/merchant/20000/convertamount", requestParams);
		Assert.assertEquals(URI.create("https://eu.sandbox.api-ingenico.com/v1/merchant/20000/convertamount?amount=123&source=USD&target=EUR&dummy=%C3%A9%26%25%3D"), uri);

		uri = communicator.toAbsoluteURI("/v1/merchant/20000/convertamount", requestParams);
		Assert.assertEquals(URI.create("https://eu.sandbox.api-ingenico.com/v1/merchant/20000/convertamount?amount=123&source=USD&target=EUR&dummy=%C3%A9%26%25%3D"), uri);
	}
}
