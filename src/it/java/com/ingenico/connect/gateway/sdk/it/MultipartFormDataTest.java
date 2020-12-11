package com.ingenico.connect.gateway.sdk.it;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.BodyHandler;
import com.ingenico.connect.gateway.sdk.java.Communicator;
import com.ingenico.connect.gateway.sdk.java.CommunicatorConfiguration;
import com.ingenico.connect.gateway.sdk.java.Factory;
import com.ingenico.connect.gateway.sdk.java.MultipartFormDataObject;
import com.ingenico.connect.gateway.sdk.java.MultipartFormDataRequest;
import com.ingenico.connect.gateway.sdk.java.ResponseHeader;
import com.ingenico.connect.gateway.sdk.java.UploadableFile;
import com.ingenico.connect.gateway.sdk.java.defaultimpl.DefaultMarshaller;

public class MultipartFormDataTest extends ItTest {

	@Test
	public void testMultipartFormDataUploadPostMultipartFormDataObjectWithResponse() throws URISyntaxException, IOException {

		CommunicatorConfiguration configuration = getCommunicatorConfiguration();
		configuration.setApiEndpoint(URI.create("http://httpbin.org"));

		Communicator communicator = Factory.createCommunicator(configuration);
		try {
			InputStream content = getClass().getResourceAsStream("/itconfiguration.properties");
			try {
				MultipartFormDataObject multipart = new MultipartFormDataObject();
				multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
				multipart.addValue("value", "Hello World");

				@SuppressWarnings("unchecked")
				Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

				MatcherAssert.assertThat(response.get("files"), Matchers.instanceOf(Map.class));
				@SuppressWarnings("unchecked")
				Map<String, Object> files = (Map<String, Object>) response.get("files");
				Assert.assertEquals(1, files.size());
				Assert.assertNotNull(files.get("file"));
				MatcherAssert.assertThat(files.get("file"), Matchers.instanceOf(String.class));
				MatcherAssert.assertThat((String) files.get("file"), Matchers.containsString("\nconnect.api.endpoint.host"));

				MatcherAssert.assertThat(response.get("form"), Matchers.instanceOf(Map.class));
				@SuppressWarnings("unchecked")
				Map<String, Object> form = (Map<String, Object>) response.get("form");
				Assert.assertEquals(1, form.size());
				Assert.assertNotNull(form.get("value"));
				MatcherAssert.assertThat(form.get("value"), Matchers.instanceOf(String.class));
				Assert.assertEquals(form.get("value"), "Hello World");
			} finally {
				content.close();
			}
		} finally {
			communicator.close();
		}
	}

	@Test
	public void testMultipartFormDataUploadPostMultipartFormDataRequestWithResponse() throws URISyntaxException, IOException {

		CommunicatorConfiguration configuration = getCommunicatorConfiguration();
		configuration.setApiEndpoint(URI.create("http://httpbin.org"));

		Communicator communicator = Factory.createCommunicator(configuration);
		try {
			InputStream content = getClass().getResourceAsStream("/itconfiguration.properties");
			try {
				MultipartFormDataObject multipart = new MultipartFormDataObject();
				multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
				multipart.addValue("value", "Hello World");

				@SuppressWarnings("unchecked")
				Map<String, Object> response = communicator.post("/post", null, null, new MultipartFormDataObjectWrapper(multipart), Map.class, null);

				MatcherAssert.assertThat(response.get("files"), Matchers.instanceOf(Map.class));
				@SuppressWarnings("unchecked")
				Map<String, Object> files = (Map<String, Object>) response.get("files");
				Assert.assertEquals(1, files.size());
				Assert.assertNotNull(files.get("file"));
				MatcherAssert.assertThat(files.get("file"), Matchers.instanceOf(String.class));
				MatcherAssert.assertThat((String) files.get("file"), Matchers.containsString("\nconnect.api.endpoint.host"));

				MatcherAssert.assertThat(response.get("form"), Matchers.instanceOf(Map.class));
				@SuppressWarnings("unchecked")
				Map<String, Object> form = (Map<String, Object>) response.get("form");
				Assert.assertEquals(1, form.size());
				Assert.assertNotNull(form.get("value"));
				MatcherAssert.assertThat(form.get("value"), Matchers.instanceOf(String.class));
				Assert.assertEquals(form.get("value"), "Hello World");
			} finally {
				content.close();
			}
		} finally {
			communicator.close();
		}
	}

