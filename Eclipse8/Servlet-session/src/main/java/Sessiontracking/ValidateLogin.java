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
@WebServlet("/validate")
public class ValidateLogin extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String pwd=req.getParameter("pwd");
	
	if(email.equals("admin@gmail.com") && pwd.equals("1234")) {
		HttpSession hs=req.getSession();
		RequestDispatcher rd=req.getRequestDispatcher("home.html");
		rd.forward(req, resp);
	}else {
		
		PrintWriter pw=resp.getWriter();
		pw.write("<h1>Login failed</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("login.html");
		rd.include(req, resp);
	}
}
}