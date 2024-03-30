package com.org.Execute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveStudentData {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query?user=root&password=root");
		Statement statement = connection.createStatement();
		String qrrString = "Select*From student";
//		boolean result = statement.execute(qrrString);
//		System.out.println(result);
		ResultSet rs = statement.executeQuery(qrrString);
		
		System.out.println("roll\tname\tage");
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getInt(3)+"\n");
		}
		connection.close();
	}

}





	