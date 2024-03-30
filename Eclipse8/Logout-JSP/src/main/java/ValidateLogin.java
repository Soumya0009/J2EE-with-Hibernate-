import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/validate")
public class ValidateLogin extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	
	if(email.equals("admin@gmail.com")&& password.equals("1234")) {
		
		HttpSession hs=req.getSession();
		hs.setAttribute("e", email);
		resp.sendRedirect("home.jsp");
	}
	else {
		resp.sendRedirect("login.jsp");
	}
	
}
}