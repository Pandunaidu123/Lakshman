<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.product.CartDao"%>
<%@page import="com.product.Cart"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="p" class="com.product.Cart" />
<jsp:setProperty name="p" property="*" />
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<style>
body {
	background-color: pink;
}
</style>
<head>
<style>
.main {
	text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Product Description page</title>
</head>
<body>
	<%
	HttpSession hs = request.getSession();
	String userid = (String) session.getAttribute("userid");
	List<Cart> list = CartDao.getAllRecordsOrders(userid);
	System.out.println(list);
	request.setAttribute("list", list);
	%>
	<div class="main">
		<c:forEach items="${list}" var="data">
			<div class="child">
				<img alt="image" src="${data.getUrl()}"><br>
				<p>Product Name : ${data.getName()}</p>
				<p>${data.getDescr()}</p>
				<p>Price : ${data.getPrice()}</p>

				<form action="#">
					<button style="font-weight: bold;">Cancel Order</button>
				</form>
				<br><br>
			</div>
		</c:forEach>
	</div>
</body>
</html>