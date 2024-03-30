package student.servlet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Signup {
	public static int SaveSignIn(String name, long phone, String gender, String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_servlet","root","root");
			String sql = "INSERT INTO signup(name, phone, gender, email, pass) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, name);
			ps.setLong(2, phone);
			ps.setString(3, gender);
			ps.setString(4, email);
			ps.setString(5, password);

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
