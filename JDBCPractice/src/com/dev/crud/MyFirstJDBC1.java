package com.dev.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC1 {

	public static void main(String[] args) {

		Connection conn = null; // import from java.sql
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Load the Driver
			java.sql.Driver div = new Driver(); // import from com.mysql.jdbc.Driver
			DriverManager.registerDriver(div);
			System.out.println("Driver Loaded....");

			// Get connection via Driver
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";

			conn = DriverManager.getConnection(dbUrl); // import from java.sql
			System.out.println("Connection Established....");
			System.out.println("************************************");

			// Issue SQL query via connection
			String query = "select * from users_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			// Process the results returned by SQL Query
			while (rs.next()) {
				String username = rs.getString("username");
				int userid = rs.getInt("userid");
				String email = rs.getString("email");

				System.out.println(username);
				System.out.println(userid);
				System.out.println(email);

			}

		} catch (SQLException e) {
			e.printStackTrace();

		} 
		//close all objects
		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
		}

	}
}

