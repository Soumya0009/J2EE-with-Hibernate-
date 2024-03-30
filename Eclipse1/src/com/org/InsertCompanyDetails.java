package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertCompanyDetails {
	public static void main(String[] args) {
		String urlString = "jdbc:mysql://localhost:3306/mythird";
		String userString = "root";
		String passString = "root";
		String driverString = "com.mysql.cj.jdbc.Driver";
//		String sqlString = "insert into company values(101,'TCS',55500,100000,1234567890)";
//		String sqlString1 = "insert into company values(102,'Java',55500,100000,1234567890)";
//		String sqlString2 = "insert into company values(103,'IBM',55500,100000,1234567890)";
		String sqlString3 = "insert into company values(104,'Tech',55500,100000,1234567890)";
		String sqlString4 = "insert into company values(105,'NTT',55500,100000,1234567890)";
		try {
			Class.forName(driverString);
			Connection connection = DriverManager.getConnection(urlString,userString,passString);
			Statement statement = connection.createStatement();
//			statement.execute(sqlString);
//			statement.execute(sqlString1);
//			statement.execute(sqlString2);
			statement.execute(sqlString3);
			statement.execute(sqlString4);
			connection.close();
			
			System.out.println("Data hasbeen inserted");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
