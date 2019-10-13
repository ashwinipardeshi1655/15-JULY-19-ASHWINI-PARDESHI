package com.dev.Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateToUtilDate {

	public static void main(String[] args) throws ParseException {

		String date = "15/08/1947";
		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		Date d = format.parse(date);
		System.out.println(date.toString());
	}
}
