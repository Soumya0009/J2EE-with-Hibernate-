package com.org.batchExecution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CarDetailsBatchExecution {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query?user=root&password=root");
		Statement statement = connection.createStatement();
		String qrrString1 = "insert into car values(2,'Harrier', 2300000)";
		String qrrString2 = "insert into car values(3,'Thar', 180000)";
		String qrrString3 = "insert into car values(4,'Hector', 245000)";
		String qrrString4 = "insert into car values(5,'Gloster', 4800000)";
//		Adding all into the batch
		statement.addBatch(qrrString1);
		statement.addBatch(qrrString2);
		statement.addBatch(qrrString3);
		statement.addBatch(qrrString4);
		
//		Executing all the quarries
		statement.executeBatch();
		connection.close();
	}
}
