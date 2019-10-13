package com.dev.assignments;

public class ReverseString {
	

	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		r.reverseString();

	}
	public void reverseString() {
	
		String str = "Ashwini";
		char[] str1 = str.toCharArray();
		System.out.println(str);
		
		for(int i=str1.length-1 ; i>=0 ; i--) {
			System.out.print(str1[i]);
		}
		
	}

}
