package com.test.designpattern;

public class LazySingletonRunner {
	public static void main ( String[] args)
	{
		LazySingleton s= LazySingleton.getObject();
		LazySingleton s1= LazySingleton.getObject();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
