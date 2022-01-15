package com.test.designpattern;

public class EagerSingleton {
	private static final EagerSingleton OBJECT = new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getObject() {
		System.out.println(OBJECT);
		return OBJECT;
	}
}
