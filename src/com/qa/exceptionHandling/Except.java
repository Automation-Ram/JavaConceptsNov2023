package com.qa.exceptionHandling;

public class Except {

	public static void main(String[] args) {

		try {
			int a[] = new int[2];
			int i = 100 / 0;
		} catch (ArithmeticException arth) {

			System.out.println("Exception for Arth");
		} catch (ArrayIndexOutOfBoundsException arr) {

			System.out.println("Exception for arth");
		} catch (Exception e) {
			System.out.println("Excedption");
		} finally {
			System.out.println("Finally block is executted");
		}

	}

}
