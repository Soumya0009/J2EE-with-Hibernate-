import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/life")

public class LifeTest  implements Servlet{
	
static {
		
		System.out.println("I am satatic block");
	}
	{
		System.out.println("I am non-static block");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init Config");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("Servlet Config");
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("Servlet req, res");
	}

	@Override
	public String getServletInfo() {
		System.out.println("ServletInfo");
		return null;
	}

	@Override
	public void destroy() {
		System.out.println("Destroy");
		
	}

	
}
