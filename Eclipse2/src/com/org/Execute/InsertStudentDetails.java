package com.org.Execute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertStudentDetails {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query?user=root&password=root");
		Statement statement = connection.createStatement();
		String qrrString1 = "insert into student values(2,'Satya', 23)";
		String qrrString2 = "insert into student values(3,'Priyabrata', 32)";
		String qrrString3 = "insert into student values(4,'Pintu', 24)";
		String qrrString4 = "insert into student values(5,'Debasis', 22)";
		boolean result = statement.execute(qrrString1);
		statement.execute(qrrString2);
		statement.execute(qrrString3);
		statement.execute(qrrString4);
		System.out.println(result);
		connection.close();
	}
}




