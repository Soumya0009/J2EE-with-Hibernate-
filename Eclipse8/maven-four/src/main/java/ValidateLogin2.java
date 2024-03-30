import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/validate2")
public class ValidateLogin2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pass = req.getParameter("pwd");
		
		if (email.equals("soumyaranjanmohanty@gmail.com") && pass.equals("Soumya2580")) {
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.forward(req, resp);
		}else {
			PrintWriter pw = resp.getWriter();
			pw.write("<html><body><h1>Invalid Login</h1></body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
	}
}

