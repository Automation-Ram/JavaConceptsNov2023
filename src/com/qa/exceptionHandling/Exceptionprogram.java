package com.qa.exceptionHandling;

public class Exceptionprogram {

	public static void main(String[] args) {
		
		
		//to handle the runtime exception
		// Checked exception - Classes that directly inherits from throwable class except Exception and error # Check at compile time
		//UCE- Claases that inherits from exception Checked at runtiume
		// Error is irrecoverable

		try {
			int num = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception has been handled");
		}

	}

}
