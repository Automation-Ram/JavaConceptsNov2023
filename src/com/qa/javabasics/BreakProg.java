package com.qa.javabasics;

public class BreakProg {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			if (i == 50) {
				continue;
			}
			System.out.println("Check break Statement:" + i);
		}

	}

}
