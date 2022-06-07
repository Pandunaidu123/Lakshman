<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.product.ProductDao"%>
<%@page import="com.product.Product"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="p" class="com.product.Product" />
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
	int id = Integer.parseInt(request.getParameter("ProductId"));
	Product product = ProductDao.getRecordById(id);

	request.setAttribute("product", product);
	%>
	<div class="main">

		<div class="child">
			<img alt="image" src="${product.getUrl()}"><br>
			<p>Product Name : ${product.getName()}</p>
			<p>${product.getDescr()}</p>
			<p>Price : ${product.getPrice()}</p>

			<a href="OrderConfirmation.jsp?ProductId=${product.getProductId()}"
				style="height: 20px;"><button>Buy Now</button></a> &nbsp&nbsp&nbsp <a
				href="Addtocart.jsp?ProductId=${product.getProductId()}"
				style="height: 20px;"><button>Add to cart</button></a>
			<!--<a href="Addtocart.jsp?name=${product.getName()}">Add to cart</a>-->
		</div>

	</div>
</body>
</html>