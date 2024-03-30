import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/addcardetails")
public class AddCarDetails extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String cname = req.getParameter("cname");
		double price = Double.parseDouble(req.getParameter("price"));

		System.out.println(id);
		System.out.println(cname);
		System.out.println(price);
		int result =0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/car_servlet?user=root&password=root");
			String sqlString = "Insert into car values(?,?,?)";
			PreparedStatement pStatement = connection.prepareStatement(sqlString);

			pStatement.setInt(1, id);
			pStatement.setString(2, cname);
			pStatement.setDouble(3, price);
			
			pStatement.execute();


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter pr = res.getWriter();
		if (result==1) {
			pr.write("<html><body>");
			pr.write("<h1>Data addes successfully.</h1>");

		}else {

			pr.write("<h1>Use Bimal bolo zuba keshari for mind sarf.</h1>");
			pr.write("</body></html>");

		}
	}
}
