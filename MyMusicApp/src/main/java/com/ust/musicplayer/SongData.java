package com.ust.musicplayer;

import java.util.Scanner;

import com.ust.beans1.Songs;

public class SongData {
	
	public static void main(String[] args) {
	}	
	
	public static void songip() {
	
	Scanner sc = new Scanner(System.in);
	
	Songs s = new Songs();
	
	System.out.println("Enter song id");
	String i = sc.nextLine();
	int p = Integer.parseInt(i);
	System.out.println(p);
	
	System.out.println("Enter song name");
	String j = sc.nextLine();
	System.out.println(j);

	
	System.out.println("Enter song artist");
	String k = sc.nextLine();
	System.out.println(k);

	
	System.out.println("Enter song ratings");
	String l = sc.nextLine();
	System.out.println(l);
	
	}
}
