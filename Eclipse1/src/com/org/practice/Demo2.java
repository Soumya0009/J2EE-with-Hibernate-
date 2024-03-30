package com.org.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {
	public static void main(String[] args) {
		String urlString = "jdbc:mysql://localhost:3306/demo";
		String userString = "root";
		String passString = "root";
		String driverString = "com.mysql.cj.jdbc.Driver";
//		String sqlString = "Update employee set sal = 7000 where id = 4";
//		String sqlString1 = "Update employee set sal = 8000 where id = 5";
//		String sqlString2 = "Update employee set sal = 9000 where id = 6";
		String sqlString3 = "Update employee set sal = 62000 where id = 7";
		String sqlString4 = "Update employee  set name = 'Doreamon'  where id = 7";
		
		
		try {
			Class.forName(driverString);
			Connection connection = DriverManager.getConnection(urlString, userString, passString);
			Statement statement = connection.createStatement();
//			statement.execute(sqlString);
//			statement.execute(sqlString1);
//			statement.execute(sqlString2);
			statement.execute(sqlString3);
			statement.execute(sqlString4);
			connection.close();
			
			System.out.println("Data updated Sucessfull");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
