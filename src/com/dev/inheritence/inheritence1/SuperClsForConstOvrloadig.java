package com.dev.inheritence.inheritence1;

public class SuperClsForConstOvrloadig {

	public SuperClsForConstOvrloadig() {
		System.out.println("Constructor with 0 argument");
	}

	public SuperClsForConstOvrloadig(int a) {
		System.out.println("Constructor with 1 int argument");

	}

	public SuperClsForConstOvrloadig(int a , char b) {
		System.out.println("Constructor with 1 int and 1 char argument");

	}

	public SuperClsForConstOvrloadig(char a ,int b) {
		System.out.println("Constructor with 1 char and 1 int argument");

	}

	public SuperClsForConstOvrloadig(int a, int b) {
		System.out.println("Constructor with 2 int argument");


	}



	public static void main(String[] args) {

		SuperClsForConstOvrloadig sc = new SuperClsForConstOvrloadig();

	}

}
