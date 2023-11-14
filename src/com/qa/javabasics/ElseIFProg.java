package com.qa.javabasics;

public class ElseIFProg {

	public static void main(String[] args) {

		String city = "Kovi";

		if (city == "Erode") {
			System.out.println("City is Erode");
		} else if (city == "Kovai") {
			System.out.println("City is Kovai");

		} else if (city == "Mumbai") {
			System.out.println("City is Erode");

		} else if (city == "Kolkata") {
			System.out.println("City is Mumbai");

		} else if (city == "Trichy") {
			System.out.println("City is Trichy");

		} else {
			System.out.println("No more cities ther");
		}

	}

}
