package com.qa.exceptionHandling;

import java.io.IOException;

public class CheckExcepprog {

	public void m1() throws IOException {
		throw new IOException("Device Error");
	}

	public void m2() throws IOException {
		m1();
	}

	public void m3() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println("Exception has been handledd");
		}
	}

	public static void main(String[] args) {

		CheckExcepprog obj = new CheckExcepprog();
		obj.m3();
	}

}
