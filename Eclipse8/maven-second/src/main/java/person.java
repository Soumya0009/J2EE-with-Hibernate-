import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/person")
public class person extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Person data is added.");
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		String gender = req.getParameter("gender");
		long phone = Long.parseLong(req.getParameter("phone"));
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(phone);
		
		PrintWriter pr = res.getWriter();
		pr.write("<html><body>");
		pr.write("<h1>"+id+"</h1>");
		pr.write("<h1>"+name+"</h1>");
		pr.write("<h1>"+age+"</h1>");
		pr.write("<h1>"+gender+"</h1>");
		pr.write("<h1>"+phone+"</h1>");
		pr.write("</body></html>");
	}

}
