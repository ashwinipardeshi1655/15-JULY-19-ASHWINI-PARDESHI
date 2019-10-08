package com.ust.crud;

import java.util.Scanner;

public class MusicFiles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SongOperationImpl sio = new SongOperationImpl();

		int key;
		System.out.println("select from following options");
		System.out.println("Press 1: Play songs");
		System.out.println("Press 1: Search songs");
		System.out.println("Press 1: Print songs");
		System.out.println("Press 1: Operate songs");
		System.out.println("*******************************");
		key = Integer.parseInt(sc.nextLine());

		switch (key) {
		case 1:
			System.out.println("Playing all songs");
			int i;
			System.out.println("Enter the key");
			i = Integer.parseInt(sc.nextLine());

			switch (i) {
			case 1: System.out.println("Play all songs");
					sio.getAllSongs();
				break;
			case 2: System.out.println("Play random Songs");
					sio.randomSongs();
				break;
			case 3: System.out.println("Play a song");
				sio.getSongs(1);
				break;

			default:
				break;
			}

			break;
		case 2: System.out.println("Searching all songs");
				sio.searchSong(1);

			break;
		case 3: System.out.println("Printing all songs");
				sio.getAllSongs();

			break;
		case 4: System.out.println("Operating all songs");
			int j;
			System.out.println("Enter a key");
			j = Integer.parseInt(sc.nextLine());
			switch (j) {
			case 1: System.out.println("Insert a song");
					sio.storeSong();
				break;
			case 2: System.out.println("Update a song");
				//	sio.updateSongs(m);
				break;
			case 3: System.out.println("Delete a song");
					sio.deleteSong(1);
				break;

			default:
				break;
			}

			break;

		default:
			break;
		}
	}

}
