package com.ust.musicplayer;

import java.util.Scanner;

import com.ust.beans1.Songs;



public class MusicPlayer {

	public static void main(String[] args) {

		SongsImpClass sic = new SongsImpClass();
		Scanner sc = new Scanner(System.in);
		int key;
		System.out.println("Music System is ON");
		System.out.println("Press 1 to Play a song");
		System.out.println("Press 2 to Search songs");
		System.out.println("Press 3 to Show all songs");
		System.out.println("Press 4 to Operate songs");

		key = sc.nextInt();

		switch (key) {
		case 1:
			System.out.println("play a song");
			Songs s = null;
			sic.getSong(s);
			break;
		case 2:
			System.out.println("Search songs");
			Songs name = null;
			sic.searchSong(name);
			break;
		case 3:
			System.out.println("Show all songs");
			
			break;
		case 4:
			System.out.println("Delete songs");
			String id = null;
			sic.deleteSong(id);
			break;

		default:
			System.out.println("Invalid Input");

			break;
		}
	}

}