	@Test
	public void testMultipartFormDataUploadPostMultipartFormDataObjectWithBodyHandler() throws URISyntaxException, IOException {

		CommunicatorConfiguration configuration = getCommunicatorConfiguration();
		configuration.setApiEndpoint(URI.create("http://httpbin.org"));

		Communicator communicator = Factory.createCommunicator(configuration);
		try {
			InputStream content = getClass().getResourceAsStream("/itconfiguration.properties");
			try {
				MultipartFormDataObject multipart = new MultipartFormDataObject();
				multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
				multipart.addValue("value", "Hello World");

				communicator.post("/post", null, null, multipart, new BodyHandler() {

					@Override
					public void handleBody(InputStream bodyStream, List<ResponseHeader> headers) throws IOException {
						@SuppressWarnings("unchecked")
						Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

						MatcherAssert.assertThat(response.get("files"), Matchers.instanceOf(Map.class));
						@SuppressWarnings("unchecked")
						Map<String, Object> files = (Map<String, Object>) response.get("files");
						Assert.assertEquals(1, files.size());
						Assert.assertNotNull(files.get("file"));
						MatcherAssert.assertThat(files.get("file"), Matchers.instanceOf(String.class));
						MatcherAssert.assertThat((String) files.get("file"), Matchers.containsString("\nconnect.api.endpoint.host"));

						MatcherAssert.assertThat(response.get("form"), Matchers.instanceOf(Map.class));
						@SuppressWarnings("unchecked")
						Map<String, Object> form = (Map<String, Object>) response.get("form");
						Assert.assertEquals(1, form.size());
						Assert.assertNotNull(form.get("value"));
						MatcherAssert.assertThat(form.get("value"), Matchers.instanceOf(String.class));
						Assert.assertEquals(form.get("value"), "Hello World");
					}
				}, null);
			} finally {
				content.close();
			}
		} finally {
			communicator.close();
		}
	}

	@Test
	public void testMultipartFormDataUploadPostMultipartFormDataRequestWithBodyHandler() throws URISyntaxException, IOException {

		CommunicatorConfiguration configuration = getCommunicatorConfiguration();
		configuration.setApiEndpoint(URI.create("http://httpbin.org"));

		Communicator communicator = Factory.createCommunicator(configuration);
		try {
			InputStream content = getClass().getResourceAsStream("/itconfiguration.properties");
			try {
				MultipartFormDataObject multipart = new MultipartFormDataObject();
				multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
				multipart.addValue("value", "Hello World");

				communicator.post("/post", null, null, new MultipartFormDataObjectWrapper(multipart), new BodyHandler() {

					@Override
					public void handleBody(InputStream bodyStream, List<ResponseHeader> headers) throws IOException {
						@SuppressWarnings("unchecked")
						Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

						MatcherAssert.assertThat(response.get("files"), Matchers.instanceOf(Map.class));
						@SuppressWarnings("unchecked")
						Map<String, Object> files = (Map<String, Object>) response.get("files");
						Assert.assertEquals(1, files.size());
						Assert.assertNotNull(files.get("file"));
						MatcherAssert.assertThat(files.get("file"), Matchers.instanceOf(String.class));
						MatcherAssert.assertThat((String) files.get("file"), Matchers.containsString("\nconnect.api.endpoint.host"));

						MatcherAssert.assertThat(response.get("form"), Matchers.instanceOf(Map.class));
						@SuppressWarnings("unchecked")
						Map<String, Object> form = (Map<String, Object>) response.get("form");
						Assert.assertEquals(1, form.size());
						Assert.assertNotNull(form.get("value"));
						MatcherAssert.assertThat(form.get("value"), Matchers.instanceOf(String.class));
						Assert.assertEquals(form.get("value"), "Hello World");
					}
				}, null);
			} finally {
				content.close();
			}
		} finally {
			communicator.close();
		}
	}

