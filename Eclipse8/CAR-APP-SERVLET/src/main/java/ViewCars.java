import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/viewcar")
public class ViewCars extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/car_servlet?user=root&password=root");
			Statement statement = connection.createStatement();
			String qrrString = "Select*From car";

			ResultSet rs = statement.executeQuery(qrrString);
			PrintWriter pw = res.getWriter();
			pw.write("<html><body>");
			pw.write("<table border=2px><tr>");
			pw.write("<th>Id</th>");
			pw.write("<th>CName</th>");
			pw.write("<th>Price</th>");
			pw.write("</tr>");
			while (rs.next()) {
				
				pw.write("</tr>");
				pw.write("<th>"+rs.getInt(1) +"</th>");
				pw.write("<th>"+rs.getString(2)+"</th>");
				pw.write("<th>"+rs.getDouble(3)+"</th>");
				pw.write("</tr>");
				
//				pw.write("<h3> Id: " + rs.getInt(1) + "</h3>");
//				pw.write("<h3> CName: " + rs.getString(2) + "</h3>");
//				pw.write("<h3> Price: " + rs.getDouble(3) + "</h3>");
				pw.write("</body></html>");

			}

			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
