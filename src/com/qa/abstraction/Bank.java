package com.qa.abstraction;

public abstract class Bank {

	public abstract void loan();

	public void credit() {
		System.out.println("Credit Function");
	}

	public void debit() {
		System.out.println("Debit Function");
	}

}
