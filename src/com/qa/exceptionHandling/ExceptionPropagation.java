package com.qa.exceptionHandling;

public class ExceptionPropagation {

	public void m1() {
		int i = 50 / 0;
	}

	public void m2() {
		m1();
	}

	public void m3() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println("Exception has been handled");
		}
	}

	public static void main(String[] args) {
		
		ExceptionPropagation obj=new ExceptionPropagation();
		obj.m3();
	}

}
