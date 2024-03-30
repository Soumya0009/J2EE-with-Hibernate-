package com.org.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
public static void main(String[] args) {
	String urlString = "jdbc:mysql://localhost:3306/demo";
	String userString = "root";
	String passString = "root";
	String driverString = "com.mysql.cj.jdbc.Driver";
//	String sqlString = "Create table employee(id int(3)primary key, name varchar(5)not null, sal int(10)not null)";
	String sqlString2 = "Insert into employee values(1,'Satya', 50000)";
	
	try {
		Class.forName(driverString);
		Connection connection = DriverManager.getConnection(urlString, userString, passString);
		Statement statement = connection.createStatement();
//		statement.execute(sqlString);
		statement.execute(sqlString2);
		connection.close();
		
		System.out.println("Table created and all the data are stored.");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
