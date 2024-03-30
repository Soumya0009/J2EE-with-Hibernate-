package hiddenformfild;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testhf2")
public class TestHF2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name =req.getParameter("name");
		
		PrintWriter pw = resp.getWriter();
		
		pw.write("<html><body>");
		pw.write("<form action=print>");
		pw.write("<input type=text name=n value="+name+" hidden>");
		pw.write("<input type=text name=e value="+name+"@gamil.com hidden>");
		pw.write("<input type=submit value=print>");
		pw.write("</form></body></html>");
	}
	
}
