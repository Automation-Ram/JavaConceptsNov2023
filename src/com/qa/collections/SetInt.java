package com.qa.collections;

import java.util.HashSet;
import java.util.Set;

public class SetInt {

	public static void main(String[] args) {

		Set<String> st = new HashSet<String>();
		st.add("Ram");
		st.add("Rakesh");
		st.add("Ram");
		st.add("Deva");

		for (String stt : st) {
			System.out.println(stt);
		}

	}

}
