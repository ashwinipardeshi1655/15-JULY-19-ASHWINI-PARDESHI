package com.ust.hotel;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BillImpClass bil = new BillImpClass();

		int i;
		System.out.println("press 1: To show all food");
		System.out.println("press 2: To order food");
		System.out.println("press 3: To operate food");
		System.out.println("press 4: To show total bill");

		i = sc.nextInt();

		switch (i) {
		case 1:
			System.out.println(" show all food");
			bil.showfood();
			
			break;
		case 2:
			System.out.println("To order food");
			bil.addfood();
			break;
		case 3:
			System.out.println("To operate food");

			int key;
			System.out.println("press 1: insert food item");
			System.out.println("press 2: update food item");
			System.out.println("press 3: delete food item");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("Insert food item");
				bil.insertfood();
				break;
			case 2:
				System.out.println("Update food item");
				bil.updatefood();
				break;
			case 3:
				System.out.println("Delete food item");
				bil.deletefood();
				break;

			default:
				break;
			}
			break;
		case 4:
			System.out.println("To show total bill");
			bil.totalbill();
			break;

		default:
			System.out.println("Invalid Key");
			break;
		}

	}
}