	@Test
	public void testMultipartFormDataUploadPutMultipartFormDataObjectWithResponse() throws URISyntaxException, IOException {

		CommunicatorConfiguration configuration = getCommunicatorConfiguration();
		configuration.setApiEndpoint(URI.create("http://httpbin.org"));

		Communicator communicator = Factory.createCommunicator(configuration);
		try {
			InputStream content = getClass().getResourceAsStream("/itconfiguration.properties");
			try {
				MultipartFormDataObject multipart = new MultipartFormDataObject();
				multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
				multipart.addValue("value", "Hello World");

				@SuppressWarnings("unchecked")
				Map<String, Object> response = communicator.put("/put", null, null, multipart, Map.class, null);

				MatcherAssert.assertThat(response.get("files"), Matchers.instanceOf(Map.class));
				@SuppressWarnings("unchecked")
				Map<String, Object> files = (Map<String, Object>) response.get("files");
				Assert.assertEquals(1, files.size());
				Assert.assertNotNull(files.get("file"));
				MatcherAssert.assertThat(files.get("file"), Matchers.instanceOf(String.class));
				MatcherAssert.assertThat((String) files.get("file"), Matchers.containsString("\nconnect.api.endpoint.host"));

				MatcherAssert.assertThat(response.get("form"), Matchers.instanceOf(Map.class));
				@SuppressWarnings("unchecked")
				Map<String, Object> form = (Map<String, Object>) response.get("form");
				Assert.assertEquals(1, form.size());
				Assert.assertNotNull(form.get("value"));
				MatcherAssert.assertThat(form.get("value"), Matchers.instanceOf(String.class));
				Assert.assertEquals(form.get("value"), "Hello World");
			} finally {
				content.close();
			}
		} finally {
			communicator.close();
		}
	}

	@Test
	public void testMultipartFormDataUploadPutMultipartFormDataRequestWithResponse() throws URISyntaxException, IOException {

		CommunicatorConfiguration configuration = getCommunicatorConfiguration();
		configuration.setApiEndpoint(URI.create("http://httpbin.org"));

		Communicator communicator = Factory.createCommunicator(configuration);
		try {
			InputStream content = getClass().getResourceAsStream("/itconfiguration.properties");
			try {
				MultipartFormDataObject multipart = new MultipartFormDataObject();
				multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
				multipart.addValue("value", "Hello World");

				@SuppressWarnings("unchecked")
				Map<String, Object> response = communicator.put("/put", null, null, new MultipartFormDataObjectWrapper(multipart), Map.class, null);

				MatcherAssert.assertThat(response.get("files"), Matchers.instanceOf(Map.class));
				@SuppressWarnings("unchecked")
				Map<String, Object> files = (Map<String, Object>) response.get("files");
				Assert.assertEquals(1, files.size());
				Assert.assertNotNull(files.get("file"));
				MatcherAssert.assertThat(files.get("file"), Matchers.instanceOf(String.class));
				MatcherAssert.assertThat((String) files.get("file"), Matchers.containsString("\nconnect.api.endpoint.host"));

				MatcherAssert.assertThat(response.get("form"), Matchers.instanceOf(Map.class));
				@SuppressWarnings("unchecked")
				Map<String, Object> form = (Map<String, Object>) response.get("form");
				Assert.assertEquals(1, form.size());
				Assert.assertNotNull(form.get("value"));
				MatcherAssert.assertThat(form.get("value"), Matchers.instanceOf(String.class));
				Assert.assertEquals(form.get("value"), "Hello World");
			} finally {
				content.close();
			}
		} finally {
			communicator.close();
		}
	}

