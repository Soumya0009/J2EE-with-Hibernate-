package usingJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveBike {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.setBid(101);
		b.setBname("Ninja H2r");
		b.setBprice(8000000);
		b.setBcc(998);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/usingjdbc","root","root");
			
			String sql = "INSERT INTO bike VALUES(?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, b.getBid());
			ps.setString(2, b.getBname());
			ps.setDouble(3, b.getBprice());
			ps.setInt(4, b.getBcc());
			
			
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
