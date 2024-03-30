package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCompanyTable {

	public static void main(String[] args) {
		String urlString = "jdbc:mysql://localhost:3306/mythird";
		String userString = "root";
		String passString = "root";
		String driverString = "com.mysql.cj.jdbc.Driver";
		String sqlString = "Create table company(id int(3) primary key,cname varchar(10)not null, min_sal int(5)not null, max_sal int(5)not null, phone int(10)not null)";
		try {
			Class.forName(driverString);
			Connection connection = DriverManager.getConnection(urlString,userString,passString);
			Statement statement = connection.createStatement();
			statement.execute(sqlString);
			connection.close();
			System.out.println("Table is created");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
