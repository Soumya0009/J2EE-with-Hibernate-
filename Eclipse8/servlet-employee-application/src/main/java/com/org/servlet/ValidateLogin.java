package com.org.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/log")
public class ValidateLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		int validate = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_employee", "root",
					"root");
			String sql = "SELECT * FROM signin WHERE email=? AND password=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				validate = 1;
			}

			con.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (validate != 0) {
			PrintWriter pw = resp.getWriter();
			pw.write("<html><body>");
			pw.write("<style>");
			pw.write(".alert-box {");
			pw.write("  position: fixed;");
			pw.write("  top: 50%;");
			pw.write("  right: 0;");
			pw.write("  transform: translate(-50%, -50%);");
			pw.write("  background-color: #000000;");
			pw.write("  color: #FFFFFF;");
			pw.write("  padding: 20px;");
			pw.write("  text-align: center;");
			pw.write("}");

			pw.write(".alert-box h1 {");
			pw.write("  font-size: 24px;");
			pw.write("}");

			pw.write(".alert-box button {");
			pw.write("  background-color: #FFFFFF;");
			pw.write("  color: #000000;");
			pw.write("  padding: 10px 20px;");
			pw.write("  border: none;");
			pw.write("  cursor: pointer;");
			pw.write("}");

			pw.write("</style>");
			pw.write("<script>");
			pw.write("function showAlert() {");
			pw.write("  var alertBox = document.createElement('div');");
			pw.write("  alertBox.className = 'alert-box';");
			pw.write("  alertBox.innerHTML = '<h1>Login Success</h1>';");
			pw.write("  var closeButton = document.createElement('button');");
			pw.write("  closeButton.innerHTML = 'Close';");
			pw.write("  closeButton.onclick = function() {");
			pw.write("    alertBox.style.display = 'none';");
			pw.write("  };");
			pw.write("  alertBox.appendChild(closeButton);");
			pw.write("  document.body.appendChild(alertBox);");
			pw.write("  setTimeout(function() {");
			pw.write("    alertBox.style.display = 'none';");
			pw.write("  }, 5000);"); // Close the alert after 5 seconds
			pw.write("}");
			pw.write("showAlert();");
			pw.write("</script>");
			pw.write("</body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("home.html");
			rd.include(req, resp);

		} else {
			PrintWriter pw = resp.getWriter();
			pw.write("<html><body>");
			pw.write("<style>");
			pw.write(".alert-box {");
			pw.write("  position: fixed;");
			pw.write("  top: 50%;");
			pw.write("  right: 0;");
			pw.write("  transform: translate(-50%, -50%);");
			pw.write("  background-color: #000000;");
			pw.write("  color: #FFFFFF;");
			pw.write("  padding: 20px;");
			pw.write("  text-align: center;");
			pw.write("}");

			pw.write(".alert-box h1 {");
			pw.write("  font-size: 24px;");
			pw.write("}");

			pw.write(".alert-box button {");
			pw.write("  background-color: #FFFFFF;");
			pw.write("  color: #000000;");
			pw.write("  padding: 10px 20px;");
			pw.write("  border: none;");
			pw.write("  cursor: pointer;");
			pw.write("}");

			pw.write("</style>");
			pw.write("<script>");
			pw.write("function showAlert() {");
			pw.write("  var alertBox = document.createElement('div');");
			pw.write("  alertBox.className = 'alert-box';");
			pw.write("  alertBox.innerHTML = '<h1>Login Faild</h1>';");
			pw.write("  var closeButton = document.createElement('button');");
			pw.write("  closeButton.innerHTML = 'Close';");
			pw.write("  closeButton.onclick = function() {");
			pw.write("    alertBox.style.display = 'none';");
			pw.write("  };");
			pw.write("  alertBox.appendChild(closeButton);");
			pw.write("  document.body.appendChild(alertBox);");
			pw.write("  setTimeout(function() {");
			pw.write("    alertBox.style.display = 'none';");
			pw.write("  }, 5000);"); // Close the alert after 5 seconds
			pw.write("}");
			pw.write("showAlert();");
			pw.write("</script>");
			pw.write("</body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);

		}

	}
}