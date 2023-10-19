package com.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("servlet2")
public class Servlet2 extends HttpServlet {
	String name;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		String name=req.getParameter("name");
		Cookie c[] = req.getCookies();

		for (Cookie cookie : c) {
			name = cookie.getValue();
		}
		PrintWriter printwriter = resp.getWriter();
		printwriter.write("<html><body><h1>" + "Welcome " + name + "</h1></body></html>");
	}

}
