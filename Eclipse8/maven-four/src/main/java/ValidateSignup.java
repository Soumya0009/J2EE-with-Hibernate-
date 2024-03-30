import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class ValidateSignup extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		long phone = Long.parseLong(req.getParameter("phone"));
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup?user=root&password=root");
            String sqlString = "INSERT INTO data (name, phone, email, password) VALUES (?, ?, ?, ?)";
            PreparedStatement pStatement = connection.prepareStatement(sqlString);

            pStatement.setString(1, name);
            pStatement.setLong(2, phone);
            pStatement.setString(3, email);
            pStatement.setString(4, password);

            pStatement.execute();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
		

		PrintWriter pw = resp.getWriter();
		if (name.matches("[a-zA-Z ]+") && String.valueOf(phone).matches("[6-9]\\d{9}")) {
			RequestDispatcher rd = req.getRequestDispatcher("signin2.html");
			rd.forward(req, resp);

		} else {

			pw.write("<html>");
			pw.write("<head>");
			pw.write("<style>");
			pw.write("body {");
			pw.write("  background-color: #222;");
			pw.write("}");
			pw.write("h1 {");
			pw.write("  color: #fff;");
			pw.write("  text-align: center;");
			pw.write("}");
			pw.write(".alert {");
			pw.write("  background-color: #333;");
			pw.write("  color: #fff;");
			pw.write("  padding: 10px;");
			pw.write("  text-align: center;");
			pw.write("  margin-bottom: 20px;");
			pw.write("}");
			pw.write("</style>");
			pw.write("</head>");
			pw.write("<body>");
			pw.write("<div class='alert'>");
			pw.write("<p>Data has not been inserted. Enter a valid data!!!</p>");
			pw.write("</div>");
			pw.write("</body>");
			pw.write("</html>");
			
			RequestDispatcher rd = req.getRequestDispatcher("signin.html");
			rd.include(req, resp);
		}
	}
}
