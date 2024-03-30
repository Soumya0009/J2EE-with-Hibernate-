package com.org.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertCarData {
	public static void main(String[] args)throws Exception {
	String sqlString = "insert into car values(?,?,?)";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query?user=root&password=root");
	PreparedStatement pStatement = connection.prepareStatement(sqlString);
	
	pStatement.setInt(1, 101);
	pStatement.setString(2, "Challanger");
	pStatement.setDouble(3, 8000000);
	
	pStatement.execute();
	
	pStatement.setInt(1, 102);
	pStatement.setString(2, "Mustang");
	pStatement.setDouble(3, 800000);
	
	pStatement.execute();
	connection.close();
	
	}
}