	@Test
	public void testMultipartFormDataUploadPutMultipartFormDataObjectWithBodyHandler() throws URISyntaxException, IOException {

		CommunicatorConfiguration configuration = getCommunicatorConfiguration();
		configuration.setApiEndpoint(URI.create("http://httpbin.org"));

		Communicator communicator = Factory.createCommunicator(configuration);
		try {
			InputStream content = getClass().getResourceAsStream("/itconfiguration.properties");
			try {
				MultipartFormDataObject multipart = new MultipartFormDataObject();
				multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
				multipart.addValue("value", "Hello World");

				communicator.put("/put", null, null, multipart, new BodyHandler() {

					@Override
					public void handleBody(InputStream bodyStream, List<ResponseHeader> headers) throws IOException {
						@SuppressWarnings("unchecked")
						Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

						MatcherAssert.assertThat(response.get("files"), Matchers.instanceOf(Map.class));
						@SuppressWarnings("unchecked")
						Map<String, Object> files = (Map<String, Object>) response.get("files");
						Assert.assertEquals(1, files.size());
						Assert.assertNotNull(files.get("file"));
						MatcherAssert.assertThat(files.get("file"), Matchers.instanceOf(String.class));
						MatcherAssert.assertThat((String) files.get("file"), Matchers.containsString("\nconnect.api.endpoint.host"));

						MatcherAssert.assertThat(response.get("form"), Matchers.instanceOf(Map.class));
						@SuppressWarnings("unchecked")
						Map<String, Object> form = (Map<String, Object>) response.get("form");
						Assert.assertEquals(1, form.size());
						Assert.assertNotNull(form.get("value"));
						MatcherAssert.assertThat(form.get("value"), Matchers.instanceOf(String.class));
						Assert.assertEquals(form.get("value"), "Hello World");
					}
				}, null);
			} finally {
				content.close();
			}
		} finally {
			communicator.close();
		}
	}

	@Test
	public void testMultipartFormDataUploadPutMultipartFormDataRequestWithBodyHandler() throws URISyntaxException, IOException {

		CommunicatorConfiguration configuration = getCommunicatorConfiguration();
		configuration.setApiEndpoint(URI.create("http://httpbin.org"));

		Communicator communicator = Factory.createCommunicator(configuration);
		try {
			InputStream content = getClass().getResourceAsStream("/itconfiguration.properties");
			try {
				MultipartFormDataObject multipart = new MultipartFormDataObject();
				multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
				multipart.addValue("value", "Hello World");

				communicator.put("/put", null, null, new MultipartFormDataObjectWrapper(multipart), new BodyHandler() {

					@Override
					public void handleBody(InputStream bodyStream, List<ResponseHeader> headers) throws IOException {
						@SuppressWarnings("unchecked")
						Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

						MatcherAssert.assertThat(response.get("files"), Matchers.instanceOf(Map.class));
						@SuppressWarnings("unchecked")
						Map<String, Object> files = (Map<String, Object>) response.get("files");
						Assert.assertEquals(1, files.size());
						Assert.assertNotNull(files.get("file"));
						MatcherAssert.assertThat(files.get("file"), Matchers.instanceOf(String.class));
						MatcherAssert.assertThat((String) files.get("file"), Matchers.containsString("\nconnect.api.endpoint.host"));

						MatcherAssert.assertThat(response.get("form"), Matchers.instanceOf(Map.class));
						@SuppressWarnings("unchecked")
						Map<String, Object> form = (Map<String, Object>) response.get("form");
						Assert.assertEquals(1, form.size());
						Assert.assertNotNull(form.get("value"));
						MatcherAssert.assertThat(form.get("value"), Matchers.instanceOf(String.class));
						Assert.assertEquals(form.get("value"), "Hello World");
					}
				}, null);
			} finally {
				content.close();
			}
		} finally {
			communicator.close();
		}
	}

	private static final class MultipartFormDataObjectWrapper implements MultipartFormDataRequest {

		private final MultipartFormDataObject multipart;

		private MultipartFormDataObjectWrapper(MultipartFormDataObject multipart) {
			this.multipart = multipart;
		}

		@Override
		public MultipartFormDataObject toMultipartFormDataObject() {
			return multipart;
		}
	}
}
