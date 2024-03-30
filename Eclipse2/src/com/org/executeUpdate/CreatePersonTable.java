package com.org.executeUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatePersonTable {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query?user=root&password=root");
		Statement statement = connection.createStatement();
		String qrrString = "create table person (id int(5) primary key, name varchar(10) not null, phone bigint(10) not null)";
		int res = statement.executeUpdate(qrrString);
		
		System.out.println(res);
		
		connection.close();
	}
}
