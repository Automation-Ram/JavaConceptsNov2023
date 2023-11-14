package com.qa.constructor;

public class ThisKeyword {

	int id;
	String name;

	public ThisKeyword(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		
		ThisKeyword obj=new ThisKeyword(1111, "Ram");
		obj.display();

	}

}
