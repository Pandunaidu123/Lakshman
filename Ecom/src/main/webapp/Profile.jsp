<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
		.GFG {
			background-color: white;
			border: 2px solid black;
			color: green;
			padding: 5px 10px;
			text-align: center;
			display: inline-block;
			font-size: 20px;
			margin: 10px 30px;
			cursor: pointer;
		}
		
	
</style>
<meta charset="ISO-8859-1">
<title>Registration Process</title>
</head>
<body>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"  %>
<%

String user=request.getParameter("userid");
session.putValue("userid", user);
String pwd=request.getParameter("pwd");
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String email=request.getParameter("email");
Class.forName("com.mysql.jdbc.Driver");  
java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","techouts");  
Statement stmt= con.createStatement();
ResultSet rs;
int i=stmt.executeUpdate("insert into users values ('"+user+"','"+pwd+"','"+fname+"','"+lname+"','"+email+"')");
out.println("Profile Updated Successfully");

%>
<br>
<br>
<a href='Login.html'>
<button class="GFG">
	Login Here..
</button>
</a>
</body>
</html>