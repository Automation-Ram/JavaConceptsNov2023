package com.qa.constructor;

public class ThisCon {

	public ThisCon() {
		System.out.println("Cons 1");
	}

	public ThisCon(int a) {
		this();
		System.out.println(a);
	}

	public static void main(String[] args) {
		ThisCon obj = new ThisCon(10);

	}

}
