package com.qa.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProg {

	public static void main(String[] args) {

		Employee emp1 = new Employee(121, "Deva");
		Employee emp2 = new Employee(131, "Ram");
		Employee emp3 = new Employee(141, "Dev");

		LinkedList<Employee> ll = new LinkedList<Employee>();
		ll.add(emp1);
		ll.add(emp2);
		ll.add(emp3);

		Iterator<Employee> it = ll.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.println(e.id + " " + e.name);
		}

	}

}
