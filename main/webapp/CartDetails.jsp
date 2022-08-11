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

<style>
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

	<%
	String cat = request.getParameter("cat");
	
	List<Product> list = ProductDao.getAllRecords(cat);

	request.setAttribute("list", list);
	%>
	<div class="id">
		<c:forEach items="${list}" var="data">
			<div style="text-align: center;">
				<div>
					<p>name: ${data.getName()}</p>
					<p>price: ${data.getPrice()}</p>
				</div>
				<div style="display: inline;">
					<a style="text-decoration: none;"
						href="CartPDP.jsp?ProductId=${data.getProductId()}">
						<button>Buy Now</button>
					</a>
				</div>
			</div>
		</c:forEach>
	</div>
</body>


</html>