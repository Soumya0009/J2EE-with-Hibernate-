package com.org.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
	public static void main(String[] args) {
		String urlString = "jdbc:mysql://localhost:3306/demo";
		String userString = "root";
		String passString = "root";
		String driverString = "com.mysql.cj.jdbc.Driver";
		String sqlString = "Insert into employee values(8, 'Sunikichi Sunio', 55000)";
		String sqlString1 = "Insert into employee values(9, 'Nobita Nobi', 57850)";
		String sqlString2= "Insert into employee values(10, 'Gian Takashi', 48575)";
		String sqlString3 = "Insert into employee values(11, 'Sizuka Yamamoto', 60000)";
		String sqlString4= "Insert into employee values(12, 'Nobisuki Nobi', 65000)";
		try {
			Class.forName(driverString);
			Connection connection = DriverManager.getConnection(urlString, userString, passString);
			Statement statement = connection.createStatement();
			statement.execute(sqlString);
			statement.execute(sqlString1);
			statement.execute(sqlString2);
			statement.execute(sqlString3);
			statement.execute(sqlString4);
			connection.close();
			System.out.println("Data Stored in table");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
