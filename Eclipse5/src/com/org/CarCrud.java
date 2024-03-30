package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarCrud {
	public static int saveCar(CarDTO c) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_orm?user=root&password=root");
			String sqlString = "Insert into car values(?,?,?)";
			PreparedStatement pStatement = connection.prepareStatement(sqlString);
			
			pStatement.setInt(1, c.id);
			pStatement.setString(2, c.cname);
			pStatement.setDouble(3, c.price);
			
			int res = pStatement.executeUpdate();
			connection.close();
			return res;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
