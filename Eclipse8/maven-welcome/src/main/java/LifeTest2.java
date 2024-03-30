import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/life2")
public class LifeTest2 implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(ServletConfig config) throws ServletException");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()");
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service(ServletRequest req, ServletResponse res) throws ServletException, IOException");
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo()");
		return null;
	}

	@Override
	public void destroy() {
		
		System.out.println("destroy()");
	}
	static {
		System.out.println("Static block");
	}
	{
		System.out.println("Nonstatic block");
	}
}
