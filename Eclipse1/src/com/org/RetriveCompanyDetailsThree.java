package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveCompanyDetailsThree {
	public static void main(String[] args) {
		String urlString = "jdbc:mysql://localhost:3306/mythird";
		String userString = "root";
		String passString = "root";
		String driverString = "com.mysql.cj.jdbc.Driver";

		String sqlString1 = "Select * From company";
		try {
			Class.forName(driverString);
			Connection connection = DriverManager.getConnection(urlString,userString,passString);
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery(sqlString1);

			System.out.printf("%-5s %-15s %-10s %-10s %-15s\n", "id", "cname", "min_sal", "max_sal", "phone");//Not Recommended Way
			while (rs.next()) {
			    System.out.printf("%-5s %-15s %-10s %-10s %-15s\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4), rs.getLong(5));
			}
			
			connection.close();

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
