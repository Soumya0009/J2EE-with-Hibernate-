import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class VlidateLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		PrintWriter pw = resp.getWriter();
		
		
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/signup?user=root&password=root");
		    Statement statement = connection.createStatement();
		    String queryString = "SELECT * FROM data";

		    ResultSet rs = statement.executeQuery(queryString);
		    boolean loginSuccessful = false;

		    while (rs.next()) {
		        if (email.equals(rs.getString("email")) && pass.equals(rs.getString("password"))) {
		            loginSuccessful = true;
		            break;
		        }
		    }

		    if (loginSuccessful) {
		        RequestDispatcher rd = req.getRequestDispatcher("success.html");
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
		        pw.write("<p>Enter valid Email or password!!!</p>");
		        pw.write("</div>");
		        pw.write("</body>");
		        pw.write("</html>");
		        
		        RequestDispatcher rd = req.getRequestDispatcher("signin2.html");
		        rd.include(req, resp);
		    }

		    connection.close();
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		} catch (SQLException e) {
		    e.printStackTrace();
		}
		
	}
}
