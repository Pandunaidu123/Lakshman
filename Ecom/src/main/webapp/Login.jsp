<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: pink;
}

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
<title>Insert title here</title>
</head>
<body>
	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	<%
	String userid = request.getParameter("usr");
	session.putValue("userid", userid);
	System.out.println(userid);
	String pwd = request.getParameter("pwd");
	HttpSession hs = request.getSession();
	hs.setAttribute("userid", userid);
	Class.forName("com.mysql.jdbc.Driver");
	java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "techouts");
	PreparedStatement stmt = con.prepareStatement("select * from users where userid=?");
	stmt.setString(1, userid);
	ResultSet rs = stmt.executeQuery();
	if (rs.next()) {
		if (rs.getString(2).equals(pwd)) {
			response.sendRedirect("home.html");
	%>
	<%
	} else {
		response.sendRedirect("Login1.html");
	}
	} else
	%>


</body>
</html>