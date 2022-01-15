package com.test.designpattern;

public class EagerSingletonRunner {
	public static void main ( String[] args)
	{
		EagerSingleton s= EagerSingleton.getObject();
		EagerSingleton s1= EagerSingleton.getObject();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
