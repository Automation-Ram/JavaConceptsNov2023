package com.qa.strings;

public class Stringprog {

	public static void main(String[] args) {

		String name = "Ram";
		System.out.println(name.length());

		String s = new String("Rakesh");
		System.out.println(s.charAt(2));

		String n1 = "Rakesh";
		String n2 = "Rakesh";

		if (n1.equals(n2)) {
			System.out.println("Given string are similar");
		} else {
			System.out.println("Given string are not equal");
		}

		String n3 = "Ram";
		String n4 = " R";
		String n5 = n3.concat(n4);
		System.out.println(n5);

		String n6 = "Automation";
		System.out.println(n6.substring(0, 2));

		StringBuffer sb = new StringBuffer("Ram");
		System.out.println(sb.reverse());

		String n7 = "Rajiv";
		System.out.println(n7.charAt(2));

		String n8 = "Ram";
		String n9 = "Ram";
		System.out.println(n8.compareTo(n9));

		String n10 = "Automation";
		String n11 = "AUtomation";
		System.out.println(n10.contains(n11));
		System.out.println(n10.endsWith("o"));
		System.out.println(n10.equalsIgnoreCase(n11));

		String n12 = "My lif is in town";
		System.out.println(n12.indexOf("town"));

		String n13 = "Raem";
		System.out.println(n13.replace('e', 'a'));

		String n14 = "Ram!@#$%^&23456";
		String str = n14.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

		String n15 = "My_life_is_in_this_town";
		String[] split01 = n15.split("_");
		for (int i = 0; i < split01.length; i++) {
			System.out.println(split01[i]);
		}

		String n16 = "My life is in this town";
		String[] split02 = n16.split(" ");
		for (int i = 0; i < split02.length; i++) {
			System.out.println(split02[i]);
		}

		String n17 = "Automation";
		char[] ch = n17.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println("String chnaged to char: " + ch[i]);
		}

		String n18 = "  Hello My Automation World   ";
		System.out.println(n18.length());
		System.out.println(n18.trim());
		System.out.println(n18.length());

	}

}
