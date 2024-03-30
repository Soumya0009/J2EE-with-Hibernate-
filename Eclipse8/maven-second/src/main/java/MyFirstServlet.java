import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/abc")
public class MyFirstServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("I am My First Servlet Class");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		System.out.println(email);
		System.out.println(password);
		
		PrintWriter pr = res.getWriter();
		pr.write("<html><body>");
		pr.write("<h1>"+email+"</h1>");
		pr.write("<h1>"+password+"</h1>");
		pr.write("</body></html>");
	}

}
