package com.dev.assignments;

public class SumArray {

	public static void main(String[] args) {
		SumArray s = new SumArray();
		s.add();
		
		
	}
		
	
	public void add() {
		int[] sumArray = new int[7];
		int l = sumArray.length;
		
		for(int i=0 ; i<=l-1 ; i++) {
			sumArray[i] = i+1;
			System.out.println(sumArray[i]);
			
		}
		
		int add = sumArray[(l)/2] + sumArray[0] + sumArray[5];
		System.out.println(add);
	
		
	}	

	
	

}
