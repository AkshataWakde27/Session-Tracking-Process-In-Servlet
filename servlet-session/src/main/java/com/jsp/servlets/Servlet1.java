package com.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String pwd = req.getParameter("password");

//		Step 1:Creating a Cookie Object
		Cookie cookie1 = new Cookie("cusername", name);
		Cookie cookie2 = new Cookie("cpassword", pwd);

		resp.addCookie(cookie1);
		resp.addCookie(cookie2);

		PrintWriter printwriter = resp.getWriter();
		printwriter.write("<html><body><h1>" + "Welcome " + name + "</h1></body></html>");
		printwriter.write("<html><body><a href='servlet2'>Go to Servlet2</a></body></html>");

	}
}
