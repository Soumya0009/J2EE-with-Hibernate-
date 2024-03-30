package Sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/dis")
public class DisplayMassage extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg = req.getParameter("m");
		PrintWriter pw = resp.getWriter();
		pw.write("<h1>"+msg+"</h1>");
		RequestDispatcher rd = req.getRequestDispatcher("home.html");
		rd.include(req, resp);
	}
}
