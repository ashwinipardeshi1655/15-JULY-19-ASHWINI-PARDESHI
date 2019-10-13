package com.dev.assignments;

public class ReverseArray {

	public static void main(String[] args) {
		
		
		int[] newArray = new int[6];
		int l = newArray.length;
		
		for(int i=0 ; i<=l-1 ; i++) {
			newArray[i] = i+1;
			System.out.println("array is = "+newArray[i]);
		}
		
		for(int i=l-1 ; i>=0 ; i--) {
			
			System.out.println("reverse of array is = "+newArray[i]);
		}

	}

}
