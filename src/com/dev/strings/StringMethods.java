package com.dev.strings;

public class StringMethods {

	public static void main(String[] args) {


		String str = "Some_String";
		String str1 = "some_String";


		int length = str.length();
		System.out.println("Output for Length(): "+length);

		char[] ch = str.toCharArray();                              //Converts string into array and then return specified value of index
		System.out.println("Output for toCharArray(): "+ch[9]);

		char c = str.charAt(6);                                     // returns the specified value of index
		System.out.println("Outpiut of charAt():"+c);

		boolean b = str.equals(str1);                               // it compare the string to a specified object
		System.out.println("Output of Equals(): "+b);

		boolean b1 = str.equalsIgnoreCase(str1);                    // it compare the string to a specified object but ignores case.
		System.out.println("Output of EqualsIgnoreCase: "+b1);

		boolean v = str.contains("som");
		System.out.println("Output of Contains(): "+v);

		String g = str.replace('S','A');                            // replaces one character with another character
		System.out.println("Output of Replace(): "+g);

		int f =  str.indexOf('S');
		System.out.println("Output of indexof(): "+f);

		String s = str.toUpperCase();
		System.out.println("Output Of toUpperCase(): "+s);

		String s1 = str.toLowerCase();
		System.out.println("Output Of toLowerCase(): "+s1);

		String a = str.substring(3);
		System.out.println("Output for Substring(int): "+a);

		String q = str.substring(3,8);
		System.out.println("Output for substring(int,int): "+q);
		
		String qr = str.substring(3,11);
		System.out.println("Output for substring(int,int): "+qr);


	}
}


