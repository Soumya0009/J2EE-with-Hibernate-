package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveTeacherDetails {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query1?user=root&password=root");
		Statement statement = connection.createStatement();
		String qrrString = "Select*From teacher";
		boolean result = statement.execute(qrrString);
		System.out.println(result);
		ResultSet rs = statement.getResultSet();
		
		System.out.println("id\tname\tphone\tsub");
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getInt(3)+"\n");
			System.out.print(rs.getString(4)+"\t");
		}
		connection.close();
	}
}
