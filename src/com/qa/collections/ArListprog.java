package com.qa.collections;

import java.util.ArrayList;

public class ArListprog {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Ram");
		ar.add("Str");
		ar.add("Deva");

		System.out.println(ar.get(0));
		System.out.println(ar.set(2, "Automation Engineers"));

		for (String s : ar) {
			System.out.println(s);
		}

	}

}
