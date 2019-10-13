package com.dev.strings;

public class StringMethod1 {

	public static void main(String[] args) {
		
		String str = "UST_Global";
		String str1 = "ust_global";


		int length = str.length();
		System.out.println("Output for Length(): "+length);

		char[] ch = str.toCharArray();                           //Converts string into array
		System.out.println("Output for toCharArray(): "+ch[9]);

		char c = str.charAt(6);                                   // returns the specified value of index
		System.out.println("Outpiut of charAt(): "+c);

		boolean b = str.equals(str1);                              // it compare the string to a specified object
		System.out.println("Output of Equals(): "+b);

		boolean b1 = str.equalsIgnoreCase(str1);
		System.out.println("Output of EqualsIgnoreCase(): "+b1);


	}

}
