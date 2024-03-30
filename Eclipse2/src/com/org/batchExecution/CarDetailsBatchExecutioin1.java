package com.org.batchExecution;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CarDetailsBatchExecutioin1 {
	public static void main(String[] args)throws Exception {
		
//		to check timing
//		long start = System.currentTimeMillis();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query?user=root&password=root");
		Statement statement = connection.createStatement();
		String qrrString1 = "insert into car values(9,'Buggati', 10000000)";
//		String qrrString2 = "insert into car values(6,'Challenger', 2000000)";
//		String qrrString3 = "insert into car values(7,'Lupthansa', 2005000)";
//		String qrrString4 = "insert into car values(8,'Hurricane', 48000000)";
//		Adding all into the batch
		statement.addBatch(qrrString1);
//		statement.addBatch(qrrString2);
//		statement.addBatch(qrrString3);
//		statement.addBatch(qrrString4);
		
//		Executing all the quarries
		statement.executeBatch();
		connection.close();
		
//		to check timing
//		long end = System.currentTimeMillis();
//		System.out.println(end);
//		System.out.println(end - start);
	}
}
