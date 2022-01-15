package com.test.designpattern;

public class LazySingleton {
	private static  LazySingleton OBJECT = null;

	private LazySingleton() {

	}

	public static LazySingleton getObject() {
		if( OBJECT == null )
		{
			OBJECT = new LazySingleton();
		}
		System.out.println("OBJECT CREATED");
		return OBJECT;
	}

}
