package com.qa.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProg {

	public static void main(String[] args) {

		Employee emp1 = new Employee(121, "Ram");
		Employee emp2 = new Employee(131, "Rakesh");

		ArrayList<Employee> ar1 = new ArrayList<Employee>();
		ar1.add(emp1);
		ar1.add(emp2);

		Iterator<Employee> it = ar1.iterator();
		while (it.hasNext()) {
			Employee em = it.next();
			System.out.println(em.id + " " + em.name);
		}

	}

}
