package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveCompanyDetailsTwo {
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
			System.out.println("id\tcname\tmin_sal\tmax_sal\tphone");
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getDouble(3)+"\t");
				System.out.print(rs.getDouble(4)+"\t");
				System.out.print(rs.getLong(5)+"\n");
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
