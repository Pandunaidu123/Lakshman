<%@page import="com.product.Product"%>
<%@page import="com.product.ProductDao"%>
<jsp:useBean id="u" class="com.product.Product"></jsp:useBean>
<jsp:setProperty property="*" name="u" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="home.css">
<style>
.footer li {
	list-style-type: none;
}

.footer-div {
	background-color: silver;
	display: inline;
	display: flex;
	padding-left: 500px;
	font-size: 12px;
}

* {
	box-sizing: border-box;
}

body {
	background-color: pink;
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.logo {
	padding-right: 50px;
}

.header {
	text-align: center;
	overflow: hidden;
	background-color: silver;
	padding: 20px 10px;
	padding-left: 50px;
	padding-right: 50px;
	padding-bottom: 20px;
	margin-bottom: 20px;
}

.header a {
	float: left;
	color: black;
	text-align: center;
	padding: 10px;
	text-decoration: none;
	font-size: 18px;
	margin-right: 16px;
	border-radius: 10px;
	margin-top: 3px;
}

.header a.logo {
	font-size: 25px;
	font-weight: bold;
}

.header a:hover {
	background-color: #ddd;
	color: black;
}

.header a.active {
	background-color: black;
	color: white;
}

.header-right {
	float: left;
	padding-right: 10px;
}

@media screen and (max-width: 100px) {
	.header a {
		float: none;
		display: flex;
		text-align: left;
	}
	.header-right {
		float: none;
	}
}
body {
	background-color: pink;
}

.id {
	display: flex;
	flex-wrap: wrap;
	margin-left: 100px;
	gap: 30px;
	padding-bottom: 30px;
	gap: 100px;
}

.dem {
	padding-bottom: 30px;
}
</style>

<meta charset="ISO-8859-1">
<title>ProductPLP</title>
</head>
<body>

<div id="A">
		<div class="header">
			<a href="#default" class="logo" style="padding-right: 50px;">Explore
				. . .</a>
			<div class="header-right">
				<a class="active" href="ProductPLP.jsp?cat=Men"
					style="margin-right: 40px; margin-left: 20px;">Men</a> <a
					class="active" href="ProductPLP.jsp?cat=Women"
					style="margin-right: 40px">Women</a> <a class="active"
					href="ProductPLP.jsp?cat=Kids" style="margin-right: 40px">Kids</a>
				<a class="active" href="ProductPLP.jsp?cat=Beauty"
					style="margin-right: 40px">Beauty</a>
				<div id="demo" style="padding-left: 5px; padding-right: 100px;">
					<form class="example"
						action="http://localhost:8080/Ecom/ProductPLP.jsp?cat=?"
						style="margin: auto; max-width: 300px">

						<input type="text" placeholder="Search.." name="cat">
						<button type="submit">
							<i class="fa fa-search"></i><b
								style="color: black; font-size: 13px;">Search</b>
						</button>
					</form>
				</div>
				<div id="demo1" style="padding-left: 900px;">
					<a class="active"
						href="Reg.html"
						style="margin-right: 40px; margin-bottom: 5px; margin-top: -45px;">Signup</a>
					<a class="active" href="Profile.html"
						style="margin-right: 40px; margin-bottom: 5px; margin-top: -45px;">Profile</a>

					<a class="active" href="Login.html"
						style="margin-right: 40px; margin-bottom: 5px; margin-top: -45px;">Login</a>
					<a class="active" href="Login.html"
						style="margin-right: 20px; margin-bottom: 5px; margin-top: -45px;">Logout</a>
				</div>
			</div>
		</div>

	<%
	String cat = request.getParameter("cat");
	List<Product> list = ProductDao.getAllRecords(cat);

	request.setAttribute("list", list);
	%>
	<div class="id">
		<c:forEach items="${list}" var="data">
			<div style="text-align: center;">
				<a style="text-decoration: none;"
					href="ProductPDP.jsp?ProductId=${data.getProductId()}"> <img
					alt="image" src="${data.getUrl()}" width="160px;" height="230px;">
				</a>
				<div>
					<p>name: ${data.getName()}</p>
					<p>price: ${data.getPrice()}</p>
				</div>
				<div style="display: inline;">
					<a style="text-decoration: none;"
						href="ProductPDP.jsp?ProductId=${data.getProductId()}">
						<button>Buy Now</button>
					</a> <a href="Addtocart.jsp?ProductId=${data.getProductId()}"><button>Add
							to cart</button></a> </a>
				</div>
			</div>
		</c:forEach>
	</div>
	<footer>
							<div class="footer-div">
								<div>
									<ul>
										<li><h5>ONLINE SHOPPING</h5> <br>
										<li>Men</li>
										<li>Women</li>
										<li>Kids</li>
										<li>Home & Living</li>
										<li>Beauty</li>
										<li>Gift Cards</li>
										<li>Mynthra Insider</li>

									</ul>
								</div>

								<div id="power" style="padding-left: 100px;">
									<ul>
										<li><h5>USEFUL LINKS</h5></li>
										<br>
										<li>Contact US</li>
										<li>FAQ</li>
										<li>T & C</li>
										<li>Terms of Use</li>
										<li>Track Orders</li>
										<li>Shipping</li>
										<li>Cancellation</li>
										<li>Return</li>
										<li>Whitehat</li>
										<li>Blog</li>
										<li>Creers</li>
										<li>Privacy Policy</li>
										<li>Site Map</li>
										<li>Corporate Information</li>


									</ul>
								</div>
						</footer>
</body>


</html>