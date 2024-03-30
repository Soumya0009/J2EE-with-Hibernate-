package com.org.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5 {
	public static void main(String[] args) {
		String urlString = "jdbc:mysql://localhost:3306/demo";
		String userString = "root";
		String passString = "root";
		String driverString = "com.mysql.cj.jdbc.Driver";
//		String qrrString = "Create table car(id int(7) primary key, cname varchar(15) not null, price bigint(20) not null)";
		String qrrString = "Insert into car values(1,'Lamborgihni', 7000000)";
		try {
			Class.forName(driverString);
			Connection connection = DriverManager.getConnection(urlString, userString, passString);
			Statement statement = connection.createStatement();
			statement.execute(qrrString);
			System.out.println("Data Created Sucessfull");
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
