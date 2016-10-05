package com.ingenico.connect.gateway.sdk.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import com.ingenico.connect.gateway.sdk.java.util.RequestParamMatcher;

public class AbstractParamRequestTest {

	@Test
	public void testAddParameterString() {
		AbstractParamRequest request = new TestParamRequest();

		List<RequestParam> requestParameters = new LinkedList<RequestParam>();

		request.addParameter(requestParameters, "test", "foo");

		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();
		matchers.add(new RequestParamMatcher("test", "foo"));

		Assert.assertThat(requestParameters, Matchers.contains(matchers));
	}

	@Test
	public void testAddParameterInteger() {
		AbstractParamRequest request = new TestParamRequest();

		List<RequestParam> requestParameters = new LinkedList<RequestParam>();

		request.addParameter(requestParameters, "test", 1);

		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();
		matchers.add(new RequestParamMatcher("test", "1"));

		Assert.assertThat(requestParameters, Matchers.contains(matchers));
	}

	@Test
	public void testAddParameterLong() {
		AbstractParamRequest request = new TestParamRequest();

		List<RequestParam> requestParameters = new LinkedList<RequestParam>();

		request.addParameter(requestParameters, "test", 1L);

		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();
		matchers.add(new RequestParamMatcher("test", "1"));

		Assert.assertThat(requestParameters, Matchers.contains(matchers));
	}

	@Test
	public void testAddParameterBoolean() {
		AbstractParamRequest request = new TestParamRequest();

		List<RequestParam> requestParameters = new LinkedList<RequestParam>();

		request.addParameter(requestParameters, "test", true);

		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();
		matchers.add(new RequestParamMatcher("test", "true"));

		Assert.assertThat(requestParameters, Matchers.contains(matchers));
	}

	@Test
	public void testAddParameterStringList() {
		AbstractParamRequest request = new TestParamRequest();

		List<RequestParam> requestParameters = new LinkedList<RequestParam>();

		request.addParameter(requestParameters, "test", Arrays.asList("foo", "bar"));

		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();
		matchers.add(new RequestParamMatcher("test", "foo"));
		matchers.add(new RequestParamMatcher("test", "bar"));

		Assert.assertThat(requestParameters, Matchers.contains(matchers));
	}

	@Test
	public void testAddParameterIntegerList() {
		AbstractParamRequest request = new TestParamRequest();

		List<RequestParam> requestParameters = new LinkedList<RequestParam>();

		request.addParameter(requestParameters, "test", Arrays.asList(1, 2));

		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();
		matchers.add(new RequestParamMatcher("test", "1"));
		matchers.add(new RequestParamMatcher("test", "2"));

		Assert.assertThat(requestParameters, Matchers.contains(matchers));
	}

	@Test
	public void testAddParameterLongList() {
		AbstractParamRequest request = new TestParamRequest();

		List<RequestParam> requestParameters = new LinkedList<RequestParam>();

		request.addParameter(requestParameters, "test", Arrays.asList(1L, 2L));

		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();
		matchers.add(new RequestParamMatcher("test", "1"));
		matchers.add(new RequestParamMatcher("test", "2"));

		Assert.assertThat(requestParameters, Matchers.contains(matchers));
	}

	@Test
	public void testAddParameterBooleanList() {
		AbstractParamRequest request = new TestParamRequest();

		List<RequestParam> requestParameters = new LinkedList<RequestParam>();

		request.addParameter(requestParameters, "test", Arrays.asList(true, false));

		List<Matcher<? super RequestParam>> matchers = new ArrayList<Matcher<? super RequestParam>>();
		matchers.add(new RequestParamMatcher("test", "true"));
		matchers.add(new RequestParamMatcher("test", "false"));

		Assert.assertThat(requestParameters, Matchers.contains(matchers));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddParameterDate() {
		AbstractParamRequest request = new TestParamRequest();

		List<RequestParam> requestParameters = new LinkedList<RequestParam>();

		request.addParameter(requestParameters, "test", new Date());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAddParameterStringListList() {
		AbstractParamRequest request = new TestParamRequest();

		List<RequestParam> requestParameters = new LinkedList<RequestParam>();

		request.addParameter(requestParameters, "test", Collections.singletonList(Collections.singletonList("foo")));
	}

	private static final class TestParamRequest extends AbstractParamRequest {

		@Override
		public List<RequestParam> toRequestParameters() {
			throw new UnsupportedOperationException();
		}
	}
}
