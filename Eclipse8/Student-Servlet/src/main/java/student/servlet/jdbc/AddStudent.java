package student.servlet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStudent {
	public static int AddData(int roll, String name, String email, long phone, String department, int year, int age, String gender) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_servlet","root","root");
			String sql = "INSERT INTO add VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, roll);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setLong(4, phone);
			ps.setString(5, department);
			ps.setInt(6, year);
			ps.setInt(7, age);
			ps.setString(8, gender);

			int res = ps.executeUpdate();
			con.close();
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
