package Sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/msg")
public class WriteMassge extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession hs = req.getSession(false);
		if (hs!=null) {
			PrintWriter pw = resp.getWriter();
			pw.write("<html><body><form action=dis>");
			pw.write("<input type=text name=m><br>");
			pw.write("<input type=submit value=send>");
			pw.write("</form></body></html>");
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.forward(req, resp);
		}
	}
}
