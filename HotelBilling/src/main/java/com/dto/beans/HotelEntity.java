package com.dto.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel_Bill")
public class HotelEntity {
	
	@Id
	@Column(name = "Item_Code")
	private int itemcode;
	
	@Column(name = "Food_name")
	private String foodname;
	
	@Column(name = "Price")
	private double price;

	public int getItemcode() {
		return itemcode;
	}

	public void setItemcode(int itemcode) {
		this.itemcode = itemcode;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
