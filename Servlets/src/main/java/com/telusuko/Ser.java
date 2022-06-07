package com.telusuko;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Ser extends HttpServlet{
	String s;
	public void init()
	{
		s="Vijyawada, Krishna District, Andhra Pradesh, India";
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("html/text");
		PrintWriter out=res.getWriter();
		out.println("<h1>" +s+"</h1>");

	}
}

