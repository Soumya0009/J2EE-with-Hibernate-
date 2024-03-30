package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTeacherDetails {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query1?user=root&password=root");
		Statement statement = connection.createStatement();
		String qrrString1 = "insert into teacher values(1,'Soumya Ranjan Mohanty', 707734897, 'Physics')";
		String qrrString2 = "insert into teacher values(2,'Satya Ranjan Mohanty', 637254844, 'MIL')";
		String qrrString3 = "insert into teacher values(3,'Heartwin King Patra', 875434224, 'Chemsity')";
		String qrrString4 = "insert into teacher values(4,'Debasis Patra', 879228715,'English')";
		boolean result = statement.execute(qrrString1);
		statement.execute(qrrString2);
		statement.execute(qrrString3);
		statement.execute(qrrString4);
		System.out.println(result);
		connection.close();
	}
}
