package com.ust.beans1;

public class Songs {

	private int id;
	private String name;
	private String artist;
	private String ratings;

	@Override
	public String toString() {
		return "Songs [id=" + id + ", name=" + name + ", artist=" + artist + ", ratings=" + ratings + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getRatings() {
		return ratings;
	}

	public void setRatings(String ratings) {
		this.ratings = ratings;
	}

}


