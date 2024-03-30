package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTeacherTable {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query1?user=root&password=root");
	Statement statement = connection.createStatement();
	String qrrString = "Create table teacher(id int(3) primary key, name varchar(25) not null, phone int(10) not null, sub varchar(10))";
	boolean result = statement.execute(qrrString);
	System.out.println(result);
	connection.close();
	}
}

