package student.servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.servlet.jdbc.Signup;
 @WebServlet("/sign")
public class ValidateSignup extends HttpServlet{
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name = req.getParameter("name");
		 long phone = Long.parseLong(req.getParameter("phone"));
		 String gender = req.getParameter("gender");
		 String email = req.getParameter("email");
		 String password = req.getParameter("password");
		 
		 int res = Signup.SaveSignIn(name, phone, gender, email, password);
		 
		 PrintWriter pw = resp.getWriter();
			if (res != 0) {
				pw.write("<html><body>");
				pw.write("<style>");
				pw.write(".alert-box {");
				pw.write("  position: fixed;");
				pw.write("  top: 50%;");
				pw.write("  right: 0;");
				pw.write("  transform: translate(-50%, -50%);");
				pw.write("  background-color: #000000;");
				pw.write("  color: #FFFFFF;");
				pw.write("  padding: 10px;");
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
				pw.write("  alertBox.innerHTML = '<h1>Signin Success, You can login now</h1>';");
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
			} else {
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
				pw.write("  alertBox.innerHTML = '<h1>Signin Failed Tyr Again</h1>';");
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

				RequestDispatcher rd = req.getRequestDispatcher("signup.html");
				rd.include(req, resp);
			}
	 }
}
