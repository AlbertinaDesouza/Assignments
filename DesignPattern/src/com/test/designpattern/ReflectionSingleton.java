
package com.test.designpattern;

public class ReflectionSingleton {
	private static final ReflectionSingleton OBJECT = new ReflectionSingleton();

	private ReflectionSingleton() {

	}

	public static ReflectionSingleton getObject() {
		System.out.println(OBJECT);
		return OBJECT;
	}
}
