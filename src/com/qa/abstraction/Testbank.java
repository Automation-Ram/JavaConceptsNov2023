package com.qa.abstraction;

public class Testbank extends HDFCbank {

	public static void main(String[] args) {

		Testbank obj = new Testbank();
		obj.loan();
		obj.credit();
		obj.debit();
		obj.transfermoney();

		System.out.println("*********");

		HDFCbank obj1 = new HDFCbank();
		obj1.credit();
		obj1.debit();
		obj1.loan();
		obj1.transfermoney();

		System.out.println("*********");

		Bank obj2 = new HDFCbank();
		obj2.credit();
		obj2.debit();
		obj2.loan();

	}

}
