package com.org.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3 {
	public static void main(String[] args) {
		String urlString = "jdbc:mysql://localhost:3306/demo";
		String userString = "root";
		String passString = "root";
		String driverString = "com.mysql.cj.jdbc.Driver";
		String sqlString = "Delete from employee where id = 8";
		
		try {
			Class.forName(driverString);
			Connection connection = DriverManager.getConnection(urlString, userString, passString);
			Statement statement = connection.createStatement();
			statement.execute(sqlString);
			connection.close();
			
			System.err.println("Data Deleted sucessfylly");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
