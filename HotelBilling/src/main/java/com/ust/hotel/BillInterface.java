package com.ust.hotel;


import com.dto.beans.HotelEntity;

public interface BillInterface {
	
	void showfood();
	void insertfood();
	void updatefood();
	boolean deletefood();
	void totalbill();
	public HotelEntity addfood();
	

}
