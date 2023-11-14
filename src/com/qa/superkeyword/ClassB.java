package com.qa.superkeyword;

public class ClassB extends ClassA {
	String name = "Rahul";

	public void name() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {

		ClassB ob = new ClassB();
		ob.name();

	}

}
