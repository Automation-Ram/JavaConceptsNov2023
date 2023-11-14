package com.qa.array;

public class WrapperClass {

	public static void main(String[] args) {

		String num = "100";
		int nu = Integer.parseInt(num);
		System.out.println(nu + 10);

		String doubl = "12.33";
		double nu1 = Double.parseDouble(doubl);
		System.out.println(nu1 + 10);

		String fl = "10000000000";
		float nu2 = Float.parseFloat(fl);
		System.out.println(nu2 + 10);

		int num1 = 100;

		String s = String.valueOf(num1);
		System.out.println(s + 1000);

	}

}
