package com.loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.ldap.Rdn;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Test_01 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("email");
		String password = req.getParameter("password");
		
		RequestDispatcher rd;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		if("snehalmajhi@gmail.com".equals(username) && "20202020".equals(password)) {
			rd = req.getRequestDispatcher("/app2");
			rd.forward(req, resp);
		}
		else {
			out.println("<h1>Invaild Username and Password!</h1>");
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}

}
