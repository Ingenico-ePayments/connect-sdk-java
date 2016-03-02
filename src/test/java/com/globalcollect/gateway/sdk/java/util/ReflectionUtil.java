package com.globalcollect.gateway.sdk.java.util;

import java.lang.reflect.Field;

import org.junit.Assert;

public final class ReflectionUtil {

	private ReflectionUtil() {}

	public static <T> T getField(Object object, String fieldName, Class<T> fieldType) {
		Class<?> clazz = object.getClass();
		while (clazz != Object.class) {
			try {
				Field field = clazz.getDeclaredField(fieldName);
				field.setAccessible(true);
				Object fieldValue = field.get(object);
				Assert.assertTrue(fieldType.isInstance(fieldValue));
				return fieldType.cast(fieldValue);
			} catch (NoSuchFieldException e) {
				// try next class
			} catch (IllegalAccessException e) {
				// should no longer occur
				throw new RuntimeException(e);
			}

			clazz = clazz.getSuperclass();
		}

		return null;
	}
}
