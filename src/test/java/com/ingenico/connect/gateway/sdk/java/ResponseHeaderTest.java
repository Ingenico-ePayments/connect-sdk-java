package com.ingenico.connect.gateway.sdk.java;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class ResponseHeaderTest {

	@Test
	public void testGetDispositionFilename() {
		Map<String, String> testData = new LinkedHashMap<String, String>();
		testData.put("attachment; filename=testfile", "testfile");
		testData.put("attachment; filename=\"testfile\"", "testfile");
		testData.put("attachment; filename=\"testfile", "\"testfile");
		testData.put("attachment; filename=testfile\"", "testfile\"");
		testData.put("attachment; filename='testfile'", "testfile");
		testData.put("attachment; filename='testfile", "'testfile");
		testData.put("attachment; filename=testfile'", "testfile'");

		testData.put("filename=testfile", "testfile");
		testData.put("filename=\"testfile\"", "testfile");
		testData.put("filename=\"testfile", "\"testfile");
		testData.put("filename=testfile\"", "testfile\"");
		testData.put("filename='testfile'", "testfile");
		testData.put("filename='testfile", "'testfile");
		testData.put("filename=testfile'", "testfile'");

		testData.put("attachment; filename=testfile; x=y", "testfile");
		testData.put("attachment; filename=\"testfile\"; x=y", "testfile");
		testData.put("attachment; filename=\"testfile; x=y", "\"testfile");
		testData.put("attachment; filename=testfile\"; x=y", "testfile\"");
		testData.put("attachment; filename='testfile'; x=y", "testfile");
		testData.put("attachment; filename='testfile; x=y", "'testfile");
		testData.put("attachment; filename=testfile'; x=y", "testfile'");

		testData.put("attachment", null);

		testData.put("filename=\"", "\"");
		testData.put("filename='", "'");

		for (Map.Entry<String, String> entry : testData.entrySet()) {
			ResponseHeader header = new ResponseHeader("Content-Disposition", entry.getKey());
			Assert.assertEquals(entry.getValue(), ResponseHeader.getDispositionFilename(Collections.singletonList(header)));
		}
	}
}
