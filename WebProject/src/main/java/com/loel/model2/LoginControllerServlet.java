package com.loel.model2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginControllerServlet extends HttpServlet {
	/**
	 * SerialVersion ID for server
	 */
	private static final long serialVersionUID = 8498101910497685578L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String uname = req.getParameter("un");// name of the text field
		String pwd = req.getParameter("pwd");
		// Model
		User u1 = new User();
		u1.setUserName(uname);
		u1.setUserPassword(pwd);

		req.setAttribute("us", u1);// Key value pair key -> abc value -> u1
		boolean status = u1.validate();

		if (status) {
			RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
			rd.forward(req, res);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("failure.jsp");
			rd.forward(req, res);
		}
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

}
