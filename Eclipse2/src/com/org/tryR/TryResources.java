package com.org.tryR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class TryResources{
	public static void main(String[] args) {
		try (
			Scanner scanner = new Scanner(System.in);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/execute_query?user=root&password=root");
			Statement statement = con.createStatement();
			ResultSet rsResultset = statement.executeQuery("Select * from car");
				){
			System.out.println("id\tname\tprice");
			while(rsResultset.next()) {
				System.out.print(rsResultset.getInt(1)+"\t");
				System.out.print(rsResultset.getString(2)+"\t");
				System.out.print(rsResultset.getDouble(3)+"\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
