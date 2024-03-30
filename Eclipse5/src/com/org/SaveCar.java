package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveCar {
	public static void main(String[] args) throws Exception {
		CarDTO c = new CarDTO();
		c.id = 101;
		c.cname = "maruti";
		c.price = 250000;
		String sqlString = "Insert into car values("+c.id+",'"+c.cname+"',"+c.price+")";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_orm?user=root&password=root");
		Statement statement = connection.createStatement();
		statement.execute(sqlString);
		connection.close();
	}
}
