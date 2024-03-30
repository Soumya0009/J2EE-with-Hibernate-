package com.org.executeUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertPersonData {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query?user=root&password=root");
		Statement statement = connection.createStatement();
		String qrrString = "insert into person values(104,'Pintu',1234567878)";
		int res = statement.executeUpdate(qrrString);
		
		System.out.println(res);
		
		connection.close();
	}
}
