package com.qa.oopsconcepts;

public class NonStaticMethod {

	public int add(int a, int b) {
		int s;
		s = a + b;
		return s;
	}

	public static void main(String[] args) {
		NonStaticMethod obj = new NonStaticMethod();
		System.out.println("The sum of numbers:" + obj.add(100, 200));

	}

}
