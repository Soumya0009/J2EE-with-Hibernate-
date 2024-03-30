package practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/xyz")
public class Validatedemosignup extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("n");
		String phone = req.getParameter("p");
		String email = req.getParameter("e");
		String password = req.getParameter("pwd");

		PrintWriter pw = resp.getWriter();
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch == ' '))) {

				pw.write("<html><body><h1>Invalid Name</h1></body></html>");
				break;
			}

		}
		char ch = phone.charAt(0);
		if (!((phone.length() == 10) && (ch == '6' || ch == '7' || ch == '8' || ch == '9'))) {

			pw.write("<html><body><h1>Invalid Phone Number</h1></body></html>");
		} else {
			pw.write("<html><body><h1>Signin sucessfully</h1></body></html>");
		}

	}

}
