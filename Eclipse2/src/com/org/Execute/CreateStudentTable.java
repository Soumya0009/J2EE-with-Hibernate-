package com.org.Execute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStudentTable {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query?user=root&password=root");
		Statement statement = connection.createStatement();
		String qrrString = "Create table student(roll int(3) primary key, name varchar(15) not null, age int(2) not null)";
		boolean result = statement.execute(qrrString);
		System.out.println(result);
		connection.close();
	}
}
