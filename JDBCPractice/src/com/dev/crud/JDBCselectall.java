package com.dev.crud;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class JDBCselectall {

	public static void main(String[] args) {
		callingByString();
		// callingbyprop();
	}

	public static void callingByString() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
			System.out.println("*******************************");
			System.out.println();

			// Connecting to database
			String dbUrl = "jdbc:mysql://localhost:3306/JDBCdb?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Establish connection...");
			System.out.println("*******************************");
			System.out.println();

			// Issue the query
			String query = "Select * from series";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			// Process the ResultSet
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString(2);
				String actor = rs.getString("actor");
				String grade = rs.getString(4);

				System.out.println("Series ID:  " + id);
				System.out.println("Series name:  " + name);
				System.out.println("Series Actress:  " + actor);
				System.out.println("Popular Rate:  " + grade);
				System.out.println("*******************************");
				System.out.println();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void callingbyprop() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// Load the Driver
			java.sql.Driver div = new Driver();
			DriverManager.registerDriver(div);

			// Connecting the driver
			String filePath = "C:\\Users\\Ashwini\\Desktop\\series.properties";
			FileReader reader = new FileReader(filePath);

			Properties prop = new Properties();
			prop.load(reader);

			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"),
					prop.getProperty("password"));

			// Issue the query
			stmt = conn.createStatement();
			rs = stmt.executeQuery(prop.getProperty("query"));

			// Process the resultset
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString(2);
				String actor = rs.getString("actor");
				String grade = rs.getString(4);

				System.out.println("Series ID:  " + id);
				System.out.println("Series name:  " + name);
				System.out.println("Series Actress:  " + actor);
				System.out.println("Popular Rate:  " + grade);
				System.out.println("*******************************");
				System.out.println();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
