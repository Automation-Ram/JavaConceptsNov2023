package com.qa.constructor;

public class ParametrizedCons {

	int id;
	String name;

	public ParametrizedCons(int i, String n) {
		id = i;
		name = n;
	}

	public void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		ParametrizedCons obj = new ParametrizedCons(12121, "Ram");
		obj.display();
	}

}
