package urlrewrite;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/test")
public class TestUR extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("i"));
		System.out.println(id);
		String name = req.getParameter("n");
		System.out.println(name);
		int age = Integer.parseInt(req.getParameter("a"));
		System.out.println(age);
		String gender = req.getParameter("g");
		System.out.println(gender);
		String email = req.getParameter("e");
		System.out.println(email);
		
		PrintWriter pw = resp.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user=root&password=root");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pw.write("<html><body><h1>Id: "+id+"</h1>");
		pw.write("<h1>Name: "+name+"</h1>");
		pw.write("<h1>Age: "+age+"</h1>");
		pw.write("<h1>Gender: "+gender+"</h1>");
		pw.write("<h1>Email: "+email+"</h1></body></html>");
		
	}
}
