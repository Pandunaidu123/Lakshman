package com.telusko;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemoServlet extends HttpServlet{
	String s="Hello Lucky";
	public void init()
	{
		System.out.println("Servlet Initialized");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("html/text");
		PrintWriter out=res.getWriter();
		out.println("<h1>" +s+"</h1>");

	}
}

