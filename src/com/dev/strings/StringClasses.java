package com.dev.strings;

public class StringClasses {

	public static void main(String[] args) {
		
		String str = "Heyy";
		System.out.println(str);
		
		StringBuffer stra = new StringBuffer("Heyy");
		System.out.println(stra);
		System.out.println(stra.length());
		System.out.println(stra.capacity());             //capacity is equal to length of string + 16....as 16 is capacity of stringbuffer
		
		String str1;
		str1 = "Hello";
		System.out.println(str1);
		
		StringBuilder strb = new StringBuilder("Hello");
		System.out.println(strb);
		System.out.println(stra+ " " +strb);
		
		String str2 = new String("Hii!!!!");
		System.out.println(str2);
		
		

	}

}
