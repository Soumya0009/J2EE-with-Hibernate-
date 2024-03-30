import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/testd")
public class TestDeclaration extends HttpServlet {
	static int i = 10;
	public void m1() {
		System.out.println("I am M1 Method of Servlet.");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		{
			m1();
		}
		
	}
}
