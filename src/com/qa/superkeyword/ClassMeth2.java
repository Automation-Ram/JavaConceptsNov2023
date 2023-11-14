package com.qa.superkeyword;

public class ClassMeth2 extends ClassMeth{
	
	public void m2()
	{
		super.m1();
		System.out.println("subclass M2");
	}
	
	public static void main(String[] args) {
		ClassMeth2 obj=new ClassMeth2();
		obj.m2();
	}

}
