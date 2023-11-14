package com.qa.javabasics;

public class SwitchStatement {

	public static void main(String[] args) {

		int num = 8;
		String name = "";

		switch (num) {
		case 1:
			name = "Raju";
			break;
		case 2:
			name = "Ram";
			break;

		case 3:
			name = "Kis";
			break;
		case 4:
			name = "Flow";
			break;
		case 5:
			name = "Doc";
			break;
		case 6:
			name = "Name";
			break;
		default:
			System.out.println("Invalid");
		}
		System.out.println(name);

	}

}
