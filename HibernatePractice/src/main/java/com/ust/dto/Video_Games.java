package com.ust.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Video_Games")
public class Video_Games {
	
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int no_of_players;
	@Column
	private String ratings;
	
	
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
	public int getNo_of_players() {
		return no_of_players;
	}
	public void setNo_of_players(int no_of_players) {
		this.no_of_players = no_of_players;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	

}
