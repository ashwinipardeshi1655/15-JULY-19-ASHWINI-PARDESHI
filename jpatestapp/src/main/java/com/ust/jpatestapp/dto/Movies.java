package com.ust.jpatestapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity                                        //import it from javax.persistance as all the annotations are present in javax.persistance
@Table(name="movies")                          //give the table name here
public class Movies {

	@Id                                        //you can give the column name by @column_name...this should be use only in case of primary key
	@Column(name="id")
	private int id;
	@Column
	private String name;
	@Column
	private String rating;

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

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
