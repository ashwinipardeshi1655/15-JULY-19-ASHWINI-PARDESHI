package com.ust.musicplayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import com.ust.beans1.Songs;

public class SongsImpClass implements SongsInterface{
	
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement psmt = null;
	static Scanner sc = new Scanner(System.in);
	
	public static final String DBURL = "jdbc:mysql://localhost:3306/music_player";
	
	public static void main(String[] args) {
		
	}

	public static Connection getConnection() {
		if(conn==null) {
			try {
				//load the driver
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver loaded...");		
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public Songs getSong(Songs s) {
		getConnection();
		
		try {
			//Issue the query
			conn = DriverManager.getConnection(DBURL,"root","root");
			String query = "Select * from musicfiles where song_id = ?";
			psmt = conn.prepareStatement(query);
			
			System.out.println("Enter song id");
			String str1 = sc.nextLine();
			psmt.setInt(1, Integer.parseInt(str1));
			
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				int song_id = rs.getInt("song_id");
				String song_title = rs.getString("song_title");
				String artist_name = rs.getString("artist_name");
				String album_name = rs.getString("album_name");

				System.out.println(song_id);
				System.out.println(song_title);
				System.out.println(artist_name);
				System.out.println(album_name);

			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return s;
	}
	public boolean storeSong(Songs s) {
		getConnection();
		
		return true;
	}
	public Songs searchSong(Songs name) {
		getConnection();
		try {
			//Issue the query
			conn = DriverManager.getConnection(DBURL,"root","root");
			String query = "Select * from musicfiles where song_title = ?";
			psmt = conn.prepareStatement(query);
			
			System.out.println("Enter song name");
			String str2 = sc.nextLine();
			psmt.setString(1, str2);
			
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				int song_id = rs.getInt("song_id");
				String song_title = rs.getString("song_title");
				String artist_name = rs.getString("artist_name");
				String album_name = rs.getString("album_name");

				System.out.println(song_id);
				System.out.println(song_title);
				System.out.println(artist_name);
				System.out.println(album_name);

			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return name;
	}
	public boolean deleteSong(String id) {
		getConnection();
		try {
			//Issue the query
			conn = DriverManager.getConnection(DBURL,"root","root");
			String query = "Delete from musicfiles where song_id = ?";
			psmt = conn.prepareStatement(query);
			
			System.out.println("Enter song id");
			String str3 = sc.nextLine();
			psmt.setInt(1, Integer.parseInt(str3));
			
			int count = psmt.executeUpdate();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}


	
	


	


}
