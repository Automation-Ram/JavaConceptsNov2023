package com.qa.poly;

public class MehtodOverloading {

	public void m1() {
		System.out.println("Method 1");
	}

	public void m1(int a) {
		System.out.println(a);
	}

	public int m1(int a, int b) {
		int s;
		s = a + b;
		return s;
	}

	public static void main(String[] args) {
		MehtodOverloading obj = new MehtodOverloading();
		obj.m1();
		obj.m1(10);
		System.out.println(obj.m1(10, 20));

	}

}
