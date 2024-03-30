package httpsession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/addatt")
public class AddAttHS extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");
		
		HttpSession hs = req.getSession();
		hs.setAttribute("e", email);
		hs.setAttribute("p", password);
		RequestDispatcher rd = req.getRequestDispatcher("fetchatt");
		rd.forward(req, resp);
	}

}
