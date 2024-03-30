package usingJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveCar {
	public static void main(String[] args) {
		Car c = new Car();
		c.setId(101);
		c.setName("Dodge Challanger");
		c.setPrice(800000);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usingjdbc","root","root");
			/*
			 * String sql =
			 * "INSERT INTO car VALUES("+c.getId()+",'"+c.getName()+"',"+c.getPrice()+") ";
			 */
			
			String sql = "INSERT INTO car VALUES(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, c.getId());
			ps.setString(2, c.getName());
			ps.setDouble(3, c.getPrice());
			
			
			ps.execute();
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
