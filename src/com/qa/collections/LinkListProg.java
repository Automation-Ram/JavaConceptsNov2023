package com.qa.collections;

import java.util.LinkedList;

public class LinkListProg {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(12);
		ll.add(13);
		ll.add(14);
		ll.add(15);
		ll.add(16);
		ll.add(17);

		System.out.println(ll.removeFirstOccurrence(12));

		for (Integer i : ll) {
			System.out.println(i);
		}

	}

}
