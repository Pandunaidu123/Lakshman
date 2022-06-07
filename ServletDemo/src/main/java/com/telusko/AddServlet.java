package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		int k1=i*j;
		PrintWriter out=res.getWriter();
		out.println("Result is : " +k1);
		System.out.println("Result is : "+k1);
	}
	

}
