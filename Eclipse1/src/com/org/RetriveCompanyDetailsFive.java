package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveCompanyDetailsFive {
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

			System.out.print(String.format("%-5s", "id"));//This is Recommended Way
			System.out.print(String.format("%-15s","cname"));
			System.out.print(String.format("%-15s","max_sal"));
			System.out.print(String.format("%-15s","min_sal"));
			System.out.print(String.format("phone"+"\n"));
			while (rs.next()) {
			    
			    System.out.print(String.format("%-5s", rs.getInt(1)));//This is Recommended Way
				System.out.print(String.format("%-15s",rs.getString(2)));
				System.out.print(String.format("%-15s",rs.getDouble(3)));
				System.out.print(String.format("%-15s",rs.getDouble(4)));
				System.out.print(String.format(rs.getLong(5)+"\n"));
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
