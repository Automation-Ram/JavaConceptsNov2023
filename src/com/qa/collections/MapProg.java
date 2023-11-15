package com.qa.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapProg {

	public static void main(String[] args) {

		Employee emp1 = new Employee(121, "Ramu");
		Employee emp2 = new Employee(131, "Somu");
		Employee emp3 = new Employee(141, "Jamu");

		Hashtable<Integer, Employee> hm = new Hashtable<Integer, Employee>();
		hm.put(1, emp1);
		hm.put(2, emp2);
		hm.put(3, emp3);
		
		for(Map.Entry<Integer, Employee> entry:hm.entrySet()){    
	        int key=entry.getKey();  
	        Employee b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name);   
	    }    

	}

}
