package com.dev.methods;

public class CreatingArray {

	public static void main(String[] args) {
		
		int []arr;                             //Declaration 
		arr = new int[5];                      //Creation
		arr[0] = 1;                            //Initialization
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr[1]);
		
		char[] newArr;
		newArr = new char[3];
		newArr[0] = 'a';
		newArr[1] = 'b';
		newArr[2] = 'c';
		System.out.println(newArr[2]);

		double arr1[];
		arr1 = new double[3];
		arr1[0] = 11;
		arr1[1] = 12;
		arr1[2] = 13;
		System.out.println(arr1[0]);
		
		int []newArray = new int[3];
		newArray[0] = 55;
		newArray[1] = 56;
		newArray[2] = 57;
		System.out.println(newArray[2]);

		int []array1 = {1,2,3,4,6};
		System.out.println(array1.length);         //it gives length of an array. Here length is not a method. It acts as a variable here.
	}

}
