package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveCompanyDetails {
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
				
//				1st records data 				
				if (rs.next()) {
					int id = rs.getInt(1);
					String nameString = rs.getString(2);
					double minSal = rs.getDouble(3);
					double maxSal = rs.getDouble(4);
					long phone = rs.getLong(5);
					
					System.out.println(id);
					System.out.println(nameString);
					System.out.println(minSal);
					System.out.println(maxSal);
					System.out.println(phone);
				}
				
				
//				2nd Record Data	
				if (rs.next()) {
					int id1 = rs.getInt(1);
					String nameString1 = rs.getString(2);
					double minSal1 = rs.getDouble(3);
					double maxSal1 = rs.getDouble(4);
					long phone1 = rs.getLong(5);
					
					System.out.println(id1);
					System.out.println(nameString1);
					System.out.println(minSal1);
					System.out.println(maxSal1);
					System.out.println(phone1);
				}
				
				
//				3rd record Data
				if (rs.next()) {
					int id2 = rs.getInt(1);
					String nameString2 = rs.getString(2);
					double minSal2 = rs.getDouble(3);
					double maxSal2 = rs.getDouble(4);
					long phone2 = rs.getLong(5);
					
					System.out.println(id2);
					System.out.println(nameString2);
					System.out.println(minSal2);
					System.out.println(maxSal2);
					System.out.println(phone2);
				}
				
				
//				4th record Data
				if (rs.next()) {
					int id3 = rs.getInt(1);
					String nameString3 = rs.getString(2);
					double minSal3 = rs.getDouble(3);
					double maxSal3 = rs.getDouble(4);
					long phone3 = rs.getLong(5);
					
					System.out.println(id3);
					System.out.println(nameString3);
					System.out.println(minSal3);
					System.out.println(maxSal3);
					System.out.println(phone3);
				}
				
				
//				5th record Data
				if (rs.next()) {
					int id4 = rs.getInt(1);
					String nameString4 = rs.getString(2);
					double minSal4 = rs.getDouble(3);
					double maxSal4 = rs.getDouble(4);
					long phone4 = rs.getLong(5);
					
					System.out.println(id4);
					System.out.println(nameString4);
					System.out.println(minSal4);
					System.out.println(maxSal4);
					System.out.println(phone4);
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
		
