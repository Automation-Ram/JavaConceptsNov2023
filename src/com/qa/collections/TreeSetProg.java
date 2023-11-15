package com.qa.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProg {

	public static void main(String[] args) {
		TreeSet<String> st = new TreeSet<String>();
		st.add("Ram");
		st.add("Rakesh");
		st.add("Ram");
		st.add("Deva");

		for (String stt : st) {
			System.out.println(stt);
		}

	}

}
