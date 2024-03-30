package com.preparedStatenent1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertCarDataUsingForLoop {

	public static void main(String[] args)throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		int data ;
		do {
		System.out.print("Enter the number of data you want to: ");
		data = scanner.nextInt();
		}while(data<1);
		String sqlString = "insert into car values(?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query?user=root&password=root");
		PreparedStatement pStatement = connection.prepareStatement(sqlString);
		
		for (int i = 1; i<=data; i++) {
			 System.out.printf("Enter details for Car %d:%n", i);
	            System.out.print("Enter Car ID: ");
	            int id = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character
	            System.out.print("Enter Car Name: ");
	            String name = scanner.nextLine();
	            System.out.print("Enter Car Price: ");
	            double price = scanner.nextDouble();

	            pStatement.setInt(1, id);
	            pStatement.setString(2, name);
	            pStatement.setDouble(3, price);

	            pStatement.execute();
		}
		
		
		connection.close();
		System.out.println("Data has been inserted Successfully.");
		
		}
}
